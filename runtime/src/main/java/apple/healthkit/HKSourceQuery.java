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

@Library("HealthKit/HealthKit.h") @Mapping("HKSourceQuery")
public class HKSourceQuery 
    extends HKQuery 
     {

    
    
    public HKSourceQuery() {}
    @Mapping("initWithSampleType:samplePredicate:completionHandler:")
    public HKSourceQuery(HKSampleType sampleType, NSPredicate objectPredicate, Todo completionHandler) { }
    
    
    
    
    
    
    
    
}
