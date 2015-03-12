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

@Library("AVFoundation") @Mapping("AVPlayer")
public class AVPlayer 
    extends NSObject 
     {

    
    
    public AVPlayer() {}
    @Mapping("initWithURL:")
    public AVPlayer(NSURL URL) { }
    @Mapping("initWithPlayerItem:")
    public AVPlayer(AVPlayerItem item) { }
    
    
    @Mapping("status")
    public native @Representing("AVPlayerStatus") @MachineSizedSInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    @Mapping("rate")
    public native float getRate();
    @Mapping("setRate:")
    public native void setRate(float v);
    @Mapping("currentItem")
    public native AVPlayerItem getCurrentItem();
    @Mapping("actionAtItemEnd")
    public native @Representing("AVPlayerActionAtItemEnd") @MachineSizedSInt long getActionAtItemEnd();
    @Mapping("setActionAtItemEnd:")
    public native void setActionAtItemEnd(@Representing("AVPlayerActionAtItemEnd") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("masterClock")
    public native CMClock getMasterClock();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setMasterClock:")
    public native void setMasterClock(CMClock v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("volume")
    public native float getVolume();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setVolume:")
    public native void setVolume(float v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isMuted")
    public native boolean isMuted();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setMuted:")
    public native void setMuted(boolean v);
    @Mapping("isClosedCaptionDisplayEnabled")
    public native boolean isClosedCaptionDisplayEnabled();
    @Mapping("setClosedCaptionDisplayEnabled:")
    public native void setClosedCaptionDisplayEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("appliesMediaSelectionCriteriaAutomatically")
    public native boolean appliesMediaSelectionCriteriaAutomatically();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAppliesMediaSelectionCriteriaAutomatically:")
    public native void setAppliesMediaSelectionCriteriaAutomatically(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowsExternalPlayback")
    public native boolean allowsExternalPlayback();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAllowsExternalPlayback:")
    public native void setAllowsExternalPlayback(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isExternalPlaybackActive")
    public native boolean isExternalPlaybackActive();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("usesExternalPlaybackWhileExternalScreenIsActive")
    public native boolean usesExternalPlaybackWhileExternalScreenIsActive();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setUsesExternalPlaybackWhileExternalScreenIsActive:")
    public native void setUsesExternalPlaybackWhileExternalScreenIsActive(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("externalPlaybackVideoGravity")
    public native String getExternalPlaybackVideoGravity();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setExternalPlaybackVideoGravity:")
    public native void setExternalPlaybackVideoGravity(String v);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("allowsAirPlayVideo")
    public native boolean allowsAirPlayVideo();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setAllowsAirPlayVideo:")
    public native void setAllowsAirPlayVideo(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("usesAirPlayVideoWhileAirPlayScreenIsActive")
    public native boolean usesAirPlayVideoWhileAirPlayScreenIsActive();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setUsesAirPlayVideoWhileAirPlayScreenIsActive:")
    public native void setUsesAirPlayVideoWhileAirPlayScreenIsActive(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputObscuredDueToInsufficientExternalProtection")
    public native boolean outputObscuredDueToInsufficientExternalProtection();
    
    
    
    @Mapping("playerWithURL:")
    public static native AVPlayer create(NSURL URL);
    @Mapping("playerWithPlayerItem:")
    public static native AVPlayer create(AVPlayerItem item);
    @Mapping("play")
    public native void play();
    @Mapping("pause")
    public native void pause();
    @Mapping("replaceCurrentItemWithPlayerItem:")
    public native void replaceCurrentItem(AVPlayerItem item);
    @Mapping("currentTime")
    public native CMTime getCurrentTime();
    @Mapping("seekToDate:")
    public native void seekToDate(NSDate date);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("seekToDate:completionHandler:")
    public native void seekToDate(NSDate date, @Block VoidBooleanBlock completionHandler);
    @Mapping("seekToTime:")
    public native void seekToTime(CMTime time);
    @Mapping("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTime(CMTime time, CMTime toleranceBefore, CMTime toleranceAfter);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("seekToTime:completionHandler:")
    public native void seekToTime(CMTime time, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTime(CMTime time, CMTime toleranceBefore, CMTime toleranceAfter, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRate:time:atHostTime:")
    public native void setRate(float rate, CMTime itemTime, CMTime hostClockTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("prerollAtRate:completionHandler:")
    public native void prerollAtRate(float rate, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("cancelPendingPrerolls")
    public native void cancelPendingPrerolls();
    @Mapping("addPeriodicTimeObserverForInterval:queue:usingBlock:")
    public native Object addPeriodicTimeObserver(CMTime interval, DispatchQueue queue, @Block VoidBlock1<CMTime> block);
    @Mapping("addBoundaryTimeObserverForTimes:queue:usingBlock:")
    public native Object addBoundaryTimeObserver(NSArray<?> times, DispatchQueue queue, @Block Runnable block);
    @Mapping("removeTimeObserver:")
    public native void removeTimeObserver(Object observer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setMediaSelectionCriteria:forMediaCharacteristic:")
    public native void setMediaSelectionCriteria(AVPlayerMediaSelectionCriteria criteria, String mediaCharacteristic);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("mediaSelectionCriteriaForMediaCharacteristic:")
    public native AVPlayerMediaSelectionCriteria getMediaSelectionCriteria(String mediaCharacteristic);
    
}
