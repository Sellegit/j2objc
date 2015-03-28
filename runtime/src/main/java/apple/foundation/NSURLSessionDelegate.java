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


@Library("Foundation/Foundation.h") @Mapping("NSURLSessionDelegate")
public interface NSURLSessionDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("URLSession:didBecomeInvalidWithError:")
    void didBecomeInvalid(NSURLSession session, NSError error);
    @Mapping("URLSession:didReceiveChallenge:completionHandler:")
    void didReceiveChallenge(NSURLSession session, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("URLSessionDidFinishEventsForBackgroundURLSession:")
    void didFinishEvents(NSURLSession session);

    /*<adapter>*/
    /*</adapter>*/
}
