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
@Adapter
public abstract class NSURLProtocolClientAdapter 
    extends Object 
    implements NSURLProtocolClient {

    
    
    
    
    
    
    
    @NotImplemented("URLProtocol:wasRedirectedToRequest:redirectResponse:")
    public void wasRedirectedToRequest(NSURLProtocol protocol, NSURLRequest request, NSURLResponse redirectResponse) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:cachedResponseIsValid:")
    public void cachedResponseIsValid(NSURLProtocol protocol, NSCachedURLResponse cachedResponse) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    public void didReceiveResponse(NSURLProtocol protocol, NSURLResponse response, @Representing("NSURLCacheStoragePolicy") @MachineSizedUInt long policy) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:didLoadData:")
    public void didLoadData(NSURLProtocol protocol, NSData data) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocolDidFinishLoading:")
    public void didFinishLoading(NSURLProtocol protocol) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:didFailWithError:")
    public void didFail(NSURLProtocol protocol, NSError error) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:didReceiveAuthenticationChallenge:")
    public void didReceiveAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    @NotImplemented("URLProtocol:didCancelAuthenticationChallenge:")
    public void didCancelAuthenticationChallenge(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge) { throw new UnsupportedOperationException(); }
    
}
