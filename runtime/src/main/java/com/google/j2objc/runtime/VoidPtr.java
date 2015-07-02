package com.google.j2objc.runtime;

import com.google.j2objc.annotations.Mapping;

@Mapping("VoidPtr")
public class VoidPtr extends ValueType {

  private VoidPtr() {}

  public static native VoidPtr from(Object x) /*-[
    return (void *) x;
  ]-*/;

  public static native VoidPtr from(long x) /*-[
    return (void *) x;
  ]-*/;

  // Note this transfers the ownership from VoidPtr to object
  public static native Object toObject(VoidPtr x) /*-[
    return (id) x;
  ]-*/;

  public static native long toLong(VoidPtr x) /*-[
    return (jlong) x;
  ]-*/;
}
