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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioMixInputParameters")
public class AVAudioMixInputParameters 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVAudioMixInputParameters() { }

    
    @Mapping("trackID")
    public native int getTrackID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("audioTimePitchAlgorithm")
    public native AVAudioTimePitchAlgorithm getAudioTimePitchAlgorithm();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("audioTapProcessor")
    public native MTAudioProcessingTap getAudioTapProcessor();

    
    
    @Mapping("getVolumeRampForTime:startVolume:endVolume:timeRange:")
    public native boolean getVolumeRamp(CMTime time, Todo startVolume, Todo endVolume, CMTimeRange timeRange);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
