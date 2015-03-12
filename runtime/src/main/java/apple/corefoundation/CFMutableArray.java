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
public class CFMutableArray 
    extends CFArray 
     {

    
    
    
    
    
    @GlobalFunction("CFArrayCreateMutable")
    protected static native CFMutableArray createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFArrayCallBacks callBacks);
    @GlobalFunction("CFArrayCreateMutableCopy")
    protected static native CFMutableArray createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFArray theArray);
    @GlobalFunction("CFArrayAppendValue")
    protected static native void appendValue(CFArray theArray, Todo value);
    @GlobalFunction("CFArrayInsertValueAtIndex")
    protected static native void insertValueAtIndex(CFArray theArray, @MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArraySetValueAtIndex")
    protected static native void setValueAtIndex(CFArray theArray, @MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArrayRemoveValueAtIndex")
    protected static native void removeValueAtIndex(CFArray theArray, @MachineSizedSInt long idx);
    @GlobalFunction("CFArrayRemoveAllValues")
    protected static native void removeAllValues(CFArray theArray);
    @GlobalFunction("CFArrayReplaceValues")
    protected static native void replaceValues(CFArray theArray, CFRange range, Todo newValues, @MachineSizedSInt long newCount);
    @GlobalFunction("CFArrayExchangeValuesAtIndices")
    protected static native void exchangeValuesAtIndices(CFArray theArray, @MachineSizedSInt long idx1, @MachineSizedSInt long idx2);
    @GlobalFunction("CFArraySortValues")
    protected static native void sortValues(CFArray theArray, CFRange range, FunctionPtr comparator, Todo context);
    @GlobalFunction("CFArrayAppendArray")
    protected static native void appendArray(CFArray theArray, CFArray otherArray, CFRange otherRange);
    
}
