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
@Mapping("CFMutableCharacterSetRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableCharacterSet 
    extends CFCharacterSet 
     {

    
    
    protected CFMutableCharacterSet() {}
    
    
    
    
    @GlobalFunction("CFCharacterSetCreateMutable")
    public static native CFMutableCharacterSet createMutable(CFAllocator alloc);
    @GlobalFunction("CFCharacterSetCreateMutableCopy")
    public static native CFMutableCharacterSet createMutableCopy(CFAllocator alloc, CFCharacterSet theSet);
    @GlobalFunction("CFCharacterSetAddCharactersInRange")
    public static native void addCharactersInRange(CFMutableCharacterSet theSet, CFRange theRange);
    @GlobalFunction("CFCharacterSetRemoveCharactersInRange")
    public static native void removeCharactersInRange(CFMutableCharacterSet theSet, CFRange theRange);
    @GlobalFunction("CFCharacterSetAddCharactersInString")
    public static native void addCharactersInString(CFMutableCharacterSet theSet, CFString theString);
    @GlobalFunction("CFCharacterSetRemoveCharactersInString")
    public static native void removeCharactersInString(CFMutableCharacterSet theSet, CFString theString);
    @GlobalFunction("CFCharacterSetUnion")
    public static native void union(CFMutableCharacterSet theSet, CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetIntersect")
    public static native void intersect(CFMutableCharacterSet theSet, CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetInvert")
    public static native void invert(CFMutableCharacterSet theSet);
    
}
