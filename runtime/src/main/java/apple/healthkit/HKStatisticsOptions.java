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


@Mapping("HKStatisticsOptions")
public final class HKStatisticsOptions extends ObjCEnum {
    
    @GlobalConstant("HKStatisticsOptionNone")
    public static final long None = 0L;
    @GlobalConstant("HKStatisticsOptionSeparateBySource")
    public static final long SeparateBySource = 1L;
    @GlobalConstant("HKStatisticsOptionDiscreteAverage")
    public static final long DiscreteAverage = 2L;
    @GlobalConstant("HKStatisticsOptionDiscreteMin")
    public static final long DiscreteMin = 4L;
    @GlobalConstant("HKStatisticsOptionDiscreteMax")
    public static final long DiscreteMax = 8L;
    @GlobalConstant("HKStatisticsOptionCumulativeSum")
    public static final long CumulativeSum = 16L;
    

}
