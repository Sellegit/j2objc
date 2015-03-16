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

@Library("GameKit/GameKit.h") @Mapping("GKAchievementViewController")
public class GKAchievementViewController 
    extends GKGameCenterViewController 
     {

    
    
    public GKAchievementViewController() {}
    @Mapping("initWithRootViewController:")
    public GKAchievementViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKAchievementViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("achievementDelegate")
    public native GKAchievementViewControllerDelegate getAchievementDelegate();
    @Mapping("setAchievementDelegate:")
    public native void setAchievementDelegate(GKAchievementViewControllerDelegate v);
    
    
    
    
    
}
