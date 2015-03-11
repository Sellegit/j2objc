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
    protected native void appendValue(Todo value);
    @GlobalFunction("CFArrayInsertValueAtIndex")
    protected native void insertValueAtIndex(@MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArraySetValueAtIndex")
    protected native void setValueAtIndex(@MachineSizedSInt long idx, Todo value);
    @GlobalFunction("CFArrayRemoveValueAtIndex")
    protected native void removeValueAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFArrayRemoveAllValues")
    protected native void removeAllValues();
    @GlobalFunction("CFArrayReplaceValues")
    protected native void replaceValues(CFRange range, Todo newValues, @MachineSizedSInt long newCount);
    @GlobalFunction("CFArrayExchangeValuesAtIndices")
    protected native void exchangeValuesAtIndices(@MachineSizedSInt long idx1, @MachineSizedSInt long idx2);
    @GlobalFunction("CFArraySortValues")
    protected native void sortValues(CFRange range, FunctionPtr comparator, Todo context);
    @GlobalFunction("CFArrayAppendArray")
    protected native void appendArray(CFArray otherArray, CFRange otherRange);
    
}
