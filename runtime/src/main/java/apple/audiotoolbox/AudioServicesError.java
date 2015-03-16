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
@Mapping("AudioServicesError")
public final class AudioServicesError extends ObjCEnum {
    
    @GlobalConstant("kAudioServicesNoError")
    public static final long No = 0L;
    @GlobalConstant("kAudioServicesUnsupportedPropertyError")
    public static final long UnsupportedProperty = 1886681407L;
    @GlobalConstant("kAudioServicesBadPropertySizeError")
    public static final long BadPropertySize = 561211770L;
    @GlobalConstant("kAudioServicesBadSpecifierSizeError")
    public static final long BadSpecifierSize = 561213539L;
    @GlobalConstant("kAudioServicesSystemSoundUnspecifiedError")
    public static final long SystemSoundUnspecified = -1500L;
    @GlobalConstant("kAudioServicesSystemSoundClientTimedOutError")
    public static final long SystemSoundClientTimedOut = -1501L;
    

}
