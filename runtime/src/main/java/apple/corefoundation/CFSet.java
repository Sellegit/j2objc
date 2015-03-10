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
public class CFSet 
    extends CFType 
     {

    
    
    protected CFSet() {}
    
    
    
    
    @GlobalConstant("kCFTypeSetCallBacks")
    public static native CFSetCallBacks getTypeCallBacks();
    @GlobalConstant("kCFCopyStringSetCallBacks")
    public static native CFSetCallBacks getCopyStringCallBacks();
    
    @GlobalFunction("CFSetGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFSetCreate")
    protected static native CFSet create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFSetCallBacks callBacks);
    @GlobalFunction("CFSetCreateCopy")
    protected static native CFSet createCopy(CFAllocator allocator, CFSet theSet);
    @GlobalFunction("CFSetGetCount")
    protected native @MachineSizedSInt long getCount();
    @GlobalFunction("CFSetGetCountOfValue")
    protected native @MachineSizedSInt long getCountOfValue(Todo value);
    @GlobalFunction("CFSetContainsValue")
    protected native boolean containsValue(Todo value);
    @GlobalFunction("CFSetGetValue")
    protected native Todo getValue(Todo value);
    @GlobalFunction("CFSetGetValueIfPresent")
    protected native boolean getValueIfPresent(Todo candidate, Todo value);
    @GlobalFunction("CFSetGetValues")
    protected native void getValues(Todo values);
    @GlobalFunction("CFSetApplyFunction")
    protected native void applyFunction(FunctionPtr applier, Todo context);
    
}
