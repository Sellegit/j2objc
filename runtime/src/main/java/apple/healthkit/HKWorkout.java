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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HealthKit/HealthKit.h") @Mapping("HKWorkout")
public class HKWorkout 
    extends HKSample 
     {

    
    
    @Mapping("init")
    public HKWorkout() { }
    
    
    @Mapping("workoutActivityType")
    public native @Representing("HKWorkoutActivityType") long getWorkoutActivityType();
    @Mapping("workoutEvents")
    public native NSArray<HKWorkoutEvent> getWorkoutEvents();
    @Mapping("duration")
    public native double getDuration();
    @Mapping("totalEnergyBurned")
    public native HKQuantity getTotalEnergyBurned();
    @Mapping("totalDistance")
    public native HKQuantity getTotalDistance();
    
    
    
    @Mapping("workoutWithActivityType:startDate:endDate:")
    public static native HKWorkout create(@Representing("HKWorkoutActivityType") long workoutActivityType, NSDate startDate, NSDate endDate);
    @Mapping("workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(@Representing("HKWorkoutActivityType") long workoutActivityType, NSDate startDate, NSDate endDate, NSArray<?> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, NSDictionary<?, ?> metadata);
    @Mapping("workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(@Representing("HKWorkoutActivityType") long workoutActivityType, NSDate startDate, NSDate endDate, double duration, HKQuantity totalEnergyBurned, HKQuantity totalDistance, NSDictionary<?, ?> metadata);
    
}
