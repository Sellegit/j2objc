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
@Mapping("AudioFileRegionFlag")
public final class AudioFileRegionFlag extends ObjCEnum {
    
    @GlobalConstant("kAudioFileRegionFlag_LoopEnable")
    public static final long LoopEnable = 1L;
    @GlobalConstant("kAudioFileRegionFlag_PlayForward")
    public static final long PlayForward = 2L;
    @GlobalConstant("kAudioFileRegionFlag_PlayBackward")
    public static final long PlayBackward = 4L;


}
