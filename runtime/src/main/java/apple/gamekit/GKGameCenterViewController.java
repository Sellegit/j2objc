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
 * @since Available in iOS 6.0 and later.
 */

@Library("GameKit/GameKit.h") @Mapping("GKGameCenterViewController")
public class GKGameCenterViewController 
    extends UINavigationController 
     {

    
    
    @Mapping("initWithRootViewController:")
    public GKGameCenterViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKGameCenterViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public GKGameCenterViewController() { }
    
    
    @Mapping("gameCenterDelegate")
    public native GKGameCenterControllerDelegate getGameCenterDelegate();
    @Mapping("setGameCenterDelegate:")
    public native void setGameCenterDelegate(GKGameCenterControllerDelegate v);
    @Mapping("viewState")
    public native @Representing("GKGameCenterViewControllerState") @MachineSizedSInt long getViewState();
    @Mapping("setViewState:")
    public native void setViewState(@Representing("GKGameCenterViewControllerState") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("leaderboardTimeScope")
    public native @Representing("GKLeaderboardTimeScope") @MachineSizedSInt long getLeaderboardTimeScope();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setLeaderboardTimeScope:")
    public native void setLeaderboardTimeScope(@Representing("GKLeaderboardTimeScope") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("leaderboardIdentifier")
    public native String getLeaderboardIdentifier();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String v);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("leaderboardCategory")
    public native String getLeaderboardCategory();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setLeaderboardCategory:")
    public native void setLeaderboardCategory(String v);
    
    
    
    
    
}
