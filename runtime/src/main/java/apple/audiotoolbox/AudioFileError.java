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
@Mapping("AudioFileError")
public final class AudioFileError extends ObjCEnum {
    
    @GlobalConstant("kAudioFileUnspecifiedError")
    public static final long Unspecified = 2003334207L;
    @GlobalConstant("kAudioFileUnsupportedFileTypeError")
    public static final long UnsupportedFileType = 1954115647L;
    @GlobalConstant("kAudioFileUnsupportedDataFormatError")
    public static final long UnsupportedDataFormat = 1718449215L;
    @GlobalConstant("kAudioFileUnsupportedPropertyError")
    public static final long UnsupportedProperty = 1886681407L;
    @GlobalConstant("kAudioFileBadPropertySizeError")
    public static final long BadPropertySize = 561211770L;
    @GlobalConstant("kAudioFilePermissionsError")
    public static final long Permissions = 1886547263L;
    @GlobalConstant("kAudioFileNotOptimizedError")
    public static final long NotOptimized = 1869640813L;
    @GlobalConstant("kAudioFileInvalidChunkError")
    public static final long InvalidChunk = 1667787583L;
    @GlobalConstant("kAudioFileDoesNotAllow64BitDataSizeError")
    public static final long DoesNotAllow64BitDataSize = 1868981823L;
    @GlobalConstant("kAudioFileInvalidPacketOffsetError")
    public static final long InvalidPacketOffset = 1885563711L;
    @GlobalConstant("kAudioFileInvalidFileError")
    public static final long InvalidFile = 1685348671L;
    @GlobalConstant("kAudioFileOperationNotSupportedError")
    public static final long OperationNotSupported = 1869627199L;
    @GlobalConstant("kAudioFileNotOpenError")
    public static final long NotOpen = -38L;
    @GlobalConstant("kAudioFileEndOfFileError")
    public static final long EndOfFile = -39L;
    @GlobalConstant("kAudioFilePositionError")
    public static final long Position = -40L;
    @GlobalConstant("kAudioFileFileNotFoundError")
    public static final long FileNotFound = -43L;


}
