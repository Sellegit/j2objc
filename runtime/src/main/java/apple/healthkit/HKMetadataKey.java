package apple.healthkit;


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
@Library("HealthKit/HealthKit.h")
public class HKMetadataKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceSerialNumber")
    public static native NSString DeviceSerialNumberKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyBodyTemperatureSensorLocation")
    public static native NSString BodyTemperatureSensorLocationKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyHeartRateSensorLocation")
    public static native NSString HeartRateSensorLocationKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyFoodType")
    public static native NSString FoodTypeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyUDIDeviceIdentifier")
    public static native NSString UDIDeviceIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyUDIProductionIdentifier")
    public static native NSString UDIProductionIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDigitalSignature")
    public static native NSString DigitalSignatureKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyExternalUUID")
    public static native NSString ExternalUUIDKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyTimeZone")
    public static native NSString TimeZoneKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceName")
    public static native NSString DeviceNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceManufacturerName")
    public static native NSString DeviceManufacturerNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWasTakenInLab")
    public static native NSString WasTakenInLabKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyReferenceRangeLowerLimit")
    public static native NSString ReferenceRangeLowerLimitKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyReferenceRangeUpperLimit")
    public static native NSString ReferenceRangeUpperLimitKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWasUserEntered")
    public static native NSString WasUserEnteredKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWorkoutBrandName")
    public static native NSString WorkoutBrandNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyGroupFitness")
    public static native NSString GroupFitnessKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyIndoorWorkout")
    public static native NSString IndoorWorkoutKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyCoachedWorkout")
    public static native NSString CoachedWorkoutKey();

}
