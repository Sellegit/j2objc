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
public class CFMutableDictionary 
    extends CFDictionary 
     {

    
    
    
    
    
    @GlobalFunction("CFDictionaryCreateMutable")
    public static native CFMutableDictionary createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionaryKeyCallBacks keyCallBacks, CFDictionaryValueCallBacks valueCallBacks);
    @GlobalFunction("CFDictionaryCreateMutableCopy")
    public static native CFMutableDictionary createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionary theDict);
    @GlobalFunction("CFDictionaryAddValue")
    public static native void addValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionarySetValue")
    public static native void setValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryReplaceValue")
    public static native void replaceValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryRemoveValue")
    public static native void removeValue(CFDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryRemoveAllValues")
    public static native void removeAllValues(CFDictionary theDict);
    
}
