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
@Mapping("CFArrayRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFArray 
    extends CFPropertyList 
     {

    
    
    protected CFArray() {}

    
    
    
    @GlobalConstant("kCFTypeArrayCallBacks")
    public static native CFArrayCallBacks getTypeCallBacks();

    @GlobalFunction("CFArrayGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFArrayCreate")
    public static native CFArray create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFArrayCallBacks callBacks);
    @GlobalFunction("CFArrayCreateCopy")
    public static native CFArray createCopy(CFAllocator allocator, CFArray theArray);
    @GlobalFunction("CFArrayGetCount")
    public static native @MachineSizedSInt long getCount(CFArray theArray);
    @GlobalFunction("CFArrayGetCountOfValue")
    public static native @MachineSizedSInt long getCountOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayContainsValue")
    public static native boolean containsValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayGetValueAtIndex")
    public static native Todo getValueAtIndex(CFArray theArray, @MachineSizedSInt long idx);
    @GlobalFunction("CFArrayGetValues")
    public static native void getValues(CFArray theArray, CFRange range, Todo values);
    @GlobalFunction("CFArrayApplyFunction")
    public static native void applyFunction(CFArray theArray, CFRange range, FunctionPtr applier, Todo context);
    @GlobalFunction("CFArrayGetFirstIndexOfValue")
    public static native @MachineSizedSInt long getFirstIndexOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayGetLastIndexOfValue")
    public static native @MachineSizedSInt long getLastIndexOfValue(CFArray theArray, CFRange range, Todo value);
    @GlobalFunction("CFArrayBSearchValues")
    public static native @MachineSizedSInt long bSearchValues(CFArray theArray, CFRange range, Todo value, FunctionPtr comparator, Todo context);

}
