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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioEnvironmentDistanceAttenuationParameters")
public class AVAudioEnvironmentDistanceAttenuationParameters 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVAudioEnvironmentDistanceAttenuationParameters() { }
    
    
    @Mapping("distanceAttenuationModel")
    public native @Representing("AVAudioEnvironmentDistanceAttenuationModel") @MachineSizedSInt long getDistanceAttenuationModel();
    @Mapping("setDistanceAttenuationModel:")
    public native void setDistanceAttenuationModel(@Representing("AVAudioEnvironmentDistanceAttenuationModel") @MachineSizedSInt long v);
    @Mapping("referenceDistance")
    public native float getReferenceDistance();
    @Mapping("setReferenceDistance:")
    public native void setReferenceDistance(float v);
    @Mapping("maximumDistance")
    public native float getMaximumDistance();
    @Mapping("setMaximumDistance:")
    public native void setMaximumDistance(float v);
    @Mapping("rolloffFactor")
    public native float getRolloffFactor();
    @Mapping("setRolloffFactor:")
    public native void setRolloffFactor(float v);
    
    
    
    
    
}
