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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioUnitReverb")
public class AVAudioUnitReverb 
    extends AVAudioUnitEffect 
     {

    
    
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitReverb(AudioComponentDescription audioComponentDescription) { }
    @Mapping("init")
    public AVAudioUnitReverb() { }

    
    @Mapping("wetDryMix")
    public native float getWetDryMix();
    @Mapping("setWetDryMix:")
    public native void setWetDryMix(float v);

    
    
    @Mapping("loadFactoryPreset:")
    public native void loadFactoryPreset(@Representing("AVAudioUnitReverbPreset") long preset);

}
