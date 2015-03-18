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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetWriterInputGroup")
public class AVAssetWriterInputGroup 
    extends AVMediaSelectionGroup 
     {

    
    
    @Mapping("initWithInputs:defaultInput:")
    public AVAssetWriterInputGroup(NSArray<?> inputs, AVAssetWriterInput defaultInput) { }
    @Mapping("init")
    public AVAssetWriterInputGroup() { }
    
    
    @Mapping("inputs")
    public native NSArray<AVAssetWriterInput> getInputs();
    @Mapping("defaultInput")
    public native AVAssetWriterInput getDefaultInput();
    
    
    
    @Mapping("assetWriterInputGroupWithInputs:defaultInput:")
    public static native AVAssetWriterInputGroup create(NSArray<?> inputs, AVAssetWriterInput defaultInput);
    
}
