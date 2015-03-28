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
@Mapping("AudioSessionOverrideAudioRoute")
public final class AudioSessionOverrideAudioRoute extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionOverrideAudioRoute_None")
    public static final long None = 0L;
    @GlobalConstant("kAudioSessionOverrideAudioRoute_Speaker")
    public static final long Speaker = 1936747378L;


}
