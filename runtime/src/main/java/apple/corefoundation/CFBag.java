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
@Mapping("CFBagRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFBag 
    extends CFType 
     {

    
    
    protected CFBag() {}
    
    
    
    
    @GlobalConstant("kCFTypeBagCallBacks")
    public static native CFBagCallBacks getTypeCallBacks();
    @GlobalConstant("kCFCopyStringBagCallBacks")
    public static native CFBagCallBacks getCopyStringCallBacks();
    
    @GlobalFunction("CFBagGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFBagCreate")
    public static native CFBag create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFBagCallBacks callBacks);
    @GlobalFunction("CFBagCreateCopy")
    public static native CFBag createCopy(CFAllocator allocator, CFBag theBag);
    @GlobalFunction("CFBagGetCount")
    public static native @MachineSizedSInt long getCount(CFBag theBag);
    @GlobalFunction("CFBagGetCountOfValue")
    public static native @MachineSizedSInt long getCountOfValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagContainsValue")
    public static native boolean containsValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagGetValue")
    public static native Todo getValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagGetValueIfPresent")
    public static native boolean getValueIfPresent(CFBag theBag, Todo candidate, Todo value);
    @GlobalFunction("CFBagGetValues")
    public static native void getValues(CFBag theBag, Todo values);
    @GlobalFunction("CFBagApplyFunction")
    public static native void applyFunction(CFBag theBag, FunctionPtr applier, Todo context);
    
}
