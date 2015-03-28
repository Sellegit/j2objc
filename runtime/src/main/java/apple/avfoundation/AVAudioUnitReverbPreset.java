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
@Mapping("AVAudioUnitReverbPreset")
public final class AVAudioUnitReverbPreset extends ObjCEnum {
    
    @GlobalConstant("AVAudioUnitReverbPresetSmallRoom")
    public static final long SmallRoom = 0L;
    @GlobalConstant("AVAudioUnitReverbPresetMediumRoom")
    public static final long MediumRoom = 1L;
    @GlobalConstant("AVAudioUnitReverbPresetLargeRoom")
    public static final long LargeRoom = 2L;
    @GlobalConstant("AVAudioUnitReverbPresetMediumHall")
    public static final long MediumHall = 3L;
    @GlobalConstant("AVAudioUnitReverbPresetLargeHall")
    public static final long LargeHall = 4L;
    @GlobalConstant("AVAudioUnitReverbPresetPlate")
    public static final long Plate = 5L;
    @GlobalConstant("AVAudioUnitReverbPresetMediumChamber")
    public static final long MediumChamber = 6L;
    @GlobalConstant("AVAudioUnitReverbPresetLargeChamber")
    public static final long LargeChamber = 7L;
    @GlobalConstant("AVAudioUnitReverbPresetCathedral")
    public static final long Cathedral = 8L;
    @GlobalConstant("AVAudioUnitReverbPresetLargeRoom2")
    public static final long LargeRoom2 = 9L;
    @GlobalConstant("AVAudioUnitReverbPresetMediumHall2")
    public static final long MediumHall2 = 10L;
    @GlobalConstant("AVAudioUnitReverbPresetMediumHall3")
    public static final long MediumHall3 = 11L;
    @GlobalConstant("AVAudioUnitReverbPresetLargeHall2")
    public static final long LargeHall2 = 12L;


}
