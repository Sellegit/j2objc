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
@Library("HealthKit")
public class HKMetadataKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceSerialNumber")
    protected static native NSString DeviceSerialNumberKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyBodyTemperatureSensorLocation")
    protected static native NSString BodyTemperatureSensorLocationKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyHeartRateSensorLocation")
    protected static native NSString HeartRateSensorLocationKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyFoodType")
    protected static native NSString FoodTypeKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyUDIDeviceIdentifier")
    protected static native NSString UDIDeviceIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyUDIProductionIdentifier")
    protected static native NSString UDIProductionIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDigitalSignature")
    protected static native NSString DigitalSignatureKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyExternalUUID")
    protected static native NSString ExternalUUIDKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyTimeZone")
    protected static native NSString TimeZoneKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceName")
    protected static native NSString DeviceNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyDeviceManufacturerName")
    protected static native NSString DeviceManufacturerNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWasTakenInLab")
    protected static native NSString WasTakenInLabKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyReferenceRangeLowerLimit")
    protected static native NSString ReferenceRangeLowerLimitKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyReferenceRangeUpperLimit")
    protected static native NSString ReferenceRangeUpperLimitKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWasUserEntered")
    protected static native NSString WasUserEnteredKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyWorkoutBrandName")
    protected static native NSString WorkoutBrandNameKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyGroupFitness")
    protected static native NSString GroupFitnessKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyIndoorWorkout")
    protected static native NSString IndoorWorkoutKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKMetadataKeyCoachedWorkout")
    protected static native NSString CoachedWorkoutKey();
    
}
