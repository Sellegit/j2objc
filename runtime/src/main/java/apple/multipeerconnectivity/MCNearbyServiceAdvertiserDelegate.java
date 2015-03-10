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





@Library("MultipeerConnectivity") @Mapping("MCNearbyServiceAdvertiserDelegate")
public interface MCNearbyServiceAdvertiserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("advertiser:didReceiveInvitationFromPeer:withContext:invitationHandler:")
    void didReceiveInvitation(MCNearbyServiceAdvertiser advertiser, MCPeerID peerID, NSData context, @Block VoidBlock2<Boolean, MCSession> invitationHandler);
    @Mapping("advertiser:didNotStartAdvertisingPeer:")
    void didNotStart(MCNearbyServiceAdvertiser advertiser, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
