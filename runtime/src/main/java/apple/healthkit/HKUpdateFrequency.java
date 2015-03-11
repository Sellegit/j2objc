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


@Mapping("HKUpdateFrequency")
public final class HKUpdateFrequency extends ObjCEnum {
    
    @GlobalConstant("HKUpdateFrequencyImmediate")
    public static final long Immediate = 1L;
    @GlobalConstant("HKUpdateFrequencyHourly")
    public static final long Hourly = 2L;
    @GlobalConstant("HKUpdateFrequencyDaily")
    public static final long Daily = 3L;
    @GlobalConstant("HKUpdateFrequencyWeekly")
    public static final long Weekly = 4L;
    

}
