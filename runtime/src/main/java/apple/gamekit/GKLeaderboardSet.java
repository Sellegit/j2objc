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
 * @since Available in iOS 7.0 and later.
 */

@Library("GameKit/GameKit.h") @Mapping("GKLeaderboardSet")
public class GKLeaderboardSet 
    extends NSObject 
    implements NSCoding {

    
    
    public GKLeaderboardSet() {}
    
    
    @Mapping("title")
    public native String getTitle();
    @Mapping("groupIdentifier")
    public native String getGroupIdentifier();
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("loadLeaderboardsWithCompletionHandler:")
    public native void loadLeaderboards(Todo completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("loadLeaderboardSetsWithCompletionHandler:")
    public static native void loadLeaderboardSets(Todo completionHandler);
    @Mapping("loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
