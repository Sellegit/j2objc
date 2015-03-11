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
@Adapter
public abstract class GKTurnBasedEventHandlerDelegateAdapter 
    extends Object 
    implements GKTurnBasedEventHandlerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @NotImplemented("handleInviteFromGameCenter:")
    public void handleInvite(List<String> playersToInvite) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @NotImplemented("handleTurnEventForMatch:didBecomeActive:")
    public void handleTurnEvent(GKTurnBasedMatch match, boolean didBecomeActive) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("handleTurnEventForMatch:")
    public void handleTurnEvent(GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @NotImplemented("handleMatchEnded:")
    public void handleMatchEnded(GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    
}
