package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;
import apple.metal.*;





@Library("CoreVideo/CoreVideo.h")
@Mapping("CVPixelFormatType")
public final class CVPixelFormatType extends ObjCEnum {
    
    @GlobalConstant("kCVPixelFormatType_1Monochrome")
    public static final long _1Monochrome = 1L;
    @GlobalConstant("kCVPixelFormatType_2Indexed")
    public static final long _2Indexed = 2L;
    @GlobalConstant("kCVPixelFormatType_4Indexed")
    public static final long _4Indexed = 4L;
    @GlobalConstant("kCVPixelFormatType_8Indexed")
    public static final long _8Indexed = 8L;
    @GlobalConstant("kCVPixelFormatType_1IndexedGray_WhiteIsZero")
    public static final long _1IndexedGray_WhiteIsZero = 33L;
    @GlobalConstant("kCVPixelFormatType_2IndexedGray_WhiteIsZero")
    public static final long _2IndexedGray_WhiteIsZero = 34L;
    @GlobalConstant("kCVPixelFormatType_4IndexedGray_WhiteIsZero")
    public static final long _4IndexedGray_WhiteIsZero = 36L;
    @GlobalConstant("kCVPixelFormatType_8IndexedGray_WhiteIsZero")
    public static final long _8IndexedGray_WhiteIsZero = 40L;
    @GlobalConstant("kCVPixelFormatType_16BE555")
    public static final long _16BE555 = 16L;
    @GlobalConstant("kCVPixelFormatType_16LE555")
    public static final long _16LE555 = 1278555445L;
    @GlobalConstant("kCVPixelFormatType_16LE5551")
    public static final long _16LE5551 = 892679473L;
    @GlobalConstant("kCVPixelFormatType_16BE565")
    public static final long _16BE565 = 1110783541L;
    @GlobalConstant("kCVPixelFormatType_16LE565")
    public static final long _16LE565 = 1278555701L;
    @GlobalConstant("kCVPixelFormatType_24RGB")
    public static final long _24RGB = 24L;
    @GlobalConstant("kCVPixelFormatType_24BGR")
    public static final long _24BGR = 842285639L;
    @GlobalConstant("kCVPixelFormatType_32ARGB")
    public static final long _32ARGB = 32L;
    @GlobalConstant("kCVPixelFormatType_32BGRA")
    public static final long _32BGRA = 1111970369L;
    @GlobalConstant("kCVPixelFormatType_32ABGR")
    public static final long _32ABGR = 1094862674L;
    @GlobalConstant("kCVPixelFormatType_32RGBA")
    public static final long _32RGBA = 1380401729L;
    @GlobalConstant("kCVPixelFormatType_64ARGB")
    public static final long _64ARGB = 1647719521L;
    @GlobalConstant("kCVPixelFormatType_48RGB")
    public static final long _48RGB = 1647589490L;
    @GlobalConstant("kCVPixelFormatType_32AlphaGray")
    public static final long _32AlphaGray = 1647522401L;
    @GlobalConstant("kCVPixelFormatType_16Gray")
    public static final long _16Gray = 1647392359L;
    @GlobalConstant("kCVPixelFormatType_30RGB")
    public static final long _30RGB = 1378955371L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr8")
    public static final long _422YpCbCr8 = 846624121L;
    @GlobalConstant("kCVPixelFormatType_4444YpCbCrA8")
    public static final long _4444YpCbCrA8 = 1983131704L;
    @GlobalConstant("kCVPixelFormatType_4444YpCbCrA8R")
    public static final long _4444YpCbCrA8R = 1916022840L;
    @GlobalConstant("kCVPixelFormatType_4444AYpCbCr8")
    public static final long _4444AYpCbCr8 = 2033463352L;
    @GlobalConstant("kCVPixelFormatType_4444AYpCbCr16")
    public static final long _4444AYpCbCr16 = 2033463606L;
    @GlobalConstant("kCVPixelFormatType_444YpCbCr8")
    public static final long _444YpCbCr8 = 1983066168L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr16")
    public static final long _422YpCbCr16 = 1983000886L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr10")
    public static final long _422YpCbCr10 = 1983000880L;
    @GlobalConstant("kCVPixelFormatType_444YpCbCr10")
    public static final long _444YpCbCr10 = 1983131952L;
    @GlobalConstant("kCVPixelFormatType_420YpCbCr8Planar")
    public static final long _420YpCbCr8Planar = 2033463856L;
    @GlobalConstant("kCVPixelFormatType_420YpCbCr8PlanarFullRange")
    public static final long _420YpCbCr8PlanarFullRange = 1714696752L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr_4A_8BiPlanar")
    public static final long _422YpCbCr_4A_8BiPlanar = 1630697081L;
    @GlobalConstant("kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange")
    public static final long _420YpCbCr8BiPlanarVideoRange = 875704438L;
    @GlobalConstant("kCVPixelFormatType_420YpCbCr8BiPlanarFullRange")
    public static final long _420YpCbCr8BiPlanarFullRange = 875704422L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr8_yuvs")
    public static final long _422YpCbCr8_yuvs = 2037741171L;
    @GlobalConstant("kCVPixelFormatType_422YpCbCr8FullRange")
    public static final long _422YpCbCr8FullRange = 2037741158L;
    @GlobalConstant("kCVPixelFormatType_OneComponent8")
    public static final long OneComponent8 = 1278226488L;
    @GlobalConstant("kCVPixelFormatType_TwoComponent8")
    public static final long TwoComponent8 = 843264056L;
    @GlobalConstant("kCVPixelFormatType_OneComponent16Half")
    public static final long OneComponent16Half = 1278226536L;
    @GlobalConstant("kCVPixelFormatType_OneComponent32Float")
    public static final long OneComponent32Float = 1278226534L;
    @GlobalConstant("kCVPixelFormatType_TwoComponent16Half")
    public static final long TwoComponent16Half = 843264104L;
    @GlobalConstant("kCVPixelFormatType_TwoComponent32Float")
    public static final long TwoComponent32Float = 843264102L;
    @GlobalConstant("kCVPixelFormatType_64RGBAHalf")
    public static final long _64RGBAHalf = 1380411457L;
    @GlobalConstant("kCVPixelFormatType_128RGBAFloat")
    public static final long _128RGBAFloat = 1380410945L;
    

}
