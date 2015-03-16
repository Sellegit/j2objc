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
 * @since Available in iOS 4.2 and later.
 */

@Library("GameKit/GameKit.h") @Mapping("GKFriendRequestComposeViewController")
public class GKFriendRequestComposeViewController 
    extends UINavigationController 
     {

    
    
    public GKFriendRequestComposeViewController() {}
    @Mapping("initWithRootViewController:")
    public GKFriendRequestComposeViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public GKFriendRequestComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("composeViewDelegate")
    public native GKFriendRequestComposeViewControllerDelegate getComposeViewDelegate();
    @Mapping("setComposeViewDelegate:")
    public native void setComposeViewDelegate(GKFriendRequestComposeViewControllerDelegate v);
    
    
    
    @Mapping("setMessage:")
    public native void setMessage(String message);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("addRecipientPlayers:")
    public native void addRecipientPlayers(NSArray<?> players);
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("addRecipientsWithPlayerIDs:")
    public native void addRecipientsWithPlayerIDs(NSArray<?> playerIDs);
    @Mapping("addRecipientsWithEmailAddresses:")
    public native void addRecipientsWithEmailAddresses(NSArray<?> emailAddresses);
    @Mapping("maxNumberOfRecipients")
    public static native @MachineSizedUInt long getMaxNumberOfRecipients();
    
}
