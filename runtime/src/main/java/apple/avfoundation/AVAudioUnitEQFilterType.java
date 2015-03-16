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
@Mapping("AVAudioUnitEQFilterType")
public final class AVAudioUnitEQFilterType extends ObjCEnum {
    
    @GlobalConstant("AVAudioUnitEQFilterTypeParametric")
    public static final long Parametric = 0L;
    @GlobalConstant("AVAudioUnitEQFilterTypeLowPass")
    public static final long LowPass = 1L;
    @GlobalConstant("AVAudioUnitEQFilterTypeHighPass")
    public static final long HighPass = 2L;
    @GlobalConstant("AVAudioUnitEQFilterTypeResonantLowPass")
    public static final long ResonantLowPass = 3L;
    @GlobalConstant("AVAudioUnitEQFilterTypeResonantHighPass")
    public static final long ResonantHighPass = 4L;
    @GlobalConstant("AVAudioUnitEQFilterTypeBandPass")
    public static final long BandPass = 5L;
    @GlobalConstant("AVAudioUnitEQFilterTypeBandStop")
    public static final long BandStop = 6L;
    @GlobalConstant("AVAudioUnitEQFilterTypeLowShelf")
    public static final long LowShelf = 7L;
    @GlobalConstant("AVAudioUnitEQFilterTypeHighShelf")
    public static final long HighShelf = 8L;
    @GlobalConstant("AVAudioUnitEQFilterTypeResonantLowShelf")
    public static final long ResonantLowShelf = 9L;
    @GlobalConstant("AVAudioUnitEQFilterTypeResonantHighShelf")
    public static final long ResonantHighShelf = 10L;
    

}
