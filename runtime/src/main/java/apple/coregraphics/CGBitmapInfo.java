package apple.coregraphics;


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
import apple.uikit.*;


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("CoreGraphics/CoreGraphics.h")
@Mapping("CGBitmapInfo")
public final class CGBitmapInfo extends ObjCEnum {
    
    @GlobalConstant("kCGBitmapAlphaInfoMask")
    public static final long AlphaInfoMask = 31L;
    @GlobalConstant("kCGBitmapFloatComponents")
    public static final long FloatComponents = 256L;
    @GlobalConstant("kCGBitmapByteOrderMask")
    public static final long ByteOrderMask = 28672L;
    @GlobalConstant("kCGBitmapByteOrderDefault")
    public static final long ByteOrderDefault = 0L;
    @GlobalConstant("kCGBitmapByteOrder16Little")
    public static final long ByteOrder16Little = 4096L;
    @GlobalConstant("kCGBitmapByteOrder32Little")
    public static final long ByteOrder32Little = 8192L;
    @GlobalConstant("kCGBitmapByteOrder16Big")
    public static final long ByteOrder16Big = 12288L;
    @GlobalConstant("kCGBitmapByteOrder32Big")
    public static final long ByteOrder32Big = 16384L;


}
