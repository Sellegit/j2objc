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


@Library("AudioToolbox/AudioToolbox.h")
@Mapping("AudioConverterSampleRateConverterComplexity")
public final class AudioConverterSampleRateConverterComplexity extends ObjCEnum {
    
    @GlobalConstant("kAudioConverterSampleRateConverterComplexity_Linear")
    public static final long Linear = 1818848869L;
    @GlobalConstant("kAudioConverterSampleRateConverterComplexity_Normal")
    public static final long Normal = 1852797549L;
    @GlobalConstant("kAudioConverterSampleRateConverterComplexity_Mastering")
    public static final long Mastering = 1650553971L;


}
