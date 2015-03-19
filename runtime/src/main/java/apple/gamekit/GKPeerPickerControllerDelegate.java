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





@Library("GameKit/GameKit.h") @Mapping("GKPeerPickerControllerDelegate")
public interface GKPeerPickerControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("peerPickerController:didSelectConnectionType:")
    void didSelectConnectionType(GKPeerPickerController picker, @Representing("GKPeerPickerConnectionType") long type);
    @Mapping("peerPickerController:sessionForConnectionType:")
    GKSession getSession(GKPeerPickerController picker, @Representing("GKPeerPickerConnectionType") long type);
    @Mapping("peerPickerController:didConnectPeer:toSession:")
    void didConnectPeer(GKPeerPickerController picker, String peerID, GKSession session);
    @Mapping("peerPickerControllerDidCancel:")
    void didCancel(GKPeerPickerController picker);
    
    /*<adapter>*/
    /*</adapter>*/
}
