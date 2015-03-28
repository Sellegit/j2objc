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


@Library("GameKit/GameKit.h") @Mapping("GKMatchmakerViewControllerDelegate")
public interface GKMatchmakerViewControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("matchmakerViewControllerWasCancelled:")
    void wasCancelled(GKMatchmakerViewController viewController);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("matchmakerViewController:didFailWithError:")
    void didFail(GKMatchmakerViewController viewController, NSError error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("matchmakerViewController:didFindMatch:")
    void didFindMatch(GKMatchmakerViewController viewController, GKMatch match);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("matchmakerViewController:didFindHostedPlayers:")
    void didFindHostedPlayers(GKMatchmakerViewController viewController, NSArray<?> players);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("matchmakerViewController:didFindPlayers:")
    void didFindPlayers(GKMatchmakerViewController viewController, NSArray<?> playerIDs);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("matchmakerViewController:hostedPlayerDidAccept:")
    void hostedPlayerDidAccept(GKMatchmakerViewController viewController, GKPlayer player);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    void didReceiveAccept(GKMatchmakerViewController viewController, String playerID);

    /*<adapter>*/
    /*</adapter>*/
}
