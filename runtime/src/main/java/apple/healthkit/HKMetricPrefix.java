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

@Library("HealthKit")
@Mapping("HKMetricPrefix")
public final class HKMetricPrefix extends ObjCEnum {
    
    @GlobalConstant("HKMetricPrefixNone")
    public static final long None = 0L;
    @GlobalConstant("HKMetricPrefixPico")
    public static final long Pico = 1L;
    @GlobalConstant("HKMetricPrefixNano")
    public static final long Nano = 2L;
    @GlobalConstant("HKMetricPrefixMicro")
    public static final long Micro = 3L;
    @GlobalConstant("HKMetricPrefixMilli")
    public static final long Milli = 4L;
    @GlobalConstant("HKMetricPrefixCenti")
    public static final long Centi = 5L;
    @GlobalConstant("HKMetricPrefixDeci")
    public static final long Deci = 6L;
    @GlobalConstant("HKMetricPrefixDeca")
    public static final long Deca = 7L;
    @GlobalConstant("HKMetricPrefixHecto")
    public static final long Hecto = 8L;
    @GlobalConstant("HKMetricPrefixKilo")
    public static final long Kilo = 9L;
    @GlobalConstant("HKMetricPrefixMega")
    public static final long Mega = 10L;
    @GlobalConstant("HKMetricPrefixGiga")
    public static final long Giga = 11L;
    @GlobalConstant("HKMetricPrefixTera")
    public static final long Tera = 12L;
    

}
