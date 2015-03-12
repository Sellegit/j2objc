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

@Library("AVFoundation") @Mapping("AVAssetReaderAudioMixOutput")
public class AVAssetReaderAudioMixOutput 
    extends AVAssetReaderOutput 
     {

    
    
    public AVAssetReaderAudioMixOutput() {}
    @Mapping("initWithAudioTracks:audioSettings:")
    public AVAssetReaderAudioMixOutput(NSArray<?> audioTracks, NSDictionary<?, ?> audioSettings) { }
    
    
    @Mapping("audioTracks")
    public native NSArray<AVAssetTrack> getAudioTracks();
    @Mapping("audioSettings")
    public native AVAudioSettings getAudioSettings();
    @Mapping("audioMix")
    public native AVAudioMix getAudioMix();
    @Mapping("setAudioMix:")
    public native void setAudioMix(AVAudioMix v);
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
    
    
    
    @Mapping("assetReaderAudioMixOutputWithAudioTracks:audioSettings:")
    public static native AVAssetReaderAudioMixOutput create(NSArray<?> audioTracks, NSDictionary<?, ?> audioSettings);
    
}
