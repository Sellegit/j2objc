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
@Mapping("AudioQueueHardwareCodecPolicy")
public final class AudioQueueHardwareCodecPolicy extends ObjCEnum {
    
    @GlobalConstant("kAudioQueueHardwareCodecPolicy_Default")
    public static final long Default = 0L;
    @GlobalConstant("kAudioQueueHardwareCodecPolicy_UseSoftwareOnly")
    public static final long UseSoftwareOnly = 1L;
    @GlobalConstant("kAudioQueueHardwareCodecPolicy_UseHardwareOnly")
    public static final long UseHardwareOnly = 2L;
    @GlobalConstant("kAudioQueueHardwareCodecPolicy_PreferSoftware")
    public static final long PreferSoftware = 3L;
    @GlobalConstant("kAudioQueueHardwareCodecPolicy_PreferHardware")
    public static final long PreferHardware = 4L;
    

}
