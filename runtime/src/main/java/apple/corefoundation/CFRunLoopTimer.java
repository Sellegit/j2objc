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
@Library("CoreFoundation")
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
    public native double getNextFireDate();
    @GlobalFunction("CFRunLoopTimerSetNextFireDate")
    public native void setNextFireDate(double fireDate);
    @GlobalFunction("CFRunLoopTimerGetInterval")
    public native double getInterval();
    @GlobalFunction("CFRunLoopTimerDoesRepeat")
    public native boolean doesRepeat();
    @GlobalFunction("CFRunLoopTimerGetOrder")
    public native @MachineSizedSInt long getOrder();
    @GlobalFunction("CFRunLoopTimerInvalidate")
    public native void invalidate();
    @GlobalFunction("CFRunLoopTimerIsValid")
    public native boolean isValid();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFRunLoopTimerGetTolerance")
    public native double getTolerance();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFRunLoopTimerSetTolerance")
    public native void setTolerance(double tolerance);
    
}
