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
@Mapping("AudioFileLoopDirection")
public final class AudioFileLoopDirection extends ObjCEnum {
    
    @GlobalConstant("kAudioFileLoopDirection_NoLooping")
    public static final long NoLooping = 0L;
    @GlobalConstant("kAudioFileLoopDirection_Forward")
    public static final long Forward = 1L;
    @GlobalConstant("kAudioFileLoopDirection_ForwardAndBackward")
    public static final long ForwardAndBackward = 2L;
    @GlobalConstant("kAudioFileLoopDirection_Backward")
    public static final long Backward = 3L;
    

}
