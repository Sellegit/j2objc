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
 * @since Available in iOS 8.0 and later.
 */


@Mapping("AVCaptureAutoFocusSystem")
public final class AVCaptureAutoFocusSystem extends ObjCEnum {
    
    @GlobalConstant("AVCaptureAutoFocusSystemNone")
    public static final long None = 0L;
    @GlobalConstant("AVCaptureAutoFocusSystemContrastDetection")
    public static final long ContrastDetection = 1L;
    @GlobalConstant("AVCaptureAutoFocusSystemPhaseDetection")
    public static final long PhaseDetection = 2L;
    

}
