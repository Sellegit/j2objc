package apple.pushkit;


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
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class PKPushRegistryDelegateAdapter 
    extends Object 
    implements PKPushRegistryDelegate {

    
    
    
    
    
    
    
    @NotImplemented("pushRegistry:didUpdatePushCredentials:forType:")
    public void didUpdatePushCredentials(PKPushRegistry registry, PKPushCredentials credentials, String type) { throw new UnsupportedOperationException(); }
    @NotImplemented("pushRegistry:didReceiveIncomingPushWithPayload:forType:")
    public void didReceiveIncomingPush(PKPushRegistry registry, PKPushPayload payload, String type) { throw new UnsupportedOperationException(); }
    @NotImplemented("pushRegistry:didInvalidatePushTokenForType:")
    public void didInvalidatePushToken(PKPushRegistry registry, String type) { throw new UnsupportedOperationException(); }
    
}
