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

@Library("AVFoundation") @Mapping("AVAudioTime")
public class AVAudioTime 
    extends NSObject 
     {

    
    
    public AVAudioTime() {}
    @Mapping("initWithAudioTimeStamp:sampleRate:")
    public AVAudioTime(AudioTimeStamp ts, double sampleRate) { }
    @Mapping("initWithHostTime:")
    public AVAudioTime(long hostTime) { }
    @Mapping("initWithSampleTime:atRate:")
    public AVAudioTime(long sampleTime, double sampleRate) { }
    @Mapping("initWithHostTime:sampleTime:atRate:")
    public AVAudioTime(long hostTime, long sampleTime, double sampleRate) { }
    
    
    @Mapping("isHostTimeValid")
    public native boolean isHostTimeValid();
    @Mapping("hostTime")
    public native long getHostTime();
    @Mapping("isSampleTimeValid")
    public native boolean isSampleTimeValid();
    @Mapping("sampleTime")
    public native long getSampleTime();
    @Mapping("sampleRate")
    public native double getSampleRate();
    @Mapping("audioTimeStamp")
    public native AudioTimeStamp getAudioTimeStamp();
    
    
    
    @Mapping("extrapolateTimeFromAnchor:")
    public native AVAudioTime extrapolateTimeFromAnchor(AVAudioTime anchorTime);
    @Mapping("timeWithAudioTimeStamp:sampleRate:")
    public static native AVAudioTime create(AudioTimeStamp ts, double sampleRate);
    @Mapping("timeWithHostTime:")
    public static native AVAudioTime create(long hostTime);
    @Mapping("timeWithSampleTime:atRate:")
    public static native AVAudioTime create(long sampleTime, double sampleRate);
    @Mapping("timeWithHostTime:sampleTime:atRate:")
    public static native AVAudioTime create(long hostTime, long sampleTime, double sampleRate);
    @Mapping("hostTimeForSeconds:")
    public static native long convertSecondsToHostTime(double seconds);
    @Mapping("secondsForHostTime:")
    public static native double convertHostTimeToSeconds(long hostTime);
    
}
