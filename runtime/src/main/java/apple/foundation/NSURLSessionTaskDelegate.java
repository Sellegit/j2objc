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


@Library("Foundation/Foundation.h") @Mapping("NSURLSessionTaskDelegate")
public interface NSURLSessionTaskDelegate 
    extends NSURLSessionDelegate {

    
    


    
    @Mapping("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    void willPerformHTTPRedirection(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<NSURLRequest> completionHandler);
    @Mapping("URLSession:task:didReceiveChallenge:completionHandler:")
    void didReceiveChallenge(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Mapping("URLSession:task:needNewBodyStream:")
    void needNewBodyStream(NSURLSession session, NSURLSessionTask task, @Block VoidBlock1<NSInputStream> completionHandler);
    @Mapping("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    void didSendBodyData(NSURLSession session, NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend);
    @Mapping("URLSession:task:didCompleteWithError:")
    void didComplete(NSURLSession session, NSURLSessionTask task, NSError error);

    /*<adapter>*/
    /*</adapter>*/
}
