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
@Mapping("AudioFormatError")
public final class AudioFormatError extends ObjCEnum {
    
    @GlobalConstant("kAudioFormatUnspecifiedError")
    public static final long Unspecified = 2003329396L;
    @GlobalConstant("kAudioFormatUnsupportedPropertyError")
    public static final long UnsupportedProperty = 1886547824L;
    @GlobalConstant("kAudioFormatBadPropertySizeError")
    public static final long BadPropertySize = 561211770L;
    @GlobalConstant("kAudioFormatBadSpecifierSizeError")
    public static final long BadSpecifierSize = 561213539L;
    @GlobalConstant("kAudioFormatUnsupportedDataFormatError")
    public static final long UnsupportedDataFormat = 1718449215L;
    @GlobalConstant("kAudioFormatUnknownFormatError")
    public static final long UnknownFormat = 560360820L;
    

}
