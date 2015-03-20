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
@Mapping("CFMutableSetRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableSet 
    extends CFSet 
     {

    
    
    protected CFMutableSet() {}
    
    
    
    
    @GlobalFunction("CFSetCreateMutable")
    public static native CFMutableSet createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFSetCallBacks callBacks);
    @GlobalFunction("CFSetCreateMutableCopy")
    public static native CFMutableSet createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFSet theSet);
    @GlobalFunction("CFSetAddValue")
    public static native void addValue(CFMutableSet theSet, Todo value);
    @GlobalFunction("CFSetReplaceValue")
    public static native void replaceValue(CFMutableSet theSet, Todo value);
    @GlobalFunction("CFSetSetValue")
    public static native void setValue(CFMutableSet theSet, Todo value);
    @GlobalFunction("CFSetRemoveValue")
    public static native void removeValue(CFMutableSet theSet, Todo value);
    @GlobalFunction("CFSetRemoveAllValues")
    public static native void removeAllValues(CFMutableSet theSet);
    
}
