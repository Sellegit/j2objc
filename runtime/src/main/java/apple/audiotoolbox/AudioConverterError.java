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
@Mapping("AudioConverterError")
public final class AudioConverterError extends ObjCEnum {
    
    @GlobalConstant("kAudioConverterErr_FormatNotSupported")
    public static final long FormatNotSupported = 1718449215L;
    @GlobalConstant("kAudioConverterErr_OperationNotSupported")
    public static final long OperationNotSupported = 1869627199L;
    @GlobalConstant("kAudioConverterErr_PropertyNotSupported")
    public static final long PropertyNotSupported = 1886547824L;
    @GlobalConstant("kAudioConverterErr_InvalidInputSize")
    public static final long InvalidInputSize = 1768846202L;
    @GlobalConstant("kAudioConverterErr_InvalidOutputSize")
    public static final long InvalidOutputSize = 1869902714L;
    @GlobalConstant("kAudioConverterErr_UnspecifiedError")
    public static final long UnspecifiedError = 2003329396L;
    @GlobalConstant("kAudioConverterErr_BadPropertySizeError")
    public static final long BadPropertySizeError = 561211770L;
    @GlobalConstant("kAudioConverterErr_RequiresPacketDescriptionsError")
    public static final long RequiresPacketDescriptionsError = 561015652L;
    @GlobalConstant("kAudioConverterErr_InputSampleRateOutOfRange")
    public static final long InputSampleRateOutOfRange = 560558962L;
    @GlobalConstant("kAudioConverterErr_OutputSampleRateOutOfRange")
    public static final long OutputSampleRateOutOfRange = 560952178L;
    

}
