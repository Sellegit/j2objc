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

@Library("HealthKit/HealthKit.h") @Mapping("HKQuantityType")
public class HKQuantityType 
    extends HKSampleType 
     {

    
    
    @Mapping("init")
    public HKQuantityType() { }
    
    
    @Mapping("aggregationStyle")
    public native @Representing("HKQuantityAggregationStyle") @MachineSizedSInt long getAggregationStyle();
    
    
    
    @Mapping("isCompatibleWithUnit:")
    public native boolean isCompatibleWithUnit(HKUnit unit);
    
}
