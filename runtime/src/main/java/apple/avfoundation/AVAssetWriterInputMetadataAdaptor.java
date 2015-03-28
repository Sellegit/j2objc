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
@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetWriterInputMetadataAdaptor")
public class AVAssetWriterInputMetadataAdaptor 
    extends NSObject 
     {

    
    
    @Mapping("initWithAssetWriterInput:")
    public AVAssetWriterInputMetadataAdaptor(AVAssetWriterInput input) { }
    @Mapping("init")
    public AVAssetWriterInputMetadataAdaptor() { }

    
    @Mapping("assetWriterInput")
    public native AVAssetWriterInput getAssetWriterInput();

    
    
    @Mapping("appendTimedMetadataGroup:")
    public native boolean appendTimedMetadataGroup(AVTimedMetadataGroup timedMetadataGroup);
    @Mapping("assetWriterInputMetadataAdaptorWithAssetWriterInput:")
    public static native AVAssetWriterInputMetadataAdaptor create(AVAssetWriterInput input);

}
