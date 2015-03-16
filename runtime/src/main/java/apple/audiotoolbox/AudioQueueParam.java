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
@Mapping("AudioQueueParam")
public final class AudioQueueParam extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueParam_Volume")
    public static final long Volume = 1L;
    @GlobalConstant("kAudioQueueParam_PlayRate")
    public static final long PlayRate = 2L;
    @GlobalConstant("kAudioQueueParam_Pitch")
    public static final long Pitch = 3L;
    @GlobalConstant("kAudioQueueParam_VolumeRampTime")
    public static final long VolumeRampTime = 4L;
    @GlobalConstant("kAudioQueueParam_Pan")
    public static final long Pan = 13L;
    

}
