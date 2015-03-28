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
@Mapping("CFMutableDictionaryRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableDictionary 
    extends CFDictionary 
     {

    
    
    protected CFMutableDictionary() {}

    
    
    
    @GlobalFunction("CFDictionaryCreateMutable")
    public static native CFMutableDictionary createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionaryKeyCallBacks keyCallBacks, CFDictionaryValueCallBacks valueCallBacks);
    @GlobalFunction("CFDictionaryCreateMutableCopy")
    public static native CFMutableDictionary createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionary theDict);
    @GlobalFunction("CFDictionaryAddValue")
    public static native void addValue(CFMutableDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionarySetValue")
    public static native void setValue(CFMutableDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryReplaceValue")
    public static native void replaceValue(CFMutableDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryRemoveValue")
    public static native void removeValue(CFMutableDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryRemoveAllValues")
    public static native void removeAllValues(CFMutableDictionary theDict);

}
