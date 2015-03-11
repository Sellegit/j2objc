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

@Library("HealthKit") @Mapping("HKQuantitySample")
public class HKQuantitySample 
    extends HKSample 
     {

    
    
    public HKQuantitySample() {}
    
    
    @Mapping("quantityType")
    public native HKQuantityType getQuantityType();
    @Mapping("quantity")
    public native HKQuantity getQuantity();
    
    
    
    @Mapping("quantitySampleWithType:quantity:startDate:endDate:")
    public static native HKQuantitySample create(HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate);
    @Mapping("quantitySampleWithType:quantity:startDate:endDate:metadata:")
    public static native HKQuantitySample create(HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate, NSDictionary<?, ?> metadata);
    
}
