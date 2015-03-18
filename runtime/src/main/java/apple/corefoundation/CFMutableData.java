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
public class CFMutableData 
    extends CFData 
     {

    
    
    
    
    
    @GlobalFunction("CFDataCreateMutable")
    public static native CFMutableData createMutable(CFAllocator allocator, @MachineSizedSInt long capacity);
    @GlobalFunction("CFDataCreateMutableCopy")
    public static native CFMutableData createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFData theData);
    @GlobalFunction("CFDataSetLength")
    public static native void setLength(CFData theData, @MachineSizedSInt long length);
    @GlobalFunction("CFDataIncreaseLength")
    public static native void increaseLength(CFData theData, @MachineSizedSInt long extraLength);
    @GlobalFunction("CFDataAppendBytes")
    public static native void append(CFData theData, Todo bytes, @MachineSizedSInt long length);
    @GlobalFunction("CFDataReplaceBytes")
    public static native void replace(CFData theData, CFRange range, Todo newBytes, @MachineSizedSInt long newLength);
    @GlobalFunction("CFDataDeleteBytes")
    public static native void deleteBytes(CFData theData, CFRange range);
    
}
