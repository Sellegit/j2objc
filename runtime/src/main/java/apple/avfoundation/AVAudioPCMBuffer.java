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

@Library("AVFoundation") @Mapping("AVAudioPCMBuffer")
public class AVAudioPCMBuffer 
    extends AVAudioBuffer 
     {

    
    
    public AVAudioPCMBuffer() {}
    @Mapping("initWithPCMFormat:frameCapacity:")
    public AVAudioPCMBuffer(AVAudioFormat format, int frameCapacity) { }
    
    
    @Mapping("frameCapacity")
    public native int getFrameCapacity();
    @Mapping("frameLength")
    public native int getFrameLength();
    public native void setFrameLength(int v);
    @Mapping("stride")
    public native @MachineSizedUInt long getStride();
    @Mapping("floatChannelData")
    public native Todo getFloatChannelData();
    @Mapping("int16ChannelData")
    public native Todo getInt16ChannelData();
    @Mapping("int32ChannelData")
    public native Todo getInt32ChannelData();
    
    
    
    
    
}
