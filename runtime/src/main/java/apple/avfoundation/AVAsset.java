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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAsset")
public class AVAsset 
    extends NSObject 
    implements NSCopying, AVAsynchronousKeyValueLoading {

    
    
    @Mapping("init")
    public AVAsset() { }

    
    @Mapping("duration")
    public native CMTime getDuration();
    @Mapping("preferredRate")
    public native float getPreferredRate();
    @Mapping("preferredVolume")
    public native float getPreferredVolume();
    @Mapping("preferredTransform")
    public native CGAffineTransform getPreferredTransform();
    @Mapping("providesPreciseDurationAndTiming")
    public native boolean providesPreciseDurationAndTiming();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("referenceRestrictions")
    public native @Representing("AVAssetReferenceRestrictions") long getReferenceRestrictions();
    @Mapping("tracks")
    public native NSArray<AVAssetTrack> getTracks();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("trackGroups")
    public native NSArray<AVAssetTrackGroup> getTrackGroups();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("creationDate")
    public native AVMetadataItem getCreationDate();
    @Mapping("lyrics")
    public native String getLyrics();
    @Mapping("commonMetadata")
    public native NSArray<AVMetadataItem> getCommonMetadata();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Mapping("availableMetadataFormats")
    public native List<AVMetadataFormat> getAvailableMetadataFormats();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("availableChapterLocales")
    public native NSArray<NSLocale> getAvailableChapterLocales();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableMediaCharacteristicsWithMediaSelectionOptions")
    public native List<AVMediaCharacteristic> getAvailableMediaCharacteristicsWithMediaSelectionOptions();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("hasProtectedContent")
    public native boolean hasProtectedContent();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("isPlayable")
    public native boolean isPlayable();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("isExportable")
    public native boolean isExportable();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("isReadable")
    public native boolean isReadable();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("isComposable")
    public native boolean isComposable();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isCompatibleWithSavedPhotosAlbum")
    public native boolean isCompatibleWithSavedPhotosAlbum();

    
    
    @Mapping("assetWithURL:")
    public static native AVAsset create(NSURL URL);
    @Mapping("cancelLoading")
    public native void cancelLoading();
    @Mapping("trackWithTrackID:")
    public native AVAssetTrack getTrack(int trackID);
    @Mapping("tracksWithMediaType:")
    public native NSArray<AVAssetTrack> getTracksWithType(String mediaType);
    @Mapping("tracksWithMediaCharacteristic:")
    public native NSArray<AVAssetTrack> getTracksWithCharacteristic(String mediaCharacteristic);
    @Mapping("metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadata(String format);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsContainingItemsWithCommonKeys(NSLocale locale, NSArray<?> commonKeys);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsBestMatchingPreferredLanguages(NSArray<?> preferredLanguages);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup getMediaSelectionGroup(String mediaCharacteristic);
    @Mapping("unusedTrackID")
    public native int getUnusedTrackID();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("statusOfValueForKey:error:")
    public native @Representing("AVKeyValueStatus") long getStatusOfValue(String key, Todo outError);
    @Mapping("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(NSArray<?> keys, @Block Runnable handler);

}
