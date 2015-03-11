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


/*<javadoc>*/
/*</javadoc>*/

public abstract class GKMatchmakerViewControllerDelegateAdapter 
    extends Object 
    implements GKMatchmakerViewControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewControllerWasCancelled:")
    public void wasCancelled(GKMatchmakerViewController viewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewController:didFailWithError:")
    public void didFail(GKMatchmakerViewController viewController, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     */
    @NotImplemented("matchmakerViewController:didFindMatch:")
    public void didFindMatch(GKMatchmakerViewController viewController, GKMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("matchmakerViewController:didFindHostedPlayers:")
    public void didFindHostedPlayers(GKMatchmakerViewController viewController, NSArray<GKPlayer> players) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didFindPlayers:")
    public void didFindPlayers(GKMatchmakerViewController viewController, List<String> playerIDs) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("matchmakerViewController:hostedPlayerDidAccept:")
    public void hostedPlayerDidAccept(GKMatchmakerViewController viewController, GKPlayer player) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    public void didReceiveAccept(GKMatchmakerViewController viewController, String playerID) { throw new UnsupportedOperationException(); }
    
}
