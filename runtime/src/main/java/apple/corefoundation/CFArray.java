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
    protected native @MachineSizedSInt long getCount();
    @GlobalFunction("CFArrayGetCountOfValue")
    protected native @MachineSizedSInt long getCountOfValue(CFRange range, Todo value);
    @GlobalFunction("CFArrayContainsValue")
    protected native boolean containsValue(CFRange range, Todo value);
    @GlobalFunction("CFArrayGetValueAtIndex")
    protected native Todo getValueAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFArrayGetValues")
    protected native void getValues(CFRange range, Todo values);
    @GlobalFunction("CFArrayApplyFunction")
    protected native void applyFunction(CFRange range, FunctionPtr applier, Todo context);
    @GlobalFunction("CFArrayGetFirstIndexOfValue")
    protected native @MachineSizedSInt long getFirstIndexOfValue(CFRange range, Todo value);
    @GlobalFunction("CFArrayGetLastIndexOfValue")
    protected native @MachineSizedSInt long getLastIndexOfValue(CFRange range, Todo value);
    @GlobalFunction("CFArrayBSearchValues")
    protected native @MachineSizedSInt long bSearchValues(CFRange range, Todo value, FunctionPtr comparator, Todo context);
    
}
