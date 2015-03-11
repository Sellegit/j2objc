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
public abstract class NSURLConnectionDataDelegateAdapter 
    extends NSURLConnectionDelegateAdapter 
    implements NSURLConnectionDataDelegate {

    
    
    
    
    
    
    
    @NotImplemented("connection:willSendRequest:redirectResponse:")
    public NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:didReceiveResponse:")
    public void didReceiveResponse(NSURLConnection connection, NSURLResponse response) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:didReceiveData:")
    public void didReceiveData(NSURLConnection connection, NSData data) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:needNewBodyStream:")
    public NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    public void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite) { throw new UnsupportedOperationException(); }
    @NotImplemented("connection:willCacheResponse:")
    public NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse) { throw new UnsupportedOperationException(); }
    @NotImplemented("connectionDidFinishLoading:")
    public void didFinishLoading(NSURLConnection connection) { throw new UnsupportedOperationException(); }
    
}
