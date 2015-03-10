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
public class CFMutableSet 
    extends CFSet 
     {

    
    
    
    
    
    @GlobalFunction("CFSetCreateMutable")
    protected static native CFMutableSet createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFSetCallBacks callBacks);
    @GlobalFunction("CFSetCreateMutableCopy")
    protected static native CFMutableSet createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFSet theSet);
    @GlobalFunction("CFSetAddValue")
    protected native void addValue(Todo value);
    @GlobalFunction("CFSetReplaceValue")
    protected native void replaceValue(Todo value);
    @GlobalFunction("CFSetSetValue")
    protected native void setValue(Todo value);
    @GlobalFunction("CFSetRemoveValue")
    protected native void removeValue(Todo value);
    @GlobalFunction("CFSetRemoveAllValues")
    protected native void removeAllValues();
    
}
