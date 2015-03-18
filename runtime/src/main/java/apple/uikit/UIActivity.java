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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIActivity")
public class UIActivity 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIActivity() { }
    
    
    
    
    
    
    @Mapping("activityType")
    public native String getType();
    @Mapping("activityTitle")
    public native String getTitle();
    @Mapping("activityImage")
    public native UIImage getImage();
    @Mapping("canPerformWithActivityItems:")
    public native boolean canPerform(NSArray<?> activityItems);
    @Mapping("prepareWithActivityItems:")
    public native void prepare(NSArray<?> activityItems);
    @Mapping("activityViewController")
    public native UIViewController getViewController();
    @Mapping("performActivity")
    public native void perform();
    @Mapping("activityDidFinish:")
    public native void didFinish(boolean completed);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("activityCategory")
    public static native @Representing("UIActivityCategory") @MachineSizedSInt long getActivityCategory();
    
}
