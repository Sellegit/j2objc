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

@Library("GameKit/GameKit.h") @Mapping("GKLeaderboard")
public class GKLeaderboard 
    extends NSObject 
     {

    
    
    public GKLeaderboard() {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithPlayers:")
    public GKLeaderboard(NSArray<?> players) { }
    
    
    @Mapping("timeScope")
    public native @Representing("GKLeaderboardTimeScope") @MachineSizedSInt long getTimeScope();
    @Mapping("setTimeScope:")
    public native void setTimeScope(@Representing("GKLeaderboardTimeScope") @MachineSizedSInt long v);
    @Mapping("playerScope")
    public native @Representing("GKLeaderboardPlayerScope") @MachineSizedSInt long getPlayerScope();
    @Mapping("setPlayerScope:")
    public native void setPlayerScope(@Representing("GKLeaderboardPlayerScope") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("range")
    public native NSRange getRange();
    @Mapping("setRange:")
    public native void setRange(NSRange v);
    @Mapping("scores")
    public native NSArray<GKScore> getScores();
    @Mapping("maxRange")
    public native @MachineSizedUInt long getMaxRange();
    @Mapping("localPlayerScore")
    public native GKScore getLocalPlayerScore();
    @Mapping("isLoading")
    public native boolean isLoading();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("groupIdentifier")
    public native String getGroupIdentifier();
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
    
    
    
    @Mapping("loadScoresWithCompletionHandler:")
    public native void loadScores(Todo completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("loadLeaderboardsWithCompletionHandler:")
    public static native void loadLeaderboards(Todo completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("loadCategoriesWithCompletionHandler:")
    public static native void loadCategories(@Block VoidBlock3<NSArray<NSString>, NSArray<NSString>, NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setDefaultLeaderboard:withCompletionHandler:")
    public static native void setDefaultLeaderboard(String leaderboardIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    
}
