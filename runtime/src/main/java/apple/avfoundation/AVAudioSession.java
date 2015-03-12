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

@Library("AVFoundation") @Mapping("AVAudioSession")
public class AVAudioSession 
    extends NSObject 
     {

    
    
    public AVAudioSession() {}
    
    
    @Mapping("category")
    public native AVAudioSessionCategory getCategory();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("categoryOptions")
    public native @Representing("AVAudioSessionCategoryOptions") @MachineSizedUInt long getCategoryOptions();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("mode")
    public native AVAudioSessionMode getMode();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isOtherAudioPlaying")
    public native boolean isOtherAudioPlaying();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("secondaryAudioShouldBeSilencedHint")
    public native boolean secondaryAudioShouldBeSilencedHint();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("currentRoute")
    public native AVAudioSessionRouteDescription getCurrentRoute();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredInput")
    public native AVAudioSessionPortDescription getPreferredInput();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("availableInputs")
    public native NSArray<AVAudioSessionPortDescription> getAvailableInputs();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("preferredSampleRate")
    public native double getPreferredSampleRate();
    @Mapping("preferredIOBufferDuration")
    public native double getPreferredIOBufferDuration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredInputNumberOfChannels")
    public native @MachineSizedSInt long getPreferredInputNumberOfChannels();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredOutputNumberOfChannels")
    public native @MachineSizedSInt long getPreferredOutputNumberOfChannels();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("maximumInputNumberOfChannels")
    public native @MachineSizedSInt long getMaximumInputNumberOfChannels();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("maximumOutputNumberOfChannels")
    public native @MachineSizedSInt long getMaximumOutputNumberOfChannels();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inputGain")
    public native float getInputGain();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isInputGainSettable")
    public native boolean isInputGainSettable();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isInputAvailable")
    public native boolean isInputAvailable();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inputDataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getInputDataSources();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inputDataSource")
    public native AVAudioSessionDataSourceDescription getInputDataSource();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputDataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getOutputDataSources();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputDataSource")
    public native AVAudioSessionDataSourceDescription getOutputDataSource();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("sampleRate")
    public native double getSampleRate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inputNumberOfChannels")
    public native @MachineSizedSInt long getInputNumberOfChannels();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputNumberOfChannels")
    public native @MachineSizedSInt long getOutputNumberOfChannels();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputVolume")
    public native float getOutputVolume();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inputLatency")
    public native double getInputLatency();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("outputLatency")
    public native double getOutputLatency();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("IOBufferDuration")
    public native double getIOBufferDuration();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("delegate")
    public native AVAudioSessionDelegate getDelegate();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setDelegate:")
    public native void setDelegate(AVAudioSessionDelegate v);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("currentHardwareSampleRate")
    public native double getCurrentHardwareSampleRate();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("currentHardwareInputNumberOfChannels")
    public native @MachineSizedSInt long getCurrentHardwareInputNumberOfChannels();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("currentHardwareOutputNumberOfChannels")
    public native @MachineSizedSInt long getCurrentHardwareOutputNumberOfChannels();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("preferredHardwareSampleRate")
    public native double getPreferredHardwareSampleRate();
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionInterruptionNotification")
    public static native NSString InterruptionNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionRouteChangeNotification")
    public static native NSString RouteChangeNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionMediaServicesWereLostNotification")
    public static native NSString MediaServicesWereLostNotification();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVAudioSessionMediaServicesWereResetNotification")
    public static native NSString MediaServicesWereResetNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVAudioSessionSilenceSecondaryAudioHintNotification")
    public static native NSString SilenceSecondaryAudioHintNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVAudioSessionSilenceSecondaryAudioHintTypeKey")
    public static native NSString SilenceSecondaryAudioHintTypeKey();
    
    @Mapping("setActive:error:")
    public native boolean setActive$error$(boolean active, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setActive:withOptions:error:")
    public native boolean setActive$withOptions$error$(boolean active, @Representing("AVAudioSessionSetActiveOptions") @MachineSizedUInt long options, Todo outError);
    @Mapping("setCategory:error:")
    public native boolean setCategory(String category, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setCategory:withOptions:error:")
    public native boolean setCategory(String category, @Representing("AVAudioSessionCategoryOptions") @MachineSizedUInt long options, Todo outError);
    @Mapping("recordPermission")
    public native @Representing("AVAudioSessionRecordPermission") @MachineSizedUInt long getRecordPermission();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setMode:error:")
    public native boolean setMode(String mode, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("overrideOutputAudioPort:error:")
    public native boolean overrideOutputAudioPort(@Representing("AVAudioSessionPortOverride") @MachineSizedUInt long portOverride, Todo outError);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredInput:error:")
    public native boolean setPreferredInput(AVAudioSessionPortDescription inPort, Todo outError);
    @Mapping("sharedInstance")
    public static native AVAudioSession getSharedInstance();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setPreferredSampleRate:error:")
    public native boolean setPreferredSampleRate(double sampleRate, Todo outError);
    @Mapping("setPreferredIOBufferDuration:error:")
    public native boolean setPreferredIOBufferDuration(double duration, Todo outError);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredInputNumberOfChannels:error:")
    public native boolean setPreferredInputNumberOfChannels(@MachineSizedSInt long count, Todo outError);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredOutputNumberOfChannels:error:")
    public native boolean setPreferredOutputNumberOfChannels(@MachineSizedSInt long count, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setInputGain:error:")
    public native boolean setInputGain(float gain, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setInputDataSource:error:")
    public native boolean setInputDataSource(AVAudioSessionDataSourceDescription dataSource, Todo outError);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setOutputDataSource:error:")
    public native boolean setOutputDataSource(AVAudioSessionDataSourceDescription dataSource, Todo outError);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setActive:withFlags:error:")
    public native boolean setActive$withFlags$error$(boolean active, @MachineSizedSInt long flags, Todo outError);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("setPreferredHardwareSampleRate:error:")
    public native boolean setPreferredHardwareSampleRate(double sampleRate, Todo outError);
    
}
