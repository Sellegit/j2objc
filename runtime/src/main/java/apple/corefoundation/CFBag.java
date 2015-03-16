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
    protected static native CFBag create(CFAllocator allocator, Todo values, @MachineSizedSInt long numValues, CFBagCallBacks callBacks);
    @GlobalFunction("CFBagCreateCopy")
    protected static native CFBag createCopy(CFAllocator allocator, CFBag theBag);
    @GlobalFunction("CFBagGetCount")
    protected static native @MachineSizedSInt long getCount(CFBag theBag);
    @GlobalFunction("CFBagGetCountOfValue")
    protected static native @MachineSizedSInt long getCountOfValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagContainsValue")
    protected static native boolean containsValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagGetValue")
    protected static native Todo getValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagGetValueIfPresent")
    protected static native boolean getValueIfPresent(CFBag theBag, Todo candidate, Todo value);
    @GlobalFunction("CFBagGetValues")
    protected static native void getValues(CFBag theBag, Todo values);
    @GlobalFunction("CFBagApplyFunction")
    protected static native void applyFunction(CFBag theBag, FunctionPtr applier, Todo context);
    
}
