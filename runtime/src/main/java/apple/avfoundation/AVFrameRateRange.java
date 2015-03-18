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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVFrameRateRange")
public class AVFrameRateRange 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVFrameRateRange() { }
    
    
    @Mapping("minFrameRate")
    public native double getMinFrameRate();
    @Mapping("maxFrameRate")
    public native double getMaxFrameRate();
    @Mapping("maxFrameDuration")
    public native CMTime getMaxFrameDuration();
    @Mapping("minFrameDuration")
    public native CMTime getMinFrameDuration();
    
    
    
    
    
}
