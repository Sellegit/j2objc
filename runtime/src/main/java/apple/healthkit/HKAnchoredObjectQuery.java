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
@Library("HealthKit/HealthKit.h") @Mapping("HKAnchoredObjectQuery")
public class HKAnchoredObjectQuery 
    extends HKQuery 
     {

    
    public static final int NoAnchor = 0;

    
    @Mapping("initWithType:predicate:anchor:limit:completionHandler:")
    public HKAnchoredObjectQuery(HKSampleType type, NSPredicate predicate, @MachineSizedUInt long anchor, @MachineSizedUInt long limit, Todo handler) { }
    @Mapping("init")
    public HKAnchoredObjectQuery() { }

    


    
    


}
