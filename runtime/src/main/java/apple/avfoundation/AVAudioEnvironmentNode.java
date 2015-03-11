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

@Library("AVFoundation") @Mapping("AVAudioEnvironmentNode")
public class AVAudioEnvironmentNode 
    extends AVAudioNode 
    implements AVAudioMixing {

    
    
    public AVAudioEnvironmentNode() {}
    
    
    @Mapping("outputVolume")
    public native float getOutputVolume();
    public native void setOutputVolume(float v);
    @Mapping("nextAvailableInputBus")
    public native @MachineSizedUInt long getNextAvailableInputBus();
    @Mapping("listenerPosition")
    public native AVAudio3DPoint getListenerPosition();
    public native void setListenerPosition(AVAudio3DPoint v);
    @Mapping("listenerVectorOrientation")
    public native AVAudio3DVectorOrientation getListenerVectorOrientation();
    public native void setListenerVectorOrientation(AVAudio3DVectorOrientation v);
    @Mapping("listenerAngularOrientation")
    public native AVAudio3DAngularOrientation getListenerAngularOrientation();
    public native void setListenerAngularOrientation(AVAudio3DAngularOrientation v);
    @Mapping("distanceAttenuationParameters")
    public native AVAudioEnvironmentDistanceAttenuationParameters getDistanceAttenuationParameters();
    @Mapping("reverbParameters")
    public native AVAudioEnvironmentReverbParameters getReverbParameters();
    @Mapping("volume")
    public native float getVolume();
    public native void setVolume(float v);
    @Mapping("pan")
    public native float getPan();
    public native void setPan(float v);
    @Mapping("renderingAlgorithm")
    public native @Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long getRenderingAlgorithm();
    public native void setRenderingAlgorithm(@Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long v);
    @Mapping("rate")
    public native float getRate();
    public native void setRate(float v);
    @Mapping("reverbBlend")
    public native float getReverbBlend();
    public native void setReverbBlend(float v);
    @Mapping("obstruction")
    public native float getObstruction();
    public native void setObstruction(float v);
    @Mapping("occlusion")
    public native float getOcclusion();
    public native void setOcclusion(float v);
    @Mapping("position")
    public native AVAudio3DPoint getPosition();
    public native void setPosition(AVAudio3DPoint v);
    
    
    
    @Mapping("applicableRenderingAlgorithms")
    public native List<AVAudio3DMixingRenderingAlgorithm> getApplicableRenderingAlgorithms();
    
}
