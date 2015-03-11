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
public class CFMutableAttributedString 
    extends CFAttributedString 
     {

    
    
    
    
    
    @GlobalFunction("CFAttributedStringCreateMutableCopy")
    protected static native CFMutableAttributedString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringCreateMutable")
    protected static native CFMutableAttributedString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFAttributedStringReplaceString")
    public native void replaceString(CFRange range, String replacement);
    @GlobalFunction("CFAttributedStringSetAttributes")
    public native void setAttributes(CFRange range, CFDictionary replacement, boolean clearOtherAttributes);
    @GlobalFunction("CFAttributedStringSetAttribute")
    public native void setAttribute(CFRange range, String attrName, CFType value);
    @GlobalFunction("CFAttributedStringRemoveAttribute")
    public native void removeAttribute(CFRange range, String attrName);
    @GlobalFunction("CFAttributedStringReplaceAttributedString")
    public native void replaceAttributedString(CFRange range, CFAttributedString replacement);
    @GlobalFunction("CFAttributedStringBeginEditing")
    public native void beginEditing();
    @GlobalFunction("CFAttributedStringEndEditing")
    public native void endEditing();
    
}
