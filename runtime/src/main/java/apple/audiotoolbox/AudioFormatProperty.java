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
@Mapping("AudioFormatProperty")
public final class AudioFormatProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioFormatProperty_FormatInfo")
    public static final long FormatInfo = 1718449257L;
    @GlobalConstant("kAudioFormatProperty_FormatName")
    public static final long FormatName = 1718509933L;
    @GlobalConstant("kAudioFormatProperty_EncodeFormatIDs")
    public static final long EncodeFormatIDs = 1633906534L;
    @GlobalConstant("kAudioFormatProperty_DecodeFormatIDs")
    public static final long DecodeFormatIDs = 1633904998L;
    @GlobalConstant("kAudioFormatProperty_FormatList")
    public static final long FormatList = 1718383476L;
    @GlobalConstant("kAudioFormatProperty_ASBDFromESDS")
    public static final long ASBDFromESDS = 1702064996L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutFromESDS")
    public static final long ChannelLayoutFromESDS = 1702060908L;
    @GlobalConstant("kAudioFormatProperty_OutputFormatList")
    public static final long OutputFormatList = 1868983411L;
    @GlobalConstant("kAudioFormatProperty_FirstPlayableFormatFromList")
    public static final long FirstPlayableFormatFromList = 1718642284L;
    @GlobalConstant("kAudioFormatProperty_FormatIsVBR")
    public static final long FormatIsVBR = 1719034482L;
    @GlobalConstant("kAudioFormatProperty_FormatIsExternallyFramed")
    public static final long FormatIsExternallyFramed = 1717925990L;
    @GlobalConstant("kAudioFormatProperty_FormatIsEncrypted")
    public static final long FormatIsEncrypted = 1668446576L;
    @GlobalConstant("kAudioFormatProperty_Encoders")
    public static final long Encoders = 1635149166L;
    @GlobalConstant("kAudioFormatProperty_Decoders")
    public static final long Decoders = 1635148901L;
    @GlobalConstant("kAudioFormatProperty_AvailableEncodeBitRates")
    public static final long AvailableEncodeBitRates = 1634034290L;
    @GlobalConstant("kAudioFormatProperty_AvailableEncodeSampleRates")
    public static final long AvailableEncodeSampleRates = 1634038642L;
    @GlobalConstant("kAudioFormatProperty_AvailableEncodeChannelLayoutTags")
    public static final long AvailableEncodeChannelLayoutTags = 1634034540L;
    @GlobalConstant("kAudioFormatProperty_AvailableEncodeNumberChannels")
    public static final long AvailableEncodeNumberChannels = 1635151459L;
    @GlobalConstant("kAudioFormatProperty_ASBDFromMPEGPacket")
    public static final long ASBDFromMPEGPacket = 1633971568L;
    @GlobalConstant("kAudioFormatProperty_BitmapForLayoutTag")
    public static final long BitmapForLayoutTag = 1651340391L;
    @GlobalConstant("kAudioFormatProperty_MatrixMixMap")
    public static final long MatrixMixMap = 1835884912L;
    @GlobalConstant("kAudioFormatProperty_ChannelMap")
    public static final long ChannelMap = 1667788144L;
    @GlobalConstant("kAudioFormatProperty_NumberOfChannelsForLayout")
    public static final long NumberOfChannelsForLayout = 1852008557L;
    @GlobalConstant("kAudioFormatProperty_AreChannelLayoutsEquivalent")
    public static final long AreChannelLayoutsEquivalent = 1667786097L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutHash")
    public static final long ChannelLayoutHash = 1667786849L;
    @GlobalConstant("kAudioFormatProperty_ValidateChannelLayout")
    public static final long ValidateChannelLayout = 1986093932L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutForTag")
    public static final long ChannelLayoutForTag = 1668116588L;
    @GlobalConstant("kAudioFormatProperty_TagForChannelLayout")
    public static final long TagForChannelLayout = 1668116596L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutName")
    public static final long ChannelLayoutName = 1819242093L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutSimpleName")
    public static final long ChannelLayoutSimpleName = 1819504237L;
    @GlobalConstant("kAudioFormatProperty_ChannelLayoutForBitmap")
    public static final long ChannelLayoutForBitmap = 1668116578L;
    @GlobalConstant("kAudioFormatProperty_ChannelName")
    public static final long ChannelName = 1668178285L;
    @GlobalConstant("kAudioFormatProperty_ChannelShortName")
    public static final long ChannelShortName = 1668509293L;
    @GlobalConstant("kAudioFormatProperty_TagsForNumberOfChannels")
    public static final long TagsForNumberOfChannels = 1952540515L;
    @GlobalConstant("kAudioFormatProperty_PanningMatrix")
    public static final long PanningMatrix = 1885433453L;
    @GlobalConstant("kAudioFormatProperty_BalanceFade")
    public static final long BalanceFade = 1650551910L;
    @GlobalConstant("kAudioFormatProperty_ID3TagSize")
    public static final long ID3TagSize = 1768174451L;
    @GlobalConstant("kAudioFormatProperty_ID3TagToDictionary")
    public static final long ID3TagToDictionary = 1768174436L;
    

}
