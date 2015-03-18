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

@Library("GameKit/GameKit.h") @Mapping("GKPlayer")
public class GKPlayer 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GKPlayer() { }
    
    
    @Mapping("playerID")
    public native String getPlayerID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("displayName")
    public native String getDisplayName();
    @Mapping("alias")
    public native String getAlias();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("isFriend")
    public native boolean isFriend();
    
    
    
    @GlobalConstant("GKPlayerDidChangeNotificationName")
    public static native NSString DidChangeNotification();
    
    @Mapping("loadPlayersForIdentifiers:withCompletionHandler:")
    public static native void loadPlayers(NSArray<?> identifiers, Todo completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("loadPhotoForSize:withCompletionHandler:")
    public native void loadPhoto(@Representing("GKPhotoSize") int size, @Block VoidBlock2<UIImage, NSError> completionHandler);
    
}
