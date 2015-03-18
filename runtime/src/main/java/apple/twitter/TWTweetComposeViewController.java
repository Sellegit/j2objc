package apple.twitter;


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
import apple.social.*;
import apple.accounts.*;



/**
 * @since Available in iOS 5.0 and later.
 * @deprecated Deprecated in iOS 6.0.
 */
@Deprecated

@Library("Twitter/Twitter.h") @Mapping("TWTweetComposeViewController")
public class TWTweetComposeViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithNibName:bundle:")
    public TWTweetComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public TWTweetComposeViewController() { }
    
    
    @Mapping("completionHandler")
    public native @Block VoidBlock1<TWTweetComposeViewControllerResult> getCompletionHandler();
    @Mapping("setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock1<TWTweetComposeViewControllerResult> v);
    
    
    
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
    @Mapping("canSendTweet")
    public static native boolean canSendTweet();
    
}
