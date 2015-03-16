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
public class CFArray 
    extends CFPropertyList 
     {

    
    
    protected CFArray() {}
    
    
    
    
    @GlobalConstant("kCFTypeArrayCallBacks")
    public static native CFArrayCallBacks getTypeCallBacks();
    
    @GlobalFunction("CFArrayGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFArrayCreate")
    protected static native CFArray create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFArrayCallBacks callBacks);
    @GlobalFunction("CFArrayCreateCopy")
    protected static native CFArray createCopy(CFAllocator allocator, CFArray theArray);
    @GlobalFunction("CFArrayGetCount")
    protected static native @MachineSizedSInt long getCount(CFArray theArray);
    @GlobalFunction("CFArrayGetCountOfValue")
    protected static native @MachineSizedSInt long getCountOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayContainsValue")
    protected static native boolean containsValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayGetValueAtIndex")
    protected static native Todo getValueAtIndex(CFArray theArray, @MachineSizedSInt long idx);
    @GlobalFunction("CFArrayGetValues")
    protected static native void getValues(CFArray theArray, CFRange range, Todo values);
    @GlobalFunction("CFArrayApplyFunction")
    protected static native void applyFunction(CFArray theArray, CFRange range, FunctionPtr applier, Todo context);
    @GlobalFunction("CFArrayGetFirstIndexOfValue")
    protected static native @MachineSizedSInt long getFirstIndexOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayGetLastIndexOfValue")
    protected static native @MachineSizedSInt long getLastIndexOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayBSearchValues")
    protected static native @MachineSizedSInt long bSearchValues(CFArray theArray, CFRange range, Todo value, FunctionPtr comparator, Todo context);
    
}
