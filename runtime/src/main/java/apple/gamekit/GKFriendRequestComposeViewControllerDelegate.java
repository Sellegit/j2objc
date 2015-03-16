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





@Library("GameKit/GameKit.h") @Mapping("GKFriendRequestComposeViewControllerDelegate")
public interface GKFriendRequestComposeViewControllerDelegate 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("friendRequestComposeViewControllerDidFinish:")
    void didFinish(GKFriendRequestComposeViewController viewController);
    
    /*<adapter>*/
    /*</adapter>*/
}
