package apple.assetslibrary;


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
import apple.imageio.*;





@Library("AssetsLibrary/AssetsLibrary.h")
@Mapping("ALAssetOrientation")
public final class ALAssetOrientation extends ObjCEnum {
    
    @GlobalConstant("ALAssetOrientationUp")
    public static final long Up = 0L;
    @GlobalConstant("ALAssetOrientationDown")
    public static final long Down = 1L;
    @GlobalConstant("ALAssetOrientationLeft")
    public static final long Left = 2L;
    @GlobalConstant("ALAssetOrientationRight")
    public static final long Right = 3L;
    @GlobalConstant("ALAssetOrientationUpMirrored")
    public static final long UpMirrored = 4L;
    @GlobalConstant("ALAssetOrientationDownMirrored")
    public static final long DownMirrored = 5L;
    @GlobalConstant("ALAssetOrientationLeftMirrored")
    public static final long LeftMirrored = 6L;
    @GlobalConstant("ALAssetOrientationRightMirrored")
    public static final long RightMirrored = 7L;
    

}
