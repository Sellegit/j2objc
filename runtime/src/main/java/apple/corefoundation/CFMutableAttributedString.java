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
public class CFMutableAttributedString 
    extends CFAttributedString 
     {

    
    
    
    
    
    @GlobalFunction("CFAttributedStringCreateMutableCopy")
    public static native CFMutableAttributedString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringCreateMutable")
    public static native CFMutableAttributedString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFAttributedStringReplaceString")
    public static native void replaceString(CFAttributedString aStr, CFRange range, String replacement);
    @GlobalFunction("CFAttributedStringSetAttributes")
    public static native void setAttributes(CFAttributedString aStr, CFRange range, CFDictionary replacement, boolean clearOtherAttributes);
    @GlobalFunction("CFAttributedStringSetAttribute")
    public static native void setAttribute(CFAttributedString aStr, CFRange range, String attrName, CFType value);
    @GlobalFunction("CFAttributedStringRemoveAttribute")
    public static native void removeAttribute(CFAttributedString aStr, CFRange range, String attrName);
    @GlobalFunction("CFAttributedStringReplaceAttributedString")
    public static native void replaceAttributedString(CFAttributedString aStr, CFRange range, CFAttributedString replacement);
    @GlobalFunction("CFAttributedStringBeginEditing")
    public static native void beginEditing(CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringEndEditing")
    public static native void endEditing(CFAttributedString aStr);
    
}
