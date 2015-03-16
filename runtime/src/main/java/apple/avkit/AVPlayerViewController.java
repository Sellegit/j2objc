package apple.avkit;


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
import apple.uikit.*;
import apple.avfoundation.*;
import apple.iad.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("AVKit/AVKit.h") @Mapping("AVPlayerViewController")
public class AVPlayerViewController 
    extends UIViewController 
     {

    
    
    public AVPlayerViewController() {}
    @Mapping("initWithNibName:bundle:")
    public AVPlayerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("player")
    public native AVPlayer getPlayer();
    @Mapping("setPlayer:")
    public native void setPlayer(AVPlayer v);
    @Mapping("showsPlaybackControls")
    public native boolean showsPlaybackControls();
    @Mapping("setShowsPlaybackControls:")
    public native void setShowsPlaybackControls(boolean v);
    @Mapping("videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    @Mapping("setVideoGravity:")
    public native void setVideoGravity(AVLayerVideoGravity v);
    @Mapping("isReadyForDisplay")
    public native boolean isReadyForDisplay();
    @Mapping("videoBounds")
    public native CGRect getVideoBounds();
    @Mapping("contentOverlayView")
    public native UIView getContentOverlayView();
    
    
    
    
    
}
