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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioUnitMIDIInstrument")
public class AVAudioUnitMIDIInstrument 
    extends AVAudioUnit 
     {

    
    
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitMIDIInstrument(AudioComponentDescription description) { }
    @Mapping("init")
    public AVAudioUnitMIDIInstrument() { }
    
    
    
    
    
    
    @Mapping("startNote:withVelocity:onChannel:")
    public native void startNote(byte note, byte velocity, byte channel);
    @Mapping("stopNote:onChannel:")
    public native void stopNote(byte note, byte channel);
    @Mapping("sendController:withValue:onChannel:")
    public native void sendController(byte controller, byte value, byte channel);
    @Mapping("sendPitchBend:onChannel:")
    public native void sendPitchBend(short pitchbend, byte channel);
    @Mapping("sendPressure:onChannel:")
    public native void sendPressure(byte pressure, byte channel);
    @Mapping("sendPressureForKey:withValue:onChannel:")
    public native void sendPressure(byte key, byte value, byte channel);
    @Mapping("sendProgramChange:onChannel:")
    public native void sendProgramChange(byte program, byte channel);
    @Mapping("sendProgramChange:bankMSB:bankLSB:onChannel:")
    public native void sendProgramChange(byte program, byte bankMSB, byte bankLSB, byte channel);
    @Mapping("sendMIDIEvent:data1:data2:")
    public native void sendMIDIEvent(byte midiStatus, byte data1, byte data2);
    @Mapping("sendMIDIEvent:data1:")
    public native void sendMIDIEvent(byte midiStatus, byte data1);
    @Mapping("sendMIDISysExEvent:")
    public native void sendMIDISysExEvent(NSData midiData);
    
}
