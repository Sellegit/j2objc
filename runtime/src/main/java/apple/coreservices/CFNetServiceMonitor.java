package apple.coreservices;


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
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork/CFNetwork.h")
public class CFNetServiceMonitor 
    extends CFType 
     {

    
    
    protected CFNetServiceMonitor() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorCreate")
    public static native CFNetServiceMonitor create(CFAllocator alloc, CFNetService theService, FunctionPtr clientCB, CFNetServiceClientContext clientContext);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorInvalidate")
    public static native void invalidate(CFNetServiceMonitor monitor);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorStart")
    public static native boolean start(CFNetServiceMonitor monitor, CFNetServiceMonitorType recordType, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorStop")
    public static native void stop(CFNetServiceMonitor monitor, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorScheduleWithRunLoop")
    public static native void schedule(CFNetServiceMonitor monitor, CFRunLoop runLoop, String runLoopMode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetServiceMonitorUnscheduleFromRunLoop")
    public static native void unschedule(CFNetServiceMonitor monitor, CFRunLoop runLoop, String runLoopMode);
    
}
