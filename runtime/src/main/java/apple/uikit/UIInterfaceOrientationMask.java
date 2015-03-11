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





@Library("UIKit")
@Mapping("UIInterfaceOrientationMask")
public final class UIInterfaceOrientationMask extends ObjCEnum {
    
    @GlobalConstant("UIInterfaceOrientationMaskPortrait")
    public static final long Portrait = 2L;
    @GlobalConstant("UIInterfaceOrientationMaskLandscapeLeft")
    public static final long LandscapeLeft = 16L;
    @GlobalConstant("UIInterfaceOrientationMaskLandscapeRight")
    public static final long LandscapeRight = 8L;
    @GlobalConstant("UIInterfaceOrientationMaskPortraitUpsideDown")
    public static final long PortraitUpsideDown = 4L;
    @GlobalConstant("UIInterfaceOrientationMaskLandscape")
    public static final long Landscape = 24L;
    @GlobalConstant("UIInterfaceOrientationMaskAll")
    public static final long All = 30L;
    @GlobalConstant("UIInterfaceOrientationMaskAllButUpsideDown")
    public static final long AllButUpsideDown = 26L;
    

}
