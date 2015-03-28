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
public class HKFitnessQuantityTypeIdentifier 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierStepCount")
    public static native NSString StepCountValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierDistanceWalkingRunning")
    public static native NSString DistanceWalkingRunningValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierDistanceCycling")
    public static native NSString DistanceCyclingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBasalEnergyBurned")
    public static native NSString BasalEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierActiveEnergyBurned")
    public static native NSString ActiveEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierFlightsClimbed")
    public static native NSString FlightsClimbedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierNikeFuel")
    public static native NSString NikeFuelValue();

}
