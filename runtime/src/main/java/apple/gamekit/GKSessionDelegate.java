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





@Library("GameKit") @Mapping("GKSessionDelegate")
public interface GKSessionDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("session:peer:didChangeState:")
    void didChangeState(GKSession session, String peerID, GKPeerConnectionState state);
    @Mapping("session:didReceiveConnectionRequestFromPeer:")
    void didReceiveConnectionRequest(GKSession session, String peerID);
    @Mapping("session:connectionWithPeerFailed:withError:")
    void connectionWithPeerFailed(GKSession session, String peerID, NSError error);
    @Mapping("session:didFailWithError:")
    void didFail(GKSession session, NSError error);
    
    /*<adapter>*/
    /*</adapter>*/
}
