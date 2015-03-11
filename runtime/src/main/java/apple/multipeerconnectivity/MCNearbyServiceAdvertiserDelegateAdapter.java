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
public abstract class MCNearbyServiceAdvertiserDelegateAdapter 
    extends Object 
    implements MCNearbyServiceAdvertiserDelegate {

    
    
    
    
    
    
    
    @NotImplemented("advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:")
    public void didReceiveInvitation(MCNearbyServiceAdvertiser advertiser, MCPeerID peerID, NSData context, @Block VoidBlock2<Boolean, MCSession> invitationHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("advertiser:didNotStartAdvertisingPeer:")
    public void didNotStart(MCNearbyServiceAdvertiser advertiser, NSError error) { throw new UnsupportedOperationException(); }
    
}
