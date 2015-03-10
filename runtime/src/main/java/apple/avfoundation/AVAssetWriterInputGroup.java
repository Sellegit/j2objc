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

@Library("AVFoundation") @Mapping("AVAssetWriterInputGroup")
public class AVAssetWriterInputGroup 
    extends AVMediaSelectionGroup 
     {

    
    
    public AVAssetWriterInputGroup() {}
    @Mapping("initWithInputs:defaultInput:")
    public AVAssetWriterInputGroup(NSArray<AVAssetWriterInput> inputs, AVAssetWriterInput defaultInput) { }
    
    
    @Mapping("inputs")
    public native NSArray<AVAssetWriterInput> getInputs();
    @Mapping("defaultInput")
    public native AVAssetWriterInput getDefaultInput();
    
    
    
    @Mapping("assetWriterInputGroupWithInputs:defaultInput:")
    public static native AVAssetWriterInputGroup create(NSArray<AVAssetWriterInput> inputs, AVAssetWriterInput defaultInput);
    
}
