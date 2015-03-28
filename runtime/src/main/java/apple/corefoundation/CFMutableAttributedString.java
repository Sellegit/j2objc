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
@Mapping("CFMutableAttributedStringRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableAttributedString 
    extends CFAttributedString 
     {

    
    
    protected CFMutableAttributedString() {}

    
    
    
    @GlobalFunction("CFAttributedStringCreateMutableCopy")
    public static native CFMutableAttributedString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringCreateMutable")
    public static native CFMutableAttributedString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFAttributedStringReplaceString")
    public static native void replaceString(CFMutableAttributedString aStr, CFRange range, CFString replacement);
    @GlobalFunction("CFAttributedStringSetAttributes")
    public static native void setAttributes(CFMutableAttributedString aStr, CFRange range, CFDictionary replacement, boolean clearOtherAttributes);
    @GlobalFunction("CFAttributedStringSetAttribute")
    public static native void setAttribute(CFMutableAttributedString aStr, CFRange range, CFString attrName, CFType value);
    @GlobalFunction("CFAttributedStringRemoveAttribute")
    public static native void removeAttribute(CFMutableAttributedString aStr, CFRange range, CFString attrName);
    @GlobalFunction("CFAttributedStringReplaceAttributedString")
    public static native void replaceAttributedString(CFMutableAttributedString aStr, CFRange range, CFAttributedString replacement);
    @GlobalFunction("CFAttributedStringBeginEditing")
    public static native void beginEditing(CFMutableAttributedString aStr);
    @GlobalFunction("CFAttributedStringEndEditing")
    public static native void endEditing(CFMutableAttributedString aStr);

}
