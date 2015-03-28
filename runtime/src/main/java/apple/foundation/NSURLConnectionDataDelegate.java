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


@Library("Foundation/Foundation.h") @Mapping("NSURLConnectionDataDelegate")
public interface NSURLConnectionDataDelegate 
    extends NSURLConnectionDelegate {

    
    


    
    @Mapping("connection:willSendRequest:redirectResponse:")
    NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response);
    @Mapping("connection:didReceiveResponse:")
    void didReceiveResponse(NSURLConnection connection, NSURLResponse response);
    @Mapping("connection:didReceiveData:")
    void didReceiveData(NSURLConnection connection, NSData data);
    @Mapping("connection:needNewBodyStream:")
    NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request);
    @Mapping("connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite);
    @Mapping("connection:willCacheResponse:")
    NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse);
    @Mapping("connectionDidFinishLoading:")
    void didFinishLoading(NSURLConnection connection);

    /*<adapter>*/
    /*</adapter>*/
}
