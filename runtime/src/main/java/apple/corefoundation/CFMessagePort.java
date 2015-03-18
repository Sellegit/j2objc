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
public class CFMessagePort 
    extends CFType 
     {

    
    
    protected CFMessagePort() {}
    
    
    
    
    @GlobalFunction("CFMessagePortGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFMessagePortCreateLocal")
    public static native CFMessagePort createLocal(CFAllocator allocator, String name, FunctionPtr callout, CFMessagePortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMessagePortCreateRemote")
    public static native CFMessagePort createRemote(CFAllocator allocator, String name);
    @GlobalFunction("CFMessagePortIsRemote")
    public static native boolean isRemote(CFMessagePort ms);
    @GlobalFunction("CFMessagePortGetName")
    public static native String getName(CFMessagePort ms);
    @GlobalFunction("CFMessagePortSetName")
    public static native boolean setName(CFMessagePort ms, String newName);
    @GlobalFunction("CFMessagePortInvalidate")
    public static native void invalidate(CFMessagePort ms);
    @GlobalFunction("CFMessagePortIsValid")
    public static native boolean isValid(CFMessagePort ms);
    @GlobalFunction("CFMessagePortGetInvalidationCallBack")
    public static native FunctionPtr getInvalidationCallBack0(CFMessagePort ms);
    @GlobalFunction("CFMessagePortSetInvalidationCallBack")
    public static native void setInvalidationCallBack0(CFMessagePort ms, FunctionPtr callout);
    @GlobalFunction("CFMessagePortSendRequest")
    public static native CFMessagePortErrorCode sendRequest(CFMessagePort remote, int msgid, CFData data, double sendTimeout, double rcvTimeout, String replyMode, Todo returnData);
    @GlobalFunction("CFMessagePortCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFMessagePort local, @MachineSizedSInt long order);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFMessagePortSetDispatchQueue")
    public static native void setDispatchQueue(CFMessagePort ms, DispatchQueue queue);
    
}
