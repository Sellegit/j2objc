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
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation") @Mapping("AVAudioNode")
public class AVAudioNode 
    extends NSObject 
     {

    
    
    public AVAudioNode() {}
    
    
    @Mapping("engine")
    public native AVAudioEngine getEngine();
    @Mapping("numberOfInputs")
    public native @MachineSizedUInt long getNumberOfInputs();
    @Mapping("numberOfOutputs")
    public native @MachineSizedUInt long getNumberOfOutputs();
    @Mapping("lastRenderTime")
    public native AVAudioTime getLastRenderTime();
    
    
    
    @Mapping("reset")
    public native void reset();
    @Mapping("inputFormatForBus:")
    public native AVAudioFormat getInputFormatForBus(@MachineSizedUInt long bus);
    @Mapping("outputFormatForBus:")
    public native AVAudioFormat getOutputFormatForBus(@MachineSizedUInt long bus);
    @Mapping("nameForInputBus:")
    public native String getNameForInputBus(@MachineSizedUInt long bus);
    @Mapping("nameForOutputBus:")
    public native String getNameForOutputBus(@MachineSizedUInt long bus);
    @Mapping("installTapOnBus:bufferSize:format:block:")
    public native void installTapOnBus(@MachineSizedUInt long bus, int bufferSize, AVAudioFormat format, @Block VoidBlock2<AVAudioPCMBuffer, AVAudioTime> tapBlock);
    @Mapping("removeTapOnBus:")
    public native void removeTapOnBus(@MachineSizedUInt long bus);
    
}
