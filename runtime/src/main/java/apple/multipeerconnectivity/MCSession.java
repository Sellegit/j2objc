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

@Library("MultipeerConnectivity") @Mapping("MCSession")
public class MCSession 
    extends NSObject 
     {

    
    
    public MCSession() {}
    @Mapping("initWithPeer:")
    public MCSession(MCPeerID myPeerID) { }
    @Mapping("initWithPeer:securityIdentity:encryptionPreference:")
    public MCSession(MCPeerID myPeerID, List<SecIdentity> identity, @Representing("MCEncryptionPreference") @MachineSizedSInt long encryptionPreference) { }
    
    
    @Mapping("delegate")
    public native MCSessionDelegate getDelegate();
    public native void setDelegate(MCSessionDelegate v);
    @Mapping("myPeerID")
    public native MCPeerID getMyPeerID();
    @Mapping("securityIdentity")
    public native List<SecIdentity> getSecurityIdentity();
    @Mapping("encryptionPreference")
    public native @Representing("MCEncryptionPreference") @MachineSizedSInt long getEncryptionPreference();
    @Mapping("connectedPeers")
    public native NSArray<MCPeerID> getConnectedPeers();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kMCSessionMinimumNumberOfPeers")
    public static native @MachineSizedUInt long getMinimumNumberOfPeers();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("kMCSessionMaximumNumberOfPeers")
    public static native @MachineSizedUInt long getMaximumNumberOfPeers();
    
    @Mapping("sendData:toPeers:withMode:error:")
    protected native boolean sendData(NSData data, NSArray<MCPeerID> peerIDs, @Representing("MCSessionSendDataMode") @MachineSizedSInt long mode, Todo error);
    @Mapping("disconnect")
    public native void disconnect();
    @Mapping("sendResourceAtURL:withName:toPeer:withCompletionHandler:")
    public native NSProgress sendResource(NSURL resourceURL, String resourceName, MCPeerID peerID, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("startStreamWithName:toPeer:error:")
    protected native NSOutputStream startStream(String streamName, MCPeerID peerID, Todo error);
    @Mapping("nearbyConnectionDataForPeer:withCompletionHandler:")
    public native void requestNearbyConnectionData(MCPeerID peerID, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Mapping("connectPeer:withNearbyConnectionData:")
    public native void connectPeer(MCPeerID peerID, NSData data);
    @Mapping("cancelConnectPeer:")
    public native void cancelConnectPeer(MCPeerID peerID);
    
}
