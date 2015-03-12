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
    public AVAssetExportSession(AVAsset asset, String presetName) { }
    
    
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
    @Mapping("setOutputFileType:")
    public native void setOutputFileType(String v);
    @Mapping("outputURL")
    public native NSURL getOutputURL();
    @Mapping("setOutputURL:")
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
    @Mapping("setTimeRange:")
    public native void setTimeRange(CMTimeRange v);
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Mapping("setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("metadataItemFilter")
    public native AVMetadataItemFilter getMetadataItemFilter();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setMetadataItemFilter:")
    public native void setMetadataItemFilter(AVMetadataItemFilter v);
    @Mapping("fileLengthLimit")
    public native long getFileLengthLimit();
    @Mapping("setFileLengthLimit:")
    public native void setFileLengthLimit(long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("audioTimePitchAlgorithm")
    public native AVAudioTimePitchAlgorithm getAudioTimePitchAlgorithm();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(AVAudioTimePitchAlgorithm v);
    @Mapping("audioMix")
    public native AVAudioMix getAudioMix();
    @Mapping("setAudioMix:")
    public native void setAudioMix(AVAudioMix v);
    @Mapping("videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Mapping("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    @Mapping("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    @Mapping("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("directoryForTemporaryFiles")
    public native NSURL getDirectoryForTemporaryFiles();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypes(Todo handler);
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
    public static native void determineCompatibilityOfExportPreset(String presetName, AVAsset asset, String outputFileType, @Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("exportSessionWithAsset:presetName:")
    public static native AVAssetExportSession create(AVAsset asset, String presetName);
    
}
