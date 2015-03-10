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
public class CFCharacterSet 
    extends CFType 
     {

    
    
    protected CFCharacterSet() {}
    
    
    
    
    @GlobalFunction("CFCharacterSetGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFCharacterSetGetPredefined")
    public static native CFCharacterSet getPredefined(CFCharacterSetPredefinedSet theSetIdentifier);
    @GlobalFunction("CFCharacterSetCreateWithCharactersInRange")
    protected static native CFCharacterSet create(CFAllocator alloc, CFRange theRange);
    @GlobalFunction("CFCharacterSetCreateWithCharactersInString")
    protected static native CFCharacterSet create(CFAllocator alloc, String theString);
    @GlobalFunction("CFCharacterSetCreateWithBitmapRepresentation")
    protected static native CFCharacterSet create(CFAllocator alloc, CFData theData);
    @GlobalFunction("CFCharacterSetCreateInvertedSet")
    protected static native CFCharacterSet createInvertedSet(CFAllocator alloc, CFCharacterSet theSet);
    @GlobalFunction("CFCharacterSetIsSupersetOfSet")
    public native boolean isSupersetOfSet(CFCharacterSet theOtherset);
    @GlobalFunction("CFCharacterSetHasMemberInPlane")
    public native boolean hasMemberInPlane(@MachineSizedSInt long thePlane);
    @GlobalFunction("CFCharacterSetIsCharacterMember")
    public native boolean isCharacterMember(short theChar);
    @GlobalFunction("CFCharacterSetIsLongCharacterMember")
    public native boolean isLongCharacterMember(int theChar);
    @GlobalFunction("CFCharacterSetCreateBitmapRepresentation")
    protected static native CFData createBitmapRepresentation(CFAllocator alloc, CFCharacterSet theSet);
    
}
