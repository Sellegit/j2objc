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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAudioUnit")
public class AVAudioUnit 
    extends AVAudioNode 
     {

    
    
    public AVAudioUnit() {}
    
    
    @Mapping("audioComponentDescription")
    public native AudioComponentDescription getAudioComponentDescription();
    @Mapping("audioUnit")
    public native AudioComponentInstance getAudioUnit();
    @Mapping("name")
    public native String getName();
    @Mapping("manufacturerName")
    public native String getManufacturerName();
    @Mapping("version")
    public native @MachineSizedUInt long getVersion();
    
    
    
    @Mapping("loadAudioUnitPresetAtURL:error:")
    public native boolean loadAudioUnitPreset(NSURL url, Todo error);
    
}
