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
@Mapping("CFRunLoopObserverRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFRunLoopObserver create(CFAllocator allocator, @MachineSizedUInt long activities, boolean repeats, @MachineSizedSInt long order, @Block VoidBlock2<CFRunLoopObserver, CFRunLoopActivity> block);
    @GlobalFunction("CFRunLoopObserverGetActivities")
    public static native CFRunLoopActivity getActivities(CFRunLoopObserver observer);
    @GlobalFunction("CFRunLoopObserverDoesRepeat")
    public static native boolean doesRepeat(CFRunLoopObserver observer);
    @GlobalFunction("CFRunLoopObserverGetOrder")
    public static native @MachineSizedSInt long getOrder(CFRunLoopObserver observer);
    @GlobalFunction("CFRunLoopObserverInvalidate")
    public static native void invalidate(CFRunLoopObserver observer);
    @GlobalFunction("CFRunLoopObserverIsValid")
    public static native boolean isValid(CFRunLoopObserver observer);

}
