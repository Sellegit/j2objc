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
 * @since Available in iOS 5.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit") @Mapping("GKTurnBasedEventHandlerDelegate")
public interface GKTurnBasedEventHandlerDelegate 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("handleInviteFromGameCenter:")
    void handleInvite(List<String> playersToInvite);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("handleTurnEventForMatch:didBecomeActive:")
    void handleTurnEvent(GKTurnBasedMatch match, boolean didBecomeActive);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("handleTurnEventForMatch:")
    void handleTurnEvent(GKTurnBasedMatch match);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("handleMatchEnded:")
    void handleMatchEnded(GKTurnBasedMatch match);
    
    /*<adapter>*/
    /*</adapter>*/
}
