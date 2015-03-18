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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItemOutput")
public class AVPlayerItemOutput 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVPlayerItemOutput() { }
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("suppressesPlayerRendering")
    public native boolean suppressesPlayerRendering();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setSuppressesPlayerRendering:")
    public native void setSuppressesPlayerRendering(boolean v);
    
    
    
    @Mapping("itemTimeForHostTime:")
    public native CMTime getItem(double hostTimeInSeconds);
    @Mapping("itemTimeForMachAbsoluteTime:")
    public native CMTime getItem(long machAbsoluteTime);
    
}
