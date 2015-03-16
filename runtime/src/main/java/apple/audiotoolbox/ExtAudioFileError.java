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
@Mapping("ExtAudioFileError")
public final class ExtAudioFileError extends ObjCEnum {
    
    @GlobalConstant("kExtAudioFileError_CodecUnavailableInputConsumed")
    public static final long CodecUnavailableInputConsumed = -66559L;
    @GlobalConstant("kExtAudioFileError_CodecUnavailableInputNotConsumed")
    public static final long CodecUnavailableInputNotConsumed = -66560L;
    @GlobalConstant("kExtAudioFileError_InvalidProperty")
    public static final long InvalidProperty = -66561L;
    @GlobalConstant("kExtAudioFileError_InvalidPropertySize")
    public static final long InvalidPropertySize = -66562L;
    @GlobalConstant("kExtAudioFileError_NonPCMClientFormat")
    public static final long NonPCMClientFormat = -66563L;
    @GlobalConstant("kExtAudioFileError_InvalidChannelMap")
    public static final long InvalidChannelMap = -66564L;
    @GlobalConstant("kExtAudioFileError_InvalidOperationOrder")
    public static final long InvalidOperationOrder = -66565L;
    @GlobalConstant("kExtAudioFileError_InvalidDataFormat")
    public static final long InvalidDataFormat = -66566L;
    @GlobalConstant("kExtAudioFileError_MaxPacketSizeUnknown")
    public static final long MaxPacketSizeUnknown = -66567L;
    @GlobalConstant("kExtAudioFileError_InvalidSeek")
    public static final long InvalidSeek = -66568L;
    @GlobalConstant("kExtAudioFileError_AsyncWriteTooLarge")
    public static final long AsyncWriteTooLarge = -66569L;
    @GlobalConstant("kExtAudioFileError_AsyncWriteBufferOverflow")
    public static final long AsyncWriteBufferOverflow = -66570L;
    

}
