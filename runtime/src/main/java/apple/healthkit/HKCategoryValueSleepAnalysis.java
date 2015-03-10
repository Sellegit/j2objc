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


@Mapping("HKCategoryValueSleepAnalysis")
public final class HKCategoryValueSleepAnalysis extends ObjCEnum {
    
    @GlobalConstant("HKCategoryValueSleepAnalysisInBed")
    public static final long InBed = 0L;
    @GlobalConstant("HKCategoryValueSleepAnalysisAsleep")
    public static final long Asleep = 1L;
    

}
