package com.google.devtools.j2objc.types;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;

import java.util.List;

public class IOSBlockTypeBinding extends IOSTypeBinding {
  private ITypeBinding mDelegate;
  private String returnType = null;
  private List<String> argumentTypes = null;

  public IOSBlockTypeBinding(String retType, Iterable<String> argTypes, ITypeBinding delegate) {
    // same as IOSTypeBinding.newUnmappedClass
    super(getBlockSignature(retType, argTypes), null, null, false);

    assert retType != null;
    assert argTypes != null;

    returnType = retType;
    argumentTypes = Lists.newArrayList(argTypes);
    mDelegate = delegate;
  }

  public String getReturnType() {
    return returnType;
  }

  public Iterable<String> getArgumentTypes() {
    return argumentTypes;
  }

  public String getParameterSignature() {
    return getBlockSignature(returnType, argumentTypes);
  }

  public String getNamedDeclaration(String name) {
    return getNamedDeclarationFirstPart() + name + getNamedDeclarationLastPart();
  }

  public String getNamedDeclarationFirstPart() {
    StringBuilder sb = new StringBuilder();
    sb.append(returnType);
    sb.append(" (^");

    return sb.toString();
  }

  public String getNamedDeclarationLastPart() {
    StringBuilder sb = new StringBuilder();

    sb.append(")(");
    boolean first = true;
    for (String arg : argumentTypes) {
      if (first) {
        first = false;
      } else {
        sb.append(", ");
      }
      sb.append(arg);
    }
    sb.append(")");

    return sb.toString();
  }

  public static String getParameterList(Iterable<String> args) {
    StringBuilder sb = new StringBuilder();

    sb.append("(");
    boolean first = true;
    for (String arg : args) {
      if (first) {
        first = false;
      } else {
        sb.append(", ");
      }
      sb.append(arg);
    }
    if (first) {
      sb.append("void");
    }
    sb.append(")");

    return sb.toString();
  }

  public static String getBlockSignature(String retType, Iterable<String> args) {
    StringBuilder sb = new StringBuilder();

    sb.append(retType + " (^)");
    sb.append(getParameterList(args));

    return sb.toString();
  }

  public String getParametersWithParen() {
    return getParameterList(argumentTypes);
  }

  @Override
  public boolean isEqualTo(IBinding binding) {
    return mDelegate.isEqualTo(binding);
  }

  @Override
  public boolean equals(Object obj) {
    return mDelegate.equals(obj);
  }
}
