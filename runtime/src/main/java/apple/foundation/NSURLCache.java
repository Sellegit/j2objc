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





@Library("Foundation/Foundation.h") @Mapping("NSURLCache")
public class NSURLCache 
    extends NSObject 
     {

    
    
    public NSURLCache() {}
    @Mapping("initWithMemoryCapacity:diskCapacity:diskPath:")
    public NSURLCache(@MachineSizedUInt long memoryCapacity, @MachineSizedUInt long diskCapacity, String path) { }
    
    
    @Mapping("memoryCapacity")
    public native @MachineSizedUInt long getMemoryCapacity();
    @Mapping("setMemoryCapacity:")
    public native void setMemoryCapacity(@MachineSizedUInt long v);
    @Mapping("diskCapacity")
    public native @MachineSizedUInt long getDiskCapacity();
    @Mapping("setDiskCapacity:")
    public native void setDiskCapacity(@MachineSizedUInt long v);
    @Mapping("currentMemoryUsage")
    public native @MachineSizedUInt long getCurrentMemoryUsage();
    @Mapping("currentDiskUsage")
    public native @MachineSizedUInt long getCurrentDiskUsage();
    
    
    
    @Mapping("cachedResponseForRequest:")
    public native NSCachedURLResponse getCachedResponse(NSURLRequest request);
    @Mapping("storeCachedResponse:forRequest:")
    public native void storeCachedResponse(NSCachedURLResponse cachedResponse, NSURLRequest request);
    @Mapping("removeCachedResponseForRequest:")
    public native void removeCachedResponse(NSURLRequest request);
    @Mapping("removeAllCachedResponses")
    public native void removeAllCachedResponses();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeCachedResponsesSinceDate:")
    public native void removeCachedResponsesSinceDate(NSDate date);
    @Mapping("sharedURLCache")
    public static native NSURLCache getSharedURLCache();
    @Mapping("setSharedURLCache:")
    public static native void setSharedURLCache(NSURLCache cache);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("storeCachedResponse:forDataTask:")
    public native void storeCachedResponse(NSCachedURLResponse cachedResponse, NSURLSessionDataTask dataTask);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getCachedResponseForDataTask:completionHandler:")
    public native void getCachedResponse(NSURLSessionDataTask dataTask, @Block VoidBlock1<NSCachedURLResponse> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("removeCachedResponseForDataTask:")
    public native void removeCachedResponse(NSURLSessionDataTask dataTask);
    
}
