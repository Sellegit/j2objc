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
public class CFDictionary 
    extends CFPropertyList 
     {

    
    
    protected CFDictionary() {}
    
    
    
    
    @GlobalConstant("kCFTypeDictionaryKeyCallBacks")
    public static native CFDictionaryKeyCallBacks getTypeKeyCallBacks();
    @GlobalConstant("kCFCopyStringDictionaryKeyCallBacks")
    public static native CFDictionaryKeyCallBacks getCopyStringKeyCallBacks();
    @GlobalConstant("kCFTypeDictionaryValueCallBacks")
    public static native CFDictionaryValueCallBacks getTypeValueCallBacks();
    
    @GlobalFunction("CFDictionaryGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFDictionaryCreate")
    protected static native CFDictionary create(CFAllocator allocator, Todo keys, Todo values, @MachineSizedSInt long numValues, CFDictionaryKeyCallBacks keyCallBacks, CFDictionaryValueCallBacks valueCallBacks);
    @GlobalFunction("CFDictionaryCreateCopy")
    protected static native CFDictionary createCopy(CFAllocator allocator, CFDictionary theDict);
    @GlobalFunction("CFDictionaryGetCount")
    protected native @MachineSizedSInt long getCount();
    @GlobalFunction("CFDictionaryGetCountOfKey")
    protected native @MachineSizedSInt long getCountOfKey(Todo key);
    @GlobalFunction("CFDictionaryGetCountOfValue")
    protected native @MachineSizedSInt long getCountOfValue(Todo value);
    @GlobalFunction("CFDictionaryContainsKey")
    protected native boolean containsKey(Todo key);
    @GlobalFunction("CFDictionaryContainsValue")
    protected native boolean containsValue(Todo value);
    @GlobalFunction("CFDictionaryGetValue")
    protected native Todo getValue(Todo key);
    @GlobalFunction("CFDictionaryGetValueIfPresent")
    protected native boolean getValueIfPresent(Todo key, Todo value);
    @GlobalFunction("CFDictionaryGetKeysAndValues")
    protected native void getKeysAndValues(Todo keys, Todo values);
    @GlobalFunction("CFDictionaryApplyFunction")
    protected native void applyFunction(FunctionPtr applier, @Pointer long context);
    
}
