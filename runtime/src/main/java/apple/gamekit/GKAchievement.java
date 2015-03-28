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
@Library("GameKit/GameKit.h") @Mapping("GKAchievement")
public class GKAchievement 
    extends NSObject 
    implements NSCoding {

    
    
    @Mapping("initWithIdentifier:")
    public GKAchievement(String identifier) { }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithIdentifier:player:")
    public GKAchievement(String identifier, GKPlayer player) { }
    @Mapping("init")
    public GKAchievement() { }
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("initWithIdentifier:forPlayer:")
    public GKAchievement(String identifier, String playerID) { }

    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    @Mapping("percentComplete")
    public native double getPercentComplete();
    @Mapping("setPercentComplete:")
    public native void setPercentComplete(double v);
    @Mapping("isCompleted")
    public native boolean isCompleted();
    @Mapping("lastReportedDate")
    public native NSDate getLastReportedDate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("showsCompletionBanner")
    public native boolean showsCompletionBanner();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setShowsCompletionBanner:")
    public native void setShowsCompletionBanner(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("player")
    public native GKPlayer getPlayer();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("isHidden")
    public native boolean isHidden();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playerID")
    public native String getPlayerID();

    
    
    @Mapping("loadAchievementsWithCompletionHandler:")
    public static native void loadAchievements(Todo completionHandler);
    @Mapping("resetAchievementsWithCompletionHandler:")
    public static native void resetAchievements(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("reportAchievements:withCompletionHandler:")
    public static native void reportAchievements(NSArray<?> achievements, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("reportAchievementWithCompletionHandler:")
    public native void reportAchievement(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayers(NSArray<?> playerIDs, String message);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("selectChallengeablePlayers:withCompletionHandler:")
    public native void selectChallengeablePlayers(NSArray<?> players, Todo completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("reportAchievements:withEligibleChallenges:withCompletionHandler:")
    public static native void reportAchievements(NSArray<?> achievements, NSArray<?> challenges, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("selectChallengeablePlayerIDs:withCompletionHandler:")
    public native void selectChallengeablePlayerIDs(NSArray<?> playerIDs, Todo completionHandler);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
