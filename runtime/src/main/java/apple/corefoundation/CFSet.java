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
@Mapping("CFSetRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFSet create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFSetCallBacks callBacks);
    @GlobalFunction("CFSetCreateCopy")
    public static native CFSet createCopy(CFAllocator allocator, CFSet theSet);
    @GlobalFunction("CFSetGetCount")
    public static native @MachineSizedSInt long getCount(CFSet theSet);
    @GlobalFunction("CFSetGetCountOfValue")
    public static native @MachineSizedSInt long getCountOfValue(CFSet theSet, Todo value);
    @GlobalFunction("CFSetContainsValue")
    public static native boolean containsValue(CFSet theSet, Todo value);
    @GlobalFunction("CFSetGetValue")
    public static native Todo getValue(CFSet theSet, Todo value);
    @GlobalFunction("CFSetGetValueIfPresent")
    public static native boolean getValueIfPresent(CFSet theSet, Todo candidate, Todo value);
    @GlobalFunction("CFSetGetValues")
    public static native void getValues(CFSet theSet, Todo values);
    @GlobalFunction("CFSetApplyFunction")
    public static native void applyFunction(CFSet theSet, FunctionPtr applier, Todo context);

}
