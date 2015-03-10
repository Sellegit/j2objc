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

@Library("AVFoundation") @Mapping("AVCaptureDeviceFormat")
public class AVCaptureDeviceFormat 
    extends NSObject 
     {

    
    
    public AVCaptureDeviceFormat() {}
    
    
    @Mapping("mediaType")
    public native AVMediaType getMediaType();
    @Mapping("formatDescription")
    public native CMFormatDescription getFormatDescription();
    @Mapping("videoSupportedFrameRateRanges")
    public native NSArray<AVFrameRateRange> getVideoSupportedFrameRateRanges();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoFieldOfView")
    public native float getVideoFieldOfView();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isVideoBinned")
    public native boolean isVideoBinned();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoMaxZoomFactor")
    public native @MachineSizedFloat double getVideoMaxZoomFactor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoZoomFactorUpscaleThreshold")
    public native @MachineSizedFloat double getVideoZoomFactorUpscaleThreshold();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("minExposureDuration")
    public native CMTime getMinExposureDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maxExposureDuration")
    public native CMTime getMaxExposureDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("minISO")
    public native float getMinISO();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maxISO")
    public native float getMaxISO();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isVideoHDRSupported")
    public native boolean isVideoHDRSupported();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("highResolutionStillImageDimensions")
    public native CMVideoDimensions getHighResolutionStillImageDimensions();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("autoFocusSystem")
    public native @Representing("AVCaptureAutoFocusSystem") @MachineSizedSInt long getAutoFocusSystem();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(@Representing("AVCaptureVideoStabilizationMode") @MachineSizedSInt long videoStabilizationMode);
    
}
