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

@Library("UIKit/UIKit.h") @Mapping("UIActivityViewController")
public class UIActivityViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithActivityItems:applicationActivities:")
    public UIActivityViewController(NSArray<?> activityItems, NSArray<?> applicationActivities) { }
    @Mapping("initWithNibName:bundle:")
    public UIActivityViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UIActivityViewController(NSCoder aDecoder) { }
    @Mapping("init")
    public UIActivityViewController() { }
    
    
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("completionHandler")
    public native @Block VoidBlock2<String, Boolean> getCompletionHandler();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock2<String, Boolean> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("completionWithItemsHandler")
    public native @Block VoidBlock4<String, Boolean, NSArray<NSObject>, NSError> getCompletionWithItemsHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setCompletionWithItemsHandler:")
    public native void setCompletionWithItemsHandler(@Block VoidBlock4<String, Boolean, NSArray<NSObject>, NSError> v);
    @Mapping("excludedActivityTypes")
    public native List<String> getExcludedActivityTypes();
    @Mapping("setExcludedActivityTypes:")
    public native void setExcludedActivityTypes(List<String> v);
    
    
    
    
    
}
