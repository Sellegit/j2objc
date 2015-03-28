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
@Mapping("ExtAudioFileProperty")
public final class ExtAudioFileProperty extends ObjCEnum {
    
    @GlobalConstant("kExtAudioFileProperty_FileDataFormat")
    public static final long FileDataFormat = 1717988724L;
    @GlobalConstant("kExtAudioFileProperty_FileChannelLayout")
    public static final long FileChannelLayout = 1717791855L;
    @GlobalConstant("kExtAudioFileProperty_ClientDataFormat")
    public static final long ClientDataFormat = 1667657076L;
    @GlobalConstant("kExtAudioFileProperty_ClientChannelLayout")
    public static final long ClientChannelLayout = 1667460207L;
    @GlobalConstant("kExtAudioFileProperty_CodecManufacturer")
    public static final long CodecManufacturer = 1668112750L;
    @GlobalConstant("kExtAudioFileProperty_AudioConverter")
    public static final long AudioConverter = 1633906294L;
    @GlobalConstant("kExtAudioFileProperty_AudioFile")
    public static final long AudioFile = 1634101612L;
    @GlobalConstant("kExtAudioFileProperty_FileMaxPacketSize")
    public static final long FileMaxPacketSize = 1718448243L;
    @GlobalConstant("kExtAudioFileProperty_ClientMaxPacketSize")
    public static final long ClientMaxPacketSize = 1668116595L;
    @GlobalConstant("kExtAudioFileProperty_FileLengthFrames")
    public static final long FileLengthFrames = 593916525L;
    @GlobalConstant("kExtAudioFileProperty_ConverterConfig")
    public static final long ConverterConfig = 1633903462L;
    @GlobalConstant("kExtAudioFileProperty_IOBufferSizeBytes")
    public static final long IOBufferSizeBytes = 1768907379L;
    @GlobalConstant("kExtAudioFileProperty_IOBuffer")
    public static final long IOBuffer = 1768907366L;
    @GlobalConstant("kExtAudioFileProperty_PacketTable")
    public static final long PacketTable = 2020635753L;


}
