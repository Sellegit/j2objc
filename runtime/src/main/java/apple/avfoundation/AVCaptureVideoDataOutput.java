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
 * @since Available in iOS 4.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureVideoDataOutput")
public class AVCaptureVideoDataOutput 
    extends AVCaptureOutput 
     {

    
    
    public AVCaptureVideoDataOutput() {}
    
    
    @Mapping("sampleBufferDelegate")
    public native AVCaptureVideoDataOutputSampleBufferDelegate getSampleBufferDelegate();
    @Mapping("sampleBufferCallbackQueue")
    public native DispatchQueue getSampleBufferCallbackQueue();
    @Mapping("videoSettings")
    public native NSDictionary<NSString, NSObject> getVideoSettings0();
    @Mapping("setVideoSettings:")
    public native void setVideoSettings0(NSDictionary<NSString, NSObject> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableVideoCVPixelFormatTypes")
    public native List<CVPixelFormatType> getAvailableVideoCVPixelFormatTypes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("availableVideoCodecTypes")
    public native List<CMVideoCodecType> getAvailableVideoCodecTypes();
    @Mapping("alwaysDiscardsLateVideoFrames")
    public native boolean alwaysDiscardsLateVideoFrames();
    @Mapping("setAlwaysDiscardsLateVideoFrames:")
    public native void setAlwaysDiscardsLateVideoFrames(boolean v);
    
    
    
    @Mapping("setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegate(AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate, DispatchQueue sampleBufferCallbackQueue);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("recommendedVideoSettingsForAssetWriterWithOutputFileType:")
    public native NSDictionary<NSString, NSObject> getRecommendedVideoSettings0(String outputFileType);
    
}
