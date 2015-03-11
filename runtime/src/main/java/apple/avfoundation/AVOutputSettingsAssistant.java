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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation") @Mapping("AVOutputSettingsAssistant")
public class AVOutputSettingsAssistant 
    extends NSObject 
     {

    
    
    public AVOutputSettingsAssistant() {}
    
    
    @Mapping("audioSettings")
    public native AVAudioSettings getAudioSettings();
    @Mapping("videoSettings")
    public native AVVideoSettings getVideoSettings();
    @Mapping("outputFileType")
    public native String getOutputFileType();
    @Mapping("sourceAudioFormat")
    public native CMAudioFormatDescription getSourceAudioFormat();
    @Mapping("setSourceAudioFormat:")
    public native void setSourceAudioFormat(CMAudioFormatDescription v);
    @Mapping("sourceVideoFormat")
    public native CMVideoFormatDescription getSourceVideoFormat();
    @Mapping("setSourceVideoFormat:")
    public native void setSourceVideoFormat(CMVideoFormatDescription v);
    @Mapping("sourceVideoAverageFrameDuration")
    public native CMTime getSourceVideoAverageFrameDuration();
    @Mapping("setSourceVideoAverageFrameDuration:")
    public native void setSourceVideoAverageFrameDuration(CMTime v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sourceVideoMinFrameDuration")
    public native CMTime getSourceVideoMinFrameDuration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSourceVideoMinFrameDuration:")
    public native void setSourceVideoMinFrameDuration(CMTime v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("availableOutputSettingsPresets")
    public static native List<AVOutputSettingsPreset> getAvailableOutputSettingsPresets();
    @Mapping("outputSettingsAssistantWithPreset:")
    public static native AVOutputSettingsAssistant create(AVOutputSettingsPreset presetIdentifier);
    
}
