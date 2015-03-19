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

@Library("AVFoundation/AVFoundation.h") @Mapping("AVCaptureDevice")
public class AVCaptureDevice 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public AVCaptureDevice() { }
    
    
    @Mapping("uniqueID")
    public native String getUniqueID();
    @Mapping("modelID")
    public native String getModelID();
    @Mapping("localizedName")
    public native String getLocalizedName();
    @Mapping("isConnected")
    public native boolean isConnected();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("formats")
    public native NSArray<AVCaptureDeviceFormat> getFormats();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("activeFormat")
    public native AVCaptureDeviceFormat getActiveFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setActiveFormat:")
    public native void setActiveFormat(AVCaptureDeviceFormat v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("activeVideoMinFrameDuration")
    public native CMTime getActiveVideoMinFrameDuration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setActiveVideoMinFrameDuration:")
    public native void setActiveVideoMinFrameDuration(CMTime v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("activeVideoMaxFrameDuration")
    public native CMTime getActiveVideoMaxFrameDuration();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setActiveVideoMaxFrameDuration:")
    public native void setActiveVideoMaxFrameDuration(CMTime v);
    @Mapping("position")
    public native @Representing("AVCaptureDevicePosition") long getPosition();
    @Mapping("hasFlash")
    public native boolean hasFlash();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isFlashAvailable")
    public native boolean isFlashAvailable();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isFlashActive")
    public native boolean isFlashActive();
    @Mapping("flashMode")
    public native @Representing("AVCaptureFlashMode") long getFlashMode();
    @Mapping("setFlashMode:")
    public native void setFlashMode(@Representing("AVCaptureFlashMode") long v);
    @Mapping("hasTorch")
    public native boolean hasTorch();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isTorchAvailable")
    public native boolean isTorchAvailable();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isTorchActive")
    public native boolean isTorchActive();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("torchLevel")
    public native float getTorchLevel();
    @Mapping("torchMode")
    public native @Representing("AVCaptureTorchMode") long getTorchMode();
    @Mapping("setTorchMode:")
    public native void setTorchMode(@Representing("AVCaptureTorchMode") long v);
    @Mapping("focusMode")
    public native @Representing("AVCaptureFocusMode") long getFocusMode();
    @Mapping("setFocusMode:")
    public native void setFocusMode(@Representing("AVCaptureFocusMode") long v);
    @Mapping("isFocusPointOfInterestSupported")
    public native boolean isFocusPointOfInterestSupported();
    @Mapping("focusPointOfInterest")
    public native CGPoint getFocusPointOfInterest();
    @Mapping("setFocusPointOfInterest:")
    public native void setFocusPointOfInterest(CGPoint v);
    @Mapping("isAdjustingFocus")
    public native boolean isAdjustingFocus();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isAutoFocusRangeRestrictionSupported")
    public native boolean isAutoFocusRangeRestrictionSupported();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("autoFocusRangeRestriction")
    public native @Representing("AVCaptureAutoFocusRangeRestriction") long getAutoFocusRangeRestriction();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAutoFocusRangeRestriction:")
    public native void setAutoFocusRangeRestriction(@Representing("AVCaptureAutoFocusRangeRestriction") long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isSmoothAutoFocusSupported")
    public native boolean isSmoothAutoFocusSupported();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isSmoothAutoFocusEnabled")
    public native boolean isSmoothAutoFocusEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSmoothAutoFocusEnabled:")
    public native void setSmoothAutoFocusEnabled(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lensPosition")
    public native float getLensPosition();
    @Mapping("exposureMode")
    public native @Representing("AVCaptureExposureMode") long getExposureMode();
    @Mapping("setExposureMode:")
    public native void setExposureMode(@Representing("AVCaptureExposureMode") long v);
    @Mapping("isExposurePointOfInterestSupported")
    public native boolean isExposurePointOfInterestSupported();
    @Mapping("exposurePointOfInterest")
    public native CGPoint getExposurePointOfInterest();
    @Mapping("setExposurePointOfInterest:")
    public native void setExposurePointOfInterest(CGPoint v);
    @Mapping("isAdjustingExposure")
    public native boolean isAdjustingExposure();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("lensAperture")
    public native float getLensAperture();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("exposureDuration")
    public native CMTime getExposureDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("ISO")
    public native float getISO();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("exposureTargetOffset")
    public native float getExposureTargetOffset();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("exposureTargetBias")
    public native float getExposureTargetBias();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("minExposureTargetBias")
    public native float getMinExposureTargetBias();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maxExposureTargetBias")
    public native float getMaxExposureTargetBias();
    @Mapping("whiteBalanceMode")
    public native @Representing("AVCaptureWhiteBalanceMode") long getWhiteBalanceMode();
    @Mapping("setWhiteBalanceMode:")
    public native void setWhiteBalanceMode(@Representing("AVCaptureWhiteBalanceMode") long v);
    @Mapping("isAdjustingWhiteBalance")
    public native boolean isAdjustingWhiteBalance();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("deviceWhiteBalanceGains")
    public native AVCaptureWhiteBalanceGains getDeviceWhiteBalanceGains();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("grayWorldDeviceWhiteBalanceGains")
    public native AVCaptureWhiteBalanceGains getGrayWorldDeviceWhiteBalanceGains();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maxWhiteBalanceGain")
    public native float getMaxWhiteBalanceGain();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isSubjectAreaChangeMonitoringEnabled")
    public native boolean isSubjectAreaChangeMonitoringEnabled();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSubjectAreaChangeMonitoringEnabled:")
    public native void setSubjectAreaChangeMonitoringEnabled(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isLowLightBoostSupported")
    public native boolean isLowLightBoostSupported();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isLowLightBoostEnabled")
    public native boolean isLowLightBoostEnabled();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("automaticallyEnablesLowLightBoostWhenAvailable")
    public native boolean automaticallyEnablesLowLightBoostWhenAvailable();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAutomaticallyEnablesLowLightBoostWhenAvailable:")
    public native void setAutomaticallyEnablesLowLightBoostWhenAvailable(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("videoZoomFactor")
    public native @MachineSizedFloat double getVideoZoomFactor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setVideoZoomFactor:")
    public native void setVideoZoomFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isRampingVideoZoom")
    public native boolean isRampingVideoZoom();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("automaticallyAdjustsVideoHDREnabled")
    public native boolean automaticallyAdjustsVideoHDREnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setAutomaticallyAdjustsVideoHDREnabled:")
    public native void setAutomaticallyAdjustsVideoHDREnabled(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isVideoHDREnabled")
    public native boolean isVideoHDREnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setVideoHDREnabled:")
    public native void setVideoHDREnabled(boolean v);
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureDeviceWasConnectedNotification")
    public static native NSString WasConnectedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCaptureDeviceWasDisconnectedNotification")
    public static native NSString WasDisconnectedNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVCaptureDeviceSubjectAreaDidChangeNotification")
    public static native NSString SubjectAreaDidChangeNotification();
    @GlobalConstant("AVCaptureMaxAvailableTorchLevel")
    public static native float getMaxAvailableTorchLevel();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureLensPositionCurrent")
    public static native float getLensPositionCurrent();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureExposureDurationCurrent")
    public static native CMTime getExposureDurationCurrent();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureISOCurrent")
    public static native float getISOCurrent();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureExposureTargetBiasCurrent")
    public static native float getExposureTargetBiasCurrent();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVCaptureWhiteBalanceGainsCurrent")
    public static native AVCaptureWhiteBalanceGains getWhiteBalanceGainsCurrent();
    
    @Mapping("hasMediaType:")
    public native boolean hasMediaType(String mediaType);
    @Mapping("lockForConfiguration:")
    public native boolean lockForConfiguration(Todo outError);
    @Mapping("unlockForConfiguration")
    public native void unlockForConfiguration();
    @Mapping("supportsAVCaptureSessionPreset:")
    public native boolean supportsAVCaptureSessionPreset(String preset);
    @Mapping("devices")
    public static native NSArray<AVCaptureDevice> getDevices();
    @Mapping("devicesWithMediaType:")
    public static native NSArray<AVCaptureDevice> getDevicesForMediaType(String mediaType);
    @Mapping("defaultDeviceWithMediaType:")
    public static native AVCaptureDevice getDefaultDeviceForMediaType(String mediaType);
    @Mapping("deviceWithUniqueID:")
    public static native AVCaptureDevice getDeviceWithUniqueID(String deviceUniqueID);
    @Mapping("isFlashModeSupported:")
    public native boolean isFlashModeSupported(@Representing("AVCaptureFlashMode") long flashMode);
    @Mapping("isTorchModeSupported:")
    public native boolean isTorchModeSupported(@Representing("AVCaptureTorchMode") long torchMode);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTorchModeOnWithLevel:error:")
    public native boolean setTorchModeOn(float torchLevel, Todo outError);
    @Mapping("isFocusModeSupported:")
    public native boolean isFocusModeSupported(@Representing("AVCaptureFocusMode") long focusMode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setFocusModeLockedWithLensPosition:completionHandler:")
    public native void setFocusModeLocked(float lensPosition, @Block VoidBlock1<CMTime> handler);
    @Mapping("isExposureModeSupported:")
    public native boolean isExposureModeSupported(@Representing("AVCaptureExposureMode") long exposureMode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setExposureModeCustomWithDuration:ISO:completionHandler:")
    public native void setExposureModeCustom(CMTime duration, float ISO, @Block VoidBlock1<CMTime> handler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setExposureTargetBias:completionHandler:")
    public native void setExposureTargetBias(float bias, @Block VoidBlock1<CMTime> handler);
    @Mapping("isWhiteBalanceModeSupported:")
    public native boolean isWhiteBalanceModeSupported(@Representing("AVCaptureWhiteBalanceMode") long whiteBalanceMode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:")
    public native void setWhiteBalanceModeLocked(AVCaptureWhiteBalanceGains whiteBalanceGains, @Block VoidBlock1<CMTime> handler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("chromaticityValuesForDeviceWhiteBalanceGains:")
    public native AVCaptureWhiteBalanceChromaticityValues convertDeviceWhiteBalanceGainsToChromaticityValues(AVCaptureWhiteBalanceGains whiteBalanceGains);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("deviceWhiteBalanceGainsForChromaticityValues:")
    public native AVCaptureWhiteBalanceGains convertChromaticityValuesToDeviceWhiteBalanceGains(AVCaptureWhiteBalanceChromaticityValues chromaticityValues);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("temperatureAndTintValuesForDeviceWhiteBalanceGains:")
    public native AVCaptureWhiteBalanceTemperatureAndTintValues convertDeviceWhiteBalanceGainsToTemperatureAndTintValues(AVCaptureWhiteBalanceGains whiteBalanceGains);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("deviceWhiteBalanceGainsForTemperatureAndTintValues:")
    public native AVCaptureWhiteBalanceGains convertTemperatureAndTintValuesToDeviceWhiteBalanceGains(AVCaptureWhiteBalanceTemperatureAndTintValues tempAndTintValues);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("rampToVideoZoomFactor:withRate:")
    public native void rampToVideoZoomFactor(@MachineSizedFloat double factor, float rate);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("cancelVideoZoomRamp")
    public native void cancelVideoZoomRamp();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("authorizationStatusForMediaType:")
    public static native @Representing("AVAuthorizationStatus") long getAuthorizationStatusForMediaType(String mediaType);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("requestAccessForMediaType:completionHandler:")
    public static native void requestAccessForMediaType(String mediaType, @Block VoidBooleanBlock handler);
    
}
