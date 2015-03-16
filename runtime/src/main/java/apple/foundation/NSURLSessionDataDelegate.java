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





@Library("Foundation/Foundation.h") @Mapping("NSURLSessionDataDelegate")
public interface NSURLSessionDataDelegate 
    extends NSURLSessionTaskDelegate {

    
    
    
    
    
    @Mapping("URLSession:dataTask:didReceiveResponse:completionHandler:")
    void didReceiveResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSURLResponse response, @Block VoidBlock1<NSURLSessionResponseDisposition> completionHandler);
    @Mapping("URLSession:dataTask:didBecomeDownloadTask:")
    void didBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask);
    @Mapping("URLSession:dataTask:didReceiveData:")
    void didReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data);
    @Mapping("URLSession:dataTask:willCacheResponse:completionHandler:")
    void willCacheResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse, @Block VoidBlock1<NSCachedURLResponse> completionHandler);
    
    /*<adapter>*/
    /*</adapter>*/
}
