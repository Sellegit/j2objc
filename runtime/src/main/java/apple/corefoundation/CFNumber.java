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
public class CFNumber 
    extends CFPropertyList 
     {

    
    
    protected CFNumber() {}
    
    
    
    
    @GlobalConstant("kCFNumberPositiveInfinity")
    public static native CFNumber getPositiveInfinity();
    @GlobalConstant("kCFNumberNegativeInfinity")
    public static native CFNumber getNegativeInfinity();
    @GlobalConstant("kCFNumberNaN")
    public static native CFNumber getNaN();
    
    @GlobalFunction("CFNumberGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFNumberCreate")
    protected static native CFNumber create(CFAllocator allocator, CFNumberType theType, Todo valuePtr);
    @GlobalFunction("CFNumberGetType")
    public native CFNumberType getType();
    @GlobalFunction("CFNumberGetByteSize")
    public native @MachineSizedSInt long getByteSize();
    @GlobalFunction("CFNumberIsFloatType")
    public native boolean isFloatType();
    @GlobalFunction("CFNumberGetValue")
    protected native boolean getValue(CFNumberType theType, Todo valuePtr);
    @GlobalFunction("CFNumberCompare")
    protected native CFComparisonResult compareTo(CFNumber otherNumber, Todo context);
    
}
