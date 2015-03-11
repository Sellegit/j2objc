package apple.mediaplayer;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("MediaPlayer") @Mapping("MPNowPlayingInfoCenter")
public class MPNowPlayingInfoCenter 
    extends NSObject 
     {

    
    
    public MPNowPlayingInfoCenter() {}
    
    
    @Mapping("nowPlayingInfo")
    public native MPNowPlayingInfo getNowPlayingInfo();
    @Mapping("setNowPlayingInfo:")
    public native void setNowPlayingInfo(MPNowPlayingInfo v);
    
    
    
    @Mapping("defaultCenter")
    public static native MPNowPlayingInfoCenter getDefaultCenter();
    
}
