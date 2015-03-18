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





@Library("Foundation/Foundation.h") @Mapping("NSURLProtocol")
public class NSURLProtocol 
    extends NSObject 
     {

    
    
    @Mapping("initWithRequest:cachedResponse:client:")
    public NSURLProtocol(NSURLRequest request, NSCachedURLResponse cachedResponse, NSURLProtocolClient client) { }
    @Mapping("init")
    public NSURLProtocol() { }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("initWithTask:cachedResponse:client:")
    public NSURLProtocol(NSURLSessionTask task, NSCachedURLResponse cachedResponse, NSURLProtocolClient client) { }
    
    
    @Mapping("client")
    public native NSURLProtocolClient getClient();
    @Mapping("request")
    public native NSURLRequest getRequest();
    @Mapping("cachedResponse")
    public native NSCachedURLResponse getCachedResponse();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("task")
    public native NSURLSessionTask getTask();
    
    
    
    @Mapping("startLoading")
    public native void startLoading();
    @Mapping("stopLoading")
    public native void stopLoading();
    @Mapping("canInitWithRequest:")
    public static native boolean canInitWithRequest(NSURLRequest request);
    @Mapping("canonicalRequestForRequest:")
    public static native NSURLRequest newCanonicalRequest(NSURLRequest request);
    @Mapping("requestIsCacheEquivalent:toRequest:")
    public static native boolean requestIsCacheEquivalent(NSURLRequest a, NSURLRequest b);
    @Mapping("propertyForKey:inRequest:")
    public static native Object getPropertyInRequest(String key, NSURLRequest request);
    @Mapping("setProperty:forKey:inRequest:")
    public static native void setPropertyInRequest(Object value, String key, NSMutableURLRequest request);
    @Mapping("removePropertyForKey:inRequest:")
    public static native void removePropertyInRequest(String key, NSMutableURLRequest request);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("canInitWithTask:")
    public static native boolean canInitWithTask(NSURLSessionTask task);
    
}
