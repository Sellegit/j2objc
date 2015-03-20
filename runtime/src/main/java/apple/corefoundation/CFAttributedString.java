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
@Mapping("CFAttributedStringRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFAttributedString 
    extends CFType 
     {

    
    
    protected CFAttributedString() {}
    
    
    
    
    @GlobalFunction("CFAttributedStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFAttributedStringCreate")
    public static native CFAttributedString create(CFAllocator alloc, CFString str, CFDictionary attributes);
    @GlobalFunction("CFAttributedStringCreateWithSubstring")
    public static native CFAttributedString createWithSubstring(CFAllocator alloc, CFAttributedString aStr, CFRange range);
    @GlobalFunction("CFAttributedStringCreateCopy")
    public static native CFAttributedString createCopy(CFAllocator alloc, CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringGetString")
    public static native CFString getString(CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringGetLength")
    public static native @MachineSizedSInt long getLength(CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringGetAttributes")
    public static native CFDictionary getAttributes(CFAttributedString aStr, @MachineSizedSInt long loc, CFRange effectiveRange);
    @GlobalFunction("CFAttributedStringGetAttribute")
    public static native CFType getAttribute(CFAttributedString aStr, @MachineSizedSInt long loc, CFString attrName, CFRange effectiveRange);
    @GlobalFunction("CFAttributedStringGetAttributesAndLongestEffectiveRange")
    public static native CFDictionary getAttributesAndLongestEffectiveRange(CFAttributedString aStr, @MachineSizedSInt long loc, CFRange inRange, CFRange longestEffectiveRange);
    @GlobalFunction("CFAttributedStringGetAttributeAndLongestEffectiveRange")
    public static native CFType getAttributeAndLongestEffectiveRange(CFAttributedString aStr, @MachineSizedSInt long loc, CFString attrName, CFRange inRange, CFRange longestEffectiveRange);
    @GlobalFunction("CFAttributedStringGetMutableString")
    public static native CFMutableString getMutableString(CFMutableAttributedString aStr);
    
}
