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


/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox")
public class AudioConverter 
    extends Object 
     {

    
    
    protected AudioConverter() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterNew")
    protected static native AudioConverterError create(AudioStreamBasicDescription inSourceFormat, AudioStreamBasicDescription inDestinationFormat, Todo outAudioConverter);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterNewSpecific")
    protected static native AudioConverterError create(AudioStreamBasicDescription inSourceFormat, AudioStreamBasicDescription inDestinationFormat, int inNumberClassDescriptions, AudioClassDescription inClassDescriptions, Todo outAudioConverter);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterReset")
    public native AudioConverterError reset();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterGetPropertyInfo")
    protected native AudioConverterError getPropertyInfo(int inPropertyID, Todo outSize, Todo outWritable);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterGetProperty")
    protected native AudioConverterError getProperty(int inPropertyID, Todo ioPropertyDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterSetProperty")
    protected native AudioConverterError setProperty(int inPropertyID, int inPropertyDataSize, Todo inPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterConvertBuffer")
    protected native AudioConverterError convertBuffer(int inInputDataSize, Todo inInputData, Todo ioOutputDataSize, Todo outOutputData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioConverterFillComplexBuffer")
    protected native AudioConverterError fillComplexBuffer(FunctionPtr inInputDataProc, Todo inInputDataProcUserData, Todo ioOutputDataPacketSize, AudioBufferList outOutputData, AudioStreamPacketDescription outPacketDescription);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("AudioConverterConvertComplexBuffer")
    protected native AudioConverterError convertComplexBuffer(int inNumberPCMFrames, AudioBufferList inInputData, AudioBufferList outOutputData);
    
}
