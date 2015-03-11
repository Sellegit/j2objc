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

@Library("AVFoundation") @Mapping("AVAudioUnitVarispeed")
public class AVAudioUnitVarispeed 
    extends AVAudioUnitTimeEffect 
     {

    
    
    public AVAudioUnitVarispeed() {}
    @Mapping("initWithAudioComponentDescription:")
    public AVAudioUnitVarispeed(AudioComponentDescription audioComponentDescription) { }
    
    
    @Mapping("rate")
    public native float getRate();
    @Mapping("setRate:")
    public native void setRate(float v);
    
    
    
    
    
}
