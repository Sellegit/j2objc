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


@Library("CoreGraphics/CoreGraphics.h")
@Mapping("CGColorSpaceModel")
public final class CGColorSpaceModel extends ObjCEnum {
    
    @GlobalConstant("kCGColorSpaceModelUnknown")
    public static final long Unknown = -1L;
    @GlobalConstant("kCGColorSpaceModelMonochrome")
    public static final long Monochrome = 0L;
    @GlobalConstant("kCGColorSpaceModelRGB")
    public static final long RGB = 1L;
    @GlobalConstant("kCGColorSpaceModelCMYK")
    public static final long CMYK = 2L;
    @GlobalConstant("kCGColorSpaceModelLab")
    public static final long Lab = 3L;
    @GlobalConstant("kCGColorSpaceModelDeviceN")
    public static final long DeviceN = 4L;
    @GlobalConstant("kCGColorSpaceModelIndexed")
    public static final long Indexed = 5L;
    @GlobalConstant("kCGColorSpaceModelPattern")
    public static final long Pattern = 6L;


}
