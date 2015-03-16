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
@Mapping("AudioFileStreamError")
public final class AudioFileStreamError extends ObjCEnum {
    
    @GlobalConstant("kAudioFileStreamError_UnsupportedFileType")
    public static final long UnsupportedFileType = 1954115647L;
    @GlobalConstant("kAudioFileStreamError_UnsupportedDataFormat")
    public static final long UnsupportedDataFormat = 1718449215L;
    @GlobalConstant("kAudioFileStreamError_UnsupportedProperty")
    public static final long UnsupportedProperty = 1886681407L;
    @GlobalConstant("kAudioFileStreamError_BadPropertySize")
    public static final long BadPropertySize = 561211770L;
    @GlobalConstant("kAudioFileStreamError_NotOptimized")
    public static final long NotOptimized = 1869640813L;
    @GlobalConstant("kAudioFileStreamError_InvalidPacketOffset")
    public static final long InvalidPacketOffset = 1885563711L;
    @GlobalConstant("kAudioFileStreamError_InvalidFile")
    public static final long InvalidFile = 1685348671L;
    @GlobalConstant("kAudioFileStreamError_ValueUnknown")
    public static final long ValueUnknown = 1970170687L;
    @GlobalConstant("kAudioFileStreamError_DataUnavailable")
    public static final long DataUnavailable = 1836020325L;
    @GlobalConstant("kAudioFileStreamError_IllegalOperation")
    public static final long IllegalOperation = 1852797029L;
    @GlobalConstant("kAudioFileStreamError_UnspecifiedError")
    public static final long UnspecifiedError = 2003334207L;
    @GlobalConstant("kAudioFileStreamError_DiscontinuityCantRecover")
    public static final long DiscontinuityCantRecover = 1685283617L;
    

}
