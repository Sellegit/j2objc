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

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.devtools.j2objc.types.IOSBlockTypeBinding;
import com.google.devtools.j2objc.types.IOSMethod;
import com.google.devtools.j2objc.types.IOSParameter;
import com.google.j2objc.annotations.DotMapping;
import com.google.j2objc.annotations.GlobalConstant;
import com.google.j2objc.annotations.Mapping;
import com.google.j2objc.annotations.Representing;
import com.google.j2objc.annotations.Weak;
import com.google.j2objc.annotations.WeakOuter;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.osgi.framework.debug.Debug;

import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
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
   * If this method overrides another method, return the binding for the
   * original declaration.
   */
  public static IMethodBinding getOriginalMethodBinding(IMethodBinding method) {
    if (!method.isConstructor()) {
      for (ITypeBinding inheritedType : getAllInheritedTypes(method.getDeclaringClass())) {
        for (IMethodBinding interfaceMethod : inheritedType.getDeclaredMethods()) {
          if (method.overrides(interfaceMethod)) {
            method = interfaceMethod;
          }
        }
      }
    }
    return method.getMethodDeclaration();
  }

  /**
   * Returns a set containing the bindings of all classes and interfaces that
   * are inherited by the given type.
   */
  public static Set<ITypeBinding> getAllInheritedTypes(ITypeBinding type) {
    Set<ITypeBinding> inheritedTypes = getAllInterfaces(type);
    while (true) {
      type = type.getSuperclass();
      if (type == null) {
        break;
      }
      inheritedTypes.add(type);
    }
    return inheritedTypes;
  }

  /**
   * Returns a set containing bindings of all interfaces implemented by the
   * given class, and all super-interfaces of those.
   */
  public static Set<ITypeBinding> getAllInterfaces(ITypeBinding type) {
    Set<ITypeBinding> allInterfaces = Sets.newHashSet();
    Deque<ITypeBinding> typeQueue = Lists.newLinkedList();

    while (type != null) {
      typeQueue.add(type);
      type = type.getSuperclass();
    }

    while (!typeQueue.isEmpty()) {
      ITypeBinding nextType = typeQueue.poll();
      List<ITypeBinding> newInterfaces = Arrays.asList(nextType.getInterfaces());
      allInterfaces.addAll(newInterfaces);
      typeQueue.addAll(newInterfaces);
    }

    return allInterfaces;
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

  /**
   * Returns the signature of an element, defined in the Java Language
   * Specification 3rd edition, section 13.1.
   */
  public static String getSignature(IBinding binding) {
    if (binding instanceof ITypeBinding) {
      return ((ITypeBinding) binding).getBinaryName();
    }
    if (binding instanceof IMethodBinding) {
      return getSignature((IMethodBinding) binding);
    }
    return binding.getName();
  }

  private static String getSignature(IMethodBinding binding) {
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
    return hasAnnotation(var, Weak.class)
        || var.getName().startsWith("this$")
        && hasAnnotation(var.getDeclaringClass(), WeakOuter.class);
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
    if (binding != null) {
      for (IAnnotationBinding ann : binding.getAnnotations()) {
        if (ann.getName().equals("Retention")) {
          IVariableBinding retentionBinding =
              (IVariableBinding) ann.getDeclaredMemberValuePairs()[0].getValue();
          return retentionBinding.getName().equals(RetentionPolicy.RUNTIME.name());
        }
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
    String methodName = NameTable.getName(m);
    return methodName.equals(NameTable.FINALIZE_METHOD)
        || methodName.equals(NameTable.DEALLOC_METHOD);
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

  public static boolean isMappedToNative(IBinding binding) {
    return extractMappingName(binding) != null
        || extractDotMappingName(binding) != null
        || extractGlobalConstantName(binding) != null;
  }

  static final Splitter IOS_METHOD_PART_SPLITTER =
      Splitter.on(Pattern.compile(":")).omitEmptyStrings().trimResults();
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
    if (method == null) {
      return null;
    }

    List<String> candidates = Lists.newArrayList();
    List<IMethodBinding> methodCandidates = Lists.newArrayList();
    ITypeBinding currentCls = method.getDeclaringClass();

    // this is a hack to work around binding info being inconsistent
    String mappingName = extractMappingName(method);
    if (mappingName != null) {
      candidates.add(mappingName);
      methodCandidates.add(method);
    }
//    while (!currentCls.isEqualTo(Types.resolveJavaType("java.lang.Object"))) {
    while (currentCls != null) { // jdt's system has been messed up, so one cant do it in usual way
      for (IMethodBinding binding : currentCls.getDeclaredMethods()) {
        if (binding.isEqualTo(method) || method.overrides(binding)) {
          mappingName = extractMappingName(binding);
          if (mappingName != null) {
            candidates.add(mappingName);
            methodCandidates.add(binding);
          }
        }
      }

      for (ITypeBinding directInterface : currentCls.getInterfaces()) {
        for (ITypeBinding interfaze : flattenInterface(directInterface)) {
          for (IMethodBinding binding : interfaze.getDeclaredMethods()) {
            // TODO: check if this is the way jdt handles interface implementation
            if (method.isSubsignature(binding)) {
              mappingName = extractMappingName(binding);
              if (mappingName != null) {
                candidates.add(mappingName);
                methodCandidates.add(binding);
              }
            }
          }
        }
      }

//      if (currentCls.getSuperclass() == null) {
//        ErrorUtil.error(currentCls.getName() + "'s super class is null.");
//      }
      currentCls = currentCls.getSuperclass();
    }

    assert candidates.size() == methodCandidates.size();

    if (candidates.size() == 0) {
      // None is found
      return null;
    } else {
      String methodName = candidates.get(0);
      for (String curName : candidates) {
        if (!curName.equals(methodName)) {
          ErrorUtil.error(
              "Ambiguous mapping specified for " + method.getName() + ". Detected " + methodName +
              " and " + curName);
          return null;
        }
      }

      IMethodBinding methodBinding = methodCandidates.get(0);
      for (IMethodBinding curMethod : methodCandidates) {
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
              (annotation != null && !(annotation.equals(otherAnnotation)))) {
            ErrorUtil.error(
                "Ambiguous representing clause: " + methodBinding.toString() + ", " + curMethod.toString());
            return null;
          }
        }
      }
jj
      List<String> methodParts = Lists.newArrayList(IOS_METHOD_PART_SPLITTER.split(methodName));
      ITypeBinding[] paramTypes = method.getParameterTypes();
      if (methodName.endsWith(":")) {
        // has arguments
        if (methodParts.size() != paramTypes.length) {
          ErrorUtil.error(
              "Illegal selector: " + methodName + " for " + methodBinding.getName());
          return null;
        }
      } else {
        if (paramTypes.length != 0) {
          ErrorUtil.error(
              "Illegal selector: " + methodName + " for " + methodBinding.getName() +
              ". Don't expect parameters");
          return null;
        }
      }
      ImmutableList.Builder<IOSParameter> parameters = ImmutableList.builder();
      for (int i = 0; i < paramTypes.length; i++) {
        ITypeBinding typeBinding = paramTypes[i];
        IAnnotationBinding representingAnno = getAnnotation(
            methodBinding.getParameterAnnotations(i), Representing.class);
        IOSBlockTypeBinding nativeBlockType = getBlockType(
            methodBinding.getParameterAnnotations(i)
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

  public static IOSBlockTypeBinding getBlockType(IAnnotationBinding[] annotations) {
    IAnnotationBinding blockAnno = BindingUtil.getAnnotation(
        annotations,
        com.google.j2objc.annotations.Block.class
    );
    if (blockAnno == null) {
      return null;
    }

    Object[] argObjs = (Object[]) BindingUtil.getAnnotationValue(blockAnno, "params");
    List<String> args = Lists.newArrayList();
    for (Object argObj : argObjs) {
      args.add((String) argObj);
    }
    IOSBlockTypeBinding nativeBlockType = new IOSBlockTypeBinding(
        (String) BindingUtil.getAnnotationValue(blockAnno, "ret"),
        args
    );

    return nativeBlockType;
  }

  public static boolean isValueType(ITypeBinding type) {
    ITypeBinding currentCls = type;

    if (currentCls.isInterface()) {
      return false;
    }

    while (currentCls != null) { // jdt's system has been messed up, so one cant do it in usual way
      // TODO: change to qualified name
      if (currentCls.getName().equals("ValueType")) {
        return true;
      }
      currentCls = currentCls.getSuperclass();
    }

    return false;
  }
}
