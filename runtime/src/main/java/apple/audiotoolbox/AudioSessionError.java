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
@Mapping("AudioSessionError")
public final class AudioSessionError extends ObjCEnum {
    
    @GlobalConstant("kAudioSessionNoError")
    public static final long ssionNo = 0L;
    @GlobalConstant("kAudioSessionNotInitialized")
    public static final long ssionNotInitialized = 560557673L;
    @GlobalConstant("kAudioSessionAlreadyInitialized")
    public static final long ssionAlreadyInitialized = 1768843636L;
    @GlobalConstant("kAudioSessionInitializationError")
    public static final long ssionInitialization = 1768843583L;
    @GlobalConstant("kAudioSessionUnsupportedPropertyError")
    public static final long ssionUnsupportedProperty = 1886681407L;
    @GlobalConstant("kAudioSessionBadPropertySizeError")
    public static final long ssionBadPropertySize = 561211770L;
    @GlobalConstant("kAudioSessionNotActiveError")
    public static final long ssionNotActive = 560030580L;
    @GlobalConstant("kAudioServicesNoHardwareError")
    public static final long rvicesNoHardware = 1852794999L;
    @GlobalConstant("kAudioSessionNoCategorySet")
    public static final long ssionNoCategorySet = 1063477620L;
    @GlobalConstant("kAudioSessionIncompatibleCategory")
    public static final long ssionIncompatibleCategory = 560161140L;
    @GlobalConstant("kAudioSessionUnspecifiedError")
    public static final long ssionUnspecified = 2003329396L;


}
