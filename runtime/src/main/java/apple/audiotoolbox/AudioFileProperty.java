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
@Mapping("AudioFileProperty")
public final class AudioFileProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioFilePropertyFileFormat")
    public static final long FileFormat = 1717988724L;
    @GlobalConstant("kAudioFilePropertyDataFormat")
    public static final long DataFormat = 1684434292L;
    @GlobalConstant("kAudioFilePropertyIsOptimized")
    public static final long IsOptimized = 1869640813L;
    @GlobalConstant("kAudioFilePropertyMagicCookieData")
    public static final long MagicCookieData = 1835493731L;
    @GlobalConstant("kAudioFilePropertyAudioDataByteCount")
    public static final long AudioDataByteCount = 1650683508L;
    @GlobalConstant("kAudioFilePropertyAudioDataPacketCount")
    public static final long AudioDataPacketCount = 1885564532L;
    @GlobalConstant("kAudioFilePropertyMaximumPacketSize")
    public static final long MaximumPacketSize = 1886616165L;
    @GlobalConstant("kAudioFilePropertyDataOffset")
    public static final long DataOffset = 1685022310L;
    @GlobalConstant("kAudioFilePropertyChannelLayout")
    public static final long ChannelLayout = 1668112752L;
    @GlobalConstant("kAudioFilePropertyDeferSizeUpdates")
    public static final long DeferSizeUpdates = 1685289589L;
    @GlobalConstant("kAudioFilePropertyDataFormatName")
    public static final long DataFormatName = 1718512997L;
    @GlobalConstant("kAudioFilePropertyMarkerList")
    public static final long MarkerList = 1835756659L;
    @GlobalConstant("kAudioFilePropertyRegionList")
    public static final long RegionList = 1919380595L;
    @GlobalConstant("kAudioFilePropertyPacketToFrame")
    public static final long PacketToFrame = 1886086770L;
    @GlobalConstant("kAudioFilePropertyFrameToPacket")
    public static final long FrameToPacket = 1718775915L;
    @GlobalConstant("kAudioFilePropertyPacketToByte")
    public static final long PacketToByte = 1886085753L;
    @GlobalConstant("kAudioFilePropertyByteToPacket")
    public static final long ByteToPacket = 1652125803L;
    @GlobalConstant("kAudioFilePropertyChunkIDs")
    public static final long ChunkIDs = 1667787108L;
    @GlobalConstant("kAudioFilePropertyInfoDictionary")
    public static final long InfoDictionary = 1768842863L;
    @GlobalConstant("kAudioFilePropertyPacketTableInfo")
    public static final long PacketTableInfo = 1886283375L;
    @GlobalConstant("kAudioFilePropertyFormatList")
    public static final long FormatList = 1718383476L;
    @GlobalConstant("kAudioFilePropertyPacketSizeUpperBound")
    public static final long PacketSizeUpperBound = 1886090594L;
    @GlobalConstant("kAudioFilePropertyReserveDuration")
    public static final long ReserveDuration = 1920168566L;
    @GlobalConstant("kAudioFilePropertyEstimatedDuration")
    public static final long EstimatedDuration = 1701082482L;
    @GlobalConstant("kAudioFilePropertyBitRate")
    public static final long BitRate = 1651663220L;
    @GlobalConstant("kAudioFilePropertyID3Tag")
    public static final long ID3Tag = 1768174452L;
    @GlobalConstant("kAudioFilePropertySourceBitDepth")
    public static final long SourceBitDepth = 1935832164L;
    @GlobalConstant("kAudioFilePropertyAlbumArtwork")
    public static final long AlbumArtwork = 1633776244L;
    @GlobalConstant("kAudioFilePropertyAudioTrackCount")
    public static final long AudioTrackCount = 1635017588L;
    @GlobalConstant("kAudioFilePropertyUseAudioTrack")
    public static final long UseAudioTrack = 1969321067L;
    

}
