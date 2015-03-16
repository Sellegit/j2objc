package apple.imageio;


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





@Library("ImageIO/ImageIO.h")
@Mapping("CGImagePropertyOrientation")
public final class CGImagePropertyOrientation extends ObjCEnum {
    
    @GlobalConstant("kCGImagePropertyOrientationUp")
    public static final long Up = 1L;
    @GlobalConstant("kCGImagePropertyOrientationUpMirrored")
    public static final long UpMirrored = 2L;
    @GlobalConstant("kCGImagePropertyOrientationDown")
    public static final long Down = 3L;
    @GlobalConstant("kCGImagePropertyOrientationDownMirrored")
    public static final long DownMirrored = 4L;
    @GlobalConstant("kCGImagePropertyOrientationLeftMirrored")
    public static final long LeftMirrored = 5L;
    @GlobalConstant("kCGImagePropertyOrientationRight")
    public static final long Right = 6L;
    @GlobalConstant("kCGImagePropertyOrientationRightMirrored")
    public static final long RightMirrored = 7L;
    @GlobalConstant("kCGImagePropertyOrientationLeft")
    public static final long Left = 8L;
    

}
