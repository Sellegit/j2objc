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
public class HKPredicateKeyPath 
    extends NSPredicateKeyPath 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathUUID")
    public static native NSString UUIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathSource")
    public static native NSString SourceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathMetadata")
    public static native NSString MetadataValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathCorrelation")
    public static native NSString CorrelationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkout")
    public static native NSString WorkoutValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathStartDate")
    public static native NSString StartDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathEndDate")
    public static native NSString EndDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutDuration")
    public static native NSString WorkoutDurationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutTotalDistance")
    public static native NSString WorkoutTotalDistanceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutTotalEnergyBurned")
    public static native NSString WorkoutTotalEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutType")
    public static native NSString WorkoutTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathCategoryValue")
    public static native NSString CategoryValueValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathQuantity")
    public static native NSString QuantityValue();

}
