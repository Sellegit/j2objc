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





@Library("Foundation/Foundation.h") @Mapping("NSURLAuthenticationChallenge")
public class NSURLAuthenticationChallenge 
    extends NSObject 
     {

    
    
    public NSURLAuthenticationChallenge() {}
    @Mapping("initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:")
    public NSURLAuthenticationChallenge(NSURLProtectionSpace space, NSURLCredential credential, @MachineSizedSInt long previousFailureCount, NSURLResponse response, NSError error, NSURLAuthenticationChallengeSender sender) { }
    @Mapping("initWithAuthenticationChallenge:sender:")
    public NSURLAuthenticationChallenge(NSURLAuthenticationChallenge challenge, NSURLAuthenticationChallengeSender sender) { }
    
    
    @Mapping("protectionSpace")
    public native NSURLProtectionSpace getProtectionSpace();
    @Mapping("proposedCredential")
    public native NSURLCredential getProposedCredential();
    @Mapping("previousFailureCount")
    public native @MachineSizedSInt long getPreviousFailureCount();
    @Mapping("failureResponse")
    public native NSURLResponse getFailureResponse();
    @Mapping("error")
    public native NSError getError();
    @Mapping("sender")
    public native NSURLAuthenticationChallengeSender getSender();
    
    
    
    
    
}
