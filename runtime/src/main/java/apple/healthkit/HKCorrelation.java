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

@Library("HealthKit") @Mapping("HKCorrelation")
public class HKCorrelation 
    extends HKSample 
     {

    
    
    public HKCorrelation() {}
    
    
    @Mapping("correlationType")
    public native HKCorrelationType getCorrelationType();
    @Mapping("objects")
    public native NSSet<HKSample> getObjects();
    
    
    
    @Mapping("objectsForType:")
    public native NSSet<HKSample> getObjectsForType(HKObjectType objectType);
    @Mapping("correlationWithType:startDate:endDate:objects:")
    public static native HKCorrelation create(HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<HKSample> objects);
    @Mapping("correlationWithType:startDate:endDate:objects:metadata:")
    public static native HKCorrelation create(HKCorrelationType correlationType, NSDate startDate, NSDate endDate, NSSet<HKSample> objects, NSDictionary<?, ?> metadata);
    
}
