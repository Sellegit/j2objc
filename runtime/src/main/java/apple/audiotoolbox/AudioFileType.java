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
@Mapping("AudioFileType")
public final class AudioFileType extends ObjCEnum {
    
    @GlobalConstant("kAudioFileAIFFType")
    public static final long AIFF = 1095321158L;
    @GlobalConstant("kAudioFileAIFCType")
    public static final long AIFC = 1095321155L;
    @GlobalConstant("kAudioFileWAVEType")
    public static final long WAVE = 1463899717L;
    @GlobalConstant("kAudioFileSoundDesigner2Type")
    public static final long SoundDesigner2 = 1399075430L;
    @GlobalConstant("kAudioFileNextType")
    public static final long Next = 1315264596L;
    @GlobalConstant("kAudioFileMP3Type")
    public static final long MP3 = 1297106739L;
    @GlobalConstant("kAudioFileMP2Type")
    public static final long MP2 = 1297106738L;
    @GlobalConstant("kAudioFileMP1Type")
    public static final long MP1 = 1297106737L;
    @GlobalConstant("kAudioFileAC3Type")
    public static final long AC3 = 1633889587L;
    @GlobalConstant("kAudioFileAAC_ADTSType")
    public static final long AAC_ADTS = 1633973363L;
    @GlobalConstant("kAudioFileMPEG4Type")
    public static final long MPEG4 = 1836069990L;
    @GlobalConstant("kAudioFileM4AType")
    public static final long M4A = 1832149350L;
    @GlobalConstant("kAudioFileM4BType")
    public static final long M4B = 1832149606L;
    @GlobalConstant("kAudioFileCAFType")
    public static final long CAF = 1667327590L;
    @GlobalConstant("kAudioFile3GPType")
    public static final long _3GP = 862417008L;
    @GlobalConstant("kAudioFile3GP2Type")
    public static final long _3GP2 = 862416946L;
    @GlobalConstant("kAudioFileAMRType")
    public static final long AMR = 1634562662L;
    

}
