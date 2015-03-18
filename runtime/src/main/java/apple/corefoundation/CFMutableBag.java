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
public class CFMutableBag 
    extends CFBag 
     {

    
    
    
    
    
    @GlobalFunction("CFBagCreateMutable")
    public static native CFMutableBag createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFBagCallBacks callBacks);
    @GlobalFunction("CFBagCreateMutableCopy")
    public static native CFMutableBag createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBag theBag);
    @GlobalFunction("CFBagAddValue")
    public static native void addValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagReplaceValue")
    public static native void replaceValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagSetValue")
    public static native void setValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagRemoveValue")
    public static native void removeValue(CFBag theBag, Todo value);
    @GlobalFunction("CFBagRemoveAllValues")
    public static native void removeAllValues(CFBag theBag);
    
}
