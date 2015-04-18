package com.google.j2objc.runtime;

import apple.foundation.NSException;
import apple.foundation.NSNumber;
import apple.foundation.NSObject;

/**
 * Created by xichen on 4/17/15.
 */
public class ObjCBridge {
  public static native NSObject toNSObject(Object x) /*-[
    return x;
  ]-*/;

  public static native NSObject toNSString(String x) /*-[
    return x;
  ]-*/;

  public static native NSNumber toNSNumber(Number x) /*-[
    return x;
  ]-*/;

  public static native NSException toNSException(Throwable x) /*-[
    return x;
  ]-*/;
}

