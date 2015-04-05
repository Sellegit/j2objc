package com.google.j2objc.runtime;

import com.google.j2objc.annotations.Mapping;

@Mapping("Protocol")
public class ObjCProtocol {
  private ObjCProtocol () {}

  public static native ObjCProtocol fromJava(Class<?> clazz) /*-[
    return clazz.objcProtocol;
  ]-*/;
}
