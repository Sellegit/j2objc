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

@Library("AVFoundation") @Mapping("AVAudioUnitEQ")
public class AVAudioUnitEQ 
    extends AVAudioUnitEffect 
     {

    
    
    public AVAudioUnitEQ() {}
    @Mapping("initWithNumberOfBands:")
    public AVAudioUnitEQ(@MachineSizedUInt long numberOfBands) { }
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitEQ(AudioComponentDescription audioComponentDescription) { }
    
    
    @Mapping("bands")
    public native AVAudioUnitEQFilterParameters getBands();
    @Mapping("globalGain")
    public native float getGlobalGain();
    @Mapping("setGlobalGain:")
    public native void setGlobalGain(float v);
    
    
    
    
    
}
