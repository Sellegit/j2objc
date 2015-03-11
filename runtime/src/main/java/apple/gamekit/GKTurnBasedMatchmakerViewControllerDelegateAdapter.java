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

public abstract class GKTurnBasedMatchmakerViewControllerDelegateAdapter 
    extends Object 
    implements GKTurnBasedMatchmakerViewControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("turnBasedMatchmakerViewControllerWasCancelled:")
    public void wasCancelled(GKTurnBasedMatchmakerViewController viewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("turnBasedMatchmakerViewController:didFailWithError:")
    public void didFail(GKTurnBasedMatchmakerViewController viewController, NSError error) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("turnBasedMatchmakerViewController:didFindMatch:")
    public void didFindMatch(GKTurnBasedMatchmakerViewController viewController, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("turnBasedMatchmakerViewController:playerQuitForMatch:")
    public void playerQuit(GKTurnBasedMatchmakerViewController viewController, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    
}
