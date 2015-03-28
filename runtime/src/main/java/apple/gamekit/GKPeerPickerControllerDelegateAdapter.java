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
public abstract class GKPeerPickerControllerDelegateAdapter 
    extends Object 
    implements GKPeerPickerControllerDelegate {

    
    
    


    
    
    @NotImplemented("peerPickerController:didSelectConnectionType:")
    public void didSelectConnectionType(GKPeerPickerController picker, @Representing("GKPeerPickerConnectionType") long type) { throw new UnsupportedOperationException(); }
    @NotImplemented("peerPickerController:sessionForConnectionType:")
    public GKSession getSession(GKPeerPickerController picker, @Representing("GKPeerPickerConnectionType") long type) { throw new UnsupportedOperationException(); }
    @NotImplemented("peerPickerController:didConnectPeer:toSession:")
    public void didConnectPeer(GKPeerPickerController picker, String peerID, GKSession session) { throw new UnsupportedOperationException(); }
    @NotImplemented("peerPickerControllerDidCancel:")
    public void didCancel(GKPeerPickerController picker) { throw new UnsupportedOperationException(); }

}
