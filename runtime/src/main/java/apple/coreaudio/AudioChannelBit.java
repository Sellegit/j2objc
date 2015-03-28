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
@Mapping("AudioChannelBit")
public final class AudioChannelBit extends ObjCEnum {
    
    @GlobalConstant("kAudioChannelBit_Left")
    public static final long Left = 1L;
    @GlobalConstant("kAudioChannelBit_Right")
    public static final long Right = 2L;
    @GlobalConstant("kAudioChannelBit_Center")
    public static final long Center = 4L;
    @GlobalConstant("kAudioChannelBit_LFEScreen")
    public static final long LFEScreen = 8L;
    @GlobalConstant("kAudioChannelBit_LeftSurround")
    public static final long LeftSurround = 16L;
    @GlobalConstant("kAudioChannelBit_RightSurround")
    public static final long RightSurround = 32L;
    @GlobalConstant("kAudioChannelBit_LeftCenter")
    public static final long LeftCenter = 64L;
    @GlobalConstant("kAudioChannelBit_RightCenter")
    public static final long RightCenter = 128L;
    @GlobalConstant("kAudioChannelBit_CenterSurround")
    public static final long CenterSurround = 256L;
    @GlobalConstant("kAudioChannelBit_LeftSurroundDirect")
    public static final long LeftSurroundDirect = 512L;
    @GlobalConstant("kAudioChannelBit_RightSurroundDirect")
    public static final long RightSurroundDirect = 1024L;
    @GlobalConstant("kAudioChannelBit_TopCenterSurround")
    public static final long TopCenterSurround = 2048L;
    @GlobalConstant("kAudioChannelBit_VerticalHeightLeft")
    public static final long VerticalHeightLeft = 4096L;
    @GlobalConstant("kAudioChannelBit_VerticalHeightCenter")
    public static final long VerticalHeightCenter = 8192L;
    @GlobalConstant("kAudioChannelBit_VerticalHeightRight")
    public static final long VerticalHeightRight = 16384L;
    @GlobalConstant("kAudioChannelBit_TopBackLeft")
    public static final long TopBackLeft = 32768L;
    @GlobalConstant("kAudioChannelBit_TopBackCenter")
    public static final long TopBackCenter = 65536L;
    @GlobalConstant("kAudioChannelBit_TopBackRight")
    public static final long TopBackRight = 131072L;


}
