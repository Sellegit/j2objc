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
@Mapping("AudioChannelLabel")
public final class AudioChannelLabel extends ObjCEnum {
    
    @GlobalConstant("kAudioChannelLabel_Unknown")
    public static final long Unknown = -1L;
    @GlobalConstant("kAudioChannelLabel_Unused")
    public static final long Unused = 0L;
    @GlobalConstant("kAudioChannelLabel_UseCoordinates")
    public static final long UseCoordinates = 100L;
    @GlobalConstant("kAudioChannelLabel_Left")
    public static final long Left = 1L;
    @GlobalConstant("kAudioChannelLabel_Right")
    public static final long Right = 2L;
    @GlobalConstant("kAudioChannelLabel_Center")
    public static final long Center = 3L;
    @GlobalConstant("kAudioChannelLabel_LFEScreen")
    public static final long LFEScreen = 4L;
    @GlobalConstant("kAudioChannelLabel_LeftSurround")
    public static final long LeftSurround = 5L;
    @GlobalConstant("kAudioChannelLabel_RightSurround")
    public static final long RightSurround = 6L;
    @GlobalConstant("kAudioChannelLabel_LeftCenter")
    public static final long LeftCenter = 7L;
    @GlobalConstant("kAudioChannelLabel_RightCenter")
    public static final long RightCenter = 8L;
    @GlobalConstant("kAudioChannelLabel_CenterSurround")
    public static final long CenterSurround = 9L;
    @GlobalConstant("kAudioChannelLabel_LeftSurroundDirect")
    public static final long LeftSurroundDirect = 10L;
    @GlobalConstant("kAudioChannelLabel_RightSurroundDirect")
    public static final long RightSurroundDirect = 11L;
    @GlobalConstant("kAudioChannelLabel_TopCenterSurround")
    public static final long TopCenterSurround = 12L;
    @GlobalConstant("kAudioChannelLabel_VerticalHeightLeft")
    public static final long VerticalHeightLeft = 13L;
    @GlobalConstant("kAudioChannelLabel_VerticalHeightCenter")
    public static final long VerticalHeightCenter = 14L;
    @GlobalConstant("kAudioChannelLabel_VerticalHeightRight")
    public static final long VerticalHeightRight = 15L;
    @GlobalConstant("kAudioChannelLabel_TopBackLeft")
    public static final long TopBackLeft = 16L;
    @GlobalConstant("kAudioChannelLabel_TopBackCenter")
    public static final long TopBackCenter = 17L;
    @GlobalConstant("kAudioChannelLabel_TopBackRight")
    public static final long TopBackRight = 18L;
    @GlobalConstant("kAudioChannelLabel_RearSurroundLeft")
    public static final long RearSurroundLeft = 33L;
    @GlobalConstant("kAudioChannelLabel_RearSurroundRight")
    public static final long RearSurroundRight = 34L;
    @GlobalConstant("kAudioChannelLabel_LeftWide")
    public static final long LeftWide = 35L;
    @GlobalConstant("kAudioChannelLabel_RightWide")
    public static final long RightWide = 36L;
    @GlobalConstant("kAudioChannelLabel_LFE2")
    public static final long LFE2 = 37L;
    @GlobalConstant("kAudioChannelLabel_LeftTotal")
    public static final long LeftTotal = 38L;
    @GlobalConstant("kAudioChannelLabel_RightTotal")
    public static final long RightTotal = 39L;
    @GlobalConstant("kAudioChannelLabel_HearingImpaired")
    public static final long HearingImpaired = 40L;
    @GlobalConstant("kAudioChannelLabel_Narration")
    public static final long Narration = 41L;
    @GlobalConstant("kAudioChannelLabel_Mono")
    public static final long Mono = 42L;
    @GlobalConstant("kAudioChannelLabel_DialogCentricMix")
    public static final long DialogCentricMix = 43L;
    @GlobalConstant("kAudioChannelLabel_CenterSurroundDirect")
    public static final long CenterSurroundDirect = 44L;
    @GlobalConstant("kAudioChannelLabel_Haptic")
    public static final long Haptic = 45L;
    @GlobalConstant("kAudioChannelLabel_Ambisonic_W")
    public static final long Ambisonic_W = 200L;
    @GlobalConstant("kAudioChannelLabel_Ambisonic_X")
    public static final long Ambisonic_X = 201L;
    @GlobalConstant("kAudioChannelLabel_Ambisonic_Y")
    public static final long Ambisonic_Y = 202L;
    @GlobalConstant("kAudioChannelLabel_Ambisonic_Z")
    public static final long Ambisonic_Z = 203L;
    @GlobalConstant("kAudioChannelLabel_MS_Mid")
    public static final long MS_Mid = 204L;
    @GlobalConstant("kAudioChannelLabel_MS_Side")
    public static final long MS_Side = 205L;
    @GlobalConstant("kAudioChannelLabel_XY_X")
    public static final long XY_X = 206L;
    @GlobalConstant("kAudioChannelLabel_XY_Y")
    public static final long XY_Y = 207L;
    @GlobalConstant("kAudioChannelLabel_HeadphonesLeft")
    public static final long HeadphonesLeft = 301L;
    @GlobalConstant("kAudioChannelLabel_HeadphonesRight")
    public static final long HeadphonesRight = 302L;
    @GlobalConstant("kAudioChannelLabel_ClickTrack")
    public static final long ClickTrack = 304L;
    @GlobalConstant("kAudioChannelLabel_ForeignLanguage")
    public static final long ForeignLanguage = 305L;
    @GlobalConstant("kAudioChannelLabel_Discrete")
    public static final long Discrete = 400L;
    @GlobalConstant("kAudioChannelLabel_Discrete_0")
    public static final long Discrete_0 = 65536L;
    @GlobalConstant("kAudioChannelLabel_Discrete_1")
    public static final long Discrete_1 = 65537L;
    @GlobalConstant("kAudioChannelLabel_Discrete_2")
    public static final long Discrete_2 = 65538L;
    @GlobalConstant("kAudioChannelLabel_Discrete_3")
    public static final long Discrete_3 = 65539L;
    @GlobalConstant("kAudioChannelLabel_Discrete_4")
    public static final long Discrete_4 = 65540L;
    @GlobalConstant("kAudioChannelLabel_Discrete_5")
    public static final long Discrete_5 = 65541L;
    @GlobalConstant("kAudioChannelLabel_Discrete_6")
    public static final long Discrete_6 = 65542L;
    @GlobalConstant("kAudioChannelLabel_Discrete_7")
    public static final long Discrete_7 = 65543L;
    @GlobalConstant("kAudioChannelLabel_Discrete_8")
    public static final long Discrete_8 = 65544L;
    @GlobalConstant("kAudioChannelLabel_Discrete_9")
    public static final long Discrete_9 = 65545L;
    @GlobalConstant("kAudioChannelLabel_Discrete_10")
    public static final long Discrete_10 = 65546L;
    @GlobalConstant("kAudioChannelLabel_Discrete_11")
    public static final long Discrete_11 = 65547L;
    @GlobalConstant("kAudioChannelLabel_Discrete_12")
    public static final long Discrete_12 = 65548L;
    @GlobalConstant("kAudioChannelLabel_Discrete_13")
    public static final long Discrete_13 = 65549L;
    @GlobalConstant("kAudioChannelLabel_Discrete_14")
    public static final long Discrete_14 = 65550L;
    @GlobalConstant("kAudioChannelLabel_Discrete_15")
    public static final long Discrete_15 = 65551L;
    @GlobalConstant("kAudioChannelLabel_Discrete_65535")
    public static final long Discrete_65535 = 131071L;


}
