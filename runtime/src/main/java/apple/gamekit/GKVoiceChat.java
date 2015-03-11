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

@Library("GameKit") @Mapping("GKVoiceChat")
public class GKVoiceChat 
    extends NSObject 
     {

    
    
    public GKVoiceChat() {}
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("playerVoiceChatStateDidChangeHandler")
    public native @Block VoidBlock2<GKPlayer, GKInviteRecipientResponse> getPlayerVoiceChatStateDidChangeHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPlayerVoiceChatStateDidChangeHandler:")
    public native void setPlayerVoiceChatStateDidChangeHandler(@Block VoidBlock2<GKPlayer, GKInviteRecipientResponse> v);
    @Mapping("name")
    public native String getName();
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("volume")
    public native float getVolume();
    @Mapping("setVolume:")
    public native void setVolume(float v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("players")
    public native NSArray<GKPlayer> getPlayers();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playerIDs")
    public native List<String> getPlayerIDs();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playerStateUpdateHandler")
    public native @Block VoidBlock2<String, GKVoiceChatPlayerState> getPlayerStateUpdateHandler();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setPlayerStateUpdateHandler:")
    public native void setPlayerStateUpdateHandler(@Block VoidBlock2<String, GKVoiceChatPlayerState> v);
    
    
    
    @Mapping("start")
    public native void start();
    @Mapping("stop")
    public native void stop();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPlayer:muted:")
    public native void setPlayerMuted(GKPlayer player, boolean isMuted);
    @Mapping("isVoIPAllowed")
    public static native boolean isVoIPAllowed();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setMute:forPlayer:")
    public native void setMuteForPlayer(boolean isMuted, String playerID);
    
}
