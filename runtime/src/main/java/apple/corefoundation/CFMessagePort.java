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
public class CFMessagePort 
    extends CFType 
     {

    
    
    protected CFMessagePort() {}
    
    
    
    
    @GlobalFunction("CFMessagePortGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFMessagePortCreateLocal")
    protected static native CFMessagePort createLocal(CFAllocator allocator, String name, FunctionPtr callout, CFMessagePortContext context, Todo shouldFreeInfo);
    @GlobalFunction("CFMessagePortCreateRemote")
    protected static native CFMessagePort createRemote(CFAllocator allocator, String name);
    @GlobalFunction("CFMessagePortIsRemote")
    public native boolean isRemote();
    @GlobalFunction("CFMessagePortGetName")
    public native String getName();
    @GlobalFunction("CFMessagePortSetName")
    public native boolean setName(String newName);
    @GlobalFunction("CFMessagePortInvalidate")
    public native void invalidate();
    @GlobalFunction("CFMessagePortIsValid")
    public native boolean isValid();
    @GlobalFunction("CFMessagePortGetInvalidationCallBack")
    private native FunctionPtr getInvalidationCallBack0();
    @GlobalFunction("CFMessagePortSetInvalidationCallBack")
    private native void setInvalidationCallBack0(FunctionPtr callout);
    @GlobalFunction("CFMessagePortSendRequest")
    protected native CFMessagePortErrorCode sendRequest(int msgid, CFData data, double sendTimeout, double rcvTimeout, String replyMode, Todo returnData);
    @GlobalFunction("CFMessagePortCreateRunLoopSource")
    protected static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFMessagePort local, @MachineSizedSInt long order);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFMessagePortSetDispatchQueue")
    public native void setDispatchQueue(DispatchQueue queue);
    
}
