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

@Library("AVFoundation") @Mapping("AVAudioUnitReverb")
public class AVAudioUnitReverb 
    extends AVAudioUnitEffect 
     {

    
    
    public AVAudioUnitReverb() {}
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitReverb(AudioComponentDescription audioComponentDescription) { }
    
    
    @Mapping("wetDryMix")
    public native float getWetDryMix();
    public native void setWetDryMix(float v);
    
    
    
    @Mapping("loadFactoryPreset:")
    public native void loadFactoryPreset(@Representing("AVAudioUnitReverbPreset") @MachineSizedSInt long preset);
    
}
