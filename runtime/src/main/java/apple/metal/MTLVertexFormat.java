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


@Mapping("MTLVertexFormat")
public final class MTLVertexFormat extends ObjCEnum {
    
    @GlobalConstant("MTLVertexFormatInvalid")
    public static final long Invalid = 0L;
    @GlobalConstant("MTLVertexFormatUChar2")
    public static final long UChar2 = 1L;
    @GlobalConstant("MTLVertexFormatUChar3")
    public static final long UChar3 = 2L;
    @GlobalConstant("MTLVertexFormatUChar4")
    public static final long UChar4 = 3L;
    @GlobalConstant("MTLVertexFormatChar2")
    public static final long Char2 = 4L;
    @GlobalConstant("MTLVertexFormatChar3")
    public static final long Char3 = 5L;
    @GlobalConstant("MTLVertexFormatChar4")
    public static final long Char4 = 6L;
    @GlobalConstant("MTLVertexFormatUChar2Normalized")
    public static final long UChar2Normalized = 7L;
    @GlobalConstant("MTLVertexFormatUChar3Normalized")
    public static final long UChar3Normalized = 8L;
    @GlobalConstant("MTLVertexFormatUChar4Normalized")
    public static final long UChar4Normalized = 9L;
    @GlobalConstant("MTLVertexFormatChar2Normalized")
    public static final long Char2Normalized = 10L;
    @GlobalConstant("MTLVertexFormatChar3Normalized")
    public static final long Char3Normalized = 11L;
    @GlobalConstant("MTLVertexFormatChar4Normalized")
    public static final long Char4Normalized = 12L;
    @GlobalConstant("MTLVertexFormatUShort2")
    public static final long UShort2 = 13L;
    @GlobalConstant("MTLVertexFormatUShort3")
    public static final long UShort3 = 14L;
    @GlobalConstant("MTLVertexFormatUShort4")
    public static final long UShort4 = 15L;
    @GlobalConstant("MTLVertexFormatShort2")
    public static final long Short2 = 16L;
    @GlobalConstant("MTLVertexFormatShort3")
    public static final long Short3 = 17L;
    @GlobalConstant("MTLVertexFormatShort4")
    public static final long Short4 = 18L;
    @GlobalConstant("MTLVertexFormatUShort2Normalized")
    public static final long UShort2Normalized = 19L;
    @GlobalConstant("MTLVertexFormatUShort3Normalized")
    public static final long UShort3Normalized = 20L;
    @GlobalConstant("MTLVertexFormatUShort4Normalized")
    public static final long UShort4Normalized = 21L;
    @GlobalConstant("MTLVertexFormatShort2Normalized")
    public static final long Short2Normalized = 22L;
    @GlobalConstant("MTLVertexFormatShort3Normalized")
    public static final long Short3Normalized = 23L;
    @GlobalConstant("MTLVertexFormatShort4Normalized")
    public static final long Short4Normalized = 24L;
    @GlobalConstant("MTLVertexFormatHalf2")
    public static final long Half2 = 25L;
    @GlobalConstant("MTLVertexFormatHalf3")
    public static final long Half3 = 26L;
    @GlobalConstant("MTLVertexFormatHalf4")
    public static final long Half4 = 27L;
    @GlobalConstant("MTLVertexFormatFloat")
    public static final long Float = 28L;
    @GlobalConstant("MTLVertexFormatFloat2")
    public static final long Float2 = 29L;
    @GlobalConstant("MTLVertexFormatFloat3")
    public static final long Float3 = 30L;
    @GlobalConstant("MTLVertexFormatFloat4")
    public static final long Float4 = 31L;
    @GlobalConstant("MTLVertexFormatInt")
    public static final long Int = 32L;
    @GlobalConstant("MTLVertexFormatInt2")
    public static final long Int2 = 33L;
    @GlobalConstant("MTLVertexFormatInt3")
    public static final long Int3 = 34L;
    @GlobalConstant("MTLVertexFormatInt4")
    public static final long Int4 = 35L;
    @GlobalConstant("MTLVertexFormatUInt")
    public static final long UInt = 36L;
    @GlobalConstant("MTLVertexFormatUInt2")
    public static final long UInt2 = 37L;
    @GlobalConstant("MTLVertexFormatUInt3")
    public static final long UInt3 = 38L;
    @GlobalConstant("MTLVertexFormatUInt4")
    public static final long UInt4 = 39L;
    @GlobalConstant("MTLVertexFormatInt1010102Normalized")
    public static final long Int1010102Normalized = 40L;
    @GlobalConstant("MTLVertexFormatUInt1010102Normalized")
    public static final long UInt1010102Normalized = 41L;
    

}
