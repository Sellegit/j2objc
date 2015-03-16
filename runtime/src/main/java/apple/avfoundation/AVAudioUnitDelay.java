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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioUnitDelay")
public class AVAudioUnitDelay 
    extends AVAudioUnitEffect 
     {

    
    
    public AVAudioUnitDelay() {}
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitDelay(AudioComponentDescription audioComponentDescription) { }
    
    
    @Mapping("delayTime")
    public native double getDelayTime();
    @Mapping("setDelayTime:")
    public native void setDelayTime(double v);
    @Mapping("feedback")
    public native float getFeedback();
    @Mapping("setFeedback:")
    public native void setFeedback(float v);
    @Mapping("lowPassCutoff")
    public native float getLowPassCutoff();
    @Mapping("setLowPassCutoff:")
    public native void setLowPassCutoff(float v);
    @Mapping("wetDryMix")
    public native float getWetDryMix();
    @Mapping("setWetDryMix:")
    public native void setWetDryMix(float v);
    
    
    
    
    
}
