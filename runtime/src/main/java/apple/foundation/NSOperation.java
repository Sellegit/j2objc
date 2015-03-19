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
 * @since Available in iOS 2.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSOperation")
public class NSOperation 
    extends NSObject 
     {

    
    
    public NSOperation() {}
    
    
    @Mapping("isCancelled")
    public native boolean isCancelled();
    @Mapping("isExecuting")
    public native boolean isExecuting();
    @Mapping("isFinished")
    public native boolean isFinished();
    @Mapping("isConcurrent")
    public native boolean isConcurrent();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isAsynchronous")
    public native boolean isAsynchronous();
    @Mapping("isReady")
    public native boolean isReady();
    @Mapping("dependencies")
    public native NSArray<NSOperation> getDependencies();
    @Mapping("queuePriority")
    public native @Representing("NSOperationQueuePriority") long getQueuePriority();
    @Mapping("setQueuePriority:")
    public native void setQueuePriority(@Representing("NSOperationQueuePriority") long v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("completionBlock")
    public native @Block Runnable getCompletionBlock();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setCompletionBlock:")
    public native void setCompletionBlock(@Block Runnable v);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("threadPriority")
    public native double getThreadPriority();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("setThreadPriority:")
    public native void setThreadPriority(double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("qualityOfService")
    public native @Representing("NSQualityOfService") long getQualityOfService();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setQualityOfService:")
    public native void setQualityOfService(@Representing("NSQualityOfService") long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setName:")
    public native void setName(String v);
    
    
    
    @Mapping("start")
    public native void start();
    @Mapping("main")
    public native void main();
    @Mapping("cancel")
    public native void cancel();
    @Mapping("addDependency:")
    public native void addDependency(NSOperation op);
    @Mapping("removeDependency:")
    public native void removeDependency(NSOperation op);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("waitUntilFinished")
    public native void waitUntilFinished();
    
}
