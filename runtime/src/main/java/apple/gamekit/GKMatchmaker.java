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
 * @since Available in iOS 4.1 and later.
 */
@Library("GameKit/GameKit.h") @Mapping("GKMatchmaker")
public class GKMatchmaker 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GKMatchmaker() { }

    
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("inviteHandler")
    public native @Block VoidBlock2<GKInvite, NSArray<NSString>> getInviteHandler();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setInviteHandler:")
    public native void setInviteHandler(@Block VoidBlock2<GKInvite, NSArray<NSString>> v);

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("matchForInvite:completionHandler:")
    public native void match(GKInvite invite, @Block VoidBlock2<GKMatch, NSError> completionHandler);
    @Mapping("findMatchForRequest:withCompletionHandler:")
    public native void findMatch(GKMatchRequest request, @Block VoidBlock2<GKMatch, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("findPlayersForHostedRequest:withCompletionHandler:")
    public native void findPlayersForHostedRequest(GKMatchRequest request, Todo completionHandler);
    @Mapping("addPlayersToMatch:matchRequest:completionHandler:")
    public native void addPlayersToMatch(GKMatch match, GKMatchRequest matchRequest, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("cancel")
    public native void cancel();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("cancelPendingInviteToPlayer:")
    public native void cancelPendingInvite(GKPlayer player);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("finishMatchmakingForMatch:")
    public native void finishMatchmaking(GKMatch match);
    @Mapping("queryPlayerGroupActivity:withCompletionHandler:")
    public native void queryPlayerGroupActivity(@MachineSizedUInt long playerGroup, @Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> completionHandler);
    @Mapping("queryActivityWithCompletionHandler:")
    public native void queryActivity(@Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("startBrowsingForNearbyPlayersWithHandler:")
    public native void startNearbyPlayersBrowsing(@Block VoidBlock2<GKPlayer, Boolean> reachableHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("stopBrowsingForNearbyPlayers")
    public native void stopBrowsingForNearbyPlayers();
    @Mapping("sharedMatchmaker")
    public static native GKMatchmaker getSharedMatchmaker();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("startBrowsingForNearbyPlayersWithReachableHandler:")
    public native void startBrowsingForNearbyPlayers(@Block VoidBlock2<String, Boolean> reachableHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("cancelInviteToPlayer:")
    public native void cancelInvite(String playerID);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("findPlayersForHostedMatchRequest:withCompletionHandler:")
    public native void findPlayers(GKMatchRequest request, Todo completionHandler);

}
