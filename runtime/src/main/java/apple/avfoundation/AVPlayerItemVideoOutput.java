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
 * @since Available in iOS 6.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemVideoOutput")
public class AVPlayerItemVideoOutput 
    extends AVPlayerItemOutput 
     {

    
    
    @Mapping("init")
    public AVPlayerItemVideoOutput() { }
    
    
    @Mapping("delegate")
    public native AVPlayerItemOutputPullDelegate getDelegate();
    @Mapping("delegateQueue")
    public native DispatchQueue getDelegateQueue();
    
    
    
    @Mapping("setDelegate:queue:")
    public native void setDelegate(AVPlayerItemOutputPullDelegate delegate, DispatchQueue delegateQueue);
    @Mapping("requestNotificationOfMediaDataChangeWithAdvanceInterval:")
    public native void requestNotificationOfMediaDataChange(double interval);
    
}
