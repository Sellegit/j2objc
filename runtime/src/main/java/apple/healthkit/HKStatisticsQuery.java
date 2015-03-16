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

@Library("HealthKit/HealthKit.h") @Mapping("HKStatisticsQuery")
public class HKStatisticsQuery 
    extends HKQuery 
     {

    
    
    public HKStatisticsQuery() {}
    @Mapping("initWithQuantityType:quantitySamplePredicate:options:completionHandler:")
    public HKStatisticsQuery(HKQuantityType quantityType, NSPredicate quantitySamplePredicate, @Representing("HKStatisticsOptions") @MachineSizedUInt long options, @Block VoidBlock3<HKStatisticsQuery, HKStatistics, NSError> handler) { }
    
    
    
    
    
    
    
    
}
