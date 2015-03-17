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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioPlayerNode")
public class AVAudioPlayerNode 
    extends AVAudioNode 
    implements AVAudioMixing {

    
    
    public AVAudioPlayerNode() {}
    
    
    @Mapping("isPlaying")
    public native boolean isPlaying();
    @Mapping("volume")
    public native float getVolume();
    @Mapping("setVolume:")
    public native void setVolume(float v);
    @Mapping("pan")
    public native float getPan();
    @Mapping("setPan:")
    public native void setPan(float v);
    @Mapping("renderingAlgorithm")
    public native @Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long getRenderingAlgorithm();
    @Mapping("setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(@Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long v);
    @Mapping("rate")
    public native float getRate();
    @Mapping("setRate:")
    public native void setRate(float v);
    @Mapping("reverbBlend")
    public native float getReverbBlend();
    @Mapping("setReverbBlend:")
    public native void setReverbBlend(float v);
    @Mapping("obstruction")
    public native float getObstruction();
    @Mapping("setObstruction:")
    public native void setObstruction(float v);
    @Mapping("occlusion")
    public native float getOcclusion();
    @Mapping("setOcclusion:")
    public native void setOcclusion(float v);
    @Mapping("position")
    public native AVAudio3DPoint getPosition();
    @Mapping("setPosition:")
    public native void setPosition(AVAudio3DPoint v);
    
    
    
    @Mapping("scheduleFile:atTime:completionHandler:")
    public native void scheduleFile(AVAudioFile file, AVAudioTime when, @Block Runnable completionHandler);
    @Mapping("scheduleSegment:startingFrame:frameCount:atTime:completionHandler:")
    public native void scheduleSegment(AVAudioFile file, long startFrame, int numberFrames, AVAudioTime when, @Block Runnable completionHandler);
    @Mapping("stop")
    public native void stop();
    @Mapping("prepareWithFrameCount:")
    public native void prepare(int frameCount);
    @Mapping("play")
    public native void play();
    @Mapping("playAtTime:")
    public native void playAtTime(AVAudioTime when);
    @Mapping("pause")
    public native void pause();
    @Mapping("nodeTimeForPlayerTime:")
    public native AVAudioTime convertPlayerTimeToNodeTime(AVAudioTime playerTime);
    @Mapping("playerTimeForNodeTime:")
    public native AVAudioTime convertNodeTimeToPlayerTime(AVAudioTime nodeTime);
    
}
