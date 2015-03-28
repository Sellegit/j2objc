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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class MPMediaPlaybackAdapter 
    extends Object 
    implements MPMediaPlayback {

    
    
    
    @NotImplemented("isPreparedToPlay")
    public boolean isPreparedToPlay() { throw new UnsupportedOperationException(); }
    @NotImplemented("currentPlaybackTime")
    public double getCurrentPlaybackTime() { throw new UnsupportedOperationException(); }
    @Mapping("setCurrentPlaybackTime:")
    public void setCurrentPlaybackTime(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("currentPlaybackRate")
    public float getCurrentPlaybackRate() { throw new UnsupportedOperationException(); }
    @Mapping("setCurrentPlaybackRate:")
    public void setCurrentPlaybackRate(float v) { throw new UnsupportedOperationException(); }

    
    
    @NotImplemented("prepareToPlay")
    public void prepareToPlay() { throw new UnsupportedOperationException(); }
    @NotImplemented("play")
    public void play() { throw new UnsupportedOperationException(); }
    @NotImplemented("pause")
    public void pause() { throw new UnsupportedOperationException(); }
    @NotImplemented("stop")
    public void stop() { throw new UnsupportedOperationException(); }
    @NotImplemented("beginSeekingForward")
    public void beginSeekingForward() { throw new UnsupportedOperationException(); }
    @NotImplemented("beginSeekingBackward")
    public void beginSeekingBackward() { throw new UnsupportedOperationException(); }
    @NotImplemented("endSeeking")
    public void endSeeking() { throw new UnsupportedOperationException(); }

}
