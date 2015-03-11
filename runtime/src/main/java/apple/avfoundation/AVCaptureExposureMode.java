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


@Mapping("AVCaptureExposureMode")
public final class AVCaptureExposureMode extends ObjCEnum {
    
    @GlobalConstant("AVCaptureExposureModeLocked")
    public static final long Locked = 0L;
    @GlobalConstant("AVCaptureExposureModeAutoExpose")
    public static final long AutoExpose = 1L;
    @GlobalConstant("AVCaptureExposureModeContinuousAutoExposure")
    public static final long ContinuousAutoExposure = 2L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureExposureModeCustom")
    public static final long Custom = 3L;
    

}
