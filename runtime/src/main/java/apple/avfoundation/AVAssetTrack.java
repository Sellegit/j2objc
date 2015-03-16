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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetTrack")
public class AVAssetTrack 
    extends NSObject 
    implements NSCopying, AVAsynchronousKeyValueLoading {

    
    
    public AVAssetTrack() {}
    
    
    @Mapping("asset")
    public native AVAsset getAsset();
    @Mapping("trackID")
    public native int getTrackID();
    @Mapping("mediaType")
    public native String getMediaType();
    @Mapping("formatDescriptions")
    public native List<CMFormatDescription> getFormatDescriptions();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isPlayable")
    public native boolean isPlayable();
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("isSelfContained")
    public native boolean isSelfContained();
    @Mapping("totalSampleDataLength")
    public native long getTotalSampleDataLength();
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    @Mapping("naturalTimeScale")
    public native int getNaturalTimeScale();
    @Mapping("estimatedDataRate")
    public native float getEstimatedDataRate();
    @Mapping("languageCode")
    public native String getLanguageCode();
    @Mapping("extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Mapping("naturalSize")
    public native CGSize getNaturalSize();
    @Mapping("preferredTransform")
    public native CGAffineTransform getPreferredTransform();
    @Mapping("preferredVolume")
    public native float getPreferredVolume();
    @Mapping("nominalFrameRate")
    public native float getNominalFrameRate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("minFrameDuration")
    public native CMTime getMinFrameDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("requiresFrameReordering")
    public native boolean requiresFrameReordering();
    @Mapping("segments")
    public native NSArray<AVAssetTrackSegment> getSegments();
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
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("availableTrackAssociationTypes")
    public native List<AVTrackAssociationType> getAvailableTrackAssociationTypes();
    
    
    
    @Mapping("hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(String mediaCharacteristic);
    @Mapping("segmentForTrackTime:")
    public native AVAssetTrackSegment getSegment(CMTime trackTime);
    @Mapping("samplePresentationTimeForTrackTime:")
    public native CMTime getSamplePresentationTime(CMTime trackTime);
    @Mapping("metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadataForFormat(String format);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("associatedTracksOfType:")
    public native NSArray<AVAssetTrack> getAssociatedTracksOfType(String trackAssociationType);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("statusOfValueForKey:error:")
    public native @Representing("AVKeyValueStatus") @MachineSizedSInt long getStatusOfValue(String key, Todo outError);
    @Mapping("loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(NSArray<?> keys, @Block Runnable handler);
    
}
