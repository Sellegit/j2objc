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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetImageGenerator")
public class AVAssetImageGenerator 
    extends NSObject 
     {

    
    
    @Mapping("initWithAsset:")
    public AVAssetImageGenerator(AVAsset asset) { }
    @Mapping("init")
    public AVAssetImageGenerator() { }

    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("asset")
    public native AVAsset getAsset();
    @Mapping("appliesPreferredTrackTransform")
    public native boolean appliesPreferredTrackTransform();
    @Mapping("setAppliesPreferredTrackTransform:")
    public native void setAppliesPreferredTrackTransform(boolean v);
    @Mapping("maximumSize")
    public native CGSize getMaximumSize();
    @Mapping("setMaximumSize:")
    public native void setMaximumSize(CGSize v);
    @Mapping("apertureMode")
    public native AVAssetImageGeneratorApertureMode getApertureMode();
    @Mapping("setApertureMode:")
    public native void setApertureMode(AVAssetImageGeneratorApertureMode v);
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
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("requestedTimeToleranceBefore")
    public native CMTime getRequestedTimeToleranceBefore();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRequestedTimeToleranceBefore:")
    public native void setRequestedTimeToleranceBefore(CMTime v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("requestedTimeToleranceAfter")
    public native CMTime getRequestedTimeToleranceAfter();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRequestedTimeToleranceAfter:")
    public native void setRequestedTimeToleranceAfter(CMTime v);

    
    
    @Mapping("copyCGImageAtTime:actualTime:error:")
    public native CGImage getCGImageAtTime(CMTime requestedTime, CMTime actualTime, Todo outError);
    @Mapping("cancelAllCGImageGeneration")
    public native void cancelAllCGImageGeneration();
    @Mapping("assetImageGeneratorWithAsset:")
    public static native AVAssetImageGenerator create(AVAsset asset);

}
