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
@Mapping("AudioSessionMode")
public final class AudioSessionMode extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionMode_Default")
    public static final long Default = 1684434036L;
    @GlobalConstant("kAudioSessionMode_VoiceChat")
    public static final long VoiceChat = 1986225012L;
    @GlobalConstant("kAudioSessionMode_VideoRecording")
    public static final long VideoRecording = 1987208036L;
    @GlobalConstant("kAudioSessionMode_Measurement")
    public static final long Measurement = 1836281204L;
    @GlobalConstant("kAudioSessionMode_GameChat")
    public static final long GameChat = 1735222132L;


}
