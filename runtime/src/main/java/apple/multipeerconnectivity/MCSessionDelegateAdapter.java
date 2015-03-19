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
public abstract class MCSessionDelegateAdapter 
    extends Object 
    implements MCSessionDelegate {

    
    
    
    
    
    
    
    @NotImplemented("session:peer:didChangeState:")
    public void didChangeState(MCSession session, MCPeerID peerID, @Representing("MCSessionState") long state) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didReceiveData:fromPeer:")
    public void didReceiveData(MCSession session, NSData data, MCPeerID peerID) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didReceiveStream:withName:fromPeer:")
    public void didReceiveStream(MCSession session, NSInputStream stream, String streamName, MCPeerID peerID) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didStartReceivingResourceWithName:fromPeer:withProgress:")
    public void didStartReceivingResource(MCSession session, String resourceName, MCPeerID peerID, NSProgress progress) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:")
    public void didFinishReceivingResource(MCSession session, String resourceName, MCPeerID peerID, NSURL localURL, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didReceiveCertificate:fromPeer:certificateHandler:")
    public void didReceiveCertificate(MCSession session, NSArray<?> certificate, MCPeerID peerID, @Block VoidBooleanBlock certificateHandler) { throw new UnsupportedOperationException(); }
    
}
