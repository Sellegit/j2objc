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





@Library("MultipeerConnectivity") @Mapping("MCBrowserViewControllerDelegate")
public interface MCBrowserViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("browserViewControllerDidFinish:")
    void didFinish(MCBrowserViewController browserViewController);
    @Mapping("browserViewControllerWasCancelled:")
    void wasCancelled(MCBrowserViewController browserViewController);
    @Mapping("browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:")
    boolean shouldPresentNearbyPeer(MCBrowserViewController browserViewController, MCPeerID peerID, Map<String, String> info);
    
    /*<adapter>*/
    /*</adapter>*/
}
