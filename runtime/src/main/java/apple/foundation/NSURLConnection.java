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





@Library("Foundation/Foundation.h") @Mapping("NSURLConnection")
public class NSURLConnection 
    extends NSObject 
     {

    
    
    public NSURLConnection() {}
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("initWithRequest:delegate:startImmediately:")
    public NSURLConnection(NSURLRequest request, Object delegate, boolean startImmediately) { }
    @Mapping("initWithRequest:delegate:")
    public NSURLConnection(NSURLRequest request, Object delegate) { }
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("originalRequest")
    public native NSURLRequest getOriginalRequest();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("currentRequest")
    public native NSURLRequest getCurrentRequest();
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("start")
    public native void start();
    @Mapping("cancel")
    public native void cancel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop aRunLoop, String mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("unscheduleFromRunLoop:forMode:")
    public native void unscheduleFromRunLoop(NSRunLoop aRunLoop, String mode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue queue);
    @Mapping("connectionWithRequest:delegate:")
    public static native NSURLConnection create(NSURLRequest request, Object delegate);
    @Mapping("canHandleRequest:")
    public static native boolean canHandleRequest(NSURLRequest request);
    @Mapping("sendSynchronousRequest:returningResponse:error:")
    protected static native NSData sendSynchronousRequest(NSURLRequest request, Todo response, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("sendAsynchronousRequest:queue:completionHandler:")
    public static native void sendAsynchronousRequest(NSURLRequest request, NSOperationQueue queue, @Block VoidBlock3<NSURLResponse, NSData, NSError> handler);
    
}
