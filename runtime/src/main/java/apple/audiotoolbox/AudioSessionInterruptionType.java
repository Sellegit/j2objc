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
@Mapping("AudioSessionInterruptionType")
public final class AudioSessionInterruptionType extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionInterruptionType_ShouldResume")
    public static final long Resume = 1769108333L;
    @GlobalConstant("kAudioSessionInterruptionType_ShouldNotResume")
    public static final long NotResume = 561148781L;


}
