package com.google.j2objc.runtime;


import com.google.j2objc.annotations.ExtensionMapping;
import com.google.j2objc.annotations.GlobalFunction;
import com.google.j2objc.annotations.Library;
import com.google.j2objc.annotations.Mapping;

@Library("Foundation/Foundation.h") @Mapping("SEL")
public final class Selector {
  private Selector() {}

  @GlobalFunction("NSSelectorFromString")
  public static native Selector fromString(String str);

  @ExtensionMapping("performSelector:")
  public static native Object performSelector(Object thiz, Selector sel);

  @ExtensionMapping("respondsToSelector:")
  public static native boolean respondsToSelector(Object thiz, Selector sel);
}

