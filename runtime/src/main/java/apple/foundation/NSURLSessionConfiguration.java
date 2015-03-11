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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation") @Mapping("NSURLSessionConfiguration")
public class NSURLSessionConfiguration 
    extends NSObject 
    implements NSCopying {

    
    
    public NSURLSessionConfiguration() {}
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("requestCachePolicy")
    public native @Representing("NSURLRequestCachePolicy") @MachineSizedUInt long getRequestCachePolicy();
    public native void setRequestCachePolicy(@Representing("NSURLRequestCachePolicy") @MachineSizedUInt long v);
    @Mapping("timeoutIntervalForRequest")
    public native double getTimeoutIntervalForRequest();
    public native void setTimeoutIntervalForRequest(double v);
    @Mapping("timeoutIntervalForResource")
    public native double getTimeoutIntervalForResource();
    public native void setTimeoutIntervalForResource(double v);
    @Mapping("networkServiceType")
    public native @Representing("NSURLRequestNetworkServiceType") @MachineSizedUInt long getNetworkServiceType();
    public native void setNetworkServiceType(@Representing("NSURLRequestNetworkServiceType") @MachineSizedUInt long v);
    @Mapping("allowsCellularAccess")
    public native boolean allowsCellularAccess();
    public native void setAllowsCellularAccess(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isDiscretionary")
    public native boolean isDiscretionary();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setDiscretionary(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sharedContainerIdentifier")
    public native String getSharedContainerIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setSharedContainerIdentifier(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sessionSendsLaunchEvents")
    public native boolean sendsLaunchEvents();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setSendsLaunchEvents(boolean v);
    @Mapping("connectionProxyDictionary")
    public native CFProxy getConnectionProxy();
    public native void setConnectionProxy(CFProxy v);
    @Mapping("TLSMinimumSupportedProtocol")
    public native SSLProtocol getTLSMinimumSupportedProtocol();
    public native void setTLSMinimumSupportedProtocol(SSLProtocol v);
    @Mapping("TLSMaximumSupportedProtocol")
    public native SSLProtocol getTLSMaximumSupportedProtocol();
    public native void setTLSMaximumSupportedProtocol(SSLProtocol v);
    @Mapping("HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    public native void setShouldUseHTTPPipelining(boolean v);
    @Mapping("HTTPShouldSetCookies")
    public native boolean shouldSetHTTPCookies();
    public native void setShouldSetHTTPCookies(boolean v);
    @Mapping("HTTPCookieAcceptPolicy")
    public native @Representing("NSHTTPCookieAcceptPolicy") @MachineSizedUInt long getHTTPCookieAcceptPolicy();
    public native void setHTTPCookieAcceptPolicy(@Representing("NSHTTPCookieAcceptPolicy") @MachineSizedUInt long v);
    @Mapping("HTTPAdditionalHeaders")
    public native Map<String, String> getGetAdditionalHTTPHeaders();
    public native void setGetAdditionalHTTPHeaders(Map<String, String> v);
    @Mapping("HTTPMaximumConnectionsPerHost")
    public native @MachineSizedSInt long getMaximumHTTPConnectionsPerHost();
    public native void setMaximumHTTPConnectionsPerHost(@MachineSizedSInt long v);
    @Mapping("HTTPCookieStorage")
    public native NSHTTPCookieStorage getHTTPCookieStorage();
    public native void setHTTPCookieStorage(NSHTTPCookieStorage v);
    @Mapping("URLCredentialStorage")
    public native NSURLCredentialStorage getURLCredentialStorage();
    public native void setURLCredentialStorage(NSURLCredentialStorage v);
    @Mapping("URLCache")
    public native NSURLCache getURLCache();
    public native void setURLCache(NSURLCache v);
    @Mapping("protocolClasses")
    public native List<ObjCClass> getProtocolClasses();
    public native void setProtocolClasses(List<ObjCClass> v);
    
    
    
    @Mapping("defaultSessionConfiguration")
    public static native NSURLSessionConfiguration getDefaultSessionConfiguration();
    @Mapping("ephemeralSessionConfiguration")
    public static native NSURLSessionConfiguration getEphemeralSessionConfiguration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("backgroundSessionConfigurationWithIdentifier:")
    public static native NSURLSessionConfiguration getBackgroundSessionConfiguration(String identifier);
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("backgroundSessionConfiguration:")
    public static native NSURLSessionConfiguration getBackgroundSessionConfiguration7(String identifier);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
