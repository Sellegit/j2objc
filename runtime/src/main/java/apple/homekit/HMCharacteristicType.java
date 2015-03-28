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

/*<javadoc>*/
/*</javadoc>*/
@Library("HomeKit/HomeKit.h")
public class HMCharacteristicType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypePowerState")
    public static native NSString PowerStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeHue")
    public static native NSString HueValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeSaturation")
    public static native NSString SaturationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeBrightness")
    public static native NSString BrightnessValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTemperatureUnits")
    public static native NSString TemperatureUnitsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentTemperature")
    public static native NSString CurrentTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetTemperature")
    public static native NSString TargetTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentHeatingCooling")
    public static native NSString CurrentHeatingCoolingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetHeatingCooling")
    public static native NSString TargetHeatingCoolingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCoolingThreshold")
    public static native NSString CoolingThresholdValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeHeatingThreshold")
    public static native NSString HeatingThresholdValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentRelativeHumidity")
    public static native NSString CurrentRelativeHumidityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetRelativeHumidity")
    public static native NSString TargetRelativeHumidityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentDoorState")
    public static native NSString CurrentDoorStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetDoorState")
    public static native NSString TargetDoorStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeObstructionDetected")
    public static native NSString ObstructionDetectedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeName")
    public static native NSString NameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeManufacturer")
    public static native NSString ManufacturerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeSerialNumber")
    public static native NSString SerialNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeIdentify")
    public static native NSString IdentifyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeRotationDirection")
    public static native NSString RotationDirectionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeRotationSpeed")
    public static native NSString RotationSpeedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeOutletInUse")
    public static native NSString OutletInUseValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeVersion")
    public static native NSString VersionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLogs")
    public static native NSString LogsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeAudioFeedback")
    public static native NSString AudioFeedbackValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeAdminOnlyAccess")
    public static native NSString AdminOnlyAccessValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeMotionDetected")
    public static native NSString MotionDetectedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentLockMechanismState")
    public static native NSString CurrentLockMechanismStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetLockMechanismState")
    public static native NSString TargetLockMechanismStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockMechanismLastKnownAction")
    public static native NSString LockMechanismLastKnownActionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockManagementControlPoint")
    public static native NSString LockManagementControlPointValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockManagementAutoSecureTimeout")
    public static native NSString LockManagementAutoSecureTimeoutValue();

}
