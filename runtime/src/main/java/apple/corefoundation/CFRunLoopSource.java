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
public class CFRunLoopSource 
    extends CFType 
     {

    
    
    protected CFRunLoopSource() {}
    
    
    
    
    @GlobalFunction("CFRunLoopSourceGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFRunLoopSourceCreate")
    protected static native CFRunLoopSource create(CFAllocator allocator, @MachineSizedSInt long order, CFRunLoopSourceContext context);
    @GlobalFunction("CFRunLoopSourceGetOrder")
    public static native @MachineSizedSInt long getOrder(CFRunLoopSource source);
    @GlobalFunction("CFRunLoopSourceInvalidate")
    public static native void invalidate(CFRunLoopSource source);
    @GlobalFunction("CFRunLoopSourceIsValid")
    public static native boolean isValid(CFRunLoopSource source);
    @GlobalFunction("CFRunLoopSourceGetContext")
    private static native void getContext(CFRunLoopSource source, CFRunLoopSourceContext context);
    @GlobalFunction("CFRunLoopSourceSignal")
    public static native void signal(CFRunLoopSource source);
    
}
