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





@Library("AudioToolbox")
@Mapping("AudioQueueProcessingTapFlag")
public final class AudioQueueProcessingTapFlag extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueProcessingTap_PreEffects")
    public static final long PreEffects = 1L;
    @GlobalConstant("kAudioQueueProcessingTap_PostEffects")
    public static final long PostEffects = 2L;
    @GlobalConstant("kAudioQueueProcessingTap_Siphon")
    public static final long Siphon = 4L;
    @GlobalConstant("kAudioQueueProcessingTap_StartOfStream")
    public static final long StartOfStream = 256L;
    @GlobalConstant("kAudioQueueProcessingTap_EndOfStream")
    public static final long EndOfStream = 512L;
    

}
