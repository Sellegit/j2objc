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
public class HKPredicateKeyPath 
    extends NSPredicateKeyPath 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathUUID")
    protected static native NSString UUIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathSource")
    protected static native NSString SourceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathMetadata")
    protected static native NSString MetadataValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathCorrelation")
    protected static native NSString CorrelationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkout")
    protected static native NSString WorkoutValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathStartDate")
    protected static native NSString StartDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathEndDate")
    protected static native NSString EndDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutDuration")
    protected static native NSString WorkoutDurationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutTotalDistance")
    protected static native NSString WorkoutTotalDistanceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutTotalEnergyBurned")
    protected static native NSString WorkoutTotalEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathWorkoutType")
    protected static native NSString WorkoutTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathCategoryValue")
    protected static native NSString CategoryValueValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKPredicateKeyPathQuantity")
    protected static native NSString QuantityValue();
    
}
