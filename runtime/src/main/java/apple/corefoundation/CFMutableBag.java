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
public class CFMutableBag 
    extends CFBag 
     {

    
    
    
    
    
    @GlobalFunction("CFBagCreateMutable")
    protected static native CFMutableBag createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFBagCallBacks callBacks);
    @GlobalFunction("CFBagCreateMutableCopy")
    protected static native CFMutableBag createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFBag theBag);
    @GlobalFunction("CFBagAddValue")
    protected native void addValue(Todo value);
    @GlobalFunction("CFBagReplaceValue")
    protected native void replaceValue(Todo value);
    @GlobalFunction("CFBagSetValue")
    protected native void setValue(Todo value);
    @GlobalFunction("CFBagRemoveValue")
    protected native void removeValue(Todo value);
    @GlobalFunction("CFBagRemoveAllValues")
    protected native void removeAllValues();
    
}
