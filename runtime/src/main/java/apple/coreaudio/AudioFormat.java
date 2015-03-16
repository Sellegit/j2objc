package apple.coreaudio;


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





@Library("CoreAudio/CoreAudioTypes.h")
@Mapping("AudioFormat")
public final class AudioFormat extends ObjCEnum {
    
    @GlobalConstant("kAudioFormatLinearPCM")
    public static final long LinearPCM = 1819304813L;
    @GlobalConstant("kAudioFormatAC3")
    public static final long AC3 = 1633889587L;
    @GlobalConstant("kAudioFormat60958AC3")
    public static final long _60958AC3 = 1667326771L;
    @GlobalConstant("kAudioFormatAppleIMA4")
    public static final long AppleIMA4 = 1768775988L;
    @GlobalConstant("kAudioFormatMPEG4AAC")
    public static final long MPEG4AAC = 1633772320L;
    @GlobalConstant("kAudioFormatMPEG4CELP")
    public static final long MPEG4CELP = 1667591280L;
    @GlobalConstant("kAudioFormatMPEG4HVXC")
    public static final long MPEG4HVXC = 1752594531L;
    @GlobalConstant("kAudioFormatMPEG4TwinVQ")
    public static final long MPEG4TwinVQ = 1953986161L;
    @GlobalConstant("kAudioFormatMACE3")
    public static final long MACE3 = 1296122675L;
    @GlobalConstant("kAudioFormatMACE6")
    public static final long MACE6 = 1296122678L;
    @GlobalConstant("kAudioFormatULaw")
    public static final long ULaw = 1970037111L;
    @GlobalConstant("kAudioFormatALaw")
    public static final long ALaw = 1634492791L;
    @GlobalConstant("kAudioFormatQDesign")
    public static final long QDesign = 1363430723L;
    @GlobalConstant("kAudioFormatQDesign2")
    public static final long QDesign2 = 1363430706L;
    @GlobalConstant("kAudioFormatQUALCOMM")
    public static final long QUALCOMM = 1365470320L;
    @GlobalConstant("kAudioFormatMPEGLayer1")
    public static final long MPEGLayer1 = 778924081L;
    @GlobalConstant("kAudioFormatMPEGLayer2")
    public static final long MPEGLayer2 = 778924082L;
    @GlobalConstant("kAudioFormatMPEGLayer3")
    public static final long MPEGLayer3 = 778924083L;
    @GlobalConstant("kAudioFormatTimeCode")
    public static final long TimeCode = 1953066341L;
    @GlobalConstant("kAudioFormatMIDIStream")
    public static final long MIDIStream = 1835623529L;
    @GlobalConstant("kAudioFormatParameterValueStream")
    public static final long ParameterValueStream = 1634760307L;
    @GlobalConstant("kAudioFormatAppleLossless")
    public static final long AppleLossless = 1634492771L;
    @GlobalConstant("kAudioFormatMPEG4AAC_HE")
    public static final long MPEG4AAC_HE = 1633772392L;
    @GlobalConstant("kAudioFormatMPEG4AAC_LD")
    public static final long MPEG4AAC_LD = 1633772396L;
    @GlobalConstant("kAudioFormatMPEG4AAC_ELD")
    public static final long MPEG4AAC_ELD = 1633772389L;
    @GlobalConstant("kAudioFormatMPEG4AAC_ELD_SBR")
    public static final long MPEG4AAC_ELD_SBR = 1633772390L;
    @GlobalConstant("kAudioFormatMPEG4AAC_ELD_V2")
    public static final long MPEG4AAC_ELD_V2 = 1633772391L;
    @GlobalConstant("kAudioFormatMPEG4AAC_HE_V2")
    public static final long MPEG4AAC_HE_V2 = 1633772400L;
    @GlobalConstant("kAudioFormatMPEG4AAC_Spatial")
    public static final long MPEG4AAC_Spatial = 1633772403L;
    @GlobalConstant("kAudioFormatAMR")
    public static final long AMR = 1935764850L;
    @GlobalConstant("kAudioFormatAMR_WB")
    public static final long AMR_WB = 1935767394L;
    @GlobalConstant("kAudioFormatAudible")
    public static final long Audible = 1096107074L;
    @GlobalConstant("kAudioFormatiLBC")
    public static final long iLBC = 1768710755L;
    @GlobalConstant("kAudioFormatDVIIntelIMA")
    public static final long DVIIntelIMA = 1836253201L;
    @GlobalConstant("kAudioFormatMicrosoftGSM")
    public static final long MicrosoftGSM = 1836253233L;
    @GlobalConstant("kAudioFormatAES3")
    public static final long AES3 = 1634038579L;
    

}
