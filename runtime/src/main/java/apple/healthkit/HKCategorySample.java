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
@Library("HealthKit/HealthKit.h") @Mapping("HKCategorySample")
public class HKCategorySample 
    extends HKSample 
     {

    
    
    public HKCategorySample() {}

    
    @Mapping("categoryType")
    public native HKCategoryType getCategoryType();
    @Mapping("value")
    public native @MachineSizedSInt long getValue();

    
    
    @Mapping("categorySampleWithType:value:startDate:endDate:metadata:")
    public static native HKCategorySample create(HKCategoryType type, @MachineSizedSInt long value, NSDate startDate, NSDate endDate, NSDictionary<?, ?> metadata);
    @Mapping("categorySampleWithType:value:startDate:endDate:")
    public static native HKCategorySample create(HKCategoryType type, @MachineSizedSInt long value, NSDate startDate, NSDate endDate);

}
