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

public abstract class NSURLSessionDataDelegateAdapter 
    extends NSURLSessionTaskDelegateAdapter 
    implements NSURLSessionDataDelegate {

    
    
    
    
    
    
    
    @NotImplemented("URLSession:dataTask:didReceiveResponse:completionHandler:")
    public void didReceiveResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSURLResponse response, @Block VoidBlock1<NSURLSessionResponseDisposition> completionHandler) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:dataTask:didBecomeDownloadTask:")
    public void didBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:dataTask:didReceiveData:")
    public void didReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLSession:dataTask:willCacheResponse:completionHandler:")
    public void willCacheResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse, @Block VoidBlock1<NSCachedURLResponse> completionHandler) { throw new UnsupportedOperationException(); }
    
}
