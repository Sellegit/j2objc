package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Library("AudioToolbox")
@Mapping("AudioQueuePitchAlgorithm")
public final class AudioQueuePitchAlgorithm extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueTimePitchAlgorithm_Spectral")
    public static final long Spectral = 1936745827L;
    @GlobalConstant("kAudioQueueTimePitchAlgorithm_TimeDomain")
    public static final long TimeDomain = 1953064047L;
    @GlobalConstant("kAudioQueueTimePitchAlgorithm_LowQualityZeroLatency")
    public static final long LowQualityZeroLatency = 1819376236L;
    @GlobalConstant("kAudioQueueTimePitchAlgorithm_Varispeed")
    public static final long Varispeed = 1987276900L;
    

}
