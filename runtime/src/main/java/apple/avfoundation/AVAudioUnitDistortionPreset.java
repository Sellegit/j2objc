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
@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAudioUnitDistortionPreset")
public final class AVAudioUnitDistortionPreset extends ObjCEnum {
    
    @GlobalConstant("AVAudioUnitDistortionPresetDrumsBitBrush")
    public static final long DrumsBitBrush = 0L;
    @GlobalConstant("AVAudioUnitDistortionPresetDrumsBufferBeats")
    public static final long DrumsBufferBeats = 1L;
    @GlobalConstant("AVAudioUnitDistortionPresetDrumsLoFi")
    public static final long DrumsLoFi = 2L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiBrokenSpeaker")
    public static final long MultiBrokenSpeaker = 3L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiCellphoneConcert")
    public static final long MultiCellphoneConcert = 4L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDecimated1")
    public static final long MultiDecimated1 = 5L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDecimated2")
    public static final long MultiDecimated2 = 6L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDecimated3")
    public static final long MultiDecimated3 = 7L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDecimated4")
    public static final long MultiDecimated4 = 8L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDistortedFunk")
    public static final long MultiDistortedFunk = 9L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDistortedCubed")
    public static final long MultiDistortedCubed = 10L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiDistortedSquared")
    public static final long MultiDistortedSquared = 11L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiEcho1")
    public static final long MultiEcho1 = 12L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiEcho2")
    public static final long MultiEcho2 = 13L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiEchoTight1")
    public static final long MultiEchoTight1 = 14L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiEchoTight2")
    public static final long MultiEchoTight2 = 15L;
    @GlobalConstant("AVAudioUnitDistortionPresetMultiEverythingIsBroken")
    public static final long MultiEverythingIsBroken = 16L;
    @GlobalConstant("AVAudioUnitDistortionPresetSpeechAlienChatter")
    public static final long SpeechAlienChatter = 17L;
    @GlobalConstant("AVAudioUnitDistortionPresetSpeechCosmicInterference")
    public static final long SpeechCosmicInterference = 18L;
    @GlobalConstant("AVAudioUnitDistortionPresetSpeechGoldenPi")
    public static final long SpeechGoldenPi = 19L;
    @GlobalConstant("AVAudioUnitDistortionPresetSpeechRadioTower")
    public static final long SpeechRadioTower = 20L;
    @GlobalConstant("AVAudioUnitDistortionPresetSpeechWaves")
    public static final long SpeechWaves = 21L;


}
