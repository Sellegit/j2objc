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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVPlayerItem")
public class AVPlayerItem 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithURL:")
    public AVPlayerItem(NSURL URL) { }
    @Mapping("initWithAsset:")
    public AVPlayerItem(AVAsset asset) { }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithAsset:automaticallyLoadedAssetKeys:")
    public AVPlayerItem(AVAsset asset, NSArray<?> automaticallyLoadedAssetKeys) { }
    @Mapping("init")
    public AVPlayerItem() { }
    
    
    @Mapping("status")
    public native @Representing("AVPlayerItemStatus") @MachineSizedSInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    @Mapping("asset")
    public native AVAsset getAsset();
    @Mapping("tracks")
    public native NSArray<AVPlayerItemTrack> getTracks();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("duration")
    public native CMTime getDuration();
    @Mapping("presentationSize")
    public native CGSize getPresentationSize();
    @Mapping("timedMetadata")
    public native NSArray<AVMetadataItem> getTimedMetadata();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("automaticallyLoadedAssetKeys")
    public native List<String> getAutomaticallyLoadedAssetKeys();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("canPlayFastForward")
    public native boolean canPlayFastForward();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canPlaySlowForward")
    public native boolean canPlaySlowForward();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canPlayReverse")
    public native boolean canPlayReverse();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canPlaySlowReverse")
    public native boolean canPlaySlowReverse();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("canPlayFastReverse")
    public native boolean canPlayFastReverse();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canStepForward")
    public native boolean canStepForward();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canStepBackward")
    public native boolean canStepBackward();
    @Mapping("forwardPlaybackEndTime")
    public native CMTime getForwardPlaybackEndTime();
    @Mapping("setForwardPlaybackEndTime:")
    public native void setForwardPlaybackEndTime(CMTime v);
    @Mapping("reversePlaybackEndTime")
    public native CMTime getReversePlaybackEndTime();
    @Mapping("setReversePlaybackEndTime:")
    public native void setReversePlaybackEndTime(CMTime v);
    @Mapping("seekableTimeRanges")
    public native List<CMTimeRange> getSeekableTimeRanges();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("timebase")
    public native CMTimebase getTimebase();
    @Mapping("videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Mapping("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("seekingWaitsForVideoCompositionRendering")
    public native boolean seekingWaitsForVideoCompositionRendering();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setSeekingWaitsForVideoCompositionRendering:")
    public native void seekingWaitsForVideoCompositionRendering(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("textStyleRules")
    public native NSArray<AVTextStyleRule> getTextStyleRules();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTextStyleRules:")
    public native void setTextStyleRules(NSArray<AVTextStyleRule> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("audioTimePitchAlgorithm")
    public native String getAudioTimePitchAlgorithm();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String v);
    @Mapping("audioMix")
    public native AVAudioMix getAudioMix();
    @Mapping("setAudioMix:")
    public native void setAudioMix(AVAudioMix v);
    @Mapping("loadedTimeRanges")
    public native List<CMTimeRange> getLoadedTimeRanges();
    @Mapping("isPlaybackLikelyToKeepUp")
    public native boolean isPlaybackLikelyToKeepUp();
    @Mapping("isPlaybackBufferFull")
    public native boolean isPlaybackBufferFull();
    @Mapping("isPlaybackBufferEmpty")
    public native boolean isPlaybackBufferEmpty();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredPeakBitRate")
    public native double getPreferredPeakBitRate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreferredPeakBitRate:")
    public native void setPreferredPeakBitRate(double v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputs")
    public native NSArray<AVPlayerItemOutput> getOutputs();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVPlayerItemTimeJumpedNotification")
    public static native NSString TimeJumpedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVPlayerItemDidPlayToEndTimeNotification")
    public static native NSString DidPlayToEndTimeNotification();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVPlayerItemFailedToPlayToEndTimeNotification")
    public static native NSString FailedToPlayToEndTimeNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVPlayerItemPlaybackStalledNotification")
    public static native NSString PlaybackStalledNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVPlayerItemNewAccessLogEntryNotification")
    public static native NSString NewAccessLogEntryNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVPlayerItemNewErrorLogEntryNotification")
    public static native NSString NewErrorLogEntryNotification();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVPlayerItemFailedToPlayToEndTimeErrorKey")
    public static native NSString FailedToPlayToEndTimeErrorKey();
    
    @Mapping("playerItemWithURL:")
    public static native AVPlayerItem create(NSURL URL);
    @Mapping("playerItemWithAsset:")
    public static native AVPlayerItem create(AVAsset asset);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("playerItemWithAsset:automaticallyLoadedAssetKeys:")
    public static native AVPlayerItem create(AVAsset asset, NSArray<?> automaticallyLoadedAssetKeys);
    @Mapping("currentTime")
    public native CMTime getCurrentTime();
    @Mapping("seekToTime:")
    public native void seekToTime(CMTime time);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("seekToTime:completionHandler:")
    public native void seekToTime(CMTime time, @Block VoidBooleanBlock completionHandler);
    @Mapping("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTime(CMTime time, CMTime toleranceBefore, CMTime toleranceAfter);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTime(CMTime time, CMTime toleranceBefore, CMTime toleranceAfter, @Block VoidBooleanBlock completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("cancelPendingSeeks")
    public native void cancelPendingSeeks();
    @Mapping("currentDate")
    public native NSDate getCurrentDate();
    @Mapping("seekToDate:")
    public native boolean seekToDate(NSDate date);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("seekToDate:completionHandler:")
    public native boolean seekToDate(NSDate date, @Block VoidBooleanBlock completionHandler);
    @Mapping("stepByCount:")
    public native void stepByCount(@MachineSizedSInt long stepCount);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("selectMediaOption:inMediaSelectionGroup:")
    public native void selectMediaOption(AVMediaSelectionOption mediaSelectionOption, AVMediaSelectionGroup mediaSelectionGroup);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("selectMediaOptionAutomaticallyInMediaSelectionGroup:")
    public native void selectMediaOptionAutomatically(AVMediaSelectionGroup mediaSelectionGroup);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("selectedMediaOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption getSelectedMediaOption(AVMediaSelectionGroup mediaSelectionGroup);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("accessLog")
    public native AVPlayerItemAccessLog getAccessLog();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("errorLog")
    public native AVPlayerItemErrorLog getErrorLog();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("addOutput:")
    public native void addOutput(AVPlayerItemOutput output);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("removeOutput:")
    public native void removeOutput(AVPlayerItemOutput output);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
