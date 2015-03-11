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
public class CFAttributedString 
    extends CFType 
     {

    
    
    protected CFAttributedString() {}
    
    
    
    
    @GlobalFunction("CFAttributedStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFAttributedStringCreate")
    public static native CFAttributedString create(CFAllocator alloc, String str, CFDictionary attributes);
    @GlobalFunction("CFAttributedStringCreateWithSubstring")
    public static native CFAttributedString createWithSubstring(CFAllocator alloc, CFAttributedString aStr, CFRange range);
    @GlobalFunction("CFAttributedStringCreateCopy")
    public static native CFAttributedString createCopy(CFAllocator alloc, CFAttributedString aStr);
    @GlobalFunction("CFAttributedStringGetString")
    public native String getString();
    @GlobalFunction("CFAttributedStringGetLength")
    public native @MachineSizedSInt long getLength();
    @GlobalFunction("CFAttributedStringGetAttributes")
    public native CFDictionary getAttributes(@MachineSizedSInt long loc, CFRange effectiveRange);
    @GlobalFunction("CFAttributedStringGetAttribute")
    public native CFType getAttribute(@MachineSizedSInt long loc, String attrName, CFRange effectiveRange);
    @GlobalFunction("CFAttributedStringGetAttributesAndLongestEffectiveRange")
    public native CFDictionary getAttributesAndLongestEffectiveRange(@MachineSizedSInt long loc, CFRange inRange, CFRange longestEffectiveRange);
    @GlobalFunction("CFAttributedStringGetAttributeAndLongestEffectiveRange")
    public native CFType getAttributeAndLongestEffectiveRange(@MachineSizedSInt long loc, String attrName, CFRange inRange, CFRange longestEffectiveRange);
    @GlobalFunction("CFAttributedStringGetMutableString")
    public native CFMutableString getMutableString();
    
}
