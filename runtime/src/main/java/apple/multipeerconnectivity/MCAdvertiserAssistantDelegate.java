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





@Library("MultipeerConnectivity") @Mapping("MCAdvertiserAssistantDelegate")
public interface MCAdvertiserAssistantDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("advertiserAssistantWillPresentInvitation:")
    void willPresentInvitation(MCAdvertiserAssistant advertiserAssistant);
    @Mapping("advertiserAssistantDidDismissInvitation:")
    void didDismissInvitation(MCAdvertiserAssistant advertiserAssistant);
    
    /*<adapter>*/
    /*</adapter>*/
}
