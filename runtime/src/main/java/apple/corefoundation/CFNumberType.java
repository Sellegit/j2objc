package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFNumberType")
public final class CFNumberType extends ObjCEnum {
    
    @GlobalConstant("kCFNumberSInt8Type")
    public static final long SInt8Type = 1L;
    @GlobalConstant("kCFNumberSInt16Type")
    public static final long SInt16Type = 2L;
    @GlobalConstant("kCFNumberSInt32Type")
    public static final long SInt32Type = 3L;
    @GlobalConstant("kCFNumberSInt64Type")
    public static final long SInt64Type = 4L;
    @GlobalConstant("kCFNumberFloat32Type")
    public static final long Float32Type = 5L;
    @GlobalConstant("kCFNumberFloat64Type")
    public static final long Float64Type = 6L;
    @GlobalConstant("kCFNumberCharType")
    public static final long CharType = 7L;
    @GlobalConstant("kCFNumberShortType")
    public static final long ShortType = 8L;
    @GlobalConstant("kCFNumberIntType")
    public static final long IntType = 9L;
    @GlobalConstant("kCFNumberLongType")
    public static final long LongType = 10L;
    @GlobalConstant("kCFNumberLongLongType")
    public static final long LongLongType = 11L;
    @GlobalConstant("kCFNumberFloatType")
    public static final long FloatType = 12L;
    @GlobalConstant("kCFNumberDoubleType")
    public static final long DoubleType = 13L;
    @GlobalConstant("kCFNumberCFIndexType")
    public static final long CFIndexType = 14L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberNSIntegerType")
    public static final long NSIntegerType = 15L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFNumberCGFloatType")
    public static final long CGFloatType = 16L;
    @GlobalConstant("kCFNumberMaxType")
    public static final long MaxType = 16L;
    

}
