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





@Library("CoreAudio")
@Mapping("AudioChannelLayoutTag")
public final class AudioChannelLayoutTag extends ObjCEnum {
    
    @GlobalConstant("kAudioChannelLayoutTag_UseChannelDescriptions")
    public static final long UseChannelDescriptions = 0L;
    @GlobalConstant("kAudioChannelLayoutTag_UseChannelBitmap")
    public static final long UseChannelBitmap = 65536L;
    @GlobalConstant("kAudioChannelLayoutTag_Mono")
    public static final long Mono = 6553601L;
    @GlobalConstant("kAudioChannelLayoutTag_Stereo")
    public static final long Stereo = 6619138L;
    @GlobalConstant("kAudioChannelLayoutTag_StereoHeadphones")
    public static final long StereoHeadphones = 6684674L;
    @GlobalConstant("kAudioChannelLayoutTag_MatrixStereo")
    public static final long MatrixStereo = 6750210L;
    @GlobalConstant("kAudioChannelLayoutTag_MidSide")
    public static final long MidSide = 6815746L;
    @GlobalConstant("kAudioChannelLayoutTag_XY")
    public static final long XY = 6881282L;
    @GlobalConstant("kAudioChannelLayoutTag_Binaural")
    public static final long Binaural = 6946818L;
    @GlobalConstant("kAudioChannelLayoutTag_Ambisonic_B_Format")
    public static final long Ambisonic_B_Format = 7012356L;
    @GlobalConstant("kAudioChannelLayoutTag_Quadraphonic")
    public static final long Quadraphonic = 7077892L;
    @GlobalConstant("kAudioChannelLayoutTag_Pentagonal")
    public static final long Pentagonal = 7143429L;
    @GlobalConstant("kAudioChannelLayoutTag_Hexagonal")
    public static final long Hexagonal = 7208966L;
    @GlobalConstant("kAudioChannelLayoutTag_Octagonal")
    public static final long Octagonal = 7274504L;
    @GlobalConstant("kAudioChannelLayoutTag_Cube")
    public static final long Cube = 7340040L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_1_0")
    public static final long MPEG_1_0 = 6553601L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_2_0")
    public static final long MPEG_2_0 = 6619138L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_3_0_A")
    public static final long MPEG_3_0_A = 7405571L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_3_0_B")
    public static final long MPEG_3_0_B = 7471107L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_4_0_A")
    public static final long MPEG_4_0_A = 7536644L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_4_0_B")
    public static final long MPEG_4_0_B = 7602180L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_0_A")
    public static final long MPEG_5_0_A = 7667717L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_0_B")
    public static final long MPEG_5_0_B = 7733253L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_0_C")
    public static final long MPEG_5_0_C = 7798789L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_0_D")
    public static final long MPEG_5_0_D = 7864325L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_1_A")
    public static final long MPEG_5_1_A = 7929862L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_1_B")
    public static final long MPEG_5_1_B = 7995398L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_1_C")
    public static final long MPEG_5_1_C = 8060934L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_5_1_D")
    public static final long MPEG_5_1_D = 8126470L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_6_1_A")
    public static final long MPEG_6_1_A = 8192007L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_7_1_A")
    public static final long MPEG_7_1_A = 8257544L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_7_1_B")
    public static final long MPEG_7_1_B = 8323080L;
    @GlobalConstant("kAudioChannelLayoutTag_MPEG_7_1_C")
    public static final long MPEG_7_1_C = 8388616L;
    @GlobalConstant("kAudioChannelLayoutTag_Emagic_Default_7_1")
    public static final long Emagic_Default_7_1 = 8454152L;
    @GlobalConstant("kAudioChannelLayoutTag_SMPTE_DTV")
    public static final long SMPTE_DTV = 8519688L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_1_0")
    public static final long ITU_1_0 = 6553601L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_2_0")
    public static final long ITU_2_0 = 6619138L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_2_1")
    public static final long ITU_2_1 = 8585219L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_2_2")
    public static final long ITU_2_2 = 8650756L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_3_0")
    public static final long ITU_3_0 = 7405571L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_3_1")
    public static final long ITU_3_1 = 7536644L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_3_2")
    public static final long ITU_3_2 = 7667717L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_3_2_1")
    public static final long ITU_3_2_1 = 7929862L;
    @GlobalConstant("kAudioChannelLayoutTag_ITU_3_4_1")
    public static final long ITU_3_4_1 = 8388616L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_0")
    public static final long DVD_0 = 6553601L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_1")
    public static final long DVD_1 = 6619138L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_2")
    public static final long DVD_2 = 8585219L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_3")
    public static final long DVD_3 = 8650756L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_4")
    public static final long DVD_4 = 8716291L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_5")
    public static final long DVD_5 = 8781828L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_6")
    public static final long DVD_6 = 8847365L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_7")
    public static final long DVD_7 = 7405571L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_8")
    public static final long DVD_8 = 7536644L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_9")
    public static final long DVD_9 = 7667717L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_10")
    public static final long DVD_10 = 8912900L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_11")
    public static final long DVD_11 = 8978437L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_12")
    public static final long DVD_12 = 7929862L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_13")
    public static final long DVD_13 = 7536644L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_14")
    public static final long DVD_14 = 7667717L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_15")
    public static final long DVD_15 = 8912900L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_16")
    public static final long DVD_16 = 8978437L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_17")
    public static final long DVD_17 = 7929862L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_18")
    public static final long DVD_18 = 9043973L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_19")
    public static final long DVD_19 = 7733253L;
    @GlobalConstant("kAudioChannelLayoutTag_DVD_20")
    public static final long DVD_20 = 7995398L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_4")
    public static final long AudioUnit_4 = 7077892L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_5")
    public static final long AudioUnit_5 = 7143429L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_6")
    public static final long AudioUnit_6 = 7208966L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_8")
    public static final long AudioUnit_8 = 7274504L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_5_0")
    public static final long AudioUnit_5_0 = 7733253L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_6_0")
    public static final long AudioUnit_6_0 = 9109510L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_7_0")
    public static final long AudioUnit_7_0 = 9175047L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_7_0_Front")
    public static final long AudioUnit_7_0_Front = 9699335L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_5_1")
    public static final long AudioUnit_5_1 = 7929862L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_6_1")
    public static final long AudioUnit_6_1 = 8192007L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_7_1")
    public static final long AudioUnit_7_1 = 8388616L;
    @GlobalConstant("kAudioChannelLayoutTag_AudioUnit_7_1_Front")
    public static final long AudioUnit_7_1_Front = 8257544L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_3_0")
    public static final long AAC_3_0 = 7471107L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_Quadraphonic")
    public static final long AAC_Quadraphonic = 7077892L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_4_0")
    public static final long AAC_4_0 = 7602180L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_5_0")
    public static final long AAC_5_0 = 7864325L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_5_1")
    public static final long AAC_5_1 = 8126470L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_6_0")
    public static final long AAC_6_0 = 9240582L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_6_1")
    public static final long AAC_6_1 = 9306119L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_7_0")
    public static final long AAC_7_0 = 9371655L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_7_1")
    public static final long AAC_7_1 = 8323080L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_7_1_B")
    public static final long AAC_7_1_B = 11993096L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_7_1_C")
    public static final long AAC_7_1_C = 12058632L;
    @GlobalConstant("kAudioChannelLayoutTag_AAC_Octagonal")
    public static final long AAC_Octagonal = 9437192L;
    @GlobalConstant("kAudioChannelLayoutTag_TMH_10_2_std")
    public static final long TMH_10_2_std = 9502736L;
    @GlobalConstant("kAudioChannelLayoutTag_TMH_10_2_full")
    public static final long TMH_10_2_full = 9568277L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_1_0_1")
    public static final long AC3_1_0_1 = 9764866L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_3_0")
    public static final long AC3_3_0 = 9830403L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_3_1")
    public static final long AC3_3_1 = 9895940L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_3_0_1")
    public static final long AC3_3_0_1 = 9961476L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_2_1_1")
    public static final long AC3_2_1_1 = 10027012L;
    @GlobalConstant("kAudioChannelLayoutTag_AC3_3_1_1")
    public static final long AC3_3_1_1 = 10092549L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC_6_0_A")
    public static final long EAC_6_0_A = 10158086L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC_7_0_A")
    public static final long EAC_7_0_A = 10223623L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_6_1_A")
    public static final long EAC3_6_1_A = 10289159L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_6_1_B")
    public static final long EAC3_6_1_B = 10354695L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_6_1_C")
    public static final long EAC3_6_1_C = 10420231L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_A")
    public static final long EAC3_7_1_A = 10485768L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_B")
    public static final long EAC3_7_1_B = 10551304L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_C")
    public static final long EAC3_7_1_C = 10616840L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_D")
    public static final long EAC3_7_1_D = 10682376L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_E")
    public static final long EAC3_7_1_E = 10747912L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_F")
    public static final long EAC3_7_1_F = 10813448L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_G")
    public static final long EAC3_7_1_G = 10878984L;
    @GlobalConstant("kAudioChannelLayoutTag_EAC3_7_1_H")
    public static final long EAC3_7_1_H = 10944520L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_3_1")
    public static final long DTS_3_1 = 11010052L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_4_1")
    public static final long DTS_4_1 = 11075589L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_0_A")
    public static final long DTS_6_0_A = 11141126L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_0_B")
    public static final long DTS_6_0_B = 11206662L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_0_C")
    public static final long DTS_6_0_C = 11272198L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_1_A")
    public static final long DTS_6_1_A = 11337735L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_1_B")
    public static final long DTS_6_1_B = 11403271L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_1_C")
    public static final long DTS_6_1_C = 11468807L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_7_0")
    public static final long DTS_7_0 = 11534343L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_7_1")
    public static final long DTS_7_1 = 11599880L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_8_0_A")
    public static final long DTS_8_0_A = 11665416L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_8_0_B")
    public static final long DTS_8_0_B = 11730952L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_8_1_A")
    public static final long DTS_8_1_A = 11796489L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_8_1_B")
    public static final long DTS_8_1_B = 11862025L;
    @GlobalConstant("kAudioChannelLayoutTag_DTS_6_1_D")
    public static final long DTS_6_1_D = 11927559L;
    @GlobalConstant("kAudioChannelLayoutTag_DiscreteInOrder")
    public static final long DiscreteInOrder = 9633792L;
    @GlobalConstant("kAudioChannelLayoutTag_Unknown")
    public static final long Unknown = -65536L;
    

}
