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

@Library("AVFoundation") @Mapping("AVAssetExportSession")
public class AVAssetExportSession 
    extends NSObject 
     {

    
    
    public AVAssetExportSession() {}
    @Mapping("initWithAsset:presetName:")
    public AVAssetExportSession(AVAsset asset, AVAssetExportPreset presetName) { }
    
    
    @Mapping("presetName")
    public native AVAssetExportPreset getPresetName();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("asset")
    public native AVAsset getAsset();
    @Mapping("supportedFileTypes")
    public native List<String> getSupportedFileTypes();
    @Mapping("outputFileType")
    public native String getOutputFileType();
    public native void setOutputFileType(String v);
    @Mapping("outputURL")
    public native NSURL getOutputURL();
    public native void setOutputURL(NSURL v);
    @Mapping("status")
    public native @Representing("AVAssetExportSessionStatus") @MachineSizedSInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    @Mapping("progress")
    public native float getProgress();
    @Mapping("maxDuration")
    public native CMTime getMaxDuration();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("estimatedOutputFileLength")
    public native long getEstimatedOutputFileLength();
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    public native void setTimeRange(CMTimeRange v);
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("metadataItemFilter")
    public native AVMetadataItemFilter getMetadataItemFilter();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setMetadataItemFilter(AVMetadataItemFilter v);
    @Mapping("fileLengthLimit")
    public native long getFileLengthLimit();
    public native void setFileLengthLimit(long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("audioTimePitchAlgorithm")
    public native AVAudioTimePitchAlgorithm getAudioTimePitchAlgorithm();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setAudioTimePitchAlgorithm(AVAudioTimePitchAlgorithm v);
    @Mapping("audioMix")
    public native AVAudioMix getAudioMix();
    public native void setAudioMix(AVAudioMix v);
    @Mapping("videoComposition")
    public native AVVideoComposition getVideoComposition();
    public native void setVideoComposition(AVVideoComposition v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    @Mapping("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    public native void setShouldOptimizeForNetworkUse(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("directoryForTemporaryFiles")
    public native NSURL getDirectoryForTemporaryFiles();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setDirectoryForTemporaryFiles(NSURL v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypes(@Block VoidBlock1<NSArray<NSString>> handler);
    @Mapping("exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronously(@Block Runnable handler);
    @Mapping("cancelExport")
    public native void cancelExport();
    @Mapping("allExportPresets")
    public static native List<AVAssetExportPreset> getAllExportPresets();
    @Mapping("exportPresetsCompatibleWithAsset:")
    public static native List<AVAssetExportPreset> getCompatibleExportPresets(AVAsset asset);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPreset(AVAssetExportPreset presetName, AVAsset asset, String outputFileType, @Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("exportSessionWithAsset:presetName:")
    public static native AVAssetExportSession create(AVAsset asset, AVAssetExportPreset presetName);
    
}
