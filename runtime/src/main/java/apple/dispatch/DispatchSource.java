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
public class DispatchSource 
    extends DispatchObject 
     {

    
    public static final int MACH_SEND_DEAD = 0x1;
    public static final int MEMORYPRESSURE_NORMAL = 0x01;
    public static final int MEMORYPRESSURE_WARN = 0x02;
    public static final int MEMORYPRESSURE_CRITICAL = 0x04;
    public static final int PROC_EXIT = 0x80000000;
    public static final int PROC_FORK = 0x40000000;
    public static final int PROC_EXEC = 0x20000000;
    public static final int PROC_SIGNAL = 0x08000000;
    public static final int VNODE_DELETE = 0x1;
    public static final int VNODE_WRITE = 0x2;
    public static final int VNODE_EXTEND = 0x4;
    public static final int VNODE_ATTRIB = 0x8;
    public static final int VNODE_LINK = 0x10;
    public static final int VNODE_RENAME = 0x20;
    public static final int VNODE_REVOKE = 0x40;
    public static final int TIMER_STRICT = 0x1;
    
    
    protected DispatchSource() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_create")
    public static native DispatchSource create(DispatchSourceType type, @MachineSizedUInt long handle, @MachineSizedUInt long mask, DispatchQueue queue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_set_event_handler")
    public native void setEventHandler(@Block Runnable handler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_set_cancel_handler")
    public native void setCancelHandler(@Block Runnable handler);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_cancel")
    public native void cancel();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_testcancel")
    public native @MachineSizedSInt long testcancel();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_get_handle")
    public native @MachineSizedUInt long getSourceHandle();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_get_mask")
    public native @MachineSizedUInt long getMask();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_get_data")
    public native @MachineSizedUInt long getData();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_merge_data")
    public native void mergeData(@MachineSizedUInt long value);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("dispatch_source_set_timer")
    public native void setTimer(long start, long interval, long leeway);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("dispatch_source_set_registration_handler")
    public native void setRegistrationHandler(@Block Runnable handler);
    
}
