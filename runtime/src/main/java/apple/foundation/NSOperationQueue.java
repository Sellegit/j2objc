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
@Library("Foundation/Foundation.h") @Mapping("NSOperationQueue")
public class NSOperationQueue 
    extends NSObject 
     {

    
    public static final int DefaultMaxConcurrentOperationCount = -1;

    
    @Mapping("init")
    public NSOperationQueue() { }

    
    @Mapping("operations")
    public native NSArray<NSOperation> getOperations();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("operationCount")
    public native @MachineSizedUInt long getOperationCount();
    @Mapping("maxConcurrentOperationCount")
    public native @MachineSizedSInt long getMaxConcurrentOperationCount();
    @Mapping("setMaxConcurrentOperationCount:")
    public native void setMaxConcurrentOperationCount(@MachineSizedSInt long v);
    @Mapping("isSuspended")
    public native boolean isSuspended();
    @Mapping("setSuspended:")
    public native void setSuspended(boolean v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setName:")
    public native void setName(String v);
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
    @Mapping("underlyingQueue")
    public native DispatchQueue getUnderlyingQueue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUnderlyingQueue:")
    public native void setUnderlyingQueue(DispatchQueue v);

    
    
    @Mapping("addOperation:")
    public native void addOperation(NSOperation op);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addOperations:waitUntilFinished:")
    public native void addOperations(NSArray<?> ops, boolean wait);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addOperationWithBlock:")
    public native void addOperation(@Block Runnable block);
    @Mapping("cancelAllOperations")
    public native void cancelAllOperations();
    @Mapping("waitUntilAllOperationsAreFinished")
    public native void waitUntilAllOperationsAreFinished();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("currentQueue")
    public static native NSOperationQueue getCurrentQueue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mainQueue")
    public static native NSOperationQueue getMainQueue();

}
