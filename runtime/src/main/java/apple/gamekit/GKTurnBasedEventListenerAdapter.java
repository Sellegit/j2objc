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
public abstract class GKTurnBasedEventListenerAdapter 
    extends Object 
    implements GKTurnBasedEventListener {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("player:didRequestMatchWithOtherPlayers:")
    public void didRequestMatchWithOtherPlayers(GKPlayer player, NSArray<?> playersToInvite) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:receivedTurnEventForMatch:didBecomeActive:")
    public void receivedTurnEvent(GKPlayer player, GKTurnBasedMatch match, boolean didBecomeActive) { throw new UnsupportedOperationException(); }
    @NotImplemented("player:matchEnded:")
    public void matchEnded(GKPlayer player, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:receivedExchangeRequest:forMatch:")
    public void receivedExchangeRequest(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:receivedExchangeCancellation:forMatch:")
    public void receivedExchangeCancellation(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("player:receivedExchangeReplies:forCompletedExchange:forMatch:")
    public void receivedExchangeReplies(GKPlayer player, NSArray<?> replies, GKTurnBasedExchange exchange, GKTurnBasedMatch match) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("player:didRequestMatchWithPlayers:")
    public void didRequestMatchWithPlayers(GKPlayer player, NSArray<?> playerIDsToInvite) { throw new UnsupportedOperationException(); }
    
}
