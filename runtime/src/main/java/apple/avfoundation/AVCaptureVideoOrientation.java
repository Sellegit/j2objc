package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("AVFoundation/AVFoundation.h")
@Mapping("AVCaptureVideoOrientation")
public final class AVCaptureVideoOrientation extends ObjCEnum {
    
    @GlobalConstant("AVCaptureVideoOrientationPortrait")
    public static final long Portrait = 1L;
    @GlobalConstant("AVCaptureVideoOrientationPortraitUpsideDown")
    public static final long PortraitUpsideDown = 2L;
    @GlobalConstant("AVCaptureVideoOrientationLandscapeRight")
    public static final long LandscapeRight = 3L;
    @GlobalConstant("AVCaptureVideoOrientationLandscapeLeft")
    public static final long LandscapeLeft = 4L;
    

}
