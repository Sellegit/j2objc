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





@Library("Foundation") @Mapping("NSMutableURLRequest")
public class NSMutableURLRequest 
    extends NSURLRequest 
     {

    
    
    public NSMutableURLRequest() {}
    @Mapping("initWithURL:")
    public NSMutableURLRequest(NSURL URL) { }
    @Mapping("initWithURL:cachePolicy:timeoutInterval:")
    public NSMutableURLRequest(NSURL URL, @Representing("NSURLRequestCachePolicy") @MachineSizedUInt long cachePolicy, double timeoutInterval) { }
    
    
    @Mapping("URL")
    public native NSURL getURL();
    public native void setURL(NSURL v);
    @Mapping("cachePolicy")
    public native @Representing("NSURLRequestCachePolicy") @MachineSizedUInt long getCachePolicy();
    public native void setCachePolicy(@Representing("NSURLRequestCachePolicy") @MachineSizedUInt long v);
    @Mapping("timeoutInterval")
    public native double getTimeoutInterval();
    public native void setTimeoutInterval(double v);
    @Mapping("mainDocumentURL")
    public native NSURL getMainDocumentURL();
    public native void setMainDocumentURL(NSURL v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("networkServiceType")
    public native @Representing("NSURLRequestNetworkServiceType") @MachineSizedUInt long getNetworkServiceType();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setNetworkServiceType(@Representing("NSURLRequestNetworkServiceType") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowsCellularAccess")
    public native boolean allowsCellularAccess();
    /**
     * @since Available in iOS 6.0 and later.
     */
    public native void setAllowsCellularAccess(boolean v);
    @Mapping("HTTPMethod")
    public native String getHTTPMethod();
    public native void setHTTPMethod(String v);
    @Mapping("allHTTPHeaderFields")
    public native Map<String, String> getAllHTTPHeaderFields();
    public native void setAllHTTPHeaderFields(Map<String, String> v);
    @Mapping("HTTPBody")
    public native NSData getHTTPBody();
    public native void setHTTPBody(NSData v);
    @Mapping("HTTPBodyStream")
    public native NSInputStream getHTTPBodyStream();
    public native void setHTTPBodyStream(NSInputStream v);
    @Mapping("HTTPShouldHandleCookies")
    public native boolean shouldHandleHTTPCookies();
    public native void setShouldHandleHTTPCookies(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    /**
     * @since Available in iOS 4.0 and later.
     */
    public native void setShouldUseHTTPPipelining(boolean v);
    
    
    
    @Mapping("setValue:forHTTPHeaderField:")
    protected native void setHTTPHeaderField0(String value, String field);
    @Mapping("addValue:forHTTPHeaderField:")
    protected native void addHTTPHeaderField0(String value, String field);
    
}
