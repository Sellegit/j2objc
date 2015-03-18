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

@Library("MultipeerConnectivity/MultipeerConnectivity.h") @Mapping("MCNearbyServiceAdvertiser")
public class MCNearbyServiceAdvertiser 
    extends NSObject 
     {

    
    
    @Mapping("initWithPeer:discoveryInfo:serviceType:")
    public MCNearbyServiceAdvertiser(MCPeerID myPeerID, NSDictionary<?, ?> info, String serviceType) { }
    @Mapping("init")
    public MCNearbyServiceAdvertiser() { }
    
    
    @Mapping("delegate")
    public native MCNearbyServiceAdvertiserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MCNearbyServiceAdvertiserDelegate v);
    @Mapping("myPeerID")
    public native MCPeerID getMyPeerID();
    @Mapping("discoveryInfo")
    public native Map<String, String> getDiscoveryInfo();
    @Mapping("serviceType")
    public native String getServiceType();
    
    
    
    @Mapping("startAdvertisingPeer")
    public native void startAdvertisingPeer();
    @Mapping("stopAdvertisingPeer")
    public native void stopAdvertisingPeer();
    
}
