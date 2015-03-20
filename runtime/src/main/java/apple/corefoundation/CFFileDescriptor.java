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
@Mapping("CFFileDescriptorRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native int getNativeDescriptor(CFFileDescriptor f);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorGetContext")
    public static native void getContext(CFFileDescriptor f, CFFileDescriptorContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorEnableCallBacks")
    public static native void enableCallBacks(CFFileDescriptor f, @MachineSizedUInt long callBackTypes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorDisableCallBacks")
    public static native void disableCallBacks(CFFileDescriptor f, @MachineSizedUInt long callBackTypes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorInvalidate")
    public static native void invalidate(CFFileDescriptor f);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorIsValid")
    public static native boolean isValid(CFFileDescriptor f);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFileDescriptorCreateRunLoopSource")
    public static native CFRunLoopSource createRunLoopSource(CFAllocator allocator, CFFileDescriptor f, @MachineSizedSInt long order);
    
}
