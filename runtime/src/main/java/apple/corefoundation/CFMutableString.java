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
public class CFMutableString 
    extends CFString 
     {

    
    
    
    
    
    @GlobalFunction("CFStringCreateMutable")
    public static native CFMutableString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFStringCreateMutableCopy")
    public static native CFMutableString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, String theString);
    @GlobalFunction("CFStringCreateMutableWithExternalCharactersNoCopy")
    public static native CFMutableString createMutableWithExternalCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, @MachineSizedSInt long capacity, CFAllocator externalCharactersAllocator);
    @GlobalFunction("CFStringAppend")
    public static native void append(String theString, String appendedString);
    @GlobalFunction("CFStringAppendCharacters")
    public static native void appendCharacters(String theString, Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringAppendPascalString")
    public static native void appendPascalString(String theString, Todo pStr, int encoding);
    @GlobalFunction("CFStringAppendCString")
    public static native void appendCString(String theString, Todo cStr, int encoding);
    @GlobalFunction("CFStringInsert")
    public static native void insert(String str, @MachineSizedSInt long idx, String insertedStr);
    @GlobalFunction("CFStringDelete")
    public static native void delete(String theString, CFRange range);
    @GlobalFunction("CFStringReplace")
    public static native void replace(String theString, CFRange range, String replacement);
    @GlobalFunction("CFStringReplaceAll")
    public static native void replaceAll(String theString, String replacement);
    @GlobalFunction("CFStringFindAndReplace")
    public static native @MachineSizedSInt long findAndReplace(String theString, String stringToFind, String replacementString, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long compareOptions);
    @GlobalFunction("CFStringSetExternalCharactersNoCopy")
    public static native void setExternalCharactersNoCopy(String theString, Todo chars, @MachineSizedSInt long length, @MachineSizedSInt long capacity);
    @GlobalFunction("CFStringPad")
    public static native void pad(String theString, String padString, @MachineSizedSInt long length, @MachineSizedSInt long indexIntoPad);
    @GlobalFunction("CFStringTrim")
    public static native void trim(String theString, String trimString);
    @GlobalFunction("CFStringTrimWhitespace")
    public static native void trimWhitespace(String theString);
    @GlobalFunction("CFStringLowercase")
    public static native void lowercase(String theString, CFLocale locale);
    @GlobalFunction("CFStringUppercase")
    public static native void uppercase(String theString, CFLocale locale);
    @GlobalFunction("CFStringCapitalize")
    public static native void capitalize(String theString, CFLocale locale);
    @GlobalFunction("CFStringNormalize")
    public static native void normalize(String theString, @Representing("CFStringNormalizationForm") long theForm);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFold")
    public static native void fold(String theString, @Representing("CFStringCompareFlags") long theFlags, CFLocale theLocale);
    @GlobalFunction("CFStringTransform")
    public static native boolean transform(String string, CFRange range, String transform, boolean reverse);
    
}
