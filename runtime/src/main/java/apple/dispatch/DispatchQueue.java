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
@Library("System")
public class DispatchQueue 
    extends DispatchObject 
     {

    
    public static final int PRIORITY_HIGH = 2;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_LOW = -2;
    public static final int PRIORITY_BACKGROUND = -32768;
    
    
    protected DispatchQueue() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_main_q")
    public static native DispatchQueue getMainQueue();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_async")
    public native void async(@Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_sync")
    public native void sync(@Block Runnable block);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_apply")
    private static native void apply(@MachineSizedUInt long iterations, DispatchQueue queue, @Block("(@MachineSizedUInt)") VoidBlock1<Long> block);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction("dispatch_get_current_queue")
    public static native DispatchQueue getCurrentQueue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_get_global_queue")
    public static native DispatchQueue getGlobalQueue(@MachineSizedSInt long identifier, @MachineSizedUInt long flags);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_queue_attr_make_with_qos_class")
    public static native DispatchQueueAttr attrMakeWithQosClass(DispatchQueueAttr attr, int qos_class, int relative_priority);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_queue_create")
    public static native DispatchQueue create(Todo label, DispatchQueueAttr attr);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_queue_get_label")
    public native String getLabel();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("dispatch_queue_get_qos_class")
    public native int getQosClass(Todo relative_priority_ptr);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_after")
    private static native void after(long when, DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("dispatch_barrier_async")
    public native void barrierAsync(@Block Runnable block);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("dispatch_barrier_sync")
    public native void barrierSync(@Block Runnable block);
    
}
