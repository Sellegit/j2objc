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
public abstract class MCAdvertiserAssistantDelegateAdapter 
    extends Object 
    implements MCAdvertiserAssistantDelegate {

    
    
    


    
    
    @NotImplemented("advertiserAssistantWillPresentInvitation:")
    public void willPresentInvitation(MCAdvertiserAssistant advertiserAssistant) { throw new UnsupportedOperationException(); }
    @NotImplemented("advertiserAssistantDidDismissInvitation:")
    public void didDismissInvitation(MCAdvertiserAssistant advertiserAssistant) { throw new UnsupportedOperationException(); }

}
