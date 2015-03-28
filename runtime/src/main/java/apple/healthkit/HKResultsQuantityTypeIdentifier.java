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
public class HKResultsQuantityTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierOxygenSaturation")
    public static native NSString OxygenSaturationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierPeripheralPerfusionIndex")
    public static native NSString PeripheralPerfusionIndexValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodGlucose")
    public static native NSString BloodGlucoseValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierNumberOfTimesFallen")
    public static native NSString NumberOfTimesFallenValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierElectrodermalActivity")
    public static native NSString ElectrodermalActivityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierInhalerUsage")
    public static native NSString InhalerUsageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodAlcoholContent")
    public static native NSString BloodAlcoholContentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierForcedVitalCapacity")
    public static native NSString ForcedVitalCapacityValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierForcedExpiratoryVolume1")
    public static native NSString ForcedExpiratoryVolume1Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierPeakExpiratoryFlowRate")
    public static native NSString PeakExpiratoryFlowRateValue();

}
