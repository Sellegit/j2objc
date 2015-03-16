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
 * @since Available in iOS 4.1 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVAssetReader")
public class AVAssetReader 
    extends NSObject 
     {

    
    
    public AVAssetReader() {}
    
    
    @Mapping("asset")
    public native AVAsset getAsset();
    @Mapping("status")
    public native @Representing("AVAssetReaderStatus") @MachineSizedSInt long getStatus();
    @Mapping("error")
    public native NSError getError();
    @Mapping("timeRange")
    public native CMTimeRange getTimeRange();
    @Mapping("setTimeRange:")
    public native void setTimeRange(CMTimeRange v);
    @Mapping("outputs")
    public native NSArray<AVAssetReaderOutput> getOutputs();
    
    
    
    @Mapping("canAddOutput:")
    public native boolean canAddOutput(AVAssetReaderOutput output);
    @Mapping("addOutput:")
    public native void addOutput(AVAssetReaderOutput output);
    @Mapping("startReading")
    public native boolean startReading();
    @Mapping("cancelReading")
    public native void cancelReading();
    @Mapping("assetReaderWithAsset:error:")
    public static native AVAssetReader create(AVAsset asset, Todo outError);
    
}
