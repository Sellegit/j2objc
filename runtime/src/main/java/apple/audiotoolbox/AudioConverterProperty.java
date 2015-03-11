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
@Mapping("AudioConverterProperty")
public final class AudioConverterProperty extends ObjCEnum {
    
    @GlobalConstant("kAudioConverterPropertyMinimumInputBufferSize")
    public static final long PropertyMinimumInputBufferSize = 1835623027L;
    @GlobalConstant("kAudioConverterPropertyMinimumOutputBufferSize")
    public static final long PropertyMinimumOutputBufferSize = 1836016243L;
    @GlobalConstant("kAudioConverterPropertyMaximumInputBufferSize")
    public static final long PropertyMaximumInputBufferSize = 2020172403L;
    @GlobalConstant("kAudioConverterPropertyMaximumInputPacketSize")
    public static final long PropertyMaximumInputPacketSize = 2020175987L;
    @GlobalConstant("kAudioConverterPropertyMaximumOutputPacketSize")
    public static final long PropertyMaximumOutputPacketSize = 2020569203L;
    @GlobalConstant("kAudioConverterPropertyCalculateInputBufferSize")
    public static final long PropertyCalculateInputBufferSize = 1667850867L;
    @GlobalConstant("kAudioConverterPropertyCalculateOutputBufferSize")
    public static final long PropertyCalculateOutputBufferSize = 1668244083L;
    @GlobalConstant("kAudioConverterPropertyInputCodecParameters")
    public static final long PropertyInputCodecParameters = 1768121456L;
    @GlobalConstant("kAudioConverterPropertyOutputCodecParameters")
    public static final long PropertyOutputCodecParameters = 1868784752L;
    @GlobalConstant("kAudioConverterSampleRateConverterAlgorithm")
    public static final long SampleRateConverterAlgorithm = 1936876393L;
    @GlobalConstant("kAudioConverterSampleRateConverterComplexity")
    public static final long SampleRateConverterComplexity = 1936876385L;
    @GlobalConstant("kAudioConverterSampleRateConverterQuality")
    public static final long SampleRateConverterQuality = 1936876401L;
    @GlobalConstant("kAudioConverterSampleRateConverterInitialPhase")
    public static final long SampleRateConverterInitialPhase = 1936876400L;
    @GlobalConstant("kAudioConverterCodecQuality")
    public static final long CodecQuality = 1667527029L;
    @GlobalConstant("kAudioConverterPrimeMethod")
    public static final long PrimeMethod = 1886547309L;
    @GlobalConstant("kAudioConverterPrimeInfo")
    public static final long PrimeInfo = 1886546285L;
    @GlobalConstant("kAudioConverterChannelMap")
    public static final long ChannelMap = 1667788144L;
    @GlobalConstant("kAudioConverterDecompressionMagicCookie")
    public static final long DecompressionMagicCookie = 1684891491L;
    @GlobalConstant("kAudioConverterCompressionMagicCookie")
    public static final long CompressionMagicCookie = 1668114275L;
    @GlobalConstant("kAudioConverterEncodeBitRate")
    public static final long EncodeBitRate = 1651663220L;
    @GlobalConstant("kAudioConverterEncodeAdjustableSampleRate")
    public static final long EncodeAdjustableSampleRate = 1634366322L;
    @GlobalConstant("kAudioConverterInputChannelLayout")
    public static final long InputChannelLayout = 1768123424L;
    @GlobalConstant("kAudioConverterOutputChannelLayout")
    public static final long OutputChannelLayout = 1868786720L;
    @GlobalConstant("kAudioConverterApplicableEncodeBitRates")
    public static final long ApplicableEncodeBitRates = 1634034290L;
    @GlobalConstant("kAudioConverterAvailableEncodeBitRates")
    public static final long AvailableEncodeBitRates = 1986355826L;
    @GlobalConstant("kAudioConverterApplicableEncodeSampleRates")
    public static final long ApplicableEncodeSampleRates = 1634038642L;
    @GlobalConstant("kAudioConverterAvailableEncodeSampleRates")
    public static final long AvailableEncodeSampleRates = 1986360178L;
    @GlobalConstant("kAudioConverterAvailableEncodeChannelLayoutTags")
    public static final long AvailableEncodeChannelLayoutTags = 1634034540L;
    @GlobalConstant("kAudioConverterCurrentOutputStreamDescription")
    public static final long CurrentOutputStreamDescription = 1633906532L;
    @GlobalConstant("kAudioConverterCurrentInputStreamDescription")
    public static final long CurrentInputStreamDescription = 1633904996L;
    @GlobalConstant("kAudioConverterPropertySettings")
    public static final long PropertySettings = 1633906803L;
    @GlobalConstant("kAudioConverterPropertyBitDepthHint")
    public static final long PropertyBitDepthHint = 1633903204L;
    @GlobalConstant("kAudioConverterPropertyFormatList")
    public static final long PropertyFormatList = 1718383476L;
    

}
