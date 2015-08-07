/*
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

import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.devtools.j2objc.ast.Annotation;
import com.google.devtools.j2objc.types.IOSBlockTypeBinding;
import com.google.devtools.j2objc.types.IOSMethod;
import com.google.devtools.j2objc.types.IOSParameter;
import com.google.j2objc.annotations.Adapter;
import com.google.j2objc.annotations.DotMapping;
import com.google.j2objc.annotations.ExtensionMapping;
import com.google.j2objc.annotations.GlobalConstant;
import com.google.j2objc.annotations.GlobalFunction;
import com.google.j2objc.annotations.Library;
import com.google.j2objc.annotations.Mapping;
import com.google.j2objc.annotations.NotImplemented;
import com.google.j2objc.annotations.Representing;
import com.google.j2objc.annotations.Weak;
import com.google.j2objc.annotations.WeakOuter;

import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.internal.compiler.lookup.Binding;

import java.lang.annotation.RetentionPolicy;
import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Utility methods for working with binding types.
 *
 * @author Keith Stanger
 */
public final class BindingUtil {

  // Flags defined in JVM spec, table 4.1. These constants are also defined in
  // java.lang.reflect.Modifier, but aren't public.
  public static final int ACC_BRIDGE = 0x40;
  public static final int ACC_VARARGS = 0x80;
  public static final int ACC_SYNTHETIC = 0x1000;
  public static final int ACC_ANNOTATION = 0x2000;
  public static final int ACC_ENUM = 0x4000;

  // Not defined in JVM spec, but used by reflection support.
  public static final int ACC_ANONYMOUS = 0x8000;

  public static boolean isStatic(IBinding binding) {
    return Modifier.isStatic(binding.getModifiers());
  }

  public static boolean isFinal(IBinding binding) {
    return Modifier.isFinal(binding.getModifiers());
  }

  public static boolean isPrivate(IBinding binding) {
    return Modifier.isPrivate(binding.getModifiers());
  }

  public static boolean isPrimitiveConstant(IVariableBinding binding) {
    return isConstant(binding) && binding.getType().isPrimitive();
  }

  public static boolean isConstant(IVariableBinding binding) {
    return binding != null && isStatic(binding) && isFinal(binding)
        && binding.getConstantValue() != null;
  }

  public static boolean isAbstract(IBinding binding) {
    return Modifier.isAbstract(binding.getModifiers());
  }

  public static boolean isNative(IBinding binding) {
    return Modifier.isNative(binding.getModifiers());
  }

  public static boolean isSynchronized(IBinding binding) {
    return Modifier.isSynchronized(binding.getModifiers());
  }

  public static boolean isSynthetic(int modifiers) {
    return (modifiers & ACC_SYNTHETIC) > 0;
  }

  public static boolean isSynthetic(IMethodBinding m) {
    return isSynthetic(m.getModifiers());
  }

  /**
   * Determines if a type can access fields and methods from an outer class.
   */
  public static boolean hasOuterContext(ITypeBinding type) {
    if (type.getDeclaringClass() == null) {
      return false;
    }
    // Local types can't be declared static, but if the declaring method is
    // static then the local type is effectively static.
    IMethodBinding declaringMethod = type.getTypeDeclaration().getDeclaringMethod();
    if (declaringMethod != null) {
      return !BindingUtil.isStatic(declaringMethod);
    }
    return !BindingUtil.isStatic(type);
  }

  /**
   * Convert an IBinding to a ITypeBinding. Returns null if the binding cannot
   * be converted to a type binding.
   */
  public static ITypeBinding toTypeBinding(IBinding binding) {
    if (binding instanceof ITypeBinding) {
      return (ITypeBinding) binding;
    } else if (binding instanceof IMethodBinding) {
      IMethodBinding m = (IMethodBinding) binding;
      return m.isConstructor() ? m.getDeclaringClass() : m.getReturnType();
    } else if (binding instanceof IVariableBinding) {
      return ((IVariableBinding) binding).getType();
    } else if (binding instanceof IAnnotationBinding) {
      return ((IAnnotationBinding) binding).getAnnotationType();
    }
    return null;
  }

  /**
   * Returns a set containing the bindings of all classes and interfaces that
   * are inherited by the given type.
   */
  public static Set<ITypeBinding> getAllInheritedTypes(ITypeBinding type) {
    Set<ITypeBinding> inheritedTypes = Sets.newHashSet();
    collectAllInheritedTypes(type, inheritedTypes);
    return inheritedTypes;
  }

  public static void collectAllInheritedTypes(ITypeBinding type, Set<ITypeBinding> inheritedTypes) {
    collectAllInterfaces(type, inheritedTypes);
    while (true) {
      type = type.getSuperclass();
      if (type == null) {
        break;
      }
      inheritedTypes.add(type);
    }
  }

  /**
   * Returns a set containing bindings of all interfaces implemented by the
   * given class, and all super-interfaces of those.
   */
  public static Set<ITypeBinding> getAllInterfaces(ITypeBinding type) {
    Set<ITypeBinding> interfaces = Sets.newHashSet();
    collectAllInterfaces(type, interfaces);
    return interfaces;
  }

  public static void collectAllInterfaces(ITypeBinding type, Set<ITypeBinding> interfaces) {
    Deque<ITypeBinding> typeQueue = Lists.newLinkedList();

    while (type != null) {
      typeQueue.add(type);
      type = type.getSuperclass();
    }

    while (!typeQueue.isEmpty()) {
      ITypeBinding nextType = typeQueue.poll();
      List<ITypeBinding> newInterfaces = Arrays.asList(nextType.getInterfaces());
      interfaces.addAll(newInterfaces);
      typeQueue.addAll(newInterfaces);
    }
  }

  /**
   * Returns the type binding for a specific interface of a specific type.
   */
  public static ITypeBinding findInterface(ITypeBinding implementingType, String qualifiedName) {
    if (implementingType.isInterface()
        && implementingType.getErasure().getQualifiedName().equals(qualifiedName)) {
      return implementingType;
    }
    for (ITypeBinding interfaze : getAllInterfaces(implementingType)) {
      if (interfaze.getErasure().getQualifiedName().equals(qualifiedName)) {
        return interfaze;
      }
    }
    return null;
  }

  /**
   * Returns the inner type with the specified name.
   */
  public static ITypeBinding findDeclaredType(ITypeBinding type, String name) {
    for (ITypeBinding innerType : type.getDeclaredTypes()) {
      if (innerType.getName().equals(name)) {
        return innerType;
      }
    }
    return null;
  }

  /**
   * Returns the method binding for a specific method of a specific type.
   */
  public static IMethodBinding findDeclaredMethod(
      ITypeBinding type, String methodName, String... paramTypes) {
    outer: for (IMethodBinding method : type.getDeclaredMethods()) {
      if (method.getName().equals(methodName)) {
        ITypeBinding[] foundParamTypes = method.getParameterTypes();
        if (paramTypes.length == foundParamTypes.length) {
          for (int i = 0; i < paramTypes.length; i++) {
            if (!paramTypes[i].equals(foundParamTypes[i].getQualifiedName())) {
              continue outer;
            }
          }
          return method;
        }
      }
    }
    return null;
  }

  public static String getMethodKey(IMethodBinding binding) {
    return binding.getDeclaringClass().getBinaryName() + '.' + binding.getName()
        + getSignature(binding);
  }

  public static String getSignature(IMethodBinding binding) {
    StringBuilder sb = new StringBuilder("(");
    for (ITypeBinding parameter : binding.getParameterTypes()) {
      appendParameterSignature(parameter.getErasure(), sb);
    }
    sb.append(')');
    if (binding.getReturnType() != null) {
      appendParameterSignature(binding.getReturnType().getErasure(), sb);
    }
    return sb.toString();
  }

  private static void appendParameterSignature(ITypeBinding parameter, StringBuilder sb) {
    if (!parameter.isPrimitive() && !parameter.isArray()) {
      sb.append('L');
    }
    sb.append(parameter.getBinaryName().replace('.', '/'));
    if (!parameter.isPrimitive() && !parameter.isArray()) {
      sb.append(';');
    }
  }

  public static boolean hasAnnotation(IBinding binding, Class<?> annotationClass) {
    return getAnnotation(binding, annotationClass) != null;
  }

  /**
   * Less strict version of the above where we don't care about the annotation's package.
   */
  public static boolean hasNamedAnnotation(IBinding binding, String annotationName) {
    for (IAnnotationBinding annotation : binding.getAnnotations()) {
      if (annotation.getName().equals(annotationName)) {
        return true;
      }
    }
    return false;
  }

  public static List<IAnnotationBinding> getAnnotations(IBinding binding, Class<?> annotationClass) {
    List<IAnnotationBinding> out = Lists.newArrayList();
    for (IAnnotationBinding annotation : binding.getAnnotations()) {
      if (typeEqualsClass(annotation.getAnnotationType(), annotationClass)) {
        out.add(annotation);
      }
    }

    return out;
  }

  public static IAnnotationBinding getAnnotation(IBinding binding, Class<?> annotationClass) {
    return getAnnotation(binding.getAnnotations(), annotationClass);
  }

  public static IAnnotationBinding getAnnotation(IAnnotationBinding[] annotations, Class<?> annotationClass) {
    for (IAnnotationBinding annotation : annotations) {
      if (typeEqualsClass(annotation.getAnnotationType(), annotationClass)) {
        return annotation;
      }
    }
    return null;
  }

  public static boolean typeEqualsClass(ITypeBinding type, Class<?> cls) {
    return type.getQualifiedName().equals(cls.getName());
  }

  public static Object getAnnotationValue(IAnnotationBinding annotation, String name) {
    for (IMemberValuePairBinding pair : annotation.getAllMemberValuePairs()) {
      if (name.equals(pair.getName())) {
        return pair.getValue();
      }
    }
    return null;
  }

  public static boolean isWeakReference(IVariableBinding var) {
    return hasNamedAnnotation(var, Weak.class.getSimpleName())
        || var.getName().startsWith("this$")
        && hasNamedAnnotation(var.getDeclaringClass(), WeakOuter.class.getSimpleName());
  }

  /**
   * Returns true if the specified binding is of an annotation that has
   * a runtime retention policy.
   */
  public static boolean isRuntimeAnnotation(IAnnotationBinding binding) {
    return isRuntimeAnnotation(binding.getAnnotationType());
  }

  /**
   * Returns true if the specified binding is of an annotation that has
   * a runtime retention policy.
   */
  public static boolean isRuntimeAnnotation(ITypeBinding binding) {
    if (binding != null && binding.isAnnotation()) {
      for (IAnnotationBinding ann : binding.getAnnotations()) {
        if (ann.getName().equals("Retention")) {
          IVariableBinding retentionBinding =
              (IVariableBinding) ann.getDeclaredMemberValuePairs()[0].getValue();
          return retentionBinding.getName().equals(RetentionPolicy.RUNTIME.name());
        }
      }
      if (binding.isNested()) {
        return BindingUtil.isRuntimeAnnotation(binding.getDeclaringClass());
      }
    }
    return false;
  }

  /**
   * Returns an alphabetically sorted list of an annotation type's members.
   * This is necessary since an annotation's values can be specified in any
   * order, but the annotation's constructor needs to be invoked using its
   * declaration order.
   */
  public static IMethodBinding[] getSortedAnnotationMembers(ITypeBinding annotation) {
    IMethodBinding[] members = annotation.getDeclaredMethods();
    Arrays.sort(members, new Comparator<IMethodBinding>() {
      @Override
      public int compare(IMethodBinding o1, IMethodBinding o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    return members;
  }

  /**
   * Returns an alphabetically sorted list of an annotation's member values.
   * This is necessary since an annotation's values can be specified in any
   * order, but the annotation's constructor needs to be invoked using its
   * declaration order.
   */
  public static IMemberValuePairBinding[] getSortedMemberValuePairs(
      IAnnotationBinding annotation) {
    IMemberValuePairBinding[] valuePairs = annotation.getAllMemberValuePairs();
    Arrays.sort(valuePairs, new Comparator<IMemberValuePairBinding>() {
      @Override
      public int compare(IMemberValuePairBinding o1, IMemberValuePairBinding o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    return valuePairs;
  }

  /**
   * Returns true if method is an Objective-C dealloc method.
   */
  public static boolean isDestructor(IMethodBinding m) {
    String methodName = m.getName();
    return !m.isConstructor() && !isStatic(m) && m.getParameterTypes().length == 0
        && (methodName.equals(NameTable.FINALIZE_METHOD)
            || methodName.equals(NameTable.DEALLOC_METHOD));
  }

  public static Iterable<ITypeBinding> flattenInterface(ITypeBinding interfaze) {
    assert interfaze.isInterface();
    List<ITypeBinding> out = Lists.newArrayList();

    out.add(interfaze);
    for (ITypeBinding one : interfaze.getInterfaces()) {
      for (ITypeBinding more : flattenInterface(one)) {
        out.add(more);
      }
    }

    return out;
  }

  public static String extractMappingName(IBinding binding) {
    if (binding == null) {
      return null;
    }

    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, Mapping.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    } else {
      return null;
    }
  }

  public static String extractExtensionMappingName(IBinding binding) {
    if (binding == null) {
      return null;
    }

    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, ExtensionMapping.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    } else {
      return null;
    }
  }

  public static String extractDotMappingName(IBinding binding) {
    if (binding == null) {
      return null;
    }

    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, DotMapping.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    } else {
      return null;
    }
  }

  public static String extractGlobalConstantName(IBinding binding) {
    if (binding == null) {
      return null;
    }

    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, GlobalConstant.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    } else {
      return null;
    }
  }

  public static String extractGlobalFunctionName(IBinding binding) {
    if (binding == null) {
      return null;
    }

    IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, GlobalFunction.class);
    if (annotation != null) {
      return (String) BindingUtil.getAnnotationValue(annotation, "value");
    } else {
      return null;
    }
  }

  public static String extractLibraryName(ITypeBinding binding) {
    if (binding == null) {
      return null;
    } else {
      IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, Library.class);
      if (annotation != null) {
        return (String) BindingUtil.getAnnotationValue(annotation, "value");
      } else {
        return null;
      }
    }
  }

  public static boolean extractLibraryUseQuotes(ITypeBinding binding) {
    if (binding == null) {
      return false;
    } else {
      IAnnotationBinding annotation = BindingUtil.getAnnotation(binding, Library.class);
      if (annotation != null) {
        return (Boolean) BindingUtil.getAnnotationValue(annotation, "useQuotes");
      } else {
        return false;
      }
    }
  }

  public static boolean isAdapter(ITypeBinding binding) {
    if (binding == null) {
      return false;
    } else {
      return BindingUtil.getAnnotation(binding, Adapter.class) != null;
    }
  }

  public static boolean isMappedToNative(IBinding binding) {
    if (binding instanceof IMethodBinding
        && ((IMethodBinding) binding).isConstructor()) {
      return extractMappingName(binding) != null
             || extractMappingName(((IMethodBinding) binding).getDeclaringClass()) != null;
    } else {
      return extractMappingName(binding) != null
             || extractExtensionMappingName(binding) != null
             || extractDotMappingName(binding) != null
             || extractGlobalConstantName(binding) != null
             || extractGlobalFunctionName(binding) != null
             || (binding instanceof ITypeBinding
                 && BindingUtil.isAdapter((ITypeBinding) binding));
    }
  }

  public static List<IMethodBinding> getOverridingMethodsAndSelf(IMethodBinding method) {
    List<IMethodBinding> out = Lists.newArrayList();

    ITypeBinding currentCls = method.getDeclaringClass();

    while (currentCls != null) { // jdt's system has been messed up, so one cant do it in usual way
      for (IMethodBinding binding : currentCls.getDeclaredMethods()) {
        if (binding.isEqualTo(method) || method.overrides(binding)) {
          out.add(binding);
        }
      }

      for (ITypeBinding directInterface : currentCls.getInterfaces()) {
        for (ITypeBinding interfaze : flattenInterface(directInterface)) {
          for (IMethodBinding binding : interfaze.getDeclaredMethods()) {
            // TODO: check if this is the way jdt handles interface implementation
            if (method.isSubsignature(binding)) {
              out.add(binding);
            }
          }
        }
      }

      currentCls = currentCls.getSuperclass();
    }

    return out;
  }

  static final Splitter IOS_METHOD_PART_SPLITTER =
      Splitter.on(Pattern.compile(":"));
  /**
   * NOTE: this helper only analyzes the @Mapping annotation
   * Attempt to get a mapped method for given method binding by the following logic
   * 1. Iterate through declaringClass and all its ancestors
   * 2. For each class, check declared methods that are overrided to see if a mapping exists
   * 3. For each class, check all interfaces and their ancestors to determine if a mapping exits
   *
   * Information is gathered to make sure no conflicting mappings exist and a assembled IOSMethod,
   *   will return. Otherwise an exception will be thrown. Returns null if no such mapping is found.
   */
  public static IOSMethod getMappedMethod(IMethodBinding method) {
    return getMappedMethod(method, false);
  }

  public static IOSMethod getMappedMethod(IMethodBinding method, boolean isExtension) {
    if (method == null) {
      return null;
    }

    List<String> candidates = Lists.newArrayList();
    List<IMethodBinding> methodCandidates = Lists.newArrayList();

    // this is a hack to work around binding info being inconsistent
    String mappingName = null;
    if (!isExtension) {
      for (IMethodBinding binding : getOverridingMethodsAndSelf(method)) {
        mappingName = extractMappingName(binding);
        if (mappingName != null) {
          candidates.add(mappingName);
          methodCandidates.add(binding);
        }
      }
    } else {
      mappingName = extractExtensionMappingName(method);
    }

    if (mappingName != null) {
      candidates.add(mappingName);
      methodCandidates.add(method);
    }
    assert candidates.size() == methodCandidates.size();

    if (candidates.size() == 0) {
      // None is found
      return null;
    } else {
      String methodName = candidates.get(0);
      int ind = 0;
      for (String curName : candidates) {
        if (!curName.equals(methodName)) {
          if (method.isConstructor()) {
            // TODO: it's possible for a super constructor to share the same java signature (unfortunately)
            //   so we will allow for this case for now
          } else {
            ErrorUtil.error(
                "Ambiguous mapping specified for " + method.getName() + ". Detected " + methodName +
                " and " + curName);
            System.err.println("this " + method);
            System.err.println("this " + method.getClass());
            System.err.println("that  " + methodCandidates.get(ind));
            System.err.println("that  " + methodCandidates.get(ind).getClass());
            System.err.println("is equal? " + methodCandidates.get(ind).isEqualTo(method));
            System.err.println("overrides? " + method.overrides(methodCandidates.get(ind)));
            return null;
          }
        }
        ind++;
      }

      IMethodBinding methodBinding = methodCandidates.get(0);
      for (IMethodBinding curMethod : methodCandidates) {
//        ITypeBinding[] curMethodParamTypes = curMethod.getParameterTypes();
//        ITypeBinding[] methodParamTypes = methodBinding.getParameterTypes();
//        boolean isMismatche = false;
//        for (int i = 0; i < curMethodParamTypes.length; i++) {
//          if (!curMethodParamTypes[i].equals(methodParamTypes[i])) {
//            if ()
//          }
//        }
        if (!Arrays.equals(curMethod.getParameterTypes(), methodBinding.getParameterTypes())) {
          ErrorUtil.error(
              "Ambiguous parameters: " + methodBinding.toString() + ", " + curMethod.toString());
          return null;
        }
        for (int i = 0; i < methodBinding.getParameterTypes().length; i++) {
          IAnnotationBinding annotation = getAnnotation(
              methodBinding.getParameterAnnotations(i), Representing.class);
          IAnnotationBinding otherAnnotation = getAnnotation(
              curMethod.getParameterAnnotations(i), Representing.class);
          if ((annotation == null ^ otherAnnotation == null) ||
              (annotation != null && !(annotation.isEqualTo(otherAnnotation)))) {
            ErrorUtil.error(
                "Ambiguous representing clause: " + methodBinding.toString() + ", " + curMethod.toString());
            return null;
          }
        }
      }
      List<String> methodParts = Lists.newArrayList(IOS_METHOD_PART_SPLITTER.split(methodName));
      ITypeBinding[] paramTypes = method.getParameterTypes();
      if (isExtension) {
        if (paramTypes.length < 1) {
          ErrorUtil.error(
              "Extension method doesnt have this: " + method);
        }

        List<ITypeBinding> newParams = Arrays.asList(paramTypes).subList(1, paramTypes.length);
        paramTypes = newParams.toArray(new ITypeBinding[newParams.size()]);
      }
      if (methodName.endsWith(":")) {
        // has arguments
        if (methodParts.size() != paramTypes.length + 1) {
          ErrorUtil.error(
              "Illegal selector: " + methodName + " for " + methodBinding.getName());
          System.err.println(methodParts);
          System.err.println(methodParts.size());
          System.err.println(paramTypes.length);
          return null;
        }
      } else {
        if (paramTypes.length != 0) {
          ErrorUtil.error(
              "Illegal selector: " + methodName + " for " + methodBinding.getName() +
              ". Didn't expect parameters");
          return null;
        }
      }
      ImmutableList.Builder<IOSParameter> parameters = ImmutableList.builder();
      for (int i = 0; i < paramTypes.length; i++) {
        ITypeBinding typeBinding = paramTypes[i];
        IAnnotationBinding representingAnno = getAnnotation(
            methodBinding.getParameterAnnotations(i), Representing.class);
        IOSBlockTypeBinding nativeBlockType = getBlockType(
            methodBinding.getParameterAnnotations(i),
            methodBinding.getParameterTypes()[i]
        );
        String type;
        if (representingAnno != null) {
          type = (String) getAnnotationValue(representingAnno, "value");
        } else if (nativeBlockType != null) {
          type = nativeBlockType.getParameterSignature();
        } else {
          type = NameTable.getObjCType(typeBinding);
        }

        parameters.add(new IOSParameter(methodParts.get(i), type, i));
      }

      String className = NameTable.getName(method.getDeclaringClass());
      return new IOSMethod(methodParts.get(0), className, parameters.build(), false);
    }

  }

  public static IOSBlockTypeBinding getBlockType(IAnnotationBinding[] annotations, ITypeBinding blockTpe) {
    IAnnotationBinding blockAnno = BindingUtil.getAnnotation(
        annotations,
        com.google.j2objc.annotations.Block.class
    );
    if (blockAnno == null) {
      return null;
    }
    if (blockTpe instanceof IOSBlockTypeBinding) {
      return (IOSBlockTypeBinding) blockTpe;
    }

    Object[] argObjs = BlockBridge.paramTypes(blockAnno, blockTpe);
    List<String> args = Lists.newArrayList();
    for (Object argObj : argObjs) {
      args.add((String) argObj);
    }
    IOSBlockTypeBinding nativeBlockType = new IOSBlockTypeBinding(
        BlockBridge.returnType(blockAnno, blockTpe),
        args,
        blockTpe
    );

    return nativeBlockType;
  }

  public static ITypeBinding lookupSuperTypeByName(ITypeBinding tpe, String superType) {
    ITypeBinding currentCls = tpe;

    if (currentCls.isInterface()) {
      return null;
    }

    while (currentCls != null) { // jdt's system has been messed up, so one cant do it in usual way
      // TODO: change to qualified name
      if (currentCls.getName().equals(superType)) {
        return currentCls;
      }
      currentCls = currentCls.getSuperclass();
    }

    return null;
  }

  public static boolean isValueType(ITypeBinding type) {
    return lookupSuperTypeByName(type, "ValueType") != null;
  }

  public static boolean isObjCType(ITypeBinding tpe) {
    return !BindingUtil.isValueType(tpe);
  }

  public static boolean isCFType(ITypeBinding type) {
    return lookupSuperTypeByName(type, "CFType") != null;
  }

  public static class BlockBridge {
    public static IMethodBinding runMethod(IAnnotationBinding blockAnnotation, ITypeBinding blockTpe) {
      List<IMethodBinding> runMethodCandidates = new ArrayList<IMethodBinding>();
      runMethodCandidates.addAll(
          Collections2.filter(
              Lists.newArrayList(blockTpe.getDeclaredMethods()),
              new Predicate<IMethodBinding>() {
                @Override
                public boolean apply(IMethodBinding input) {
                  return input.getName().equals("run");
                }
              }
          )
      );
      for (ITypeBinding superTpe : getAllInheritedTypes(blockTpe)) {
        runMethodCandidates.addAll(
            Collections2.filter(
                Lists.newArrayList(superTpe.getDeclaredMethods()),
                new Predicate<IMethodBinding>() {
                  @Override
                  public boolean apply(IMethodBinding input) {
                    return input.getName().equals("run");
                  }
                }
            )
        );
      }

      assert runMethodCandidates.size() == 1
          : "There should be one and only one run method in a Block type, but got: "
            + runMethodCandidates
            + " and type is: " + blockTpe
            + " methods are: " + Arrays.toString(blockTpe.getDeclaredMethods());

      return (IMethodBinding) runMethodCandidates.toArray()[0];
    }

    public static String returnType(IAnnotationBinding blockAnnotation, ITypeBinding blockTpe) {
      IMethodBinding runMethod = runMethod(blockAnnotation, blockTpe);

      String blockRet = (String) BindingUtil.getAnnotationValue(blockAnnotation, "ret");
      if ("".equals(blockRet)) {
        blockRet = NameTable.getSpecificObjCType(runMethod.getReturnType());
      }

      return blockRet;
    }

    public static String[] paramTypes(IAnnotationBinding blockAnnotation, ITypeBinding blockTpe) {
      IMethodBinding runMethod = runMethod(blockAnnotation, blockTpe);
      Object[] blockParams = (Object[]) BindingUtil.getAnnotationValue(blockAnnotation, "params");

      ITypeBinding[] paramTpes = runMethod.getParameterTypes();
      List<String> out = Lists.newArrayList();

      if (blockParams.length != paramTpes.length) {
        for (int i = 0; i < paramTpes.length; i++) {
          out.add(NameTable.getSpecificObjCType(paramTpes[i]));
        }
      } else {
        for (int i = 0; i < paramTpes.length; i++) {
          out.add((String) blockParams[i]);
        }
      }

      return out.toArray(new String[paramTpes.length]);
    }
  }

  public static IAnnotationBinding[] flattenMethodAnnotations(IMethodBinding binding) {
    ArrayList<IAnnotationBinding> out = new ArrayList<IAnnotationBinding>();
    for (IMethodBinding method : getOverridingMethodsAndSelf(binding)) {
      for (IAnnotationBinding anno : method.getAnnotations()) {
        out.add(anno);
      }
    }

    return out.toArray(new IAnnotationBinding[out.size()]);
  }

  public static IAnnotationBinding[] flattenParameterAnnotations(IMethodBinding binding, int index) {
    ArrayList<IAnnotationBinding> out = new ArrayList<IAnnotationBinding>();
    for (IMethodBinding method : getOverridingMethodsAndSelf(binding)) {
      for (IAnnotationBinding anno : method.getParameterAnnotations(index)) {
        out.add(anno);
      }
    }

    return out.toArray(new IAnnotationBinding[out.size()]);
  }

  public static IAnnotationBinding[] extractAnnotationBindings(List<Annotation> list) {
    IAnnotationBinding[] annotations = new IAnnotationBinding[list.size()];
    for (int i = 0; i < annotations.length; i++) {
      annotations[i] = list.get(i).getAnnotationBinding();
    }

    return annotations;
  }
}

