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





@Library("MultipeerConnectivity") @Mapping("MCNearbyServiceBrowserDelegate")
public interface MCNearbyServiceBrowserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("browser:foundPeer:withDiscoveryInfo:")
    void foundPeer(MCNearbyServiceBrowser browser, MCPeerID peerID, NSDictionary<?, ?> info);
    @Mapping("browser:lostPeer:")
    void lostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID);
    @Mapping("browser:didNotStartBrowsingForPeers:")
    void didNotStartBrowsing(MCNearbyServiceBrowser browser, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
