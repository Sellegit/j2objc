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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureAudioChannel")
public class AVCaptureAudioChannel 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVCaptureAudioChannel() { }
    
    
    @Mapping("averagePowerLevel")
    public native float getAveragePowerLevel();
    @Mapping("peakHoldLevel")
    public native float getPeakHoldLevel();
    
    
    
    
    
}
