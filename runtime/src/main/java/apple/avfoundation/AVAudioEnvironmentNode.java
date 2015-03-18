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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioEnvironmentNode")
public class AVAudioEnvironmentNode 
    extends AVAudioNode 
    implements AVAudioMixing {

    
    
    @Mapping("init")
    public AVAudioEnvironmentNode() { }
    
    
    @Mapping("outputVolume")
    public native float getOutputVolume();
    @Mapping("setOutputVolume:")
    public native void setOutputVolume(float v);
    @Mapping("nextAvailableInputBus")
    public native @MachineSizedUInt long getNextAvailableInputBus();
    @Mapping("listenerPosition")
    public native AVAudio3DPoint getListenerPosition();
    @Mapping("setListenerPosition:")
    public native void setListenerPosition(AVAudio3DPoint v);
    @Mapping("listenerVectorOrientation")
    public native AVAudio3DVectorOrientation getListenerVectorOrientation();
    @Mapping("setListenerVectorOrientation:")
    public native void setListenerVectorOrientation(AVAudio3DVectorOrientation v);
    @Mapping("listenerAngularOrientation")
    public native AVAudio3DAngularOrientation getListenerAngularOrientation();
    @Mapping("setListenerAngularOrientation:")
    public native void setListenerAngularOrientation(AVAudio3DAngularOrientation v);
    @Mapping("distanceAttenuationParameters")
    public native AVAudioEnvironmentDistanceAttenuationParameters getDistanceAttenuationParameters();
    @Mapping("reverbParameters")
    public native AVAudioEnvironmentReverbParameters getReverbParameters();
    @Mapping("volume")
    public native float getVolume();
    @Mapping("setVolume:")
    public native void setVolume(float v);
    @Mapping("pan")
    public native float getPan();
    @Mapping("setPan:")
    public native void setPan(float v);
    @Mapping("renderingAlgorithm")
    public native @Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long getRenderingAlgorithm();
    @Mapping("setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(@Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long v);
    @Mapping("rate")
    public native float getRate();
    @Mapping("setRate:")
    public native void setRate(float v);
    @Mapping("reverbBlend")
    public native float getReverbBlend();
    @Mapping("setReverbBlend:")
    public native void setReverbBlend(float v);
    @Mapping("obstruction")
    public native float getObstruction();
    @Mapping("setObstruction:")
    public native void setObstruction(float v);
    @Mapping("occlusion")
    public native float getOcclusion();
    @Mapping("setOcclusion:")
    public native void setOcclusion(float v);
    @Mapping("position")
    public native AVAudio3DPoint getPosition();
    @Mapping("setPosition:")
    public native void setPosition(AVAudio3DPoint v);
    
    
    
    @Mapping("applicableRenderingAlgorithms")
    public native List<AVAudio3DMixingRenderingAlgorithm> getApplicableRenderingAlgorithms();
    
}
