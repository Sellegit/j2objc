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


@Mapping("AVCaptureWhiteBalanceMode")
public final class AVCaptureWhiteBalanceMode extends ObjCEnum {
    
    @GlobalConstant("AVCaptureWhiteBalanceModeLocked")
    public static final long Locked = 0L;
    @GlobalConstant("AVCaptureWhiteBalanceModeAutoWhiteBalance")
    public static final long AutoWhiteBalance = 1L;
    @GlobalConstant("AVCaptureWhiteBalanceModeContinuousAutoWhiteBalance")
    public static final long ContinuousAutoWhiteBalance = 2L;
    

}
