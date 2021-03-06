package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/**
 * @since Available in iOS 2.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIImagePickerController")
public class UIImagePickerController 
    extends UINavigationController 
    implements NSCoding {

    
    
    @Mapping("initWithRootViewController:")
    public UIImagePickerController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public UIImagePickerController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UIImagePickerController(NSCoder aDecoder) { }
    @Mapping("init")
    public UIImagePickerController() { }

    
    @Mapping("delegate")
    public native UIImagePickerControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIImagePickerControllerDelegate v);
    @Mapping("sourceType")
    public native @Representing("UIImagePickerControllerSourceType") long getSourceType();
    @Mapping("setSourceType:")
    public native void setSourceType(@Representing("UIImagePickerControllerSourceType") long v);
    @Mapping("mediaTypes")
    public native List<String> getMediaTypes();
    @Mapping("setMediaTypes:")
    public native void setMediaTypes(List<String> v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("allowsEditing")
    public native boolean allowsEditing();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setAllowsEditing:")
    public native void setAllowsEditing(boolean v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("videoMaximumDuration")
    public native double getVideoMaximumDuration();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("videoQuality")
    public native @Representing("UIImagePickerControllerQualityType") long getVideoQuality();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setVideoQuality:")
    public native void setVideoQuality(@Representing("UIImagePickerControllerQualityType") long v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("showsCameraControls")
    public native boolean showsCameraControls();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setShowsCameraControls:")
    public native void setShowsCameraControls(boolean v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("cameraOverlayView")
    public native UIView getCameraOverlayView();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setCameraOverlayView:")
    public native void setCameraOverlayView(UIView v);
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("cameraViewTransform")
    public native CGAffineTransform getCameraViewTransform();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("setCameraViewTransform:")
    public native void setCameraViewTransform(CGAffineTransform v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("cameraCaptureMode")
    public native @Representing("UIImagePickerControllerCameraCaptureMode") long getCameraCaptureMode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCameraCaptureMode:")
    public native void setCameraCaptureMode(@Representing("UIImagePickerControllerCameraCaptureMode") long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("cameraDevice")
    public native @Representing("UIImagePickerControllerCameraDevice") long getCameraDevice();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCameraDevice:")
    public native void setCameraDevice(@Representing("UIImagePickerControllerCameraDevice") long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("cameraFlashMode")
    public native @Representing("UIImagePickerControllerCameraFlashMode") long getCameraFlashMode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCameraFlashMode:")
    public native void setCameraFlashMode(@Representing("UIImagePickerControllerCameraFlashMode") long v);

    
    
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("takePicture")
    public native void takePicture();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("startVideoCapture")
    public native boolean startVideoCapture();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("stopVideoCapture")
    public native void stopVideoCapture();
    @Mapping("isSourceTypeAvailable:")
    public static native boolean isSourceTypeAvailable(@Representing("UIImagePickerControllerSourceType") long sourceType);
    @Mapping("availableMediaTypesForSourceType:")
    public static native List<String> getAvailableMediaTypes(@Representing("UIImagePickerControllerSourceType") long sourceType);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isCameraDeviceAvailable:")
    public static native boolean isCameraDeviceAvailable(@Representing("UIImagePickerControllerCameraDevice") long cameraDevice);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isFlashAvailableForCameraDevice:")
    public static native boolean isFlashAvailableForCameraDevice(@Representing("UIImagePickerControllerCameraDevice") long cameraDevice);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("availableCaptureModesForCameraDevice:")
    public static native List<UIImagePickerControllerCameraCaptureMode> getAvailableCaptureModes(@Representing("UIImagePickerControllerCameraDevice") long cameraDevice);

}
