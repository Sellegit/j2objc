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

@Library("MultipeerConnectivity") @Mapping("MCBrowserViewController")
public class MCBrowserViewController 
    extends UIViewController 
    implements MCNearbyServiceBrowserDelegate {

    
    
    public MCBrowserViewController() {}
    @Mapping("initWithServiceType:session:")
    public MCBrowserViewController(String serviceType, MCSession session) { }
    @Mapping("initWithBrowser:session:")
    public MCBrowserViewController(MCNearbyServiceBrowser browser, MCSession session) { }
    @Mapping("initWithNibName:bundle:")
    public MCBrowserViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native MCBrowserViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(MCBrowserViewControllerDelegate v);
    @Mapping("browser")
    public native MCNearbyServiceBrowser getBrowser();
    @Mapping("session")
    public native MCSession getSession();
    @Mapping("minimumNumberOfPeers")
    public native @MachineSizedUInt long getMinimumNumberOfPeers();
    @Mapping("setMinimumNumberOfPeers:")
    public native void setMinimumNumberOfPeers(@MachineSizedUInt long v);
    @Mapping("maximumNumberOfPeers")
    public native @MachineSizedUInt long getMaximumNumberOfPeers();
    @Mapping("setMaximumNumberOfPeers:")
    public native void setMaximumNumberOfPeers(@MachineSizedUInt long v);
    
    
    
    @Mapping("browser:foundPeer:withDiscoveryInfo:")
    public native void foundPeer(MCNearbyServiceBrowser browser, MCPeerID peerID, Map<String, String> info);
    @Mapping("browser:lostPeer:")
    public native void lostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID);
    @Mapping("browser:didNotStartBrowsingForPeers:")
    public native void didNotStartBrowsing(MCNearbyServiceBrowser browser, NSError error);
    
}
