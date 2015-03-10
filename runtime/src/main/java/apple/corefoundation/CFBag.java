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
    protected native @MachineSizedSInt long getCount();
    @GlobalFunction("CFBagGetCountOfValue")
    protected native @MachineSizedSInt long getCountOfValue(Todo value);
    @GlobalFunction("CFBagContainsValue")
    protected native boolean containsValue(Todo value);
    @GlobalFunction("CFBagGetValue")
    protected native Todo getValue(Todo value);
    @GlobalFunction("CFBagGetValueIfPresent")
    protected native boolean getValueIfPresent(Todo candidate, Todo value);
    @GlobalFunction("CFBagGetValues")
    protected native void getValues(Todo values);
    @GlobalFunction("CFBagApplyFunction")
    protected native void applyFunction(FunctionPtr applier, Todo context);
    
}
