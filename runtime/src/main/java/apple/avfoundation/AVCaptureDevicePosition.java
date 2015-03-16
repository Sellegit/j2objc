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
@Mapping("AVCaptureDevicePosition")
public final class AVCaptureDevicePosition extends ObjCEnum {
    
    @GlobalConstant("AVCaptureDevicePositionUnspecified")
    public static final long Unspecified = 0L;
    @GlobalConstant("AVCaptureDevicePositionBack")
    public static final long Back = 1L;
    @GlobalConstant("AVCaptureDevicePositionFront")
    public static final long Front = 2L;
    

}
