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
@Mapping("CFNumberRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFNumber create(CFAllocator allocator, @Representing("CFNumberType") long theType, Todo valuePtr);
    @GlobalFunction("CFNumberGetType")
    public static native CFNumberType getType(CFNumber number);
    @GlobalFunction("CFNumberGetByteSize")
    public static native @MachineSizedSInt long getByteSize(CFNumber number);
    @GlobalFunction("CFNumberIsFloatType")
    public static native boolean isFloatType(CFNumber number);
    @GlobalFunction("CFNumberGetValue")
    public static native boolean getValue(CFNumber number, @Representing("CFNumberType") long theType, Todo valuePtr);
    @GlobalFunction("CFNumberCompare")
    public static native CFComparisonResult compareTo(CFNumber number, CFNumber otherNumber, Todo context);

}
