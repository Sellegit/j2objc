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
 * @since Available in iOS 3.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioRecorder")
public class AVAudioRecorder 
    extends NSObject 
     {

    
    
    public AVAudioRecorder() {}
    
    
    @Mapping("isRecording")
    public native boolean isRecording();
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("settings")
    public native AVAudioSettings getSettings();
    @Mapping("delegate")
    public native AVAudioRecorderDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(AVAudioRecorderDelegate v);
    @Mapping("currentTime")
    public native double getCurrentTime();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("deviceCurrentTime")
    public native double getDeviceCurrentTime();
    @Mapping("isMeteringEnabled")
    public native boolean isMeteringEnabled();
    @Mapping("setMeteringEnabled:")
    public native void setMeteringEnabled(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("channelAssignments")
    public native NSArray<AVAudioSessionChannelDescription> getChannelAssignments();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setChannelAssignments:")
    public native void setChannelAssignments(NSArray<AVAudioSessionChannelDescription> v);
    
    
    
    @Mapping("prepareToRecord")
    public native boolean prepareToRecord();
    @Mapping("record")
    public native boolean record();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("recordAtTime:")
    public native boolean recordAtTime(double time);
    @Mapping("recordForDuration:")
    public native boolean record(double duration);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("recordAtTime:forDuration:")
    public native boolean recordAtTime(double time, double duration);
    @Mapping("pause")
    public native void pause();
    @Mapping("stop")
    public native void stop();
    @Mapping("deleteRecording")
    public native boolean deleteRecording();
    @Mapping("updateMeters")
    public native void updateMeters();
    @Mapping("peakPowerForChannel:")
    public native float getPeakPowerForChannel(@MachineSizedUInt long channelNumber);
    @Mapping("averagePowerForChannel:")
    public native float getAveragePowerForChannel(@MachineSizedUInt long channelNumber);
    
}
