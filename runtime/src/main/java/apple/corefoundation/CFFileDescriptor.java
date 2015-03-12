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
public class CFFileDescriptor 
    extends CFType 
     {

    
    
    protected CFFileDescriptor() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorCreate")
    public static native CFFileDescriptor create(CFAllocator allocator, int fd, boolean closeOnInvalidate, FunctionPtr callout, CFFileDescriptorContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorGetNativeDescriptor")
    public native int getNativeDescriptor();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorGetContext")
    public native void getContext(CFFileDescriptorContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorEnableCallBacks")
    public native void enableCallBacks(@MachineSizedUInt long callBackTypes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorDisableCallBacks")
    public native void disableCallBacks(@MachineSizedUInt long callBackTypes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorInvalidate")
    public native void invalidate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorIsValid")
    public native boolean isValid();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFFileDescriptor f, @MachineSizedSInt long order);
    
}
