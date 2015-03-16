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
public class CFData 
    extends CFPropertyList 
     {

    
    
    protected CFData() {}
    
    
    
    
    @GlobalFunction("CFDataGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFDataCreate")
    protected static native CFData create(CFAllocator allocator, Todo bytes, @MachineSizedSInt long length);
    @GlobalFunction("CFDataCreateWithBytesNoCopy")
    protected static native CFData create(CFAllocator allocator, Todo bytes, @MachineSizedSInt long length, CFAllocator bytesDeallocator);
    @GlobalFunction("CFDataCreateCopy")
    protected static native CFData create(CFAllocator allocator, CFData theData);
    @GlobalFunction("CFDataGetLength")
    public static native @MachineSizedSInt long getLength(CFData theData);
    @GlobalFunction("CFDataGetBytePtr")
    public static native Todo getBytePtr(CFData theData);
    @GlobalFunction("CFDataGetMutableBytePtr")
    public static native Todo getMutableBytePtr(CFData theData);
    @GlobalFunction("CFDataGetBytes")
    protected static native void getBytes(CFData theData, CFRange range, Todo buffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFDataFind")
    public static native CFRange find(CFData theData, CFData dataToFind, CFRange searchRange, CFDataSearchFlags compareOptions);
    
}
