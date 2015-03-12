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

@Library("AVFoundation") @Mapping("AVAssetReaderTrackOutput")
public class AVAssetReaderTrackOutput 
    extends AVAssetReaderOutput 
     {

    
    
    public AVAssetReaderTrackOutput() {}
    
    
    @Mapping("track")
    public native AVAssetTrack getTrack();
    @Mapping("outputSettings")
    public native NSDictionary<NSString, NSObject> getOutputSettings();
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
    
    
    
    @Mapping("assetReaderTrackOutputWithTrack:outputSettings:")
    public static native AVAssetReaderTrackOutput create(AVAssetTrack track, NSDictionary<?, ?> outputSettings);
    
}
