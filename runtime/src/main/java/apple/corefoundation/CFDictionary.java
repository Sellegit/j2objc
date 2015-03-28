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
@Mapping("CFDictionaryRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFDictionary create(CFAllocator allocator, Todo keys, Todo values, @MachineSizedSInt long numValues, CFDictionaryKeyCallBacks keyCallBacks, CFDictionaryValueCallBacks valueCallBacks);
    @GlobalFunction("CFDictionaryCreateCopy")
    public static native CFDictionary createCopy(CFAllocator allocator, CFDictionary theDict);
    @GlobalFunction("CFDictionaryGetCount")
    public static native @MachineSizedSInt long getCount(CFDictionary theDict);
    @GlobalFunction("CFDictionaryGetCountOfKey")
    public static native @MachineSizedSInt long getCountOfKey(CFDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryGetCountOfValue")
    public static native @MachineSizedSInt long getCountOfValue(CFDictionary theDict, Todo value);
    @GlobalFunction("CFDictionaryContainsKey")
    public static native boolean containsKey(CFDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryContainsValue")
    public static native boolean containsValue(CFDictionary theDict, Todo value);
    @GlobalFunction("CFDictionaryGetValue")
    public static native Todo getValue(CFDictionary theDict, Todo key);
    @GlobalFunction("CFDictionaryGetValueIfPresent")
    public static native boolean getValueIfPresent(CFDictionary theDict, Todo key, Todo value);
    @GlobalFunction("CFDictionaryGetKeysAndValues")
    public static native void getKeysAndValues(CFDictionary theDict, Todo keys, Todo values);
    @GlobalFunction("CFDictionaryApplyFunction")
    public static native void applyFunction(CFDictionary theDict, FunctionPtr applier, Todo context);

}
