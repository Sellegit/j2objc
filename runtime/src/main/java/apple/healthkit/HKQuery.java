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

@Library("HealthKit") @Mapping("HKQuery")
public class HKQuery 
    extends NSObject 
     {

    
    
    public HKQuery() {}
    
    
    @Mapping("sampleType")
    public native HKSampleType getSampleType();
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    
    
    
    @Mapping("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key);
    @Mapping("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key, NSArray<?> allowedValues);
    @Mapping("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate createPredicateForObjectsWithMetadata(String key, @Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, Object value);
    @Mapping("predicateForObjectsFromSource:")
    public static native NSPredicate createPredicateForObjectsFromSource(HKSource source);
    @Mapping("predicateForObjectsFromSources:")
    public static native NSPredicate createPredicateForObjectsFromSources(NSSet<?> sources);
    @Mapping("predicateForObjectWithUUID:")
    public static native NSPredicate createPredicateForObjectsWithUUID(NSUUID UUID);
    @Mapping("predicateForObjectsWithUUIDs:")
    public static native NSPredicate createPredicateForObjectsWithUUIDs(NSSet<?> UUIDs);
    @Mapping("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate createPredicateForObjectsWithNoCorrelation();
    @Mapping("predicateForObjectsFromWorkout:")
    public static native NSPredicate createPredicateForObjectsFromWorkout(HKWorkout workout);
    @Mapping("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate createPredicateForSamplesWithDate(NSDate startDate, NSDate endDate, @Representing("HKQueryOptions") @MachineSizedUInt long options);
    @Mapping("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate createPredicateForQuantitySamplesWithQuantity(@Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, HKQuantity quantity);
    @Mapping("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate createPredicateForCategorySamplesWithValue(@Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, @MachineSizedSInt long value);
    @Mapping("predicateForWorkoutsWithWorkoutActivityType:")
    public static native NSPredicate createPredicateForWorkoutsWithActivityType(@Representing("HKWorkoutActivityType") @MachineSizedUInt long workoutActivityType);
    @Mapping("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate createPredicateForWorkoutsWithDuration(@Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, double duration);
    @Mapping("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate createPredicateForWorkoutsWithTotalEnergyBurned(@Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, HKQuantity totalEnergyBurned);
    @Mapping("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate createPredicateForWorkoutsWithTotalDistance(@Representing("NSPredicateOperatorType") @MachineSizedUInt long operatorType, HKQuantity totalDistance);
    
}
