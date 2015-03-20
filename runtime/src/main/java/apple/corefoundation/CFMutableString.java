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
@Mapping("CFMutableStringRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFMutableString 
    extends CFString 
     {

    
    
    protected CFMutableString() {}
    
    
    
    
    @GlobalFunction("CFStringCreateMutable")
    public static native CFMutableString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFStringCreateMutableCopy")
    public static native CFMutableString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, CFString theString);
    @GlobalFunction("CFStringCreateMutableWithExternalCharactersNoCopy")
    public static native CFMutableString createMutableWithExternalCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, @MachineSizedSInt long capacity, CFAllocator externalCharactersAllocator);
    @GlobalFunction("CFStringAppend")
    public static native void append(CFMutableString theString, CFString appendedString);
    @GlobalFunction("CFStringAppendCharacters")
    public static native void appendCharacters(CFMutableString theString, Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringAppendPascalString")
    public static native void appendPascalString(CFMutableString theString, Todo pStr, int encoding);
    @GlobalFunction("CFStringAppendCString")
    public static native void appendCString(CFMutableString theString, Todo cStr, int encoding);
    @GlobalFunction("CFStringInsert")
    public static native void insert(CFMutableString str, @MachineSizedSInt long idx, CFString insertedStr);
    @GlobalFunction("CFStringDelete")
    public static native void delete(CFMutableString theString, CFRange range);
    @GlobalFunction("CFStringReplace")
    public static native void replace(CFMutableString theString, CFRange range, CFString replacement);
    @GlobalFunction("CFStringReplaceAll")
    public static native void replaceAll(CFMutableString theString, CFString replacement);
    @GlobalFunction("CFStringFindAndReplace")
    public static native @MachineSizedSInt long findAndReplace(CFMutableString theString, CFString stringToFind, CFString replacementString, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long compareOptions);
    @GlobalFunction("CFStringSetExternalCharactersNoCopy")
    public static native void setExternalCharactersNoCopy(CFMutableString theString, Todo chars, @MachineSizedSInt long length, @MachineSizedSInt long capacity);
    @GlobalFunction("CFStringPad")
    public static native void pad(CFMutableString theString, CFString padString, @MachineSizedSInt long length, @MachineSizedSInt long indexIntoPad);
    @GlobalFunction("CFStringTrim")
    public static native void trim(CFMutableString theString, CFString trimString);
    @GlobalFunction("CFStringTrimWhitespace")
    public static native void trimWhitespace(CFMutableString theString);
    @GlobalFunction("CFStringLowercase")
    public static native void lowercase(CFMutableString theString, CFLocale locale);
    @GlobalFunction("CFStringUppercase")
    public static native void uppercase(CFMutableString theString, CFLocale locale);
    @GlobalFunction("CFStringCapitalize")
    public static native void capitalize(CFMutableString theString, CFLocale locale);
    @GlobalFunction("CFStringNormalize")
    public static native void normalize(CFMutableString theString, @Representing("CFStringNormalizationForm") long theForm);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFold")
    public static native void fold(CFMutableString theString, @Representing("CFStringCompareFlags") long theFlags, CFLocale theLocale);
    @GlobalFunction("CFStringTransform")
    public static native boolean transform(CFMutableString string, CFRange range, CFString transform, boolean reverse);
    
}
