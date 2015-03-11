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





@Library("AVFoundation") @Mapping("AVAudio3DMixing")
public interface AVAudio3DMixing 
    extends NSObjectProtocol {

    
    
    @Mapping("renderingAlgorithm")
    @Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long getRenderingAlgorithm();
    @Mapping("setRenderingAlgorithm:")
    void setRenderingAlgorithm(@Representing("AVAudio3DMixingRenderingAlgorithm") @MachineSizedSInt long v);
    @Mapping("rate")
    float getRate();
    @Mapping("setRate:")
    void setRate(float v);
    @Mapping("reverbBlend")
    float getReverbBlend();
    @Mapping("setReverbBlend:")
    void setReverbBlend(float v);
    @Mapping("obstruction")
    float getObstruction();
    @Mapping("setObstruction:")
    void setObstruction(float v);
    @Mapping("occlusion")
    float getOcclusion();
    @Mapping("setOcclusion:")
    void setOcclusion(float v);
    @Mapping("position")
    AVAudio3DPoint getPosition();
    @Mapping("setPosition:")
    void setPosition(AVAudio3DPoint v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
