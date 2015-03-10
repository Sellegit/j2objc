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
public class CFMutableCharacterSet 
    extends CFCharacterSet 
     {

    
    
    
    
    
    @GlobalFunction("CFCharacterSetCreateMutable")
    protected static native CFMutableCharacterSet createMutable(CFAllocator alloc);
    @GlobalFunction("CFCharacterSetCreateMutableCopy")
    protected static native CFMutableCharacterSet createMutableCopy(CFAllocator alloc, CFCharacterSet theSet);
    @GlobalFunction("CFCharacterSetAddCharactersInRange")
    public native void addCharactersInRange(CFRange theRange);
    @GlobalFunction("CFCharacterSetRemoveCharactersInRange")
    public native void removeCharactersInRange(CFRange theRange);
    @GlobalFunction("CFCharacterSetAddCharactersInString")
    public native void addCharactersInString(String theString);
    @GlobalFunction("CFCharacterSetRemoveCharactersInString")
    public native void removeCharactersInString(String theString);
    @GlobalFunction("CFCharacterSetUnion")
    public native void union(CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetIntersect")
    public native void intersect(CFCharacterSet theOtherSet);
    @GlobalFunction("CFCharacterSetInvert")
    public native void invert();
    
}
