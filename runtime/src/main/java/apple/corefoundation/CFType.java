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
@Mapping("CFTypeRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFType 
    extends ValueType 
     {

    
    
    protected CFType() {}
    
    
    
    
    @GlobalFunction("CFGetTypeID")
    public static native @MachineSizedUInt long getTypeID(CFType cf);
    @GlobalFunction("CFCopyTypeIDDescription")
    public static native CFString getTypeIDDescription(@MachineSizedUInt long type_id);
    @GlobalFunction("CFRetain")
    public static native CFType retain(CFType cf);
    @GlobalFunction("CFRelease")
    public static native void release(CFType cf);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFAutorelease")
    public static native CFType autorelease(CFType arg);
    @GlobalFunction("CFGetRetainCount")
    public static native @MachineSizedSInt long getRetainCount(CFType cf);
    @GlobalFunction("CFEqual")
    public static native boolean equalsTo(CFType cf1, CFType cf2);
    @GlobalFunction("CFHash")
    public static native @MachineSizedUInt long hash(CFType cf);
    @GlobalFunction("CFCopyDescription")
    public static native CFString getDescription(CFType cf);
    @GlobalFunction("CFGetAllocator")
    public static native CFAllocator getAllocator(CFType cf);
    @GlobalFunction("CFMakeCollectable")
    public static native CFType makeCollectable(CFType cf);
    @GlobalFunction("CFShow")
    public static native void show(CFType obj);
    
}
