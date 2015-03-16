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
    protected static native CFMutableDictionary createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionaryKeyCallBacks keyCallBacks, CFDictionaryValueCallBacks valueCallBacks);
    @GlobalFunction("CFDictionaryCreateMutableCopy")
    protected static native CFMutableDictionary createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFDictionary theDict);
    @GlobalFunction("CFDictionaryAddValue")
    protected static native void addValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionarySetValue")
    protected static native void setValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryReplaceValue")
    protected static native void replaceValue(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryRemoveValue")
    protected static native void removeValue(CFDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryRemoveAllValues")
    protected static native void removeAllValues(CFDictionary theDict);
    
}
