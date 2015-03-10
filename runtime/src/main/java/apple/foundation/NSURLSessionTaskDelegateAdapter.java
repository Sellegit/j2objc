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

public abstract class NSURLSessionTaskDelegateAdapter 
    extends NSURLSessionDelegateAdapter 
    implements NSURLSessionTaskDelegate {

    
    
    
    
    
    
    
    @NotImplemented("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    public void willPerformHTTPRedirection(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<NSURLRequest> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:task:didReceiveChallenge:completionHandler:")
    public void didReceiveChallenge(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:task:needNewBodyStream:")
    public void needNewBodyStream(NSURLSession session, NSURLSessionTask task, @Block VoidBlock1<NSInputStream> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    public void didSendBodyData(NSURLSession session, NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:task:didCompleteWithError:")
    public void didComplete(NSURLSession session, NSURLSessionTask task, NSError error) { throw new UnsupportedOperationException(); }
    
}
