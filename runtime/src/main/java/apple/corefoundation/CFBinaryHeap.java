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
@Mapping("CFBinaryHeapRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFBinaryHeap 
    extends CFType 
     {

    
    
    protected CFBinaryHeap() {}
    
    
    
    
    @GlobalConstant("kCFStringBinaryHeapCallBacks")
    public static native CFBinaryHeapCallBacks getCopyStringCallBacks();
    
    @GlobalFunction("CFBinaryHeapGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBinaryHeapCreate")
    public static native CFBinaryHeap create(CFAllocator allocator, @MachineSizedSInt long capacity, CFBinaryHeapCallBacks callBacks, CFBinaryHeapCompareContext compareContext);
    @GlobalFunction("CFBinaryHeapCreateCopy")
    public static native CFBinaryHeap createCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBinaryHeap heap);
    @GlobalFunction("CFBinaryHeapGetCount")
    public static native @MachineSizedSInt long getCount(CFBinaryHeap heap);
    @GlobalFunction("CFBinaryHeapGetCountOfValue")
    public static native @MachineSizedSInt long getCountOfValue(CFBinaryHeap heap, Todo value);
    @GlobalFunction("CFBinaryHeapContainsValue")
    public static native boolean containsValue(CFBinaryHeap heap, Todo value);
    @GlobalFunction("CFBinaryHeapGetMinimum")
    public static native Todo getMinimum(CFBinaryHeap heap);
    @GlobalFunction("CFBinaryHeapGetMinimumIfPresent")
    public static native boolean getMinimumIfPresent(CFBinaryHeap heap, Todo value);
    @GlobalFunction("CFBinaryHeapGetValues")
    public static native void getValues(CFBinaryHeap heap, Todo values);
    @GlobalFunction("CFBinaryHeapApplyFunction")
    public static native void applyFunction(CFBinaryHeap heap, FunctionPtr applier, Todo context);
    @GlobalFunction("CFBinaryHeapAddValue")
    public static native void addValue(CFBinaryHeap heap, Todo value);
    @GlobalFunction("CFBinaryHeapRemoveMinimumValue")
    public static native void removeMinimumValue(CFBinaryHeap heap);
    @GlobalFunction("CFBinaryHeapRemoveAllValues")
    public static native void removeAllValues(CFBinaryHeap heap);
    
}
