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
@Library("GameKit/GameKit.h") @Mapping("GKLeaderboardViewController")
public class GKLeaderboardViewController 
    extends GKGameCenterViewController 
     {

    
    
    @Mapping("initWithRootViewController:")
    public GKLeaderboardViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKLeaderboardViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public GKLeaderboardViewController() { }

    
    @Mapping("timeScope")
    public native @Representing("GKLeaderboardTimeScope") long getTimeScope();
    @Mapping("setTimeScope:")
    public native void setTimeScope(@Representing("GKLeaderboardTimeScope") long v);
    @Mapping("category")
    public native String getCategory();
    @Mapping("setCategory:")
    public native void setCategory(String v);
    @Mapping("leaderboardDelegate")
    public native GKLeaderboardViewControllerDelegate getLeaderboardDelegate();
    @Mapping("setLeaderboardDelegate:")
    public native void setLeaderboardDelegate(GKLeaderboardViewControllerDelegate v);

    
    


}
