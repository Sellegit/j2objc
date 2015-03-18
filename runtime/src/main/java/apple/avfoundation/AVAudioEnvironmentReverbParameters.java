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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioEnvironmentReverbParameters")
public class AVAudioEnvironmentReverbParameters 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVAudioEnvironmentReverbParameters() { }
    
    
    @Mapping("enable")
    public native boolean isEnable();
    @Mapping("setEnable:")
    public native void setEnable(boolean v);
    @Mapping("level")
    public native float getLevel();
    @Mapping("setLevel:")
    public native void setLevel(float v);
    @Mapping("filterParameters")
    public native AVAudioUnitEQFilterParameters getFilterParameters();
    
    
    
    @Mapping("loadFactoryReverbPreset:")
    public native void loadFactoryReverbPreset(@Representing("AVAudioUnitReverbPreset") @MachineSizedSInt long preset);
    
}
