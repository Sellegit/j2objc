/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.j2objc.util;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.devtools.j2objc.Options;
import com.google.devtools.j2objc.ast.CompilationUnit;
import com.google.devtools.j2objc.ast.PackageDeclaration;
import com.google.devtools.j2objc.file.InputFile;
import com.google.devtools.j2objc.types.GeneratedVariableBinding;
import com.google.devtools.j2objc.types.IOSBlockTypeBinding;
import com.google.devtools.j2objc.types.IOSMethod;
import com.google.devtools.j2objc.types.IOSMethodBinding;
import com.google.devtools.j2objc.types.PointerTypeBinding;
import com.google.devtools.j2objc.types.Types;
import com.google.j2objc.annotations.Mapping;
import com.google.j2objc.annotations.ObjectiveCName;

import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.osgi.framework.debug.Debug;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.Binding;

/**
 * Singleton service for type/method/variable name support.
 *
 * @author Tom Ball
 */
public class NameTable {

  private static NameTable instance;
  private final Map<IBinding, String> renamings = Maps.newHashMap();
  private final PathClassLoader classLoader;

  public static final String INIT_NAME = "init";
  public static final String ALLOC_METHOD = "alloc";
  public static final String RETAIN_METHOD = "retain";
  public static final String RELEASE_METHOD = "release";
  public static final String AUTORELEASE_METHOD = "autorelease";
  public static final String DEALLOC_METHOD = "dealloc";
  public static final String FINALIZE_METHOD = "finalize";

  // The JDT compiler requires package-info files be named as "package-info",
  // but that's an illegal type to generate.
  public static final String PACKAGE_INFO_FILE_NAME = "package-info";
  public static final String PACKAGE_INFO_MAIN_TYPE = "package_info";

  // The self name in Java is reserved in Objective-C, but functionized methods
  // actually want the first parameter to be self. This is an internal name,
  // converted to self during generation.
  public static final String SELF_NAME = "$$self$$";

  public static final String ID_TYPE = "id";

  private static final Logger logger = Logger.getLogger(NameTable.class.getName());

  /**
   * The list of predefined types, common primitive typedefs, constants and
   * variables.
   */
  public static final List<String> reservedNames = Lists.newArrayList(
      // types
      "id", "bool", "BOOL", "SEL", "IMP", "unichar",

      // constants
      "nil", "Nil", "YES", "NO", "TRUE", "FALSE",

      // C99 keywords
      "auto", "const", "entry", "extern", "goto", "inline", "register", "restrict", "signed",
      "sizeof", "struct", "typedef", "union", "unsigned", "volatile",

      // C++ keywords
      "and", "and_eq", "asm", "bitand", "bitor", "compl", "const_cast", "delete", "dynamic_cast",
      "explicit", "export", "friend", "mutable", "namespace", "not", "not_eq", "operator", "or",
      "or_eq", "reinterpret_cast", "static_cast", "template", "typeid", "typename", "using",
      "virtual", "wchar_t", "xor", "xor_eq",

      // variables
      "self", "isa",

      // Definitions from standard C and Objective-C headers, not including
      // typedefs and #defines that start with "_", nor #defines for
      // functions.  Some of these may seem very unlikely to be used in
      // Java source, but if a name is legal some Java developer might very
      // well use it.

      // Definitions from stddef.h
      "ptrdiff_t", "size_t", "wchar_t", "wint_t",

      // Definitions from stdint.h
      "int8_t", "int16_t", "int32_t", "int64_t", "uint8_t", "uint16_t", "uint32_t", "uint64_t",
      "int_least8_t", "int_least16_t", "int_least32_t", "int_least64_t",
      "uint_least8_t", "uint_least16_t", "uint_least32_t", "uint_least64_t",
      "int_fast8_t", "int_fast16_t", "int_fast32_t", "int_fast64_t",
      "uint_fast8_t", "uint_fast16_t", "uint_fast32_t", "uint_fast64_t",
      "intptr_t", "uintptr_t", "intmax_t", "uintmax_t",
      "INT8_MAX", "INT16_MAX", "INT32_MAX", "INT64_MAX", "INT8_MIN", "INT16_MIN", "INT32_MIN",
      "INT64_MIN", "UINT8_MAX", "UINT16_MAX", "UINT32_MAX", "UINT64_MAX", "INT_LEAST8_MIN",
      "INT_LEAST16_MIN", "INT_LEAST32_MIN", "INT_LEAST64_MIN", "INT_LEAST8_MAX", "INT_LEAST16_MAX",
      "INT_LEAST32_MAX", "INT_LEAST64_MAX", "INT_FAST8_MIN", "INT_FAST16_MIN", "INT_FAST32_MIN",
      "INT_FAST64_MIN", "INT_FAST8_MAX", "INT_FAST16_MAX", "INT_FAST32_MAX", "INT_FAST64_MAX",
      "UINT_FAST8_MAX", "UINT_FAST16_MAX", "UINT_FAST32_MAX", "UINT_FAST64_MAX", "INTPTR_MIN",
      "INTPTR_MAX", "UINTPTR_MAX", "INTMAX_MIN", "INTMAX_MAX", "UINTMAX_MAX", "PTRDIFF_MIN",
      "PTRDIFF_MAX", "SIZE_MAX", "WCHAR_MAX", "WCHAR_MIN", "WINT_MIN", "WINT_MAX",
      "SIG_ATOMIC_MIN", "SIG_ATOMIC_MAX", "INT8_MAX", "INT16_MAX", "INT32_MAX", "INT64_MAX",
      "UINT8_C", "UINT16_C", "UINT32_C", "UINT64_C", "INTMAX_C", "UINTMAX_C",

      // Definitions from stdio.h
      "va_list", "fpos_t", "FILE", "off_t", "ssize_t", "BUFSIZ", "EOF", "FOPEN_MAX",
      "FILENAME_MAX", "R_OK", "SEEK_SET", "SEEK_CUR", "SEEK_END", "stdin", "STDIN_FILENO",
      "stdout", "STDOUT_FILENO", "stderr", "STDERR_FILENO", "TMP_MAX", "W_OK", "X_OK",

      // Definitions from stdlib.h
      "ct_rune_t", "rune_t", "div_t", "ldiv_t", "lldiv_t", "dev_t", "mode_t",
      "NULL", "EXIT_FAILURE", "EXIT_SUCCESS", "RAND_MAX", "MB_CUR_MAX", "MB_CUR_MAX_L",

      // Definitions from errno.h
      "errno", "EPERM", "ENOENT", "ESRCH", "EINTR", "EIO", "ENXIO", "E2BIG", "ENOEXEC",
      "EBADF", "ECHILD", "EDEADLK", "ENOMEM", "EACCES", "EFAULT", "ENOTBLK", "EBUSY",
      "EEXIST", "EXDEV", "ENODEV", "ENOTDIR", "EISDIR", "EINVAL", "ENFILE", "EMFILE",
      "ENOTTY", "ETXTBSY", "EFBIG", "ENOSPC", "ESPIPE", "EROFS", "EMLINK", "EPIPE",
      "EDOM", "ERANGE", "EAGAIN", "EWOULDBLOCK", "EINPROGRESS", "EALREADY", "ENOTSOCK",
      "EDESTADDRREQ", "EMSGSIZE", "EPROTOTYPE", "ENOPROTOOPT", "EPROTONOSUPPORT",
      "ESOCKTNOSUPPORT", "ENOTSUP", "ENOTSUPP", "EPFNOSUPPORT", "EAFNOSUPPORT", "EADDRINUSE",
      "EADDRNOTAVAIL", "ENETDOWN", "ENETUNREACH", "ENETRESET", "ECONNABORTED", "ECONNRESET",
      "ENOBUFS", "EISCONN", "ENOTCONN", "ESHUTDOWN", "ETOOMANYREFS", "ETIMEDOUT", "ECONNREFUSED",
      "ELOOP", "ENAMETOOLONG", "EHOSTDOWN", "EHOSTUNREACH", "ENOTEMPTY", "EPROCLIM", "EUSERS",
      "EDQUOT", "ESTALE", "EREMOTE", "EBADRPC", "ERPCMISMATCH", "EPROGUNAVAIL", "EPROGMISMATCH",
      "EPROCUNAVAIL", "ENOLCK", "ENOSYS", "EFTYPE", "EAUTH", "ENEEDAUTH", "EPWROFF", "EDEVERR",
      "EOVERFLOW", "EBADEXEC", "EBADARCH", "ESHLIBVERS", "EBADMACHO", "ECANCELED", "EIDRM",
      "ENOMSG", "ENOATTR", "EBADMSG", "EMULTIHOP", "ENODATA", "ENOLINK", "ENOSR", "ENOSTR",
      "EPROTO", "ETIME", "ENOPOLICY", "ENOTRECOVERABLE", "EOWNERDEAD", "EQFULL", "EILSEQ",
      "EOPNOTSUPP", "ELAST",

      // Definitions from fcntl.h
      "F_DUPFD", "F_GETFD", "F_SETFD", "F_GETFL", "F_SETFL", "F_GETOWN", "F_SETOWN",
      "F_GETLK", "F_SETLK", "F_SETLKW", "FD_CLOEXEC", "F_RDLCK", "F_UNLCK", "F_WRLCK",
      "SEEK_SET", "SEEK_CUR", "SEEK_END",
      "O_RDONLY", "O_WRONLY", "O_RDWR", "O_ACCMODE", "O_NONBLOCK", "O_APPEND", "O_SYNC", "O_CREAT",
      "O_TRUNC", "O_EXCL", "O_NOCTTY", "O_NOFOLLOW",

      // Definitions from math.h
      "DOMAIN", "HUGE", "INFINITY", "NAN", "OVERFLOW", "SING", "UNDERFLOW",

      // Definitions from mman.h
      "MAP_FIXED", "MAP_PRIVATE", "MAP_SHARED", "MCL_CURRENT", "MCL_FUTURE", "MS_ASYNC",
      "MS_INVALIDATE", "MS_SYNC", "PROT_EXEC", "PROT_NONE", "PROT_READ", "PROT_WRITE",

      // Definitions from netdb.h
      "AI_ADDRCONFIG", "AI_ALL", "AI_CANONNAME", "AI_NUMERICHOST", "AI_NUMERICSERV",
      "AI_PASSIVE", "AI_V4MAPPED", "EAI_AGAIN", "EAI_BADFLAGS", "EAI_FAIL", "EAI_FAMILY",
      "EAI_MEMORY", "EAI_NODATA", "EAI_NONAME", "EAI_OVERFLOW", "EAI_SERVICE", "EAI_SOCKTYPE",
      "EAI_SYSTEM", "NI_NAMEREQD", "NI_NUMERICHOST",

      // Definitions from net/if.h
      "IFF_LOOPBACK", "IFF_MULTICAST", "IFF_POINTTOPOINT", "IFF_UP", "SIOCGIFADDR",
      "SIOCGIFBRDADDR", "SIOCGIFNETMASK", "SIOCGIFDSTADDR",

      // Definitions from netinet/in.h, in6.h
      "IPPROTO_IP", "IPPROTO_IPV6", "IPPROTO_TCP", "IPV6_MULTICAST_HOPS", "IPV6_MULTICAST_IF",
      "IP_MULTICAST_LOOP", "IPV6_TCLASS", "MCAST_JOIN_GROUP", "MCAST_JOIN_GROUP",

      // Definitions from socket.h
      "AF_INET", "AF_INET6", "AF_UNIX", "AF_UNSPEC", "MSG_OOB", "MSG_PEEK", "SHUT_RD", "SHUT_RDWR",
      "SHUT_WR", "SOCK_DGRAM", "SOCK_STREAM", "SOL_SOCKET", "SO_BINDTODEVICE", "SO_BROADCAST",
      "SO_ERROR", "SO_KEEPALIVE", "SO_LINGER", "SOOOBINLINE", "SO_REUSEADDR", "SO_RCVBUF",
      "SO_RCVTIMEO", "SO_SNDBUF", "TCP_NODELAY",

      // Definitions from stat.h
      "S_IFBLK", "S_IFCHR", "S_IFDIR", "S_IFIFO", "S_IFLNK", "S_IFMT", "S_IFREG", "S_IFSOCK",

      // Definitions from sys/poll.h
      "POLLERR", "POLLHUP", "POLLIN", "POLLOUT",

      // Definitions from sys/syslimits.h
      "ARG_MAX", "LINE_MAX", "MAX_INPUT", "NAME_MAX", "NZERO", "PATH_MAX",

      // Definitions from types.h
      "S_IRGRP", "S_IROTH", "S_IRUSR", "S_IRWXG", "S_IRWXO", "S_IRWXU", "S_IWGRP", "S_IWOTH",
      "S_IWUSR", "S_IXGRP", "S_IXOTH", "S_IXUSR",

      // Definitions from unistd.h
      "F_OK", "R_OK", "STDERR_FILENO", "STDIN_FILENO", "STDOUT_FILENO", "W_OK", "X_OK",
      "_SC_PAGESIZE", "_SC_PAGE_SIZE",

      // Cocoa definitions from ConditionalMacros.h
      "CFMSYSTEMCALLS", "CGLUESUPPORTED", "FUNCTION_PASCAL", "FUNCTION_DECLSPEC",
      "FUNCTION_WIN32CC", "GENERATING68881", "GENERATING68K", "GENERATINGCFM", "GENERATINGPOWERPC",
      "OLDROUTINELOCATIONS", "PRAGMA_ALIGN_SUPPORTED", "PRAGMA_ENUM_PACK", "PRAGMA_ENUM_ALWAYSINT",
      "PRAGMA_ENUM_OPTIONS", "PRAGMA_IMPORT", "PRAGMA_IMPORT_SUPPORTED", "PRAGMA_ONCE",
      "PRAGMA_STRUCT_ALIGN", "PRAGMA_STRUCT_PACK", "PRAGMA_STRUCT_PACKPUSH",
      "TARGET_API_MAC_CARBON", "TARGET_API_MAC_OS8", "TARGET_API_MAC_OSX", "TARGET_CARBON",
      "TYPE_BOOL", "TYPE_EXTENDED", "TYPE_LONGDOUBLE_IS_DOUBLE", "TYPE_LONGLONG",
      "UNIVERSAL_INTERFACES_VERSION",

      // Core Foundation definitions
      "BIG_ENDIAN", "BYTE_ORDER", "LITTLE_ENDIAN", "PDP_ENDIAN",

      // CoreServices definitions
      "positiveInfinity", "negativeInfinity",

      // Common preprocessor definitions.
      "DEBUG", "NDEBUG",

      // Foundation methods with conflicting return types
      "scale");

  /**
   * List of NSObject message names.  Java methods with one of these names are
   * renamed to avoid unintentional overriding.  Message names with trailing
   * colons are not included since they can't be overridden.  For example,
   * "public boolean isEqual(Object o)" would be translated as
   * "- (BOOL)isEqualWithObject:(NSObject *)o", not NSObject's "isEqual:".
   */
  public static final List<String> nsObjectMessages = Lists.newArrayList(
      "alloc", "attributeKeys", "autoContentAccessingProxy", "autorelease",
      "classCode", "classDescription", "classForArchiver",
      "classForKeyedArchiver", "classFallbacksForKeyedArchiver",
      "classForPortCoder", "className", "copy", "dealloc", "description",
      "hash", "init", "initialize", "isProxy", "load", "mutableCopy", "new",
      "release", "retain", "retainCount", "scriptingProperties", "self",
      "superclass", "toManyRelationshipKeys", "toOneRelationshipKeys",
      "version");

  /**
   * Map of package names to their specified prefixes.  Multiple packages
   * can share a prefix; for example, the com.google.common packages in
   * Guava could share a "GG" (Google Guava) or simply "Guava" prefix.
   */
  private final Map<String, String> prefixMap;

  private final Map<String, String> methodMappings;

  private static final Function<String, String> EXTRACT_SELECTOR_FUNC =
      new Function<String, String>() {
    public String apply(String value) {
      return extractMethodSelector(value);
    }
  };

  private NameTable(
      Map<String, String> prefixMap, Map<String, String> rawMethodMappings,
      PathClassLoader classLoader) {
    this.prefixMap = prefixMap;
    this.methodMappings =
        Maps.newHashMap(Maps.transformValues(rawMethodMappings, EXTRACT_SELECTOR_FUNC));
    this.classLoader = classLoader;
  }

  /**
   * Create a new NameTable according to the current options, and returns it.
   */
  public static NameTable newNameTable() {
    List<String> paths = Options.getBootClasspath();
    paths.addAll(Options.getClassPathEntries());
    return new NameTable(
        Options.getPackagePrefixes(), Options.getMethodMappings(), new PathClassLoader(paths));
  }

  /**
   * Creates a new NameTable, and sets it as the current instance.
   */
  public static void initialize() {
    instance = newNameTable();
  }

  public void setInstance() {
    instance = this;
  }

  public static void cleanup() {
    try {
      if (instance != null) {
        instance.classLoader.close();
      }
    } catch (IOException e) {
      // Ignore, any open files will be closed on exit.
    }
    instance = null;
  }

  /**
   * Returns a bound name that may have been renamed by a translation phase.
   *
   * @return the new name, or the old name if no renaming exists
   */
  public static String getName(IBinding binding) {
    assert binding != null;
    assert !(binding instanceof IMethodBinding);
    binding = getBindingDeclaration(binding);
    String newName = instance.renamings.get(binding);
    if (newName != null) {
      return newName;
    }

    // Annotation-based mapping
    if (binding instanceof IMethodBinding) {
      IOSMethod method = BindingUtil.getMappedMethod((IMethodBinding) binding);
      if (method != null) {
        return method.getName();
      }
    }

    String annoName = BindingUtil.extractMappingName(binding);
    if (annoName != null) {
      return annoName;
    }

    String name = binding.getName();
    if (binding instanceof IVariableBinding) {
      if (isReservedName(name) && !((IVariableBinding) binding).isEnumConstant()) {
        name += "_";
      }
    }
    return name.equals(SELF_NAME) ? "self" : name;
  }

  /**
   * Returns the name of an annotation property variable, extracted from its accessor binding.
   */
  public static String getAnnotationPropertyVariableName(IMethodBinding binding) {
    return getAnnotationPropertyName(binding) + '_';
  }

  /**
   * Returns the name of an annotation property variable, extracted from its accessor binding.
   */
  public static String getAnnotationPropertyName(IMethodBinding binding) {
    return getMethodName(binding);
  }

  private static IBinding getBindingDeclaration(IBinding binding) {
    if (binding instanceof IVariableBinding) {
      return ((IVariableBinding) binding).getVariableDeclaration();
    }
    if (binding instanceof IMethodBinding) {
      return ((IMethodBinding) binding).getMethodDeclaration();
    }
    if (binding instanceof ITypeBinding) {
      return ((ITypeBinding) binding).getTypeDeclaration();
    }
    return binding;
  }

  public static boolean isRenamed(IBinding binding) {
    return instance.renamings.containsKey(binding);
  }

  /**
   * Adds a name to the renamings map, used by getName().
   */
  public static void rename(IBinding oldName, String newName) {
    assert !(oldName instanceof IMethodBinding);
    oldName = getBindingDeclaration(oldName);
    String previousName = instance.renamings.get(oldName);
    if (previousName != null && !previousName.equals(newName)) {
      logger.fine(String.format("Changing previous rename: %s => %s, now: %s => %s",
          oldName.toString(), previousName, oldName, newName));
    }
    instance.renamings.put(oldName, newName);
  }

  /**
   * Capitalize the first letter of a string.
   */
  public static String capitalize(String s) {
    return s.length() > 0 ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : s;
  }

  /**
   * Given a period-separated name, return as a camel-cased type name.  For
   * example, java.util.logging.Level is returned as JavaUtilLoggingLevel.
   */
  public static String camelCaseQualifiedName(String fqn) {
    StringBuilder sb = new StringBuilder();
    for (String part : fqn.split("\\.")) {
      sb.append(capitalize(part));
    }
    return sb.toString();
  }

  /**
   * Given a path, return as a camel-cased name. Used, for example, in header guards.
   */
  public static String camelCasePath(String fqn) {
    StringBuilder sb = new StringBuilder();
    for (String part : fqn.split(Pattern.quote(File.separator))) {
      sb.append(capitalize(part));
    }
    return sb.toString();
  }

  public static String primitiveTypeToObjC(ITypeBinding type) {
    assert type.isPrimitive();
    if (Types.isVoidType(type)) {
      return "void";
    }
    return "j" + type.getName();
  }

  // TODO(kstanger): See whether the logic in this method can be simplified.
  //     Also, what about type variables?
  private static String getArrayTypeParameterKeyword(ITypeBinding elementType, int dimensions) {
    if (elementType.isParameterizedType()) {
      elementType = elementType.getErasure();
    }
    if (elementType.isCapture()) {
      elementType = elementType.getWildcard();
    }
    if (elementType.isWildcardType()) {
      ITypeBinding bound = elementType.getBound();
      if (bound != null) {
        elementType = bound;
      }
    }
    String name = getFullName(elementType) + "Array";
    if (dimensions > 1) {
      name += dimensions;
    }
    return name;
  }

  private static boolean isIdType(ITypeBinding type) {
    return type == Types.resolveIOSType("id") || type == Types.resolveIOSType("NSObject")
        || Types.isJavaObjectType(type);
  }

  private static String getParameterTypeKeyword(ITypeBinding type) {
    if (isIdType(type) || type.isTypeVariable()) {
      ITypeBinding[] bounds = type.getTypeBounds();
      if (bounds.length > 0) {
        return getParameterTypeKeyword(bounds[0]);
      }
      return ID_TYPE;
    } else if (type.isPrimitive()) {
      return type.getName();
    } else if (type.isArray()) {
      return getArrayTypeParameterKeyword(type.getElementType(), type.getDimensions());
    } else if (type instanceof IOSBlockTypeBinding) {
      return "block";
    }

    return getFullName(type);
  }

  public static String parameterKeyword(ITypeBinding type) {
    return "with" + capitalize(getParameterTypeKeyword(type));
  }

  // Matches the class name prefix or a parameter declarations of a method
  // signature. After removing these parts, the selector remains.
  private static final Pattern SIGNATURE_STRIPPER =
      Pattern.compile("^\\w* |\\s*\\([^)]*\\)\\s*\\w+\\s*");

  // TODO(kstanger): Phase out usage of full method signatures when renaming methods.
  private static String parseSelectorFromSignature(String s) {
    if (s.endsWith(";")) {
      s = s.substring(0, s.length() - 1);
    }
    Matcher matcher = SIGNATURE_STRIPPER.matcher(s);
    return matcher.replaceAll("");
  }

  private static final Pattern SELECTOR_VALIDATOR = Pattern.compile("\\w+|(\\w+\\:)+");

  private static boolean validateMethodSelector(String selector) {
    if (!SELECTOR_VALIDATOR.matcher(selector).matches()) {
      ErrorUtil.error("Invalid method selector: " + selector);
      return false;
    }
    return true;
  }

  // Be nice and only print the warning once per method.
  private static Set<String> renamingWarned = Sets.newHashSet();

  private static String extractMethodSelector(String value) {
    String selector = value;
    if (value.contains(" ") || value.contains("(")) {
      selector = parseSelectorFromSignature(value);
      if (validateMethodSelector(selector) && !renamingWarned.contains(value)) {
        ErrorUtil.warning("Method renaming with full signature is being phased out. "
            + "Please replace \"" + value + "\" with \"" + selector + "\".");
        renamingWarned.add(value);
      }
    } else {
      validateMethodSelector(selector);
    }
    return selector;
  }

  public static String getMethodName(IMethodBinding method) {
    if (method.isConstructor()) {
      return "init";
    }
    String name = method.getName();
    if (isReservedName(name)) {
      name += "__";
    }
    return name;
  }

  private static String addParamNames(IMethodBinding method, String name, char delim) {
    method = method.getMethodDeclaration();
    StringBuilder sb = new StringBuilder(name);
    ITypeBinding[] paramTypes = method.getParameterTypes();
    for (int i = 0; i < paramTypes.length; i++) {
      String keyword = parameterKeyword(paramTypes[i]);
      if (i == 0) {
        keyword = capitalize(keyword);
      }
      sb.append(keyword).append(delim);
    }
    return sb.toString();
  }

  public static String getMethodSelector(IMethodBinding method) {
    if (method instanceof IOSMethodBinding) {
      return ((IOSMethodBinding) method).getSelector();
    }
    if (BindingUtil.isDestructor(method)) {
      return DEALLOC_METHOD;
    }
    // Annotation based logic, TODO(cxi) change to selector based
    IOSMethod mappedMethod = BindingUtil.getMappedMethod(
        method, BindingUtil.extractExtensionMappingName(method) != null
    );
    if (mappedMethod != null) {
      return mappedMethod.getSelector();
    }
    if (method.isConstructor() || BindingUtil.isStatic(method)) {
      return selectorForOriginalBinding(method);
    }
    return selectorForOriginalBinding(getOriginalMethodBindings(method).get(0));
  }

  private static String getRenamedMethodName(IMethodBinding method) {
    method = method.getMethodDeclaration();
    String selector = instance.methodMappings.get(BindingUtil.getMethodKey(method));
    if (selector != null) {
      return selector;
    }
    selector = getMethodNameFromAnnotation(method);
    if (selector != null) {
      return selector;
    }
    return null;
  }

  public static String selectorForMethodName(IMethodBinding method, String name) {
    if (name.contains(":")) {
      return name;
    }
    return addParamNames(method, name, ':');
  }

  private static String selectorForOriginalBinding(IMethodBinding method) {
    String selector = getRenamedMethodName(method);
    return selectorForMethodName(method, selector != null ? selector : getMethodName(method));
  }

  /**
   * In rare edge cases a single method will override two or more methods that
   * have different selectors. This returns the additional selectors that are
   * not returned by getMethodSelector().
   */
  public static List<String> getExtraSelectors(IMethodBinding method) {
    if (method instanceof IOSMethodBinding || method.isConstructor() || BindingUtil.isStatic(method)
        || BindingUtil.isDestructor(method)) {
      return Collections.emptyList();
    }
    List<IMethodBinding> originalMethods = getOriginalMethodBindings(method);
    List<String> extraSelectors = Lists.newArrayList();
    String actualSelector = selectorForOriginalBinding(originalMethods.get(0));
    for (int i = 1; i < originalMethods.size(); i++) {
      String selector = selectorForOriginalBinding(originalMethods.get(i));
      if (!selector.equals(actualSelector)) {
        extraSelectors.add(selector);
      }
    }
    return extraSelectors;
  }

  /**
   * Returns a "Type_method" function name for static methods, such as from
   * enum types. A combination of classname plus modified selector is
   * guaranteed to be unique within the app.
   */
  public static String getFullFunctionName(IMethodBinding method) {
    return getFullName(method.getDeclaringClass()) + '_' + getFunctionName(method);
  }

  /**
   * Returns the name of the allocating constructor wrapper. The name will take
   * the form of "new_TypeName_ConstructorName".
   */
  public static String getAllocatingConstructorName(IMethodBinding method) {
    return "new_" + getFullFunctionName(method);
  }

  /**
   * Returns an appropriate name to use for this method as a function. This name
   * is guaranteed to be unique within the declaring class, if no methods in the
   * class have a renaming. The returned name should be given an appropriate
   * prefix to avoid collisions with methods from other classes.
   */
  public static String getFunctionName(IMethodBinding method) {
    method = method.getMethodDeclaration();
    String name = getRenamedMethodName(method);
    if (name != null) {
      return name.replaceAll(":", "_");
    } else {
      return addParamNames(method, getMethodName(method), '_');
    }
  }

  public static String getMethodNameFromAnnotation(IMethodBinding method) {
    IAnnotationBinding annotation = BindingUtil.getAnnotation(method, ObjectiveCName.class);
    if (annotation != null) {
      String value = (String) BindingUtil.getAnnotationValue(annotation, "value");
      return extractMethodSelector(value);
    }
    return null;
  }

  /**
   * Finds all the original overridden method bindings. If the the method is
   * overridden multiple times in the hierarchy, only the original is included.
   * Multiple results are still possible if the the given method overrides
   * methods from multiple interfaces or classes that do not share the same
   * hierarchy.
   */
  private static List<IMethodBinding> getOriginalMethodBindings(IMethodBinding method) {
    method = method.getMethodDeclaration();
    if (method.isConstructor() || BindingUtil.isStatic(method)) {
      return Lists.newArrayList(method);
    }
    ITypeBinding declaringClass = method.getDeclaringClass();
    List<IMethodBinding> originalBindings = Lists.newArrayList();
    originalBindings.add(method);

    // Collect all the inherited types.
    // Predictable ordering is important, so we use a LinkedHashSet.
    Set<ITypeBinding> inheritedTypes = Sets.newLinkedHashSet();
    BindingUtil.collectAllInheritedTypes(declaringClass, inheritedTypes);
    if (declaringClass.isInterface()) {
      inheritedTypes.add(Types.resolveJavaType("java.lang.Object"));
    }

    // Find all overridden methods.
    for (ITypeBinding inheritedType : inheritedTypes) {
      for (IMethodBinding interfaceMethod : inheritedType.getDeclaredMethods()) {
        if (method.overrides(interfaceMethod)) {
          originalBindings.add(interfaceMethod);
        }
      }
    }

    // Remove any overridden method that overrides another overriden method,
    // leaving only the original overridden methods. Usually there is just one
    // but not always.
    Iterator<IMethodBinding> iter = originalBindings.iterator();
    while (iter.hasNext()) {
      IMethodBinding inheritedMethod = iter.next();
      for (IMethodBinding otherInheritedMethod : originalBindings) {
        if (inheritedMethod != otherInheritedMethod
            && inheritedMethod.overrides(otherInheritedMethod)) {
          iter.remove();
          break;
        }
      }
    }

    return originalBindings;
  }

  /**
   * Convert a Java type to an equivalent Objective-C type with type variables
   * resolved to their bounds.
   */
  public static String getSpecificObjCType(ITypeBinding type) {
    return getObjCTypeInner(type, null, true);
  }

  public static String getSpecificObjCType(IVariableBinding var) {
    String qualifiers = null;
    if (var instanceof GeneratedVariableBinding) {
      qualifiers = ((GeneratedVariableBinding) var).getTypeQualifiers();
    }
    return getObjCTypeInner(var.getType(), qualifiers, true);
  }

  /**
   * Convert a Java type to an equivalent Objective-C type with type variables
   * converted to "id" regardless of their bounds.
   */
  public static String getObjCType(ITypeBinding type) {
    return getObjCTypeInner(type, null, false);
  }

  private static String getObjCTypeInner(
      ITypeBinding type, String qualifiers, boolean expandTypeVariables) {
    if (BindingUtil.isValueType(type)) {
      return getFullName(type);
    } else if (type instanceof IOSBlockTypeBinding){
    }

    String objCType;
    if (type instanceof PointerTypeBinding) {
      String pointeeQualifiers = null;
      if (qualifiers != null) {
        int idx = qualifiers.indexOf('*');
        if (idx != -1) {
          pointeeQualifiers = qualifiers.substring(0, idx);
          qualifiers = qualifiers.substring(idx + 1);
        }
      }
      objCType = getObjCTypeInner(
          ((PointerTypeBinding) type).getPointeeType(), pointeeQualifiers, expandTypeVariables);
      objCType = objCType.endsWith("*") ? objCType + "*" : objCType + " *";
    } else if (type.isTypeVariable()) {
      if (expandTypeVariables) {
        ITypeBinding[] bounds = type.getTypeBounds();
        while (bounds.length > 0 && bounds[0].isTypeVariable()) {
          type = bounds[0];
          bounds = type.getTypeBounds();
        }
        objCType = constructObjCType(bounds);
      } else {
        objCType = ID_TYPE;
      }
    } else if (type.isPrimitive()) {
      objCType = primitiveTypeToObjC(type);
    } else {
      objCType = constructObjCType(type.getErasure());
    }
    if (qualifiers != null) {
      qualifiers = qualifiers.trim();
      if (!qualifiers.isEmpty()) {
        objCType += " " + qualifiers;
      }
    }

    return objCType;
  }

  private static String constructObjCType(ITypeBinding... types) {
    String classType = null;
    List<String> interfaces = Lists.newArrayListWithCapacity(types.length);
    for (ITypeBinding type : types) {
      if (type == null || isIdType(type) || Types.isJavaVoidType(type)) {
        continue;
      }
      if (type.isInterface()) {
        interfaces.add(getFullName(type));
      } else {
        assert classType == null;  // Can only have one class type.
        classType = getFullName(type);
      }
    }
    String protocols = interfaces.isEmpty() ? "" : "<" + Joiner.on(", ").join(interfaces) + ">";
    return classType == null ? ID_TYPE + protocols : classType + protocols + " *";
  }

  /**
   * Return a comma-separated list of field names from a fragments list.
   *
   * @param fragments a list of VariableDeclarationFragment instances
   */
  public static String fieldNames(List<?> fragments) {
    if (fragments.isEmpty()) {
      return "";
    }
    StringBuffer sb = new StringBuffer();
    for (Iterator<?> iterator = fragments.iterator(); iterator.hasNext();) {
      Object o = iterator.next();
      if (o instanceof VariableDeclarationFragment) {
        VariableDeclarationFragment fragment = (VariableDeclarationFragment) o;
        sb.append(fragment.getName().getIdentifier());
        if (iterator.hasNext()) {
          sb.append(", ");
        }
      } else {
        throw new AssertionError("unknown fragment type: " + o.getClass());
      }
    }
    return sb.toString();
  }

  /**
   * Return the full name of a type, including its package.  For outer types,
   * is the type's full name; for example, java.lang.Object's full name is
   * "JavaLangObject".  For inner classes, the full name is their outer class'
   * name plus the inner class name; for example, java.util.ArrayList.ListItr's
   * name is "JavaUtilArrayList_ListItr".
   */
  public static String getFullName(ITypeBinding binding) {
    String name = getFullNameInner(binding);
    return binding.isEnum() ? (name + "Enum") : name;
  }

  private static String getFullNameInner(ITypeBinding binding) {
    binding = Types.mapType(binding.getErasure());  // Make sure type variables aren't included.
    ITypeBinding outerBinding = binding.getDeclaringClass();
    if (binding.isLocal() && !binding.isAnonymous()) {
      String binaryName = binding.getBinaryName();
      int innerClassIndex = binaryName.lastIndexOf(binding.getName());
      while (innerClassIndex > 0 && binaryName.charAt(innerClassIndex - 1) != '$') {
        --innerClassIndex;
      }
      return getFullNameInner(outerBinding) + '_' + binaryName.substring(innerClassIndex);
    }
    if (outerBinding != null) {
      String baseName = getFullNameInner(outerBinding) + '_' + getName(binding);
      return (outerBinding.isEnum() && binding.isAnonymous()) ? baseName : baseName;
    }
    String name = binding.getQualifiedName();

    // Use ObjectiveCType annotation, if it exists.
    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, ObjectiveCName.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    }

    // Use mapping file entry, if it exists.
    if (Options.getClassMappings().containsKey(name)) {
      return Options.getClassMappings().get(name);
    }

    // Annotation-based mapping
    String annoName = BindingUtil.extractMappingName(binding);
    if (annoName != null) {
      return annoName;
    }

    // Use camel-cased package+class name.
    IPackageBinding pkg = binding.getPackage();
    String pkgName = pkg != null ? getPrefix(pkg) : "";
    return pkgName + binding.getName();
  }

  private static boolean isReservedName(String name) {
    return reservedNames.contains(name) || nsObjectMessages.contains(name);
  }

  public static String getMainTypeFullName(CompilationUnit unit) {
    PackageDeclaration pkg = unit.getPackage();
    if (pkg.isDefaultPackage()) {
      return unit.getMainTypeName();
    } else {
      return getPrefix(pkg.getPackageBinding()) + unit.getMainTypeName();
    }
  }

  public static String getStaticAccessorName(String varName) {
    // follow the Obj-C style guide for reader names, unless it's an illegal name
    return isReservedName(varName) ? "get" + capitalize(varName) : varName;
  }

  public static String getStaticVarQualifiedName(IVariableBinding var) {
    ITypeBinding declaringType = var.getDeclaringClass().getTypeDeclaration();
    return getFullName(declaringType) + "_" + getName(var) + (var.isEnumConstant() ? "" : "_");
  }

  public static String getStaticVarName(IVariableBinding var) {
    return getName(var) + (var.isEnumConstant() ? "" : "_");
  }

  public static String getPrimitiveConstantName(IVariableBinding constant) {
    return String.format("%s_%s", getFullName(constant.getDeclaringClass()), constant.getName());
  }

  public static String javaFieldToObjC(String fieldName) {
    return fieldName + "_";
  }

  public static void mapPackageToPrefix(String packageName, String prefix) {
    instance.prefixMap.put(packageName, prefix);
  }

  /**
   * Return the prefix for a specified package. If a prefix was specified
   * for the package, then that prefix is returned. Otherwise, a camel-cased
   * prefix is created from the package name.
   */
  public static String getPrefix(IPackageBinding packageBinding) {
    String packageName = packageBinding.getName();
    if (hasPrefix(packageName)) {
      return instance.prefixMap.get(packageName);
    }

    for (IAnnotationBinding annotation : packageBinding.getAnnotations()) {
      if (annotation.getName().endsWith("ObjectiveCName")) {
        String prefix = (String) BindingUtil.getAnnotationValue(annotation, "value");
        instance.prefixMap.put(packageName, prefix);
        // Don't return, as there may be a prefix annotation that overrides this value.
      }
    }

    String prefix = getPrefixFromPackageInfoSource(packageBinding);
    if (prefix == null) {
      prefix = getPrefixFromPackageInfoClass(packageName);
    }
    if (prefix == null) {
      prefix = camelCaseQualifiedName(packageName);
    }
    instance.prefixMap.put(packageName, prefix);
    return prefix;
  }

  /**
   * Check if there is a package-info.java source file with a prefix annotation.
   */
  private static String getPrefixFromPackageInfoSource(IPackageBinding packageBinding) {
    try {
      String expectedPackageInfoPath = packageBinding.getName();
      // Path will be null if this is the empty package.
      if (expectedPackageInfoPath == null) {
        expectedPackageInfoPath = "package-info.java";
      } else {
        expectedPackageInfoPath = expectedPackageInfoPath.replace('.', File.separatorChar)
            + File.separatorChar + "package-info.java";
      }
      InputFile file = FileUtil.findOnSourcePath(expectedPackageInfoPath);
      if (file != null) {
        String pkgInfo = FileUtil.readFile(file);
        int i = pkgInfo.indexOf("@ObjectiveCName");
        if (i == -1) {
          i = pkgInfo.indexOf("@com.google.j2objc.annotations.ObjectiveCName");
        }
        if (i > -1) {
          // Extract annotation's value string.
          i = pkgInfo.indexOf('"', i + 1);
          if (i > -1) {
            int j = pkgInfo.indexOf('"', i + 1);
            if (j > -1) {
              return pkgInfo.substring(i + 1, j);
            }
          }
        }
      }
    } catch (IOException e) {
      // Continue, as there's no package-info to check.
    } catch (StringIndexOutOfBoundsException e){
      // Similarly
    }
    return null;
  }

  /**
   * Check if there is a package-info class with a prefix annotation.
   */
  private static String getPrefixFromPackageInfoClass(String packageName) {
    try {
      Class<?> clazz = instance.classLoader.loadClass(packageName + ".package-info");
      ObjectiveCName objectiveCName = clazz.getAnnotation(ObjectiveCName.class);
      if (objectiveCName != null) {
        return objectiveCName.value();
      }
    } catch (ClassNotFoundException e) {
      // Class does not exist -- ignore exception.
    } catch (SecurityException e) {
      // Failed fetching a package-info class from a secure package -- ignore exception.
    }
    return null;
  }

  public static boolean hasPrefix(String packageName) {
    return instance.prefixMap.containsKey(packageName);
  }
}
