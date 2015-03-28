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
@Mapping("AudioSessionInterruptionState")
public final class AudioSessionInterruptionState extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionBeginInterruption")
    public static final long BeginInterruption = 1L;
    @GlobalConstant("kAudioSessionEndInterruption")
    public static final long EndInterruption = 0L;


}
