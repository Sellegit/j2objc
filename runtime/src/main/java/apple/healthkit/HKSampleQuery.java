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

@Library("HealthKit") @Mapping("HKSampleQuery")
public class HKSampleQuery 
    extends HKQuery 
     {

    
    public static final int NoLimit = 0;
    
    
    public HKSampleQuery() {}
    @Mapping("initWithSampleType:predicate:limit:sortDescriptors:resultsHandler:")
    public HKSampleQuery(HKSampleType sampleType, NSPredicate predicate, @MachineSizedUInt long limit, NSArray<?> sortDescriptors, Todo resultsHandler) { }
    
    
    @Mapping("limit")
    public native @MachineSizedUInt long getLimit();
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    
    
    
    
    
}
