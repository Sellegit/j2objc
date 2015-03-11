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


@Mapping("HMCharacteristicValueLockMechanism")
public final class HMCharacteristicValueLockMechanism extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionSecuredUsingPhysicalMovementInterior")
    public static final long SecuredUsingPhysicalMovementInterior = 0L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionUnsecuredUsingPhysicalMovementInterior")
    public static final long UnsecuredUsingPhysicalMovementInterior = 1L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionSecuredUsingPhysicalMovementExterior")
    public static final long SecuredUsingPhysicalMovementExterior = 2L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionUnsecuredUsingPhysicalMovementExterior")
    public static final long UnsecuredUsingPhysicalMovementExterior = 3L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionSecuredWithKeypad")
    public static final long SecuredWithKeypad = 4L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionUnsecuredWithKeypad")
    public static final long UnsecuredWithKeypad = 5L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionSecuredRemotely")
    public static final long SecuredRemotely = 6L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionUnsecuredRemotely")
    public static final long UnsecuredRemotely = 7L;
    @GlobalConstant("HMCharacteristicValueLockMechanismLastKnownActionSecuredWithAutomaticSecureTimeout")
    public static final long SecuredWithAutomaticSecureTimeout = 8L;
    

}
