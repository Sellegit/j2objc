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

@Library("AVFoundation") @Mapping("AVMIDIPlayer")
public class AVMIDIPlayer 
    extends NSObject 
     {

    
    
    public AVMIDIPlayer() {}
    
    
    @Mapping("duration")
    public native double getDuration();
    @Mapping("isPlaying")
    public native boolean isPlaying();
    @Mapping("rate")
    public native float getRate();
    public native void setRate(float v);
    @Mapping("currentPosition")
    public native double getCurrentPosition();
    public native void setCurrentPosition(double v);
    
    
    
    @Mapping("prepareToPlay")
    public native void prepareToPlay();
    @Mapping("play:")
    public native void play(@Block Runnable completionHandler);
    @Mapping("stop")
    public native void stop();
    
}
