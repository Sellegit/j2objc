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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureInputPort")
public class AVCaptureInputPort 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVCaptureInputPort() { }
    
    
    @Mapping("input")
    public native AVCaptureInput getInput();
    @Mapping("mediaType")
    public native AVMediaType getMediaType();
    @Mapping("formatDescription")
    public native CMFormatDescription getFormatDescription();
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("clock")
    public native CMClock getClock();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureInputPortFormatDescriptionDidChangeNotification")
    public static native NSString FormatDescriptionDidChangeNotification();
    
    
    
}
