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

@Library("HealthKit/HealthKit.h") @Mapping("HKCorrelationQuery")
public class HKCorrelationQuery 
    extends HKQuery 
     {

    
    
    public HKCorrelationQuery() {}
    @Mapping("initWithType:predicate:samplePredicates:completion:")
    public HKCorrelationQuery(HKCorrelationType correlationType, NSPredicate predicate, NSDictionary<?, ?> samplePredicates, Todo completion) { }
    
    
    @Mapping("correlationType")
    public native HKCorrelationType getCorrelationType();
    @Mapping("samplePredicates")
    public native NSDictionary<HKSampleType, NSPredicate> getSamplePredicates();
    
    
    
    
    
}
