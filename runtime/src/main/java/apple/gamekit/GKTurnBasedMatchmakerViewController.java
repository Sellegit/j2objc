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

@Library("GameKit/GameKit.h") @Mapping("GKTurnBasedMatchmakerViewController")
public class GKTurnBasedMatchmakerViewController 
    extends UINavigationController 
     {

    
    
    @Mapping("initWithRootViewController:")
    public GKTurnBasedMatchmakerViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKTurnBasedMatchmakerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public GKTurnBasedMatchmakerViewController() { }
    @Mapping("initWithMatchRequest:")
    public GKTurnBasedMatchmakerViewController(GKMatchRequest request) { }
    
    
    @Mapping("turnBasedMatchmakerDelegate")
    public native GKTurnBasedMatchmakerViewControllerDelegate getTurnBasedMatchmakerDelegate();
    @Mapping("setTurnBasedMatchmakerDelegate:")
    public native void setTurnBasedMatchmakerDelegate(GKTurnBasedMatchmakerViewControllerDelegate v);
    @Mapping("showExistingMatches")
    public native boolean showsExistingMatches();
    @Mapping("setShowExistingMatches:")
    public native void setShowsExistingMatches(boolean v);
    
    
    
    
    
}
