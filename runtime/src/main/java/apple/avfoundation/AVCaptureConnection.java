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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureConnection")
public class AVCaptureConnection 
    extends NSObject 
     {

    
    
    public AVCaptureConnection() {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithInputPorts:output:")
    public AVCaptureConnection(NSArray<?> ports, AVCaptureOutput output) { }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithInputPort:videoPreviewLayer:")
    public AVCaptureConnection(AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer) { }
    
    
    @Mapping("inputPorts")
    public native NSArray<AVCaptureInputPort> getInputPorts();
    @Mapping("output")
    public native AVCaptureOutput getOutput();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("videoPreviewLayer")
    public native AVCaptureVideoPreviewLayer getVideoPreviewLayer();
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("audioChannels")
    public native NSArray<AVCaptureAudioChannel> getAudioChannels();
    @Mapping("isVideoMirroringSupported")
    public native boolean supportsVideoMirroring();
    @Mapping("isVideoMirrored")
    public native boolean isVideoMirrored();
    @Mapping("setVideoMirrored:")
    public native void setVideoMirrored(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("automaticallyAdjustsVideoMirroring")
    public native boolean automaticallyAdjustsVideoMirroring();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAutomaticallyAdjustsVideoMirroring:")
    public native void setAutomaticallyAdjustsVideoMirroring(boolean v);
    @Mapping("isVideoOrientationSupported")
    public native boolean supportsVideoOrientation();
    @Mapping("videoOrientation")
    public native @Representing("AVCaptureVideoOrientation") @MachineSizedSInt long getVideoOrientation();
    @Mapping("setVideoOrientation:")
    public native void setVideoOrientation(@Representing("AVCaptureVideoOrientation") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("isVideoMinFrameDurationSupported")
    public native boolean supportsVideoMinFrameDuration();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("videoMinFrameDuration")
    public native CMTime getVideoMinFrameDuration();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setVideoMinFrameDuration:")
    public native void setVideoMinFrameDuration(CMTime v);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("isVideoMaxFrameDurationSupported")
    public native boolean supportsVideoMaxFrameDuration();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("videoMaxFrameDuration")
    public native CMTime getVideoMaxFrameDuration();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setVideoMaxFrameDuration:")
    public native void setVideoMaxFrameDuration(CMTime v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoMaxScaleAndCropFactor")
    public native @MachineSizedFloat double getVideoMaxScaleAndCropFactor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("videoScaleAndCropFactor")
    public native @MachineSizedFloat double getVideoScaleAndCropFactor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setVideoScaleAndCropFactor:")
    public native void setVideoScaleAndCropFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredVideoStabilizationMode")
    public native @Representing("AVCaptureVideoStabilizationMode") @MachineSizedSInt long getPreferredVideoStabilizationMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreferredVideoStabilizationMode:")
    public native void setPreferredVideoStabilizationMode(@Representing("AVCaptureVideoStabilizationMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("activeVideoStabilizationMode")
    public native @Representing("AVCaptureVideoStabilizationMode") @MachineSizedSInt long getActiveVideoStabilizationMode();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isVideoStabilizationSupported")
    public native boolean supportsVideoStabilization();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("isVideoStabilizationEnabled")
    public native boolean isVideoStabilizationEnabled();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("enablesVideoStabilizationWhenAvailable")
    public native boolean enablesVideoStabilizationWhenAvailable();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setEnablesVideoStabilizationWhenAvailable:")
    public native void setEnablesVideoStabilizationWhenAvailable(boolean v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("connectionWithInputPorts:output:")
    public static native AVCaptureConnection create(NSArray<?> ports, AVCaptureOutput output);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("connectionWithInputPort:videoPreviewLayer:")
    public static native AVCaptureConnection create(AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer);
    
}
