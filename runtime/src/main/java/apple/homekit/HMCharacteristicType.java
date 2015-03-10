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
@Library("HomeKit")
public class HMCharacteristicType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypePowerState")
    protected static native NSString PowerStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeHue")
    protected static native NSString HueValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeSaturation")
    protected static native NSString SaturationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeBrightness")
    protected static native NSString BrightnessValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTemperatureUnits")
    protected static native NSString TemperatureUnitsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentTemperature")
    protected static native NSString CurrentTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetTemperature")
    protected static native NSString TargetTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentHeatingCooling")
    protected static native NSString CurrentHeatingCoolingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetHeatingCooling")
    protected static native NSString TargetHeatingCoolingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCoolingThreshold")
    protected static native NSString CoolingThresholdValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeHeatingThreshold")
    protected static native NSString HeatingThresholdValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentRelativeHumidity")
    protected static native NSString CurrentRelativeHumidityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetRelativeHumidity")
    protected static native NSString TargetRelativeHumidityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentDoorState")
    protected static native NSString CurrentDoorStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetDoorState")
    protected static native NSString TargetDoorStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeObstructionDetected")
    protected static native NSString ObstructionDetectedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeName")
    protected static native NSString NameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeManufacturer")
    protected static native NSString ManufacturerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeModel")
    protected static native NSString ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeSerialNumber")
    protected static native NSString SerialNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeIdentify")
    protected static native NSString IdentifyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeRotationDirection")
    protected static native NSString RotationDirectionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeRotationSpeed")
    protected static native NSString RotationSpeedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeOutletInUse")
    protected static native NSString OutletInUseValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeVersion")
    protected static native NSString VersionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLogs")
    protected static native NSString LogsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeAudioFeedback")
    protected static native NSString AudioFeedbackValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeAdminOnlyAccess")
    protected static native NSString AdminOnlyAccessValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeMotionDetected")
    protected static native NSString MotionDetectedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeCurrentLockMechanismState")
    protected static native NSString CurrentLockMechanismStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeTargetLockMechanismState")
    protected static native NSString TargetLockMechanismStateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockMechanismLastKnownAction")
    protected static native NSString LockMechanismLastKnownActionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockManagementControlPoint")
    protected static native NSString LockManagementControlPointValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicTypeLockManagementAutoSecureTimeout")
    protected static native NSString LockManagementAutoSecureTimeoutValue();
    
}
