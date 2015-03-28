package apple.homekit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("HomeKit/HomeKit.h")
@Mapping("HMCharacteristicValueLockMechanismState")
public final class HMCharacteristicValueLockMechanismState extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueLockMechanismStateUnsecured")
    public static final long Unsecured = 0L;
    @GlobalConstant("HMCharacteristicValueLockMechanismStateSecured")
    public static final long Secured = 1L;
    @GlobalConstant("HMCharacteristicValueLockMechanismStateJammed")
    public static final long Jammed = 2L;
    @GlobalConstant("HMCharacteristicValueLockMechanismStateUnknown")
    public static final long Unknown = 3L;


}
