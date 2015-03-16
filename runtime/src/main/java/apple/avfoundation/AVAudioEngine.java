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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioEngine")
public class AVAudioEngine 
    extends NSObject 
     {

    
    
    public AVAudioEngine() {}
    
    
    @Mapping("musicSequence")
    public native MusicSequence getMusicSequence();
    @Mapping("setMusicSequence:")
    public native void setMusicSequence(MusicSequence v);
    @Mapping("outputNode")
    public native AVAudioOutputNode getOutputNode();
    @Mapping("inputNode")
    public native AVAudioInputNode getInputNode();
    @Mapping("mainMixerNode")
    public native AVAudioMixerNode getMainMixerNode();
    @Mapping("isRunning")
    public native boolean isRunning();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVAudioEngineConfigurationChangeNotification")
    public static native NSString ConfigurationChangeNotification();
    
    @Mapping("attachNode:")
    public native void attachNode(AVAudioNode node);
    @Mapping("detachNode:")
    public native void detachNode(AVAudioNode node);
    @Mapping("connect:to:fromBus:toBus:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, @MachineSizedUInt long bus1, @MachineSizedUInt long bus2, AVAudioFormat format);
    @Mapping("connect:to:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, AVAudioFormat format);
    @Mapping("disconnectNodeInput:bus:")
    public native void disconnectNodeInput(AVAudioNode node, @MachineSizedUInt long bus);
    @Mapping("disconnectNodeInput:")
    public native void disconnectNodeInput(AVAudioNode node);
    @Mapping("disconnectNodeOutput:bus:")
    public native void disconnectNodeOutput(AVAudioNode node, @MachineSizedUInt long bus);
    @Mapping("disconnectNodeOutput:")
    public native void disconnectNodeOutput(AVAudioNode node);
    @Mapping("prepare")
    public native void prepare();
    @Mapping("startAndReturnError:")
    public native boolean start(Todo outError);
    @Mapping("pause")
    public native void pause();
    @Mapping("reset")
    public native void reset();
    @Mapping("stop")
    public native void stop();
    
}
