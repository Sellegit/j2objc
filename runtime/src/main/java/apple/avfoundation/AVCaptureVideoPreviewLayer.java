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

@Library("AVFoundation") @Mapping("AVCaptureVideoPreviewLayer")
public class AVCaptureVideoPreviewLayer 
    extends CALayer 
     {

    
    
    public AVCaptureVideoPreviewLayer() {}
    @Mapping("initWithSession:")
    public AVCaptureVideoPreviewLayer(AVCaptureSession session) { }
    @Mapping("initWithLayer:")
    public AVCaptureVideoPreviewLayer(Object layer) { }
    
    
    @Mapping("session")
    public native AVCaptureSession getSession();
    public native void setSession(AVCaptureSession v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("connection")
    public native AVCaptureConnection getConnection();
    @Mapping("videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    public native void setVideoGravity(AVLayerVideoGravity v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("isOrientationSupported")
    public native boolean isOrientationSupported();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("orientation")
    public native @Representing("AVCaptureVideoOrientation") @MachineSizedSInt long getOrientation();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    public native void setOrientation(@Representing("AVCaptureVideoOrientation") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("isMirroringSupported")
    public native boolean isMirroringSupported();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("automaticallyAdjustsMirroring")
    public native boolean automaticallyAdjustsMirroring();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    public native void setAutomaticallyAdjustsMirroring(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("isMirrored")
    public native boolean isMirrored();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    public native void setMirrored(boolean v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setSessionWithNoConnection:")
    public native void setSessionWithNoConnection(AVCaptureSession session);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("captureDevicePointOfInterestForPoint:")
    public native CGPoint captureDevicePointOfInterest(CGPoint pointInLayer);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pointForCaptureDevicePointOfInterest:")
    public native CGPoint getDevicePointOfInterest(CGPoint captureDevicePointOfInterest);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("metadataOutputRectOfInterestForRect:")
    public native CGRect getRectOfInterestInLayerCoordinates(CGRect rectInLayerCoordinates);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rectForMetadataOutputRectOfInterest:")
    public native CGRect getRectOfInterestInMetadataOutputCoordinates(CGRect rectInMetadataOutputCoordinates);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("transformedMetadataObjectForMetadataObject:")
    public native AVMetadataObject getTransformedMetadataObject(AVMetadataObject metadataObject);
    @Mapping("layerWithSession:")
    public static native AVCaptureVideoPreviewLayer create(AVCaptureSession session);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("layerWithSessionWithNoConnection:")
    public static native AVCaptureVideoPreviewLayer createWithNoConnection(AVCaptureSession session);
    
}
