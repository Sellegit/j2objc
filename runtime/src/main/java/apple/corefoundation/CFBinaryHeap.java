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
    public native @MachineSizedSInt long getCount();
    @GlobalFunction("CFBinaryHeapGetCountOfValue")
    public native @MachineSizedSInt long getCountOfValue(Todo value);
    @GlobalFunction("CFBinaryHeapContainsValue")
    public native boolean containsValue(Todo value);
    @GlobalFunction("CFBinaryHeapGetMinimum")
    public native Todo getMinimum();
    @GlobalFunction("CFBinaryHeapGetMinimumIfPresent")
    public native boolean getMinimumIfPresent(Todo value);
    @GlobalFunction("CFBinaryHeapGetValues")
    public native void getValues(Todo values);
    @GlobalFunction("CFBinaryHeapApplyFunction")
    public native void applyFunction(FunctionPtr applier, Todo context);
    @GlobalFunction("CFBinaryHeapAddValue")
    public native void addValue(Todo value);
    @GlobalFunction("CFBinaryHeapRemoveMinimumValue")
    public native void removeMinimumValue();
    @GlobalFunction("CFBinaryHeapRemoveAllValues")
    public native void removeAllValues();
    
}
