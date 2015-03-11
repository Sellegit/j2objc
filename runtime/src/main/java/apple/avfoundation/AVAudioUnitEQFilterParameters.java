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

@Library("AVFoundation") @Mapping("AVAudioUnitEQFilterParameters")
public class AVAudioUnitEQFilterParameters 
    extends NSObject 
     {

    
    
    public AVAudioUnitEQFilterParameters() {}
    
    
    @Mapping("filterType")
    public native @Representing("AVAudioUnitEQFilterType") @MachineSizedSInt long getFilterType();
    @Mapping("setFilterType:")
    public native void setFilterType(@Representing("AVAudioUnitEQFilterType") @MachineSizedSInt long v);
    @Mapping("frequency")
    public native float getFrequency();
    @Mapping("setFrequency:")
    public native void setFrequency(float v);
    @Mapping("bandwidth")
    public native float getBandwidth();
    @Mapping("setBandwidth:")
    public native void setBandwidth(float v);
    @Mapping("gain")
    public native float getGain();
    @Mapping("setGain:")
    public native void setGain(float v);
    @Mapping("bypass")
    public native boolean isBypass();
    @Mapping("setBypass:")
    public native void setBypass(boolean v);
    
    
    
    
    
}
