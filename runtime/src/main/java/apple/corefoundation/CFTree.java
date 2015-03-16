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
public class CFTree 
    extends CFType 
     {

    
    
    protected CFTree() {}
    
    
    
    
    @GlobalFunction("CFTreeGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFTreeCreate")
    public static native CFTree create(CFAllocator allocator, CFTreeContext context);
    @GlobalFunction("CFTreeGetParent")
    public static native CFTree getParent(CFTree tree);
    @GlobalFunction("CFTreeGetNextSibling")
    public static native CFTree getNextSibling(CFTree tree);
    @GlobalFunction("CFTreeGetFirstChild")
    public static native CFTree getFirstChild(CFTree tree);
    @GlobalFunction("CFTreeGetContext")
    public static native void getContext(CFTree tree, CFTreeContext context);
    @GlobalFunction("CFTreeGetChildCount")
    public static native @MachineSizedSInt long getChildCount(CFTree tree);
    @GlobalFunction("CFTreeGetChildAtIndex")
    public static native CFTree getChildAtIndex(CFTree tree, @MachineSizedSInt long idx);
    @GlobalFunction("CFTreeGetChildren")
    public static native void getChildren(CFTree tree, Todo children);
    @GlobalFunction("CFTreeApplyFunctionToChildren")
    public static native void applyFunctionToChildren(CFTree tree, FunctionPtr applier, Todo context);
    @GlobalFunction("CFTreeFindRoot")
    public static native CFTree findRoot(CFTree tree);
    @GlobalFunction("CFTreeSetContext")
    public static native void setContext(CFTree tree, CFTreeContext context);
    @GlobalFunction("CFTreePrependChild")
    public static native void prependChild(CFTree tree, CFTree newChild);
    @GlobalFunction("CFTreeAppendChild")
    public static native void appendChild(CFTree tree, CFTree newChild);
    @GlobalFunction("CFTreeInsertSibling")
    public static native void insertSibling(CFTree tree, CFTree newSibling);
    @GlobalFunction("CFTreeRemove")
    public static native void remove(CFTree tree);
    @GlobalFunction("CFTreeRemoveAllChildren")
    public static native void removeAllChildren(CFTree tree);
    @GlobalFunction("CFTreeSortChildren")
    public static native void sortChildren(CFTree tree, FunctionPtr comparator, Todo context);
    
}
