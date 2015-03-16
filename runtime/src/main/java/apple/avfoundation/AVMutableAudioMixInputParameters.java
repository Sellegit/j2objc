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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMutableAudioMixInputParameters")
public class AVMutableAudioMixInputParameters 
    extends AVAudioMixInputParameters 
     {

    
    
    public AVMutableAudioMixInputParameters() {}
    
    
    @Mapping("trackID")
    public native int getTrackID();
    @Mapping("setTrackID:")
    public native void setTrackID(int v);
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
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("audioTapProcessor")
    public native MTAudioProcessingTap getAudioTapProcessor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAudioTapProcessor:")
    public native void setAudioTapProcessor(MTAudioProcessingTap v);
    
    
    
    @Mapping("setVolumeRampFromStartVolume:toEndVolume:timeRange:")
    public native void setVolumeRamp(float startVolume, float endVolume, CMTimeRange timeRange);
    @Mapping("setVolume:atTime:")
    public native void setVolume(float volume, CMTime time);
    @Mapping("audioMixInputParametersWithTrack:")
    public static native AVMutableAudioMixInputParameters create(AVAssetTrack track);
    @Mapping("audioMixInputParameters")
    public static native AVMutableAudioMixInputParameters create();
    
}
