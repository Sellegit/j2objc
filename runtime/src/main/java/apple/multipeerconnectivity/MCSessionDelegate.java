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





@Library("MultipeerConnectivity") @Mapping("MCSessionDelegate")
public interface MCSessionDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("session:peer:didChangeState:")
    void didChangeState(MCSession session, MCPeerID peerID, @Representing("MCSessionState") @MachineSizedSInt long state);
    @Mapping("session:didReceiveData:fromPeer:")
    void didReceiveData(MCSession session, NSData data, MCPeerID peerID);
    @Mapping("session:didReceiveStream:withName:fromPeer:")
    void didReceiveStream(MCSession session, NSInputStream stream, String streamName, MCPeerID peerID);
    @Mapping("session:didStartReceivingResourceWithName:fromPeer:withProgress:")
    void didStartReceivingResource(MCSession session, String resourceName, MCPeerID peerID, NSProgress progress);
    @Mapping("session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:")
    void didFinishReceivingResource(MCSession session, String resourceName, MCPeerID peerID, NSURL localURL, NSError error);
    @Mapping("session:didReceiveCertificate:fromPeer:certificateHandler:")
    void didReceiveCertificate(MCSession session, List<SecIdentity> certificate, MCPeerID peerID, @Block VoidBooleanBlock certificateHandler);
    
    /*<adapter>*/
    /*</adapter>*/
}
