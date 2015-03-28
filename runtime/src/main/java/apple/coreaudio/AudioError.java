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
@Mapping("AudioError")
public final class AudioError extends ObjCEnum {
    
    @GlobalConstant("kAudio_UnimplementedError")
    public static final long Unimplemented = -4L;
    @GlobalConstant("kAudio_FileNotFoundError")
    public static final long FileNotFound = -43L;
    @GlobalConstant("kAudio_FilePermissionError")
    public static final long FilePermission = -54L;
    @GlobalConstant("kAudio_TooManyFilesOpenError")
    public static final long TooManyFilesOpen = -42L;
    @GlobalConstant("kAudio_BadFilePathError")
    public static final long BadFilePath = 561017960L;
    @GlobalConstant("kAudio_ParamError")
    public static final long Param = -50L;
    @GlobalConstant("kAudio_MemFullError")
    public static final long MemFull = -108L;


}
