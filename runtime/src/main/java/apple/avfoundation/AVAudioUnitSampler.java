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

@Library("AVFoundation") @Mapping("AVAudioUnitSampler")
public class AVAudioUnitSampler 
    extends AVAudioUnitMIDIInstrument 
     {

    
    
    public AVAudioUnitSampler() {}
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitSampler(AudioComponentDescription description) { }
    
    
    @Mapping("stereoPan")
    public native float getStereoPan();
    @Mapping("setStereoPan:")
    public native void setStereoPan(float v);
    @Mapping("masterGain")
    public native float getMasterGain();
    @Mapping("setMasterGain:")
    public native void setMasterGain(float v);
    @Mapping("globalTuning")
    public native float getGlobalTuning();
    @Mapping("setGlobalTuning:")
    public native void setGlobalTuning(float v);
    
    
    
    @Mapping("loadSoundBankInstrumentAtURL:program:bankMSB:bankLSB:error:")
    public native boolean loadSoundBankInstrument(NSURL bankURL, byte program, byte bankMSB, byte bankLSB, Todo outError);
    @Mapping("loadInstrumentAtURL:error:")
    public native boolean loadInstrument(NSURL instrumentURL, Todo outError);
    @Mapping("loadAudioFilesAtURLs:error:")
    public native boolean loadAudioFiles(NSArray<?> audioFiles, Todo outError);
    
}
