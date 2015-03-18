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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetReaderOutputMetadataAdaptor")
public class AVAssetReaderOutputMetadataAdaptor 
    extends NSObject 
     {

    
    
    @Mapping("initWithAssetReaderTrackOutput:")
    public AVAssetReaderOutputMetadataAdaptor(AVAssetReaderTrackOutput trackOutput) { }
    @Mapping("init")
    public AVAssetReaderOutputMetadataAdaptor() { }
    
    
    @Mapping("assetReaderTrackOutput")
    public native AVAssetReaderTrackOutput getAssetReaderTrackOutput();
    
    
    
    @Mapping("nextTimedMetadataGroup")
    public native AVTimedMetadataGroup nextTimedMetadataGroup();
    @Mapping("assetReaderOutputMetadataAdaptorWithAssetReaderTrackOutput:")
    public static native AVAssetReaderOutputMetadataAdaptor create(AVAssetReaderTrackOutput trackOutput);
    
}
