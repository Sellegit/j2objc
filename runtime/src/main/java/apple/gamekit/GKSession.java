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
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit") @Mapping("GKSession")
public class GKSession 
    extends NSObject 
     {

    
    
    public GKSession() {}
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("initWithSessionID:displayName:sessionMode:")
    public GKSession(String sessionID, String name, GKSessionMode mode) { }
    
    
    @Mapping("delegate")
    public native GKSessionDelegate getDelegate();
    public native void setDelegate(GKSessionDelegate v);
    @Mapping("sessionID")
    public native String getSessionID();
    @Mapping("displayName")
    public native String getDisplayName();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sessionMode")
    public native GKSessionMode getSessionMode();
    @Mapping("peerID")
    public native String getPeerID();
    @Mapping("isAvailable")
    public native boolean isAvailable();
    public native void setAvailable(boolean v);
    @Mapping("disconnectTimeout")
    public native double getDisconnectTimeout();
    public native void setDisconnectTimeout(double v);
    
    
    
    @Mapping("displayNameForPeer:")
    public native String getDisplayName(String peerID);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sendData:toPeers:withDataMode:error:")
    protected native boolean sendData(NSData data, List<String> peers, GKSendDataMode mode, Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("sendDataToAllPeers:withDataMode:error:")
    protected native boolean sendDataToAllPeers(NSData data, GKSendDataMode mode, Todo error);
    @Mapping("connectToPeer:withTimeout:")
    public native void connect(String peerID, double timeout);
    @Mapping("cancelConnectToPeer:")
    public native void cancelConnect(String peerID);
    @Mapping("acceptConnectionFromPeer:error:")
    protected native boolean acceptConnection(String peerID, Todo error);
    @Mapping("denyConnectionFromPeer:")
    public native void denyConnection(String peerID);
    @Mapping("disconnectPeerFromAllPeers:")
    public native void disconnectPeer(String peerID);
    @Mapping("disconnectFromAllPeers")
    public native void disconnectFromAllPeers();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("peersWithConnectionState:")
    public native List<String> getPeers(GKPeerConnectionState state);
    
}
