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
public class CFType 
    extends Object 
     {

    
    
    protected CFType() {}
    
    
    
    
    @GlobalFunction("CFGetTypeID")
    public native @MachineSizedUInt long getTypeID();
    @GlobalFunction("CFCopyTypeIDDescription")
    public static native String getTypeIDDescription(@MachineSizedUInt long type_id);
    @GlobalFunction("CFRetain")
    public native CFType retain();
    @GlobalFunction("CFRelease")
    public native void release();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFAutorelease")
    public native CFType autorelease();
    @GlobalFunction("CFGetRetainCount")
    public native @MachineSizedSInt long getRetainCount();
    @GlobalFunction("CFEqual")
    public native boolean equalsTo(CFType cf2);
    @GlobalFunction("CFHash")
    public native @MachineSizedUInt long hash();
    @GlobalFunction("CFCopyDescription")
    protected native CFString getDescription();
    @GlobalFunction("CFGetAllocator")
    public native CFAllocator getAllocator();
    @GlobalFunction("CFMakeCollectable")
    public native CFType makeCollectable();
    @GlobalFunction("CFShow")
    public native void show();
    
}
