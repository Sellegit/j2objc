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





@Library("GameKit") @Mapping("GKTurnBasedMatchmakerViewControllerDelegate")
public interface GKTurnBasedMatchmakerViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("turnBasedMatchmakerViewControllerWasCancelled:")
    void wasCancelled(GKTurnBasedMatchmakerViewController viewController);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("turnBasedMatchmakerViewController:didFailWithError:")
    void didFail(GKTurnBasedMatchmakerViewController viewController, NSError error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("turnBasedMatchmakerViewController:didFindMatch:")
    void didFindMatch(GKTurnBasedMatchmakerViewController viewController, GKTurnBasedMatch match);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("turnBasedMatchmakerViewController:playerQuitForMatch:")
    void playerQuit(GKTurnBasedMatchmakerViewController viewController, GKTurnBasedMatch match);
    
    /*<adapter>*/
    /*</adapter>*/
}
