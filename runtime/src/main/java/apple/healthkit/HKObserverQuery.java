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

@Library("HealthKit/HealthKit.h") @Mapping("HKObserverQuery")
public class HKObserverQuery 
    extends HKQuery 
     {

    
    
    @Mapping("initWithSampleType:predicate:updateHandler:")
    public HKObserverQuery(HKSampleType sampleType, NSPredicate predicate, Todo updateHandler) { }
    @Mapping("init")
    public HKObserverQuery() { }
    
    
    
    
    
    
    
    
}
