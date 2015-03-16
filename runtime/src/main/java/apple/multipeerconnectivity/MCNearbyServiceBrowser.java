package apple.multipeerconnectivity;


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
import apple.security.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("MultipeerConnectivity/MultipeerConnectivity.h") @Mapping("MCNearbyServiceBrowser")
public class MCNearbyServiceBrowser 
    extends NSObject 
     {

    
    
    public MCNearbyServiceBrowser() {}
    @Mapping("initWithPeer:serviceType:")
    public MCNearbyServiceBrowser(MCPeerID myPeerID, String serviceType) { }
    
    
    @Mapping("delegate")
    public native MCNearbyServiceBrowserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MCNearbyServiceBrowserDelegate v);
    @Mapping("myPeerID")
    public native MCPeerID getMyPeerID();
    @Mapping("serviceType")
    public native String getServiceType();
    
    
    
    @Mapping("startBrowsingForPeers")
    public native void startBrowsing();
    @Mapping("stopBrowsingForPeers")
    public native void stopBrowsing();
    @Mapping("invitePeer:toSession:withContext:timeout:")
    public native void invitePeer(MCPeerID peerID, MCSession session, NSData context, double timeout);
    
}
