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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureStillImageOutput")
public class AVCaptureStillImageOutput 
    extends AVCaptureOutput 
     {

    
    
    public AVCaptureStillImageOutput() {}
    
    
    @Mapping("outputSettings")
    public native NSDictionary<NSString, NSObject> getOutputSettings0();
    @Mapping("setOutputSettings:")
    public native void setOutputSettings0(NSDictionary<NSString, NSObject> v);
    @Mapping("availableImageDataCVPixelFormatTypes")
    public native List<CVPixelFormatType> getAvailableImageDataCVPixelFormatTypes();
    @Mapping("availableImageDataCodecTypes")
    public native List<CMVideoCodecType> getAvailableImageDataCodecTypes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("automaticallyEnablesStillImageStabilizationWhenAvailable")
    public native boolean automaticallyEnablesStillImageStabilizationWhenAvailable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAutomaticallyEnablesStillImageStabilizationWhenAvailable:")
    public native void setAutomaticallyEnablesStillImageStabilizationWhenAvailable(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isStillImageStabilizationActive")
    public native boolean isStillImageStabilizationActive();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isHighResolutionStillImageOutputEnabled")
    public native boolean isHighResolutionStillImageOutputEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHighResolutionStillImageOutputEnabled:")
    public native void setHighResolutionStillImageOutputEnabled(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isCapturingStillImage")
    public native boolean isCapturingStillImage();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maxBracketedCaptureStillImageCount")
    public native @MachineSizedUInt long getMaxBracketedCaptureStillImageCount();
    
    
    
    @Mapping("captureStillImageAsynchronouslyFromConnection:completionHandler:")
    public native void captureStillImageAsynchronously(AVCaptureConnection connection, @Block VoidBlock2<CMSampleBuffer, NSError> handler);
    @Mapping("jpegStillImageNSDataRepresentation:")
    public static native NSData createJPEGStillImageNSDataRepresentation(CMSampleBuffer jpegSampleBuffer);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:")
    public native void prepareToCaptureStillImageBracket(AVCaptureConnection connection, NSArray<?> settings, @Block VoidBlock2<Boolean, NSError> handler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:")
    public native void captureStillImageBracketAsynchronously(AVCaptureConnection connection, NSArray<?> settings, @Block VoidBlock3<CMSampleBuffer, AVCaptureBracketedStillImageSettings, NSError> handler);
    
}
