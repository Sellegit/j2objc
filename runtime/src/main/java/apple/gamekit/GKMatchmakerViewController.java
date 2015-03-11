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
 */

@Library("GameKit") @Mapping("GKMatchmakerViewController")
public class GKMatchmakerViewController 
    extends UINavigationController 
     {

    
    
    public GKMatchmakerViewController() {}
    @Mapping("initWithMatchRequest:")
    public GKMatchmakerViewController(GKMatchRequest request) { }
    @Mapping("initWithInvite:")
    public GKMatchmakerViewController(GKInvite invite) { }
    @Mapping("initWithRootViewController:")
    public GKMatchmakerViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKMatchmakerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("matchmakerDelegate")
    public native GKMatchmakerViewControllerDelegate getMatchmakerDelegate();
    @Mapping("setMatchmakerDelegate:")
    public native void setMatchmakerDelegate(GKMatchmakerViewControllerDelegate v);
    @Mapping("matchRequest")
    public native GKMatchRequest getMatchRequest();
    @Mapping("isHosted")
    public native boolean isHosted();
    @Mapping("setHosted:")
    public native void setHosted(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("defaultInvitationMessage")
    public native String getDefaultInvitationMessage();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setDefaultInvitationMessage:")
    public native void setDefaultInvitationMessage(String v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("addPlayersToMatch:")
    public native void addPlayersToMatch(GKMatch match);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setHostedPlayer:connected:")
    public native void setHostedPlayer(String playerID, boolean connected);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHostedPlayer:didConnect:")
    public native void setHostedPlayer(GKPlayer player, boolean connected);
    
}
