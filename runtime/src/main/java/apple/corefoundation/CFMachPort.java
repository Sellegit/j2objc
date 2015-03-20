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
@Mapping("CFMachPortRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMachPort 
    extends CFType 
     {

    
    
    protected CFMachPort() {}
    
    
    
    
    @GlobalFunction("CFMachPortGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFMachPortCreate")
    public static native CFMachPort create(CFAllocator allocator, FunctionPtr callout, CFMachPortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMachPortCreateWithPort")
    public static native CFMachPort create(CFAllocator allocator, int portNum, FunctionPtr callout, CFMachPortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMachPortGetPort")
    public static native int getPort(CFMachPort port);
    @GlobalFunction("CFMachPortInvalidate")
    public static native void invalidate(CFMachPort port);
    @GlobalFunction("CFMachPortIsValid")
    public static native boolean isValid(CFMachPort port);
    @GlobalFunction("CFMachPortGetInvalidationCallBack")
    public static native FunctionPtr getInvalidationCallBack0(CFMachPort port);
    @GlobalFunction("CFMachPortSetInvalidationCallBack")
    public static native void setInvalidationCallBack0(CFMachPort port, FunctionPtr callout);
    @GlobalFunction("CFMachPortCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFMachPort port, @MachineSizedSInt long order);
    
}
