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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class AVAudio3DMixingAdapter 
    extends Object 
    implements AVAudio3DMixing {

    
    
    
    @NotImplemented("renderingAlgorithm")
    public @Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long getRenderingAlgorithm() { throw new UnsupportedOperationException(); }
    @Mapping("setRenderingAlgorithm:")
    public void setRenderingAlgorithm(@Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long v) { throw new UnsupportedOperationException(); }
    @NotImplemented("rate")
    public float getRate() { throw new UnsupportedOperationException(); }
    @Mapping("setRate:")
    public void setRate(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("reverbBlend")
    public float getReverbBlend() { throw new UnsupportedOperationException(); }
    @Mapping("setReverbBlend:")
    public void setReverbBlend(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("obstruction")
    public float getObstruction() { throw new UnsupportedOperationException(); }
    @Mapping("setObstruction:")
    public void setObstruction(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("occlusion")
    public float getOcclusion() { throw new UnsupportedOperationException(); }
    @Mapping("setOcclusion:")
    public void setOcclusion(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("position")
    public AVAudio3DPoint getPosition() { throw new UnsupportedOperationException(); }
    @Mapping("setPosition:")
    public void setPosition(AVAudio3DPoint v) { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
