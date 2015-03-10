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
public class CFMutableString 
    extends CFString 
     {

    
    
    
    
    
    @GlobalFunction("CFStringCreateMutable")
    protected static native CFMutableString createMutable(CFAllocator alloc, @MachineSizedSInt long maxLength);
    @GlobalFunction("CFStringCreateMutableCopy")
    protected static native CFMutableString createMutableCopy(CFAllocator alloc, @MachineSizedSInt long maxLength, String theString);
    @GlobalFunction("CFStringCreateMutableWithExternalCharactersNoCopy")
    protected static native CFMutableString createMutableWithExternalCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, @MachineSizedSInt long capacity, CFAllocator externalCharactersAllocator);
    @GlobalFunction("CFStringAppend")
    public native void append(String appendedString);
    @GlobalFunction("CFStringAppendCharacters")
    public native void appendCharacters(Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringAppendPascalString")
    public native void appendPascalString(Todo pStr, int encoding);
    @GlobalFunction("CFStringAppendCString")
    public native void appendCString(Todo cStr, int encoding);
    @GlobalFunction("CFStringInsert")
    public native void insert(@MachineSizedSInt long idx, String insertedStr);
    @GlobalFunction("CFStringDelete")
    public native void delete(CFRange range);
    @GlobalFunction("CFStringReplace")
    public native void replace(CFRange range, String replacement);
    @GlobalFunction("CFStringReplaceAll")
    public native void replaceAll(String replacement);
    @GlobalFunction("CFStringFindAndReplace")
    public native @MachineSizedSInt long findAndReplace(String stringToFind, String replacementString, CFRange rangeToSearch, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringSetExternalCharactersNoCopy")
    public native void setExternalCharactersNoCopy(Todo chars, @MachineSizedSInt long length, @MachineSizedSInt long capacity);
    @GlobalFunction("CFStringPad")
    public native void pad(String padString, @MachineSizedSInt long length, @MachineSizedSInt long indexIntoPad);
    @GlobalFunction("CFStringTrim")
    public native void trim(String trimString);
    @GlobalFunction("CFStringTrimWhitespace")
    public native void trimWhitespace();
    @GlobalFunction("CFStringLowercase")
    public native void lowercase(CFLocale locale);
    @GlobalFunction("CFStringUppercase")
    public native void uppercase(CFLocale locale);
    @GlobalFunction("CFStringCapitalize")
    public native void capitalize(CFLocale locale);
    @GlobalFunction("CFStringNormalize")
    public native void normalize(CFStringNormalizationForm theForm);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFold")
    public native void fold(CFStringCompareFlags theFlags, CFLocale theLocale);
    @GlobalFunction("CFStringTransform")
    public native boolean transform(CFRange range, String transform, boolean reverse);
    
}
