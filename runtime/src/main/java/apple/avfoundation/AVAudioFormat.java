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
 * @since Available in iOS 8.0 and later.
 */
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioFormat")
public class AVAudioFormat 
    extends NSObject 
     {

    
    
    @Mapping("initWithStreamDescription:")
    public AVAudioFormat(AudioStreamBasicDescription asbd) { }
    @Mapping("initWithStreamDescription:channelLayout:")
    public AVAudioFormat(AudioStreamBasicDescription asbd, AVAudioChannelLayout layout) { }
    @Mapping("initStandardFormatWithSampleRate:channels:")
    public AVAudioFormat(double sampleRate, int channels) { }
    @Mapping("initStandardFormatWithSampleRate:channelLayout:")
    public AVAudioFormat(double sampleRate, AVAudioChannelLayout layout) { }
    @Mapping("initWithCommonFormat:sampleRate:channels:interleaved:")
    public AVAudioFormat(@Representing("AVAudioCommonFormat") long format, double sampleRate, int channels, boolean interleaved) { }
    @Mapping("initWithCommonFormat:sampleRate:interleaved:channelLayout:")
    public AVAudioFormat(@Representing("AVAudioCommonFormat") long format, double sampleRate, boolean interleaved, AVAudioChannelLayout layout) { }
    @Mapping("initWithSettings:")
    public AVAudioFormat(NSDictionary<?, ?> settings) { }
    @Mapping("init")
    public AVAudioFormat() { }

    
    @Mapping("isStandard")
    public native boolean isStandard();
    @Mapping("commonFormat")
    public native @Representing("AVAudioCommonFormat") long getCommonFormat();
    @Mapping("channelCount")
    public native int getChannelCount();
    @Mapping("sampleRate")
    public native double getSampleRate();
    @Mapping("isInterleaved")
    public native boolean isInterleaved();
    @Mapping("streamDescription")
    public native AudioStreamBasicDescription getStreamDescription();
    @Mapping("channelLayout")
    public native AVAudioChannelLayout getChannelLayout();
    @Mapping("settings")
    public native AVAudioSettings getSettings();

    
    
    @Mapping("isEqual:")
    public native boolean equalsTo(Object object);

}
