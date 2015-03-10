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

@Library("HealthKit") @Mapping("HKObjectType")
public class HKObjectType 
    extends NSObject 
    implements NSCopying {

    
    
    public HKObjectType() {}
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    
    
    
    @Mapping("quantityTypeForIdentifier:")
    public static native HKQuantityType getQuantityType(String identifier);
    @Mapping("categoryTypeForIdentifier:")
    public static native HKCategoryType getCategoryType(HKCategoryTypeIdentifier identifier);
    @Mapping("characteristicTypeForIdentifier:")
    public static native HKCharacteristicType getCharacteristicType(HKCharacteristicTypeIdentifier identifier);
    @Mapping("correlationTypeForIdentifier:")
    public static native HKCorrelationType getCorrelationType(HKCorrelationTypeIdentifier identifier);
    @Mapping("workoutType")
    public static native HKWorkoutType getWorkoutType();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
