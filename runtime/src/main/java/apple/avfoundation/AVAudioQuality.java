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


@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAudioQuality")
public final class AVAudioQuality extends ObjCEnum {
    
    @GlobalConstant("AVAudioQualityMin")
    public static final long Min = 0L;
    @GlobalConstant("AVAudioQualityLow")
    public static final long Low = 32L;
    @GlobalConstant("AVAudioQualityMedium")
    public static final long Medium = 64L;
    @GlobalConstant("AVAudioQualityHigh")
    public static final long High = 96L;
    @GlobalConstant("AVAudioQualityMax")
    public static final long Max = 127L;


}
