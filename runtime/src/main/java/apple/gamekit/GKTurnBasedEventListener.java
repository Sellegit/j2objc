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





@Library("GameKit") @Mapping("GKTurnBasedEventListener")
public interface GKTurnBasedEventListener 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("player:didRequestMatchWithOtherPlayers:")
    void didRequestMatch(GKPlayer player, NSArray<GKPlayer> playersToInvite);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:receivedTurnEventForMatch:didBecomeActive:")
    void receivedTurnEvent(GKPlayer player, GKTurnBasedMatch match, boolean didBecomeActive);
    @Mapping("player:matchEnded:")
    void matchEnded(GKPlayer player, GKTurnBasedMatch match);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:receivedExchangeRequest:forMatch:")
    void receivedExchangeRequest(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:receivedExchangeCancellation:forMatch:")
    void receivedExchangeCancellation(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:receivedExchangeReplies:forCompletedExchange:forMatch:")
    void receivedExchangeReplies(GKPlayer player, NSArray<GKTurnBasedExchange> replies, GKTurnBasedExchange exchange, GKTurnBasedMatch match);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("player:didRequestMatchWithPlayers:")
    void didRequestMatch(GKPlayer player, List<String> playerIDsToInvite);
    
    /*<adapter>*/
    /*</adapter>*/
}
