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





@Library("GameKit") @Mapping("GKInviteEventListener")
public interface GKInviteEventListener 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:didAcceptInvite:")
    void didAcceptInvite(GKPlayer player, GKInvite invite);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("player:didRequestMatchWithRecipients:")
    void didRequestMatch(GKPlayer player, NSArray<GKPlayer> recipientPlayers);
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
