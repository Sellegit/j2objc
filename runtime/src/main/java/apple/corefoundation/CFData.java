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
    public native @MachineSizedSInt long getLength();
    @GlobalFunction("CFDataGetBytePtr")
    public native Todo getBytePtr();
    @GlobalFunction("CFDataGetMutableBytePtr")
    public native Todo getMutableBytePtr();
    @GlobalFunction("CFDataGetBytes")
    protected native void getBytes(CFRange range, Todo buffer);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFDataFind")
    public native CFRange find(CFData dataToFind, CFRange searchRange, CFDataSearchFlags compareOptions);
    
}
