package apple.metal;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal/Metal.h")
@Mapping("MTLDataType")
public final class MTLDataType extends ObjCEnum {
    
    @GlobalConstant("MTLDataTypeNone")
    public static final long None = 0L;
    @GlobalConstant("MTLDataTypeStruct")
    public static final long Struct = 1L;
    @GlobalConstant("MTLDataTypeArray")
    public static final long Array = 2L;
    @GlobalConstant("MTLDataTypeFloat")
    public static final long Float = 3L;
    @GlobalConstant("MTLDataTypeFloat2")
    public static final long Float2 = 4L;
    @GlobalConstant("MTLDataTypeFloat3")
    public static final long Float3 = 5L;
    @GlobalConstant("MTLDataTypeFloat4")
    public static final long Float4 = 6L;
    @GlobalConstant("MTLDataTypeFloat2x2")
    public static final long Float2x2 = 7L;
    @GlobalConstant("MTLDataTypeFloat2x3")
    public static final long Float2x3 = 8L;
    @GlobalConstant("MTLDataTypeFloat2x4")
    public static final long Float2x4 = 9L;
    @GlobalConstant("MTLDataTypeFloat3x2")
    public static final long Float3x2 = 10L;
    @GlobalConstant("MTLDataTypeFloat3x3")
    public static final long Float3x3 = 11L;
    @GlobalConstant("MTLDataTypeFloat3x4")
    public static final long Float3x4 = 12L;
    @GlobalConstant("MTLDataTypeFloat4x2")
    public static final long Float4x2 = 13L;
    @GlobalConstant("MTLDataTypeFloat4x3")
    public static final long Float4x3 = 14L;
    @GlobalConstant("MTLDataTypeFloat4x4")
    public static final long Float4x4 = 15L;
    @GlobalConstant("MTLDataTypeHalf")
    public static final long Half = 16L;
    @GlobalConstant("MTLDataTypeHalf2")
    public static final long Half2 = 17L;
    @GlobalConstant("MTLDataTypeHalf3")
    public static final long Half3 = 18L;
    @GlobalConstant("MTLDataTypeHalf4")
    public static final long Half4 = 19L;
    @GlobalConstant("MTLDataTypeHalf2x2")
    public static final long Half2x2 = 20L;
    @GlobalConstant("MTLDataTypeHalf2x3")
    public static final long Half2x3 = 21L;
    @GlobalConstant("MTLDataTypeHalf2x4")
    public static final long Half2x4 = 22L;
    @GlobalConstant("MTLDataTypeHalf3x2")
    public static final long Half3x2 = 23L;
    @GlobalConstant("MTLDataTypeHalf3x3")
    public static final long Half3x3 = 24L;
    @GlobalConstant("MTLDataTypeHalf3x4")
    public static final long Half3x4 = 25L;
    @GlobalConstant("MTLDataTypeHalf4x2")
    public static final long Half4x2 = 26L;
    @GlobalConstant("MTLDataTypeHalf4x3")
    public static final long Half4x3 = 27L;
    @GlobalConstant("MTLDataTypeHalf4x4")
    public static final long Half4x4 = 28L;
    @GlobalConstant("MTLDataTypeInt")
    public static final long Int = 29L;
    @GlobalConstant("MTLDataTypeInt2")
    public static final long Int2 = 30L;
    @GlobalConstant("MTLDataTypeInt3")
    public static final long Int3 = 31L;
    @GlobalConstant("MTLDataTypeInt4")
    public static final long Int4 = 32L;
    @GlobalConstant("MTLDataTypeUInt")
    public static final long UInt = 33L;
    @GlobalConstant("MTLDataTypeUInt2")
    public static final long UInt2 = 34L;
    @GlobalConstant("MTLDataTypeUInt3")
    public static final long UInt3 = 35L;
    @GlobalConstant("MTLDataTypeUInt4")
    public static final long UInt4 = 36L;
    @GlobalConstant("MTLDataTypeShort")
    public static final long Short = 37L;
    @GlobalConstant("MTLDataTypeShort2")
    public static final long Short2 = 38L;
    @GlobalConstant("MTLDataTypeShort3")
    public static final long Short3 = 39L;
    @GlobalConstant("MTLDataTypeShort4")
    public static final long Short4 = 40L;
    @GlobalConstant("MTLDataTypeUShort")
    public static final long UShort = 41L;
    @GlobalConstant("MTLDataTypeUShort2")
    public static final long UShort2 = 42L;
    @GlobalConstant("MTLDataTypeUShort3")
    public static final long UShort3 = 43L;
    @GlobalConstant("MTLDataTypeUShort4")
    public static final long UShort4 = 44L;
    @GlobalConstant("MTLDataTypeChar")
    public static final long Char = 45L;
    @GlobalConstant("MTLDataTypeChar2")
    public static final long Char2 = 46L;
    @GlobalConstant("MTLDataTypeChar3")
    public static final long Char3 = 47L;
    @GlobalConstant("MTLDataTypeChar4")
    public static final long Char4 = 48L;
    @GlobalConstant("MTLDataTypeUChar")
    public static final long UChar = 49L;
    @GlobalConstant("MTLDataTypeUChar2")
    public static final long UChar2 = 50L;
    @GlobalConstant("MTLDataTypeUChar3")
    public static final long UChar3 = 51L;
    @GlobalConstant("MTLDataTypeUChar4")
    public static final long UChar4 = 52L;
    @GlobalConstant("MTLDataTypeBool")
    public static final long Bool = 53L;
    @GlobalConstant("MTLDataTypeBool2")
    public static final long Bool2 = 54L;
    @GlobalConstant("MTLDataTypeBool3")
    public static final long Bool3 = 55L;
    @GlobalConstant("MTLDataTypeBool4")
    public static final long Bool4 = 56L;
    

}
