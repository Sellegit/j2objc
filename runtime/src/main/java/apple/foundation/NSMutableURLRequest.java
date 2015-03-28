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


@Library("Foundation/Foundation.h") @Mapping("NSMutableURLRequest")
public class NSMutableURLRequest 
    extends NSURLRequest 
     {

    
    
    @Mapping("initWithURL:")
    public NSMutableURLRequest(NSURL URL) { }
    @Mapping("initWithURL:cachePolicy:timeoutInterval:")
    public NSMutableURLRequest(NSURL URL, @Representing("NSURLRequestCachePolicy") long cachePolicy, double timeoutInterval) { }
    @Mapping("init")
    public NSMutableURLRequest() { }

    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("setURL:")
    public native void setURL(NSURL v);
    @Mapping("cachePolicy")
    public native @Representing("NSURLRequestCachePolicy") long getCachePolicy();
    @Mapping("setCachePolicy:")
    public native void setCachePolicy(@Representing("NSURLRequestCachePolicy") long v);
    @Mapping("timeoutInterval")
    public native double getTimeoutInterval();
    @Mapping("setTimeoutInterval:")
    public native void setTimeoutInterval(double v);
    @Mapping("mainDocumentURL")
    public native NSURL getMainDocumentURL();
    @Mapping("setMainDocumentURL:")
    public native void setMainDocumentURL(NSURL v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("networkServiceType")
    public native @Representing("NSURLRequestNetworkServiceType") long getNetworkServiceType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setNetworkServiceType:")
    public native void setNetworkServiceType(@Representing("NSURLRequestNetworkServiceType") long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowsCellularAccess")
    public native boolean allowsCellularAccess();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    @Mapping("HTTPMethod")
    public native String getHTTPMethod();
    @Mapping("setHTTPMethod:")
    public native void setHTTPMethod(String v);
    @Mapping("allHTTPHeaderFields")
    public native Map<String, String> getAllHTTPHeaderFields();
    @Mapping("setAllHTTPHeaderFields:")
    public native void setAllHTTPHeaderFields(Map<String, String> v);
    @Mapping("HTTPBody")
    public native NSData getHTTPBody();
    @Mapping("setHTTPBody:")
    public native void setHTTPBody(NSData v);
    @Mapping("HTTPBodyStream")
    public native NSInputStream getHTTPBodyStream();
    @Mapping("setHTTPBodyStream:")
    public native void setHTTPBodyStream(NSInputStream v);
    @Mapping("HTTPShouldHandleCookies")
    public native boolean shouldHandleHTTPCookies();
    @Mapping("setHTTPShouldHandleCookies:")
    public native void setShouldHandleHTTPCookies(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setHTTPShouldUsePipelining:")
    public native void setShouldUseHTTPPipelining(boolean v);

    
    
    @Mapping("setValue:forHTTPHeaderField:")
    public native void setHTTPHeaderField0(String value, String field);
    @Mapping("addValue:forHTTPHeaderField:")
    public native void addHTTPHeaderField0(String value, String field);

}
