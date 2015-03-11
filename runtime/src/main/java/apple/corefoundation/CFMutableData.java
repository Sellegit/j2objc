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
public class CFMutableData 
    extends CFData 
     {

    
    
    
    
    
    @GlobalFunction("CFDataCreateMutable")
    protected static native CFMutableData createMutable(CFAllocator allocator, @MachineSizedSInt long capacity);
    @GlobalFunction("CFDataCreateMutableCopy")
    protected static native CFMutableData createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFData theData);
    @GlobalFunction("CFDataSetLength")
    public native void setLength(@MachineSizedSInt long length);
    @GlobalFunction("CFDataIncreaseLength")
    public native void increaseLength(@MachineSizedSInt long extraLength);
    @GlobalFunction("CFDataAppendBytes")
    protected native void append(@Pointer long bytes, @MachineSizedSInt long length);
    @GlobalFunction("CFDataReplaceBytes")
    protected native void replace(CFRange range, @Pointer long newBytes, @MachineSizedSInt long newLength);
    @GlobalFunction("CFDataDeleteBytes")
    protected native void deleteBytes(CFRange range);
    
}
