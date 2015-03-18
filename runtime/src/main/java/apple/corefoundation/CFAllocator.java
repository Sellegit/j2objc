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
public class CFAllocator 
    extends CFType 
     {

    
    
    protected CFAllocator() {}
    
    
    
    
    @GlobalConstant("kCFAllocatorDefault")
    public static native CFAllocator getDefaultAllocator();
    @GlobalConstant("kCFAllocatorSystemDefault")
    public static native CFAllocator getSystemDefaultAllocator();
    @GlobalConstant("kCFAllocatorMalloc")
    public static native CFAllocator getMallocAllocator();
    @GlobalConstant("kCFAllocatorMallocZone")
    public static native CFAllocator getMallocZoneAllocator();
    @GlobalConstant("kCFAllocatorNull")
    public static native CFAllocator getNullAllocator();
    @GlobalConstant("kCFAllocatorUseContext")
    public static native CFAllocator getUseContextAllocator();
    
    @GlobalFunction("CFAllocatorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFAllocatorSetDefault")
    public static native void setDefault(CFAllocator allocator);
    @GlobalFunction("CFAllocatorGetDefault")
    public static native CFAllocator getDefault();
    @GlobalFunction("CFAllocatorCreate")
    public static native CFAllocator create(CFAllocator allocator, CFAllocatorContext context);
    @GlobalFunction("CFAllocatorAllocate")
    public static native Todo allocate(CFAllocator allocator, @MachineSizedSInt long size, @MachineSizedUInt long hint);
    @GlobalFunction("CFAllocatorReallocate")
    public static native Todo reallocate(CFAllocator allocator, Todo ptr, @MachineSizedSInt long newsize, @MachineSizedUInt long hint);
    @GlobalFunction("CFAllocatorDeallocate")
    public static native void deallocate(CFAllocator allocator, Todo ptr);
    @GlobalFunction("CFAllocatorGetPreferredSizeForSize")
    public static native @MachineSizedSInt long getPreferredSizeForSize(CFAllocator allocator, @MachineSizedSInt long size, @MachineSizedUInt long hint);
    @GlobalFunction("CFAllocatorGetContext")
    public static native void getContext(CFAllocator allocator, CFAllocatorContext context);
    
}
