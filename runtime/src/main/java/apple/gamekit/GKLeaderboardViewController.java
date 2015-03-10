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
 * @since Available in iOS 4.1 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit") @Mapping("GKLeaderboardViewController")
public class GKLeaderboardViewController 
    extends GKGameCenterViewController 
     {

    
    
    public GKLeaderboardViewController() {}
    @Mapping("initWithRootViewController:")
    public GKLeaderboardViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKLeaderboardViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("timeScope")
    public native @Representing("GKLeaderboardTimeScope") @MachineSizedSInt long getTimeScope();
    public native void setTimeScope(@Representing("GKLeaderboardTimeScope") @MachineSizedSInt long v);
    @Mapping("category")
    public native String getCategory();
    public native void setCategory(String v);
    @Mapping("leaderboardDelegate")
    public native GKLeaderboardViewControllerDelegate getLeaderboardDelegate();
    public native void setLeaderboardDelegate(GKLeaderboardViewControllerDelegate v);
    
    
    
    
    
}
