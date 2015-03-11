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

public abstract class NSURLAuthenticationChallengeSenderAdapter 
    extends Object 
    implements NSURLAuthenticationChallengeSender {

    
    
    
    
    
    
    
    @NotImplemented("useCredential:forAuthenticationChallenge:")
    public void useCredential(NSURLCredential credential, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    @NotImplemented("continueWithoutCredentialForAuthenticationChallenge:")
    public void continueWithoutCredential(NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    @NotImplemented("cancelAuthenticationChallenge:")
    public void cancel(NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    @NotImplemented("performDefaultHandlingForAuthenticationChallenge:")
    public void performDefaultHandling(NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    @NotImplemented("rejectProtectionSpaceAndContinueWithChallenge:")
    public void rejectProtectionSpaceAndContinue(NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    
}
