package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class NSURLConnectionDelegateAdapter 
    extends Object 
    implements NSURLConnectionDelegate {

    
    
    
    
    
    
    
    @NotImplemented("connection:didFailWithError:")
    public void didFail(NSURLConnection connection, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("connectionShouldUseCredentialStorage:")
    public boolean shouldUseCredentialStorage(NSURLConnection connection) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:willSendRequestForAuthenticationChallenge:")
    public void willSendRequestForAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("connection:canAuthenticateAgainstProtectionSpace:")
    public boolean canAuthenticateAgainstProtectionSpace(NSURLConnection connection, NSURLProtectionSpace protectionSpace) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("connection:didReceiveAuthenticationChallenge:")
    public void didReceiveAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("connection:didCancelAuthenticationChallenge:")
    public void didCancelAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    
}
