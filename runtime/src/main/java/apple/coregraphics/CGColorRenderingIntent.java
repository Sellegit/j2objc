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





@Library("CoreGraphics")
@Mapping("CGColorRenderingIntent")
public final class CGColorRenderingIntent extends ObjCEnum {
    
    @GlobalConstant("kCGRenderingIntentDefault")
    public static final long Default = 0L;
    @GlobalConstant("kCGRenderingIntentAbsoluteColorimetric")
    public static final long AbsoluteColorimetric = 1L;
    @GlobalConstant("kCGRenderingIntentRelativeColorimetric")
    public static final long RelativeColorimetric = 2L;
    @GlobalConstant("kCGRenderingIntentPerceptual")
    public static final long Perceptual = 3L;
    @GlobalConstant("kCGRenderingIntentSaturation")
    public static final long Saturation = 4L;
    

}
