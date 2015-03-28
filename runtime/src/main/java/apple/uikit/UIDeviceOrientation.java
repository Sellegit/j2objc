package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


@Library("UIKit/UIKit.h")
@Mapping("UIDeviceOrientation")
public final class UIDeviceOrientation extends ObjCEnum {
    
    @GlobalConstant("UIDeviceOrientationUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("UIDeviceOrientationPortrait")
    public static final long Portrait = 1L;
    @GlobalConstant("UIDeviceOrientationPortraitUpsideDown")
    public static final long PortraitUpsideDown = 2L;
    @GlobalConstant("UIDeviceOrientationLandscapeLeft")
    public static final long LandscapeLeft = 3L;
    @GlobalConstant("UIDeviceOrientationLandscapeRight")
    public static final long LandscapeRight = 4L;
    @GlobalConstant("UIDeviceOrientationFaceUp")
    public static final long FaceUp = 5L;
    @GlobalConstant("UIDeviceOrientationFaceDown")
    public static final long FaceDown = 6L;


}
