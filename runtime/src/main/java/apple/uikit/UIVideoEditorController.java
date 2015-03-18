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
 * @since Available in iOS 3.1 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIVideoEditorController")
public class UIVideoEditorController 
    extends UINavigationController 
     {

    
    
    @Mapping("initWithRootViewController:")
    public UIVideoEditorController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public UIVideoEditorController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public UIVideoEditorController() { }
    
    
    @Mapping("delegate")
    public native UIVideoEditorControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIVideoEditorControllerDelegate v);
    @Mapping("videoPath")
    public native String getVideoPath();
    @Mapping("setVideoPath:")
    public native void setVideoPath(String v);
    @Mapping("videoMaximumDuration")
    public native double getVideoMaximumDuration();
    @Mapping("setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double v);
    @Mapping("videoQuality")
    public native @Representing("UIImagePickerControllerQualityType") @MachineSizedSInt long getVideoQuality();
    @Mapping("setVideoQuality:")
    public native void setVideoQuality(@Representing("UIImagePickerControllerQualityType") @MachineSizedSInt long v);
    
    
    
    /**
     * @since Available in iOS 3.1 and later.
     */
    @Mapping("canEditVideoAtPath:")
    public static native boolean canEditVideo(String videoPath);
    
}
