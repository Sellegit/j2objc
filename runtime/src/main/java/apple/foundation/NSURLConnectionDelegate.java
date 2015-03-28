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


@Library("Foundation/Foundation.h") @Mapping("NSURLConnectionDelegate")
public interface NSURLConnectionDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("connection:didFailWithError:")
    void didFail(NSURLConnection connection, NSError error);
    @Mapping("connectionShouldUseCredentialStorage:")
    boolean shouldUseCredentialStorage(NSURLConnection connection);
    @Mapping("connection:willSendRequestForAuthenticationChallenge:")
    void willSendRequestForAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("connection:canAuthenticateAgainstProtectionSpace:")
    boolean canAuthenticateAgainstProtectionSpace(NSURLConnection connection, NSURLProtectionSpace protectionSpace);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("connection:didReceiveAuthenticationChallenge:")
    void didReceiveAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("connection:didCancelAuthenticationChallenge:")
    void didCancelAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);

    /*<adapter>*/
    /*</adapter>*/
}
