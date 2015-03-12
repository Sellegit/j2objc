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
public class CFRunLoopObserver 
    extends CFType 
     {

    
    
    protected CFRunLoopObserver() {}
    
    
    
    
    @GlobalFunction("CFRunLoopObserverGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFRunLoopObserverCreateWithHandler")
    protected static native CFRunLoopObserver create(CFAllocator allocator, @MachineSizedUInt long activities, boolean repeats, @MachineSizedSInt long order, @Block VoidBlock2<CFRunLoopObserver, CFRunLoopActivity> block);
    @GlobalFunction("CFRunLoopObserverGetActivities")
    public native CFRunLoopActivity getActivities();
    @GlobalFunction("CFRunLoopObserverDoesRepeat")
    public native boolean doesRepeat();
    @GlobalFunction("CFRunLoopObserverGetOrder")
    public native @MachineSizedSInt long getOrder();
    @GlobalFunction("CFRunLoopObserverInvalidate")
    public native void invalidate();
    @GlobalFunction("CFRunLoopObserverIsValid")
    public native boolean isValid();
    
}
