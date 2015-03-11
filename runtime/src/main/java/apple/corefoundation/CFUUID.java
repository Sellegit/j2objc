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
public class CFUUID 
    extends CFType 
     {

    
    
    protected CFUUID() {}
    
    
    
    
    @GlobalFunction("CFUUIDGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFUUIDCreate")
    protected static native CFUUID create(CFAllocator alloc);
    @GlobalFunction("CFUUIDCreateWithBytes")
    protected static native CFUUID create(CFAllocator alloc, byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);
    @GlobalFunction("CFUUIDCreateFromString")
    protected static native CFUUID create(CFAllocator alloc, String uuidStr);
    @GlobalFunction("CFUUIDCreateString")
    protected static native String asString(CFAllocator alloc, CFUUID uuid);
    @GlobalFunction("CFUUIDGetConstantUUIDWithBytes")
    protected static native CFUUID getConstantUUID(CFAllocator alloc, byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);
    @GlobalFunction("CFUUIDGetUUIDBytes")
    public native CFUUIDBytes getUUIDBytes();
    @GlobalFunction("CFUUIDCreateFromUUIDBytes")
    protected static native CFUUID create(CFAllocator alloc, CFUUIDBytes bytes);
    
}
