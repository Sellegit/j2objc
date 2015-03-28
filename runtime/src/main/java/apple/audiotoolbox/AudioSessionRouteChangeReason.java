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
@Mapping("AudioSessionRouteChangeReason")
public final class AudioSessionRouteChangeReason extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionRouteChangeReason_Unknown")
    public static final long Unknown = 0L;
    @GlobalConstant("kAudioSessionRouteChangeReason_NewDeviceAvailable")
    public static final long NewDeviceAvailable = 1L;
    @GlobalConstant("kAudioSessionRouteChangeReason_OldDeviceUnavailable")
    public static final long OldDeviceUnavailable = 2L;
    @GlobalConstant("kAudioSessionRouteChangeReason_CategoryChange")
    public static final long CategoryChange = 3L;
    @GlobalConstant("kAudioSessionRouteChangeReason_Override")
    public static final long Override = 4L;
    @GlobalConstant("kAudioSessionRouteChangeReason_WakeFromSleep")
    public static final long WakeFromSleep = 6L;
    @GlobalConstant("kAudioSessionRouteChangeReason_NoSuitableRouteForCategory")
    public static final long NoSuitableRouteForCategory = 7L;
    @GlobalConstant("kAudioSessionRouteChangeReason_RouteConfigurationChange")
    public static final long RouteConfigurationChange = 8L;


}
