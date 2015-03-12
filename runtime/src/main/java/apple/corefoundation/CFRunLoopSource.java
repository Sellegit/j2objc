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
public class CFRunLoopSource 
    extends CFType 
     {

    
    
    protected CFRunLoopSource() {}
    
    
    
    
    @GlobalFunction("CFRunLoopSourceGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFRunLoopSourceCreate")
    protected static native CFRunLoopSource create(CFAllocator allocator, @MachineSizedSInt long order, CFRunLoopSourceContext context);
    @GlobalFunction("CFRunLoopSourceGetOrder")
    public native @MachineSizedSInt long getOrder();
    @GlobalFunction("CFRunLoopSourceInvalidate")
    public native void invalidate();
    @GlobalFunction("CFRunLoopSourceIsValid")
    public native boolean isValid();
    @GlobalFunction("CFRunLoopSourceGetContext")
    private native void getContext(CFRunLoopSourceContext context);
    @GlobalFunction("CFRunLoopSourceSignal")
    public native void signal();
    
}
