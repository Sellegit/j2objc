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

@Library("GameKit/GameKit.h") @Mapping("GKAchievementDescription")
public class GKAchievementDescription 
    extends NSObject 
    implements NSCoding {

    
    
    @Mapping("init")
    public GKAchievementDescription() { }
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("groupIdentifier")
    public native String getGroupIdentifier();
    @Mapping("title")
    public native String getTitle();
    @Mapping("achievedDescription")
    public native String getAchievedDescription();
    @Mapping("unachievedDescription")
    public native String getUnachievedDescription();
    @Mapping("maximumPoints")
    public native @MachineSizedSInt long getMaximumPoints();
    @Mapping("isHidden")
    public native boolean isHidden();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("isReplayable")
    public native boolean isReplayable();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("image")
    public native UIImage getImage();
    
    
    
    @Mapping("loadAchievementDescriptionsWithCompletionHandler:")
    public static native void loadAchievementDescriptions(Todo completionHandler);
    @Mapping("loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    @Mapping("incompleteAchievementImage")
    public static native UIImage getIncompleteAchievementImage();
    @Mapping("placeholderCompletedAchievementImage")
    public static native UIImage getPlaceholderCompletedAchievementImage();
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
