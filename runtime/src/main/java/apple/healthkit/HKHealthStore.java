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

@Library("HealthKit/HealthKit.h") @Mapping("HKHealthStore")
public class HKHealthStore 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public HKHealthStore() { }
    
    
    
    
    
    
    @Mapping("authorizationStatusForType:")
    public native @Representing("HKAuthorizationStatus") @MachineSizedSInt long getAuthorizationStatusForType(HKObjectType type);
    @Mapping("requestAuthorizationToShareTypes:readTypes:completion:")
    public native void requestAuthorizationToTypes(NSSet<?> typesToShare, NSSet<?> typesToRead, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("saveObject:withCompletion:")
    public native void saveObject(HKObject object, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("saveObjects:withCompletion:")
    public native void saveObjects(NSArray<?> objects, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("deleteObject:withCompletion:")
    public native void deleteObject(HKObject object, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("executeQuery:")
    public native void executeQuery(HKQuery query);
    @Mapping("stopQuery:")
    public native void stopQuery(HKQuery query);
    @Mapping("dateOfBirthWithError:")
    public native NSDate getDateOfBirth(Todo error);
    @Mapping("biologicalSexWithError:")
    public native HKBiologicalSexObject getBiologicalSex(Todo error);
    @Mapping("bloodTypeWithError:")
    public native HKBloodTypeObject getBloodType(Todo error);
    @Mapping("isHealthDataAvailable")
    public static native boolean isHealthDataAvailable();
    @Mapping("addSamples:toWorkout:completion:")
    public native void addSamplesToWorkout(NSArray<?> samples, HKWorkout workout, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("enableBackgroundDeliveryForType:frequency:withCompletion:")
    public native void enableBackgroundDeliveryForType(HKObjectType type, @Representing("HKUpdateFrequency") @MachineSizedSInt long frequency, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("disableBackgroundDeliveryForType:withCompletion:")
    public native void disableBackgroundDeliveryForType(HKObjectType type, @Block VoidBlock2<Boolean, NSError> completion);
    @Mapping("disableAllBackgroundDeliveryWithCompletion:")
    public native void disableAllBackgroundDelivery(@Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Mapping("preferredUnitsForQuantityTypes:completion:")
    public native void preferredUnitsForQuantityTypes$completion$(NSSet<?> quantityTypes, Todo completion);
    
}
