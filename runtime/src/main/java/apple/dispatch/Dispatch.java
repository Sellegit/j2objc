package apple.dispatch;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("System/System.h")
public class Dispatch 
    extends Object 
     {

    
    public static final int API_VERSION = 20141121;
    protected static final long TIME_NOW = 0L;
    protected static final long TIME_FOREVER = ~0L;
    public static final int BLOCK_BARRIER = 1;
    public static final int BLOCK_DETACHED = 2;
    public static final int BLOCK_ASSIGN_CURRENT = 4;
    public static final int BLOCK_NO_QOS_CLASS = 8;
    public static final int BLOCK_INHERIT_QOS_CLASS = 16;
    public static final int BLOCK_ENFORCE_QOS_CLASS = 32;
    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_time")
    protected static native long time(long when, long delta);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_walltime")
    protected static native long walltime(timespec when, long delta);
    @GlobalFunction("dispatch_wait")
    public static native @MachineSizedSInt long wait(Todo object, long timeout);
    @GlobalFunction("dispatch_notify")
    public static native void notify(Todo object, DispatchObject queue, @Block Runnable notification_block);
    @GlobalFunction("dispatch_cancel")
    public static native void cancel(Todo object);
    @GlobalFunction("dispatch_testcancel")
    public static native @MachineSizedSInt long testcancel(Todo object);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_main")
    public static native void main();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_create")
    public static native @Block Runnable blockCreate(@MachineSizedUInt long flags, @Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_create_with_qos_class")
    public static native @Block Runnable blockCreateWithQosClass(@MachineSizedUInt long flags, int qos_class, int relative_priority, @Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_perform")
    public static native void blockPerform(@MachineSizedUInt long flags, @Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_wait")
    public static native @MachineSizedSInt long blockWait(@Block Runnable block, long timeout);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_notify")
    public static native void blockNotify(@Block Runnable block, DispatchQueue queue, @Block Runnable notification_block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_cancel")
    public static native void blockCancel(@Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_block_testcancel")
    public static native @MachineSizedSInt long blockTestcancel(@Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_once")
    public static native void once(Todo predicate, @Block Runnable block);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_read")
    public static native void read(int fd, @MachineSizedUInt long length, DispatchQueue queue, @Block VoidBlock2<DispatchData, Integer> handler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("dispatch_write")
    public static native void write(int fd, DispatchData data, DispatchQueue queue, @Block VoidBlock2<DispatchData, Integer> handler);
    
}
