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

@Library("GameKit") @Mapping("GKMatchRequest")
public class GKMatchRequest 
    extends NSObject 
     {

    
    
    public GKMatchRequest() {}
    
    
    @Mapping("minPlayers")
    public native @MachineSizedUInt long getMinPlayers();
    public native void setMinPlayers(@MachineSizedUInt long v);
    @Mapping("maxPlayers")
    public native @MachineSizedUInt long getMaxPlayers();
    public native void setMaxPlayers(@MachineSizedUInt long v);
    @Mapping("playerGroup")
    public native @MachineSizedUInt long getPlayerGroup();
    public native void setPlayerGroup(@MachineSizedUInt long v);
    @Mapping("playerAttributes")
    public native int getPlayerAttributes();
    public native void setPlayerAttributes(int v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("recipients")
    public native NSArray<GKPlayer> getRecipients();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setRecipients(NSArray<GKPlayer> v);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("playersToInvite")
    public native List<String> getPlayersToInvite();
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    public native void setPlayersToInvite(List<String> v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("inviteMessage")
    public native String getInviteMessage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    public native void setInviteMessage(String v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("defaultNumberOfPlayers")
    public native @MachineSizedUInt long getDefaultNumberOfPlayers();
    /**
     * @since Available in iOS 6.0 and later.
     */
    public native void setDefaultNumberOfPlayers(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("recipientResponseHandler")
    public native @Block VoidBlock2<GKPlayer, GKInviteRecipientResponse> getRecipientResponseHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setRecipientResponseHandler(@Block VoidBlock2<GKPlayer, GKInviteRecipientResponse> v);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("inviteeResponseHandler")
    public native @Block VoidBlock2<String, GKInviteeResponse> getInviteeResponseHandler();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    public native void setInviteeResponseHandler(@Block VoidBlock2<String, GKInviteeResponse> v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("maxPlayersAllowedForMatchOfType:")
    public static native @MachineSizedUInt long getMaxPlayersAllowedForMatchType(@Representing("GKMatchType") @MachineSizedUInt long matchType);
    
}
