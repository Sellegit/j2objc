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
public class CFMutableCharacterSet 
    extends CFCharacterSet 
     {

    
    
    
    
    
    @GlobalFunction("CFCharacterSetCreateMutable")
    public static native CFMutableCharacterSet createMutable(CFAllocator alloc);
    @GlobalFunction("CFCharacterSetCreateMutableCopy")
    public static native CFMutableCharacterSet createMutableCopy(CFAllocator alloc, CFCharacterSet theSet);
    @GlobalFunction("CFCharacterSetAddCharactersInRange")
    public static native void addCharactersInRange(CFCharacterSet theSet, CFRange theRange);
    @GlobalFunction("CFCharacterSetRemoveCharactersInRange")
    public static native void removeCharactersInRange(CFCharacterSet theSet, CFRange theRange);
    @GlobalFunction("CFCharacterSetAddCharactersInString")
    public static native void addCharactersInString(CFCharacterSet theSet, String theString);
    @GlobalFunction("CFCharacterSetRemoveCharactersInString")
    public static native void removeCharactersInString(CFCharacterSet theSet, String theString);
    @GlobalFunction("CFCharacterSetUnion")
    public static native void union(CFCharacterSet theSet, CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetIntersect")
    public static native void intersect(CFCharacterSet theSet, CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetInvert")
    public static native void invert(CFCharacterSet theSet);
    
}
