package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("AVFoundation/AVFoundation.h")
@Mapping("AVAudioSessionRouteChangeReason")
public final class AVAudioSessionRouteChangeReason extends ObjCEnum {
    
    @GlobalConstant("AVAudioSessionRouteChangeReasonUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonNewDeviceAvailable")
    public static final long NewDeviceAvailable = 1L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonOldDeviceUnavailable")
    public static final long OldDeviceUnavailable = 2L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonCategoryChange")
    public static final long CategoryChange = 3L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonOverride")
    public static final long Override = 4L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonWakeFromSleep")
    public static final long WakeFromSleep = 6L;
    @GlobalConstant("AVAudioSessionRouteChangeReasonNoSuitableRouteForCategory")
    public static final long NoSuitableRouteForCategory = 7L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVAudioSessionRouteChangeReasonRouteConfigurationChange")
    public static final long RouteConfigurationChange = 8L;


}
