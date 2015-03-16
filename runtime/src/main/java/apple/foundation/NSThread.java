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





@Library("Foundation/Foundation.h") @Mapping("NSThread")
public class NSThread 
    extends NSObject 
     {

    
    
    public NSThread() {}
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("initWithTarget:selector:object:")
    public NSThread(Object target, Selector selector, Object argument) { }
    
    
    @Mapping("threadDictionary")
    public native NSMutableDictionary<?, ?> getThreadDictionary();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("qualityOfService")
    public native @Representing("NSQualityOfService") @MachineSizedSInt long getQualityOfService();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setQualityOfService:")
    public native void setQualityOfService(@Representing("NSQualityOfService") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("stackSize")
    public native @MachineSizedUInt long getStackSize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setStackSize:")
    public native void setStackSize(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isMainThread")
    public native boolean isMainThread();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isExecuting")
    public native boolean isExecuting();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isFinished")
    public native boolean isFinished();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isCancelled")
    public native boolean isCancelled();
    
    
    
    @GlobalConstant("NSWillBecomeMultiThreadedNotification")
    public static native NSString WillBecomeMultiThreadedNotification();
    @GlobalConstant("NSDidBecomeSingleThreadedNotification")
    public static native NSString DidBecomeSingleThreadedNotification();
    @GlobalConstant("NSThreadWillExitNotification")
    public static native NSString WillExitNotification();
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("cancel")
    public native void cancel();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("start")
    public native void start();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("main")
    public native void main();
    @Mapping("currentThread")
    public static native NSThread getCurrentThread();
    @Mapping("detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThread(Selector selector, Object target, Object argument);
    @Mapping("isMultiThreaded")
    public static native boolean isMultiThreaded();
    @Mapping("sleepUntilDate:")
    public static native void sleep(NSDate date);
    @Mapping("sleepForTimeInterval:")
    public static native void sleep(double ti);
    @Mapping("exit")
    public static native void exit();
    @Mapping("threadPriority")
    public static native double getThreadPriority();
    @Mapping("setThreadPriority:")
    public static native boolean setThreadPriority(double p);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("isMainThread")
    public static native boolean isCurrentThreadMainThread();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("mainThread")
    public static native NSThread getMainThread();
    
}
