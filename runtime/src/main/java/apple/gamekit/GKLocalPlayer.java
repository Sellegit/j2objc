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

@Library("GameKit") @Mapping("GKLocalPlayer")
public class GKLocalPlayer 
    extends GKPlayer 
    implements GKSavedGameListener {

    
    
    public GKLocalPlayer() {}
    
    
    @Mapping("isAuthenticated")
    public native boolean isAuthenticated();
    @Mapping("isUnderage")
    public native boolean isUnderage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("authenticateHandler")
    public native @Block VoidBlock2<UIViewController, NSError> getAuthenticateHandler();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAuthenticateHandler:")
    public native void setAuthenticateHandler(@Block VoidBlock2<UIViewController, NSError> v);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("friends")
    public native List<String> getFriends();
    
    
    
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalConstant("GKPlayerAuthenticationDidChangeNotificationName")
    public static native NSString AuthenticationDidChangeNotification();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("loadFriendPlayersWithCompletionHandler:")
    public native void loadFriendPlayers(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDefaultLeaderboardIdentifier:completionHandler:")
    public native void setDefaultLeaderboardIdentifier(String leaderboardIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("loadDefaultLeaderboardIdentifierWithCompletionHandler:")
    public native void loadDefaultLeaderboardIdentifier(@Block VoidBlock2<String, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("generateIdentityVerificationSignatureWithCompletionHandler:")
    public native void generateIdentityVerificationSignature(@Block VoidBlock5<NSURL, NSData, NSData, Long, NSError> completionHandler);
    @Mapping("localPlayer")
    public static native GKLocalPlayer getLocalPlayer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("registerListener:")
    public native void registerListener(GKLocalPlayerListener listener);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("unregisterListener:")
    public native void unregisterListener(GKLocalPlayerListener listener);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("unregisterAllListeners")
    public native void unregisterAllListeners();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setDefaultLeaderboardCategoryID:completionHandler:")
    public native void setDefaultLeaderboardCategoryID(String categoryID, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("loadDefaultLeaderboardCategoryIDWithCompletionHandler:")
    public native void loadDefaultLeaderboardCategoryID(@Block VoidBlock2<String, NSError> completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("loadFriendsWithCompletionHandler:")
    public native void loadFriends(@Block VoidBlock2<NSArray<NSString>, NSError> completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("authenticateWithCompletionHandler:")
    public native void authenticate(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("fetchSavedGamesWithCompletionHandler:")
    public native void fetchSavedGames(@Block VoidBlock2<NSArray<GKSavedGame>, NSError> handler);
    @Mapping("saveGameData:withName:completionHandler:")
    public native void saveGameData(NSData data, String name, @Block VoidBlock2<GKSavedGame, NSError> handler);
    @Mapping("deleteSavedGamesWithName:completionHandler:")
    public native void deleteSavedGames(String name, @Block VoidBlock1<NSError> handler);
    @Mapping("resolveConflictingSavedGames:withData:completionHandler:")
    public native void resolveConflictingSavedGames(NSArray<GKSavedGame> conflictingSavedGames, NSData data, @Block VoidBlock2<NSArray<GKSavedGame>, NSError> handler);
    @Mapping("player:didModifySavedGame:")
    public native void didModifySavedGame(GKPlayer player, GKSavedGame savedGame);
    @Mapping("player:hasConflictingSavedGames:")
    public native void hasConflictingSavedGames(GKPlayer player, NSArray<GKSavedGame> savedGames);
    
}
