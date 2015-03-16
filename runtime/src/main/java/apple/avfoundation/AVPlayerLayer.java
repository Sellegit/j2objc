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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerLayer")
public class AVPlayerLayer 
    extends CALayer 
     {

    
    
    public AVPlayerLayer() {}
    @Mapping("initWithLayer:")
    public AVPlayerLayer(Object layer) { }
    
    
    @Mapping("player")
    public native AVPlayer getPlayer();
    @Mapping("setPlayer:")
    public native void setPlayer(AVPlayer v);
    @Mapping("videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    @Mapping("setVideoGravity:")
    public native void setVideoGravity(AVLayerVideoGravity v);
    @Mapping("isReadyForDisplay")
    public native boolean isReadyForDisplay();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoRect")
    public native CGRect getVideoRect();
    
    
    
    @Mapping("playerLayerWithPlayer:")
    public static native AVPlayerLayer create(AVPlayer player);
    
}
