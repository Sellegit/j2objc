package apple.mediaplayer;


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
import apple.uikit.*;





@Library("MediaPlayer") @Mapping("MPMediaPlayback")
public interface MPMediaPlayback 
     {

    
    
    @Mapping("isPreparedToPlay")
    boolean isPreparedToPlay();
    @Mapping("currentPlaybackTime")
    double getCurrentPlaybackTime();
    @Mapping("setCurrentPlaybackTime:")
    void setCurrentPlaybackTime(double v);
    @Mapping("currentPlaybackRate")
    float getCurrentPlaybackRate();
    @Mapping("setCurrentPlaybackRate:")
    void setCurrentPlaybackRate(float v);
    
    
    @Mapping("prepareToPlay")
    void prepareToPlay();
    @Mapping("play")
    void play();
    @Mapping("pause")
    void pause();
    @Mapping("stop")
    void stop();
    @Mapping("beginSeekingForward")
    void beginSeekingForward();
    @Mapping("beginSeekingBackward")
    void beginSeekingBackward();
    @Mapping("endSeeking")
    void endSeeking();
    
    /*<adapter>*/
    /*</adapter>*/
}
