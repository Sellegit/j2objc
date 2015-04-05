package com.google.j2objc.runtime;

import com.google.j2objc.annotations.GlobalFunction;
import com.google.j2objc.annotations.Mapping;

@Mapping("Class")
public class ObjCClass<A> extends ValueType {
  private ObjCClass () {}

  public static native <T> ObjCClass<T> fromJava(Class<T> clazz) /*-[
    return clazz.objcClass;
  ]-*/;

  @GlobalFunction("NSClassFromString")
  public static native <T> ObjCClass<T> fromString(String name);
}

