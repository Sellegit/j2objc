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
 * @since Available in iOS 2.0 and later.
 */
@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMoviePlayerController")
public class MPMoviePlayerController 
    extends NSObject 
    implements MPMediaPlayback {

    
    
    @Mapping("initWithContentURL:")
    public MPMoviePlayerController(NSURL url) { }
    @Mapping("init")
    public MPMoviePlayerController() { }

    
    @Mapping("contentURL")
    public native NSURL getContentURL();
    @Mapping("setContentURL:")
    public native void setContentURL(NSURL v);
    @Mapping("view")
    public native UIView getView();
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    @Mapping("playbackState")
    public native @Representing("MPMoviePlaybackState") long getPlaybackState();
    @Mapping("loadState")
    public native @Representing("MPMovieLoadState") long getLoadState();
    @Mapping("controlStyle")
    public native @Representing("MPMovieControlStyle") long getControlStyle();
    @Mapping("setControlStyle:")
    public native void setControlStyle(@Representing("MPMovieControlStyle") long v);
    @Mapping("repeatMode")
    public native @Representing("MPMovieRepeatMode") long getRepeatMode();
    @Mapping("setRepeatMode:")
    public native void setRepeatMode(@Representing("MPMovieRepeatMode") long v);
    @Mapping("shouldAutoplay")
    public native boolean shouldAutoplay();
    @Mapping("setShouldAutoplay:")
    public native void setShouldAutoplay(boolean v);
    @Mapping("isFullscreen")
    public native boolean isFullscreen();
    @Mapping("setFullscreen:")
    public native void setFullscreen(boolean v);
    @Mapping("scalingMode")
    public native @Representing("MPMovieScalingMode") long getScalingMode();
    @Mapping("setScalingMode:")
    public native void setScalingMode(@Representing("MPMovieScalingMode") long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("readyForDisplay")
    public native boolean isReadyForDisplay();
    @Mapping("movieMediaTypes")
    public native @Representing("MPMovieMediaTypeMask") long getMovieMediaTypes();
    @Mapping("movieSourceType")
    public native @Representing("MPMovieSourceType") long getMovieSourceType();
    @Mapping("setMovieSourceType:")
    public native void setMovieSourceType(@Representing("MPMovieSourceType") long v);
    @Mapping("duration")
    public native double getDuration();
    @Mapping("playableDuration")
    public native double getPlayableDuration();
    @Mapping("naturalSize")
    public native CGSize getNaturalSize();
    @Mapping("initialPlaybackTime")
    public native double getInitialPlaybackTime();
    @Mapping("setInitialPlaybackTime:")
    public native void setInitialPlaybackTime(double v);
    @Mapping("endPlaybackTime")
    public native double getEndPlaybackTime();
    @Mapping("setEndPlaybackTime:")
    public native void setEndPlaybackTime(double v);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("allowsAirPlay")
    public native boolean allowsAirPlay();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("setAllowsAirPlay:")
    public native void setAllowsAirPlay(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("timedMetadata")
    public native NSArray<MPTimedMetadata> getTimedMetadata();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("accessLog")
    public native MPMovieAccessLog getAccessLog();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("errorLog")
    public native MPMovieErrorLog getErrorLog();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("useApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setUseApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean v);
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

    
    
    @GlobalConstant("MPMoviePlayerScalingModeDidChangeNotification")
    public static native NSString ScalingModeDidChangeNotification();
    @GlobalConstant("MPMoviePlayerPlaybackDidFinishNotification")
    public static native NSString PlaybackDidFinishNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerPlaybackDidFinishReasonUserInfoKey")
    public static native NSString PlaybackDidFinishReasonUserInfoKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerPlaybackStateDidChangeNotification")
    public static native NSString PlaybackStateDidChangeNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerLoadStateDidChangeNotification")
    public static native NSString LoadStateDidChangeNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerNowPlayingMovieDidChangeNotification")
    public static native NSString NowPlayingMovieDidChangeNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerWillEnterFullscreenNotification")
    public static native NSString WillEnterFullscreenNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerDidEnterFullscreenNotification")
    public static native NSString DidEnterFullscreenNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerWillExitFullscreenNotification")
    public static native NSString WillExitFullscreenNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerDidExitFullscreenNotification")
    public static native NSString DidExitFullscreenNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MPMoviePlayerIsAirPlayVideoActiveDidChangeNotification")
    public static native NSString IsAirPlayVideoActiveDidChangeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("MPMoviePlayerReadyForDisplayDidChangeNotification")
    public static native NSString ReadyForDisplayDidChangeNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMovieMediaTypesAvailableNotification")
    public static native NSString MediaTypesAvailableNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMovieSourceTypeAvailableNotification")
    public static native NSString SourceTypeAvailableNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMovieDurationAvailableNotification")
    public static native NSString DurationAvailableNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMovieNaturalSizeAvailableNotification")
    public static native NSString NaturalSizeAvailableNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("MPMoviePlayerThumbnailImageRequestDidFinishNotification")
    public static native NSString ThumbnailImageRequestDidFinishNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataUpdatedNotification")
    public static native NSString TimedMetadataUpdatedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("MPMoviePlayerTimedMetadataUserInfoKey")
    public static native NSString TimedMetadataUserInfoKey();

    @Mapping("setFullscreen:animated:")
    public native void setFullscreen(boolean fullscreen, boolean animated);
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("thumbnailImageAtTime:timeOption:")
    public native UIImage getThumbnailImage(double playbackTime, @Representing("MPMovieTimeOption") long option);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("requestThumbnailImagesAtTimes:timeOption:")
    public native void requestThumbnailImages(NSArray<?> playbackTimes, @Representing("MPMovieTimeOption") long option);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("cancelAllThumbnailImageRequests")
    public native void cancelAllThumbnailImageRequests();
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
