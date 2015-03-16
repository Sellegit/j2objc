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





@Library("Foundation/Foundation.h") @Mapping("NSURLProtocolClient")
public interface NSURLProtocolClient 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("URLProtocol:wasRedirectedToRequest:redirectResponse:")
    void wasRedirectedToRequest(NSURLProtocol protocol, NSURLRequest request, NSURLResponse redirectResponse);
    @Mapping("URLProtocol:cachedResponseIsValid:")
    void cachedResponseIsValid(NSURLProtocol protocol, NSCachedURLResponse cachedResponse);
    @Mapping("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    void didReceiveResponse(NSURLProtocol protocol, NSURLResponse response, @Representing("NSURLCacheStoragePolicy") @MachineSizedUInt long policy);
    @Mapping("URLProtocol:didLoadData:")
    void didLoadData(NSURLProtocol protocol, NSData data);
    @Mapping("URLProtocolDidFinishLoading:")
    void didFinishLoading(NSURLProtocol protocol);
    @Mapping("URLProtocol:didFailWithError:")
    void didFail(NSURLProtocol protocol, NSError error);
    @Mapping("URLProtocol:didReceiveAuthenticationChallenge:")
    void didReceiveAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);
    @Mapping("URLProtocol:didCancelAuthenticationChallenge:")
    void didCancelAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);
    
    /*<adapter>*/
    /*</adapter>*/
}
