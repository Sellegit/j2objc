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
@Mapping("AudioFileStreamProperty")
public final class AudioFileStreamProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioFileStreamProperty_ReadyToProducePackets")
    public static final long ReadyToProducePackets = 1919247481L;
    @GlobalConstant("kAudioFileStreamProperty_FileFormat")
    public static final long FileFormat = 1717988724L;
    @GlobalConstant("kAudioFileStreamProperty_DataFormat")
    public static final long DataFormat = 1684434292L;
    @GlobalConstant("kAudioFileStreamProperty_FormatList")
    public static final long FormatList = 1718383476L;
    @GlobalConstant("kAudioFileStreamProperty_MagicCookieData")
    public static final long MagicCookieData = 1835493731L;
    @GlobalConstant("kAudioFileStreamProperty_AudioDataByteCount")
    public static final long AudioDataByteCount = 1650683508L;
    @GlobalConstant("kAudioFileStreamProperty_AudioDataPacketCount")
    public static final long AudioDataPacketCount = 1885564532L;
    @GlobalConstant("kAudioFileStreamProperty_MaximumPacketSize")
    public static final long MaximumPacketSize = 1886616165L;
    @GlobalConstant("kAudioFileStreamProperty_DataOffset")
    public static final long DataOffset = 1685022310L;
    @GlobalConstant("kAudioFileStreamProperty_ChannelLayout")
    public static final long ChannelLayout = 1668112752L;
    @GlobalConstant("kAudioFileStreamProperty_PacketToFrame")
    public static final long PacketToFrame = 1886086770L;
    @GlobalConstant("kAudioFileStreamProperty_FrameToPacket")
    public static final long FrameToPacket = 1718775915L;
    @GlobalConstant("kAudioFileStreamProperty_PacketToByte")
    public static final long PacketToByte = 1886085753L;
    @GlobalConstant("kAudioFileStreamProperty_ByteToPacket")
    public static final long ByteToPacket = 1652125803L;
    @GlobalConstant("kAudioFileStreamProperty_PacketTableInfo")
    public static final long PacketTableInfo = 1886283375L;
    @GlobalConstant("kAudioFileStreamProperty_PacketSizeUpperBound")
    public static final long PacketSizeUpperBound = 1886090594L;
    @GlobalConstant("kAudioFileStreamProperty_AverageBytesPerPacket")
    public static final long AverageBytesPerPacket = 1633841264L;
    @GlobalConstant("kAudioFileStreamProperty_BitRate")
    public static final long BitRate = 1651663220L;
    @GlobalConstant("kAudioFileStreamProperty_InfoDictionary")
    public static final long InfoDictionary = 1768842863L;
    

}
