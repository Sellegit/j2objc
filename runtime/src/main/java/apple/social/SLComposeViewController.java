package apple.social;


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
import apple.uikit.*;
import apple.accounts.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("Social") @Mapping("SLComposeViewController")
public class SLComposeViewController 
    extends UIViewController 
     {

    
    
    public SLComposeViewController() {}
    @Mapping("initWithNibName:bundle:")
    public SLComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("serviceType")
    public native SLServiceType getServiceType();
    @Mapping("completionHandler")
    public native @Block VoidBlock3<String, SLRequestMethod, NSURL> getCompletionHandler();
    @Mapping("setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock3<String, SLRequestMethod, NSURL> v);
    
    
    
    @Mapping("setInitialText:")
    public native boolean setInitialText(String text);
    @Mapping("addImage:")
    public native boolean addImage(UIImage image);
    @Mapping("removeAllImages")
    public native boolean removeAllImages();
    @Mapping("addURL:")
    public native boolean addURL(NSURL url);
    @Mapping("removeAllURLs")
    public native boolean removeAllURLs();
    @Mapping("isAvailableForServiceType:")
    public static native boolean isAvailable(String serviceType);
    @Mapping("composeViewControllerForServiceType:")
    public static native SLComposeViewController create(String serviceType);
    
}
