package apple.gamekit;


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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class GKSessionDelegateAdapter 
    extends Object 
    implements GKSessionDelegate {

    
    
    
    
    
    
    
    @NotImplemented("session:peer:didChangeState:")
    public void didChangeState(GKSession session, String peerID, GKPeerConnectionState state) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didReceiveConnectionRequestFromPeer:")
    public void didReceiveConnectionRequest(GKSession session, String peerID) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:connectionWithPeerFailed:withError:")
    public void connectionWithPeerFailed(GKSession session, String peerID, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("session:didFailWithError:")
    public void didFail(GKSession session, NSError error) { throw new UnsupportedOperationException(); }
    
}
