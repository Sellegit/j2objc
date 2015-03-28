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
 * @since Available in iOS 3.0 and later.
 */
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMusicPlayerController")
public class MPMusicPlayerController 
    extends NSObject 
    implements MPMediaPlayback {

    
    
    @Mapping("init")
    public MPMusicPlayerController() { }

    
    @Mapping("playbackState")
    public native @Representing("MPMusicPlaybackState") long getPlaybackState();
    @Mapping("repeatMode")
    public native @Representing("MPMusicRepeatMode") long getRepeatMode();
    @Mapping("setRepeatMode:")
    public native void setRepeatMode(@Representing("MPMusicRepeatMode") long v);
    @Mapping("shuffleMode")
    public native @Representing("MPMusicShuffleMode") long getShuffleMode();
    @Mapping("setShuffleMode:")
    public native void setShuffleMode(@Representing("MPMusicShuffleMode") long v);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("volume")
    public native float getVolume();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setVolume:")
    public native void setVolume(float v);
    @Mapping("nowPlayingItem")
    public native MPMediaItem getNowPlayingItem();
    @Mapping("setNowPlayingItem:")
    public native void setNowPlayingItem(MPMediaItem v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("indexOfNowPlayingItem")
    public native @MachineSizedUInt long getIndexOfNowPlayingItem();
    @Mapping("isPreparedToPlay")
    public native boolean isPreparedToPlay();
    @Mapping("currentPlaybackTime")
    public native double getCurrentPlaybackTime();
    @Mapping("setCurrentPlaybackTime:")
    public native void setCurrentPlaybackTime(double v);
    @Mapping("currentPlaybackRate")
    public native float getCurrentPlaybackRate();
    @Mapping("setCurrentPlaybackRate:")
    public native void setCurrentPlaybackRate(float v);

    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMediaPlaybackIsPreparedToPlayDidChangeNotification")
    public static native NSString IsPreparedToPlayDidChangeNotification();
    @GlobalConstant("MPMusicPlayerControllerPlaybackStateDidChangeNotification")
    public static native NSString PlaybackStateDidChangeNotification();
    @GlobalConstant("MPMusicPlayerControllerNowPlayingItemDidChangeNotification")
    public static native NSString NowPlayingItemDidChangeNotification();
    @GlobalConstant("MPMusicPlayerControllerVolumeDidChangeNotification")
    public static native NSString VolumeDidChangeNotification();

    @Mapping("applicationMusicPlayer")
    public static native MPMusicPlayerController getApplicationMusicPlayer();
    @Mapping("systemMusicPlayer")
    public static native MPMusicPlayerController getSystemMusicPlayer();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("iPodMusicPlayer")
    public static native MPMusicPlayerController getIPodMusicPlayer();
    @Mapping("setQueueWithQuery:")
    public native void setQueue(MPMediaQuery query);
    @Mapping("setQueueWithItemCollection:")
    public native void setQueue(MPMediaItemCollection itemCollection);
    @Mapping("skipToNextItem")
    public native void skipToNextItem();
    @Mapping("skipToBeginning")
    public native void skipToBeginning();
    @Mapping("skipToPreviousItem")
    public native void skipToPreviousItem();
    @Mapping("beginGeneratingPlaybackNotifications")
    public native void beginGeneratingPlaybackNotifications();
    @Mapping("endGeneratingPlaybackNotifications")
    public native void endGeneratingPlaybackNotifications();
    @Mapping("prepareToPlay")
    public native void prepareToPlay();
    @Mapping("play")
    public native void play();
    @Mapping("pause")
    public native void pause();
    @Mapping("stop")
    public native void stop();
    @Mapping("beginSeekingForward")
    public native void beginSeekingForward();
    @Mapping("beginSeekingBackward")
    public native void beginSeekingBackward();
    @Mapping("endSeeking")
    public native void endSeeking();

}
