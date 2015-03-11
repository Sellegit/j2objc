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
@Mapping("UIInterfaceOrientation")
public final class UIInterfaceOrientation extends ObjCEnum {
    
    @GlobalConstant("UIInterfaceOrientationUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("UIInterfaceOrientationPortrait")
    public static final long Portrait = 1L;
    @GlobalConstant("UIInterfaceOrientationPortraitUpsideDown")
    public static final long PortraitUpsideDown = 2L;
    @GlobalConstant("UIInterfaceOrientationLandscapeLeft")
    public static final long LandscapeLeft = 4L;
    @GlobalConstant("UIInterfaceOrientationLandscapeRight")
    public static final long LandscapeRight = 3L;
    

}
