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
public abstract class MCBrowserViewControllerDelegateAdapter 
    extends Object 
    implements MCBrowserViewControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("browserViewControllerDidFinish:")
    public void didFinish(MCBrowserViewController browserViewController) { throw new UnsupportedOperationException(); }
    @NotImplemented("browserViewControllerWasCancelled:")
    public void wasCancelled(MCBrowserViewController browserViewController) { throw new UnsupportedOperationException(); }
    @NotImplemented("browserViewController:shouldPresentNearbyPeer:withDiscoveryInfo:")
    public boolean shouldPresentNearbyPeer(MCBrowserViewController browserViewController, MCPeerID peerID, NSDictionary<?, ?> info) { throw new UnsupportedOperationException(); }
    
}
