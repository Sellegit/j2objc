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
    protected static native NSString StepCountValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierDistanceWalkingRunning")
    protected static native NSString DistanceWalkingRunningValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierDistanceCycling")
    protected static native NSString DistanceCyclingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierBasalEnergyBurned")
    protected static native NSString BasalEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierActiveEnergyBurned")
    protected static native NSString ActiveEnergyBurnedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierFlightsClimbed")
    protected static native NSString FlightsClimbedValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HKQuantityTypeIdentifierNikeFuel")
    protected static native NSString NikeFuelValue();
    
}
