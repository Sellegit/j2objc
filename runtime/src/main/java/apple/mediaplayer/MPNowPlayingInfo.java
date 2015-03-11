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
@Library("MediaPlayer")
public class MPNowPlayingInfo 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyElapsedPlaybackTime")
    protected static native NSString ElapsedPlaybackTime();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackRate")
    protected static native NSString PlaybackRate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyDefaultPlaybackRate")
    protected static native NSString DefaultPlaybackRate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackQueueIndex")
    protected static native NSString PlaybackQueueIndex();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyPlaybackQueueCount")
    protected static native NSString PlaybackQueueCount();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyChapterNumber")
    protected static native NSString ChapterNumber();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPNowPlayingInfoPropertyChapterCount")
    protected static native NSString ChapterCount();
    
}
