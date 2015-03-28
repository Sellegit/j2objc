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
@Library("GameKit/GameKit.h") @Mapping("GKScore")
public class GKScore 
    extends NSObject 
    implements NSCoding {

    
    
    @Mapping("initWithLeaderboardIdentifier:")
    public GKScore(String identifier) { }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithLeaderboardIdentifier:player:")
    public GKScore(String identifier, GKPlayer player) { }
    @Mapping("init")
    public GKScore() { }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("initWithLeaderboardIdentifier:forPlayer:")
    public GKScore(String identifier, String playerID) { }

    
    @Mapping("value")
    public native long getValue();
    @Mapping("setValue:")
    public native void setValue(long v);
    @Mapping("formattedValue")
    public native String getFormattedValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("leaderboardIdentifier")
    public native String getLeaderboardIdentifier();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("context")
    public native long getContext();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setContext:")
    public native void setContext(long v);
    @Mapping("date")
    public native NSDate getDate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("player")
    public native GKPlayer getPlayer();
    @Mapping("rank")
    public native @MachineSizedSInt long getRank();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("shouldSetDefaultLeaderboard")
    public native boolean shouldSetDefaultLeaderboard();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setShouldSetDefaultLeaderboard:")
    public native void setShouldSetDefaultLeaderboard(boolean v);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playerID")
    public native String getPlayerID();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("category")
    public native String getCategory();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setCategory:")
    public native void setCategory(String v);

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("reportScores:withCompletionHandler:")
    public static native void reportScores(NSArray<?> scores, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("reportScoreWithCompletionHandler:")
    public native void reportScore(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayers(NSArray<?> playerIDs, String message);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("reportScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportScores(NSArray<?> scores, NSArray<?> challenges, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
