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


@Library("GameKit/GameKit.h") @Mapping("GKMatchDelegate")
public interface GKMatchDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("match:didReceiveData:fromRemotePlayer:")
    void didReceiveData(GKMatch match, NSData data, GKPlayer player);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("match:didReceiveData:fromPlayer:")
    void didReceiveData(GKMatch match, NSData data, String playerID);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("match:player:didChangeConnectionState:")
    void didChangeConnectionState(GKMatch match, GKPlayer player, @Representing("GKPlayerConnectionState") long state);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("match:player:didChangeState:")
    void didChangeState(GKMatch match, String playerID, @Representing("GKPlayerConnectionState") long state);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @Mapping("match:didFailWithError:")
    void didFail(GKMatch match, NSError error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("match:shouldReinviteDisconnectedPlayer:")
    boolean shouldReinviteDisconnectedPlayer(GKMatch match, GKPlayer player);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("match:shouldReinvitePlayer:")
    boolean shouldReinvitePlayer(GKMatch match, String playerID);

    /*<adapter>*/
    /*</adapter>*/
}
