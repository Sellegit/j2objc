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


/*<javadoc>*/
/*</javadoc>*/
@Library("MediaPlayer/MediaPlayer.h")
public class MPNowPlayingInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyElapsedPlaybackTime")
    public static native NSString ElapsedPlaybackTime();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackRate")
    public static native NSString PlaybackRate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyDefaultPlaybackRate")
    public static native NSString DefaultPlaybackRate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackQueueIndex")
    public static native NSString PlaybackQueueIndex();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackQueueCount")
    public static native NSString PlaybackQueueCount();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyChapterNumber")
    public static native NSString ChapterNumber();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyChapterCount")
    public static native NSString ChapterCount();
    
}
