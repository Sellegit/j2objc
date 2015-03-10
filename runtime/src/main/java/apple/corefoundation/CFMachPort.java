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
public class CFMachPort 
    extends CFType 
     {

    
    
    protected CFMachPort() {}
    
    
    
    
    @GlobalFunction("CFMachPortGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFMachPortCreate")
    protected static native CFMachPort create(CFAllocator allocator, FunctionPtr callout, CFMachPortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMachPortCreateWithPort")
    protected static native CFMachPort create(CFAllocator allocator, int portNum, FunctionPtr callout, CFMachPortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMachPortGetPort")
    public native int getPort();
    @GlobalFunction("CFMachPortInvalidate")
    public native void invalidate();
    @GlobalFunction("CFMachPortIsValid")
    public native boolean isValid();
    @GlobalFunction("CFMachPortGetInvalidationCallBack")
    private native FunctionPtr getInvalidationCallBack0();
    @GlobalFunction("CFMachPortSetInvalidationCallBack")
    private native void setInvalidationCallBack0(FunctionPtr callout);
    @GlobalFunction("CFMachPortCreateRunLoopSource")
    protected static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFMachPort port, @MachineSizedSInt long order);
    
}
