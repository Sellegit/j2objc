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

package com.google.devtools.j2objc.types;

import com.google.devtools.j2objc.util.BindingUtil;

import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;

/**
 * IOSMethodBinding: synthetic binding for an iOS method.
 *
 * @author Tom Ball
 */
public class IOSMethodBinding extends GeneratedMethodBinding {

  private final IOSMethod iosMethod;
  private final ITypeBinding[] exceptionTypes;

  private static final ITypeBinding[] EMPTY_TYPES = new ITypeBinding[0];

  private IOSMethodBinding(
      IOSMethod iosMethod, IMethodBinding original, int modifiers, ITypeBinding returnType,
      IMethodBinding methodDeclaration, ITypeBinding declaringClass, ITypeBinding[] exceptionTypes,
      boolean varargs, boolean synthetic) {
    super(original, iosMethod.getName(), modifiers, returnType, methodDeclaration, declaringClass,
          false, varargs, synthetic);
    this.exceptionTypes = exceptionTypes != null ? exceptionTypes : EMPTY_TYPES;
    this.iosMethod = iosMethod;
  }

  public static IOSMethodBinding newMappedMethod(IOSMethod iosMethod, IMethodBinding original) {
    ITypeBinding returnType =
        original.isConstructor() ? original.getDeclaringClass() : original.getReturnType();
    ITypeBinding declaringClass = Types.resolveIOSType(iosMethod.getDeclaringClass());
    if (declaringClass == null) {
      String mappingName = BindingUtil.extractMappingName(original.getDeclaringClass());
      if (mappingName != null) {
        declaringClass = original.getDeclaringClass();
      } else {
        declaringClass = IOSTypeBinding.newUnmappedClass(iosMethod.getDeclaringClass());
      }
    }
    IOSMethodBinding binding = new IOSMethodBinding(
        iosMethod, original, original.getModifiers(), returnType, null, declaringClass,
        null, original.isVarargs(), false);
    binding.addParameters(original);
    return binding;
  }

  public static IOSMethodBinding newMethod(
      IOSMethod iosMethod, int modifiers, ITypeBinding returnType, ITypeBinding declaringClass) {
    return new IOSMethodBinding(
        iosMethod, null, modifiers, returnType, null, declaringClass, null, false, true);
  }

  public static IOSMethod getIOSMethod(IMethodBinding binding) {
    if (binding instanceof IOSMethodBinding) {
      return ((IOSMethodBinding) binding).getIOSMethod();
    }
    return null;
  }

  public IOSMethod getIOSMethod() {
    return iosMethod;
  }

  public static boolean hasVarArgsTarget(IMethodBinding method) {
    IOSMethod iosMethod = getIOSMethod(method);
    if (iosMethod != null) {
      return iosMethod.isVarArgs();
    }
    return false;
  }

  @Override
  public ITypeBinding[] getExceptionTypes() {
    return exceptionTypes;
  }
}
