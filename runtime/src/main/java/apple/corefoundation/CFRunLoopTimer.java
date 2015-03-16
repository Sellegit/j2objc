package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFRunLoopTimer 
    extends CFType 
     {

    
    
    protected CFRunLoopTimer() {}
    
    
    
    
    @GlobalFunction("CFRunLoopTimerGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFRunLoopTimerCreateWithHandler")
    protected static native CFRunLoopTimer create(CFAllocator allocator, double fireDate, double interval, @MachineSizedUInt long flags, @MachineSizedSInt long order, @Block VoidBlock1<CFRunLoopTimer> block);
    @GlobalFunction("CFRunLoopTimerGetNextFireDate")
    public static native double getNextFireDate(CFRunLoopTimer timer);
    @GlobalFunction("CFRunLoopTimerSetNextFireDate")
    public static native void setNextFireDate(CFRunLoopTimer timer, double fireDate);
    @GlobalFunction("CFRunLoopTimerGetInterval")
    public static native double getInterval(CFRunLoopTimer timer);
    @GlobalFunction("CFRunLoopTimerDoesRepeat")
    public static native boolean doesRepeat(CFRunLoopTimer timer);
    @GlobalFunction("CFRunLoopTimerGetOrder")
    public static native @MachineSizedSInt long getOrder(CFRunLoopTimer timer);
    @GlobalFunction("CFRunLoopTimerInvalidate")
    public static native void invalidate(CFRunLoopTimer timer);
    @GlobalFunction("CFRunLoopTimerIsValid")
    public static native boolean isValid(CFRunLoopTimer timer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFRunLoopTimerGetTolerance")
    public static native double getTolerance(CFRunLoopTimer timer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFRunLoopTimerSetTolerance")
    public static native void setTolerance(CFRunLoopTimer timer, double tolerance);
    
}
