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
 * @since Available in iOS 2.2 and later.
 */

@Library("AVFoundation") @Mapping("AVAudioPlayer")
public class AVAudioPlayer 
    extends NSObject 
     {

    
    
    public AVAudioPlayer() {}
    
    
    @Mapping("isPlaying")
    public native boolean isPlaying();
    @Mapping("numberOfChannels")
    public native @MachineSizedUInt long getNumberOfChannels();
    @Mapping("duration")
    public native double getDuration();
    @Mapping("delegate")
    public native AVAudioPlayerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(AVAudioPlayerDelegate v);
    @Mapping("url")
    public native NSURL getUrl();
    @Mapping("data")
    public native NSData getData();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("pan")
    public native float getPan();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setPan:")
    public native void setPan(float v);
    @Mapping("volume")
    public native float getVolume();
    @Mapping("setVolume:")
    public native void setVolume(float v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("enableRate")
    public native boolean isRateEnabled();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setEnableRate:")
    public native void setRateEnabled(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("rate")
    public native float getRate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRate:")
    public native void setRate(float v);
    @Mapping("currentTime")
    public native double getCurrentTime();
    @Mapping("setCurrentTime:")
    public native void setCurrentTime(double v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("deviceCurrentTime")
    public native double getDeviceCurrentTime();
    @Mapping("numberOfLoops")
    public native @MachineSizedSInt long getNumberOfLoops();
    @Mapping("setNumberOfLoops:")
    public native void setNumberOfLoops(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("settings")
    public native AVAudioSettings getSettings();
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
    
    
    
    @Mapping("prepareToPlay")
    public native boolean prepareToPlay();
    @Mapping("play")
    public native boolean play();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("playAtTime:")
    public native boolean playAtTime(double time);
    @Mapping("pause")
    public native void pause();
    @Mapping("stop")
    public native void stop();
    @Mapping("updateMeters")
    public native void updateMeters();
    @Mapping("peakPowerForChannel:")
    public native float getPeakPowerForChannel(@MachineSizedUInt long channelNumber);
    @Mapping("averagePowerForChannel:")
    public native float getAveragePowerForChannel(@MachineSizedUInt long channelNumber);
    
}
