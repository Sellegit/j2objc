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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class MCNearbyServiceBrowserDelegateAdapter 
    extends Object 
    implements MCNearbyServiceBrowserDelegate {

    
    
    
    
    
    
    
    @NotImplemented("browser:foundPeer:withDiscoveryInfo:")
    public void foundPeer(MCNearbyServiceBrowser browser, MCPeerID peerID, Map<String, String> info) { throw new UnsupportedOperationException(); }
    @NotImplemented("browser:lostPeer:")
    public void lostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID) { throw new UnsupportedOperationException(); }
    @NotImplemented("browser:didNotStartBrowsingForPeers:")
    public void didNotStartBrowsing(MCNearbyServiceBrowser browser, NSError error) { throw new UnsupportedOperationException(); }
    
}
