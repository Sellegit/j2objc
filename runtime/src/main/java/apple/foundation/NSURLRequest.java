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





@Library("Foundation/Foundation.h") @Mapping("NSURLRequest")
public class NSURLRequest 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithURL:")
    public NSURLRequest(NSURL URL) { }
    @Mapping("initWithURL:cachePolicy:timeoutInterval:")
    public NSURLRequest(NSURL URL, @Representing("NSURLRequestCachePolicy") long cachePolicy, double timeoutInterval) { }
    @Mapping("init")
    public NSURLRequest() { }
    
    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("cachePolicy")
    public native @Representing("NSURLRequestCachePolicy") long getCachePolicy();
    @Mapping("timeoutInterval")
    public native double getTimeoutInterval();
    @Mapping("mainDocumentURL")
    public native NSURL getMainDocumentURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("networkServiceType")
    public native @Representing("NSURLRequestNetworkServiceType") long getNetworkServiceType();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Mapping("HTTPMethod")
    public native String getHTTPMethod();
    @Mapping("allHTTPHeaderFields")
    public native Map<String, String> getAllHTTPHeaderFields();
    @Mapping("HTTPBody")
    public native NSData getHTTPBody();
    @Mapping("HTTPBodyStream")
    public native NSInputStream getHTTPBodyStream();
    @Mapping("HTTPShouldHandleCookies")
    public native boolean shouldHandleHTTPCookies();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    
    
    
    @Mapping("supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Mapping("valueForHTTPHeaderField:")
    public native String getHTTPHeaderFieldValue(String field);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
