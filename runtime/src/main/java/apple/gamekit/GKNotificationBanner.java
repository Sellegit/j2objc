package apple.gamekit;


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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GameKit") @Mapping("GKNotificationBanner")
public class GKNotificationBanner 
    extends NSObject 
     {

    
    
    public GKNotificationBanner() {}
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("showBannerWithTitle:message:completionHandler:")
    public static native void showBanner(String title, String message, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("showBannerWithTitle:message:duration:completionHandler:")
    public static native void showBanner(String title, String message, double duration, @Block Runnable completionHandler);
    
}
