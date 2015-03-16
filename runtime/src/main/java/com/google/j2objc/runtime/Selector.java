package com.google.j2objc.runtime;


import com.google.j2objc.annotations.GlobalFunction;
import com.google.j2objc.annotations.Library;
import com.google.j2objc.annotations.Mapping;

@Library("Foundation/Foundation.h") @Mapping("SEL")
public final class Selector {
  private Selector() {}

  @GlobalFunction("NSSelectorFromString")
  public static native Selector fromString(String str);
}

