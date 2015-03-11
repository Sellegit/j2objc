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
public class CFTree 
    extends CFType 
     {

    
    
    protected CFTree() {}
    
    
    
    
    @GlobalFunction("CFTreeGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFTreeCreate")
    public static native CFTree create(CFAllocator allocator, CFTreeContext context);
    @GlobalFunction("CFTreeGetParent")
    public native CFTree getParent();
    @GlobalFunction("CFTreeGetNextSibling")
    public native CFTree getNextSibling();
    @GlobalFunction("CFTreeGetFirstChild")
    public native CFTree getFirstChild();
    @GlobalFunction("CFTreeGetContext")
    public native void getContext(CFTreeContext context);
    @GlobalFunction("CFTreeGetChildCount")
    public native @MachineSizedSInt long getChildCount();
    @GlobalFunction("CFTreeGetChildAtIndex")
    public native CFTree getChildAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFTreeGetChildren")
    public native void getChildren(Todo children);
    @GlobalFunction("CFTreeApplyFunctionToChildren")
    public native void applyFunctionToChildren(FunctionPtr applier, Todo context);
    @GlobalFunction("CFTreeFindRoot")
    public native CFTree findRoot();
    @GlobalFunction("CFTreeSetContext")
    public native void setContext(CFTreeContext context);
    @GlobalFunction("CFTreePrependChild")
    public native void prependChild(CFTree newChild);
    @GlobalFunction("CFTreeAppendChild")
    public native void appendChild(CFTree newChild);
    @GlobalFunction("CFTreeInsertSibling")
    public native void insertSibling(CFTree newSibling);
    @GlobalFunction("CFTreeRemove")
    public native void remove();
    @GlobalFunction("CFTreeRemoveAllChildren")
    public native void removeAllChildren();
    @GlobalFunction("CFTreeSortChildren")
    public native void sortChildren(FunctionPtr comparator, Todo context);
    
}
