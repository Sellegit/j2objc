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
 * @since Available in iOS 4.1 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetWriter")
public class AVAssetWriter 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVAssetWriter() { }
    
    
    @Mapping("outputURL")
    public native NSURL getOutputURL();
    @Mapping("outputFileType")
    public native String getOutputFileType();
    @Mapping("availableMediaTypes")
    public native List<AVMediaType> getAvailableMediaTypes();
    @Mapping("status")
    public native @Representing("AVAssetWriterStatus") @MachineSizedSInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    @Mapping("metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Mapping("setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Mapping("shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    @Mapping("setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean v);
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
    @Mapping("inputs")
    public native NSArray<AVAssetWriterInput> getInputs();
    @Mapping("movieFragmentInterval")
    public native CMTime getMovieFragmentInterval();
    @Mapping("setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(CMTime v);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("movieTimeScale")
    public native int getMovieTimeScale();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("setMovieTimeScale:")
    public native void setMovieTimeScale(int v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("inputGroups")
    public native NSArray<AVAssetWriterInputGroup> getInputGroups();
    
    
    
    @Mapping("canApplyOutputSettings:forMediaType:")
    public native boolean canApplyOutputSettings(NSDictionary<?, ?> outputSettings, String mediaType);
    @Mapping("canAddInput:")
    public native boolean canAddInput(AVAssetWriterInput input);
    @Mapping("addInput:")
    public native void addInput(AVAssetWriterInput input);
    @Mapping("startWriting")
    public native boolean startWriting();
    @Mapping("startSessionAtSourceTime:")
    public native void startSession(CMTime startTime);
    @Mapping("endSessionAtSourceTime:")
    public native void endSession(CMTime endTime);
    @Mapping("cancelWriting")
    public native void cancelWriting();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("finishWriting")
    public native boolean finishWriting();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("finishWritingWithCompletionHandler:")
    public native void finishWriting(@Block Runnable handler);
    @Mapping("assetWriterWithURL:fileType:error:")
    public static native AVAssetWriter create(NSURL outputURL, String outputFileType, Todo outError);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canAddInputGroup:")
    public native boolean canAddInputGroup(AVAssetWriterInputGroup inputGroup);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addInputGroup:")
    public native void addInputGroup(AVAssetWriterInputGroup inputGroup);
    
}
