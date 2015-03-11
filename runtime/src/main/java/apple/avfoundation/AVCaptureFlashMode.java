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

@Library("AVFoundation")
@Mapping("AVCaptureFlashMode")
public final class AVCaptureFlashMode extends ObjCEnum {
    
    @GlobalConstant("AVCaptureFlashModeOff")
    public static final long Off = 0L;
    @GlobalConstant("AVCaptureFlashModeOn")
    public static final long On = 1L;
    @GlobalConstant("AVCaptureFlashModeAuto")
    public static final long Auto = 2L;
    

}
