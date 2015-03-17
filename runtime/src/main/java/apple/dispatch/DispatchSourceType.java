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
@Library("dispatch/dispatch.h")
public class DispatchSourceType 
    extends DispatchObject 
     {

    
    
    protected DispatchSourceType() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_data_add")
    public static native DispatchSourceType DataAdd();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_data_or")
    public static native DispatchSourceType DataOr();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_mach_send")
    public static native DispatchSourceType MachSend();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_mach_recv")
    public static native DispatchSourceType MachRecv();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_memorypressure")
    public static native DispatchSourceType Memorypressure();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_proc")
    public static native DispatchSourceType Proc();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_read")
    public static native DispatchSourceType Read();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_signal")
    public static native DispatchSourceType Signal();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_timer")
    public static native DispatchSourceType Timer();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_vnode")
    public static native DispatchSourceType Vnode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("_dispatch_source_type_write")
    public static native DispatchSourceType Write();
    
}
