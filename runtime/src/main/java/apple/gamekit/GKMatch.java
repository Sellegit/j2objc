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

@Library("GameKit/GameKit.h") @Mapping("GKMatch")
public class GKMatch 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GKMatch() { }
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("players")
    public native NSArray<GKPlayer> getPlayers();
    @Mapping("delegate")
    public native GKMatchDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(GKMatchDelegate v);
    @Mapping("expectedPlayerCount")
    public native @MachineSizedUInt long getExpectedPlayerCount();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playerIDs")
    public native List<String> getPlayerIDs();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sendData:toPlayers:dataMode:error:")
    public native boolean sendDataToPlayersDataMode(NSData data, NSArray<?> players, @Representing("GKMatchSendDataMode") long mode, Todo error);
    @Mapping("sendDataToAllPlayers:withDataMode:error:")
    public native boolean sendDataToAllPlayers(NSData data, @Representing("GKMatchSendDataMode") long mode, Todo error);
    @Mapping("disconnect")
    public native void disconnect();
    @Mapping("voiceChatWithName:")
    public native GKVoiceChat getVoiceChat(String name);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("chooseBestHostingPlayerWithCompletionHandler:")
    public native void chooseBestHostingPlayer(@Block VoidBlock1<GKPlayer> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("rematchWithCompletionHandler:")
    public native void rematch(@Block VoidBlock2<GKMatch, NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("chooseBestHostPlayerWithCompletionHandler:")
    public native void chooseBestHostPlayer(@Block VoidBlock1<String> completionHandler);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("sendData:toPlayers:withDataMode:error:")
    public native boolean sendDataToPlayersWithDataMod(NSData data, NSArray<?> playerIDs, @Representing("GKMatchSendDataMode") long mode, Todo error);
    
}
