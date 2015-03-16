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
public class HKVitalSignsQuantityTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierHeartRate")
    protected static native NSString HeartRateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBodyTemperature")
    protected static native NSString BodyTemperatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodPressureSystolic")
    protected static native NSString BloodPressureSystolicValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBloodPressureDiastolic")
    protected static native NSString BloodPressureDiastolicValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierRespiratoryRate")
    protected static native NSString RespiratoryRateValue();
    
}
