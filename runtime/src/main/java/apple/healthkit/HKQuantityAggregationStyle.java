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


@Mapping("HKQuantityAggregationStyle")
public final class HKQuantityAggregationStyle extends ObjCEnum {
    
    @GlobalConstant("HKQuantityAggregationStyleCumulative")
    public static final long Cumulative = 0L;
    @GlobalConstant("HKQuantityAggregationStyleDiscrete")
    public static final long Discrete = 1L;
    

}
