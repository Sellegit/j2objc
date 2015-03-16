package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;





@Library("CoreMedia/CoreMedia.h")
@Mapping("CMPixelFormatType")
public final class CMPixelFormatType extends ObjCEnum {
    
    @GlobalConstant("kCMPixelFormat_32ARGB")
    public static final long _32ARGB = 32L;
    @GlobalConstant("kCMPixelFormat_32BGRA")
    public static final long _32BGRA = 1111970369L;
    @GlobalConstant("kCMPixelFormat_24RGB")
    public static final long _24RGB = 24L;
    @GlobalConstant("kCMPixelFormat_16BE555")
    public static final long _16BE555 = 16L;
    @GlobalConstant("kCMPixelFormat_16BE565")
    public static final long _16BE565 = 1110783541L;
    @GlobalConstant("kCMPixelFormat_16LE555")
    public static final long _16LE555 = 1278555445L;
    @GlobalConstant("kCMPixelFormat_16LE565")
    public static final long _16LE565 = 1278555701L;
    @GlobalConstant("kCMPixelFormat_16LE5551")
    public static final long _16LE5551 = 892679473L;
    @GlobalConstant("kCMPixelFormat_422YpCbCr8")
    public static final long _422YpCbCr8 = 846624121L;
    @GlobalConstant("kCMPixelFormat_422YpCbCr8_yuvs")
    public static final long _422YpCbCr8_yuvs = 2037741171L;
    @GlobalConstant("kCMPixelFormat_444YpCbCr8")
    public static final long _444YpCbCr8 = 1983066168L;
    @GlobalConstant("kCMPixelFormat_4444YpCbCrA8")
    public static final long _4444YpCbCrA8 = 1983131704L;
    @GlobalConstant("kCMPixelFormat_422YpCbCr16")
    public static final long _422YpCbCr16 = 1983000886L;
    @GlobalConstant("kCMPixelFormat_422YpCbCr10")
    public static final long _422YpCbCr10 = 1983000880L;
    @GlobalConstant("kCMPixelFormat_444YpCbCr10")
    public static final long _444YpCbCr10 = 1983131952L;
    @GlobalConstant("kCMPixelFormat_8IndexedGray_WhiteIsZero")
    public static final long _8IndexedGray_WhiteIsZero = 40L;
    

}
