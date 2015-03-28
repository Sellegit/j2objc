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
@Mapping("CFCharacterSetRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFCharacterSet 
    extends CFType 
     {

    
    
    protected CFCharacterSet() {}

    
    
    
    @GlobalFunction("CFCharacterSetGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFCharacterSetGetPredefined")
    public static native CFCharacterSet getPredefined(@Representing("CFCharacterSetPredefinedSet") long theSetIdentifier);
    @GlobalFunction("CFCharacterSetCreateWithCharactersInRange")
    public static native CFCharacterSet create(CFAllocator alloc, CFRange theRange);
    @GlobalFunction("CFCharacterSetCreateWithCharactersInString")
    public static native CFCharacterSet create(CFAllocator alloc, CFString theString);
    @GlobalFunction("CFCharacterSetCreateWithBitmapRepresentation")
    public static native CFCharacterSet create(CFAllocator alloc, CFData theData);
    @GlobalFunction("CFCharacterSetCreateInvertedSet")
    public static native CFCharacterSet createInvertedSet(CFAllocator alloc, CFCharacterSet theSet);
    @GlobalFunction("CFCharacterSetIsSupersetOfSet")
    public static native boolean isSupersetOfSet(CFCharacterSet theSet, CFCharacterSet theOtherset);
    @GlobalFunction("CFCharacterSetHasMemberInPlane")
    public static native boolean hasMemberInPlane(CFCharacterSet theSet, @MachineSizedSInt long thePlane);
    @GlobalFunction("CFCharacterSetIsCharacterMember")
    public static native boolean isCharacterMember(CFCharacterSet theSet, short theChar);
    @GlobalFunction("CFCharacterSetIsLongCharacterMember")
    public static native boolean isLongCharacterMember(CFCharacterSet theSet, int theChar);
    @GlobalFunction("CFCharacterSetCreateBitmapRepresentation")
    public static native CFData createBitmapRepresentation(CFAllocator alloc, CFCharacterSet theSet);

}
