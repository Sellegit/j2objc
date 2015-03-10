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
public class CFString 
    extends CFPropertyList 
     {

    
    
    protected CFString() {}
    
    
    
    
    @GlobalFunction("CFStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFStringCreateWithPascalString")
    protected static native String createWithPascalString(CFAllocator alloc, Todo pStr, int encoding);
    @GlobalFunction("CFStringCreateWithCString")
    protected static native String createWithCString(CFAllocator alloc, Todo cStr, int encoding);
    @GlobalFunction("CFStringCreateWithBytes")
    protected static native String createWithBytes(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation);
    @GlobalFunction("CFStringCreateWithCharacters")
    protected static native String createWithCharacters(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringCreateWithPascalStringNoCopy")
    protected static native String createWithPascalStringNoCopy(CFAllocator alloc, Todo pStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCStringNoCopy")
    protected static native String createWithCStringNoCopy(CFAllocator alloc, Todo cStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithBytesNoCopy")
    protected static native String createWithBytesNoCopy(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCharactersNoCopy")
    protected static native String createWithCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithSubstring")
    protected static native String createWithSubstring(CFAllocator alloc, String str, CFRange range);
    @GlobalFunction("CFStringCreateCopy")
    protected static native String createCopy(CFAllocator alloc, CFString theString);
    @GlobalFunction("CFStringGetLength")
    public native @MachineSizedSInt long length();
    @GlobalFunction("CFStringGetCharacterAtIndex")
    protected native short getCharacterAtIndex(@MachineSizedSInt long idx);
    @GlobalFunction("CFStringGetCharacters")
    protected native void getCharacters(CFRange range, Todo buffer);
    @GlobalFunction("CFStringGetPascalString")
    protected native boolean getPascalString(Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetCString")
    protected native boolean getCString(Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetPascalStringPtr")
    protected native Todo getPascalStringPtr(int encoding);
    @GlobalFunction("CFStringGetCStringPtr")
    protected native Todo getCStringPtr(int encoding);
    @GlobalFunction("CFStringGetCharactersPtr")
    protected native Todo getCharactersPtr();
    @GlobalFunction("CFStringGetBytes")
    protected native @MachineSizedSInt long getBytes(CFRange range, int encoding, byte lossByte, boolean isExternalRepresentation, Todo buffer, @MachineSizedSInt long maxBufLen, Todo usedBufLen);
    @GlobalFunction("CFStringCreateFromExternalRepresentation")
    protected static native String createFromExternalRepresentation(CFAllocator alloc, CFData data, int encoding);
    @GlobalFunction("CFStringCreateExternalRepresentation")
    protected static native CFData createExternalRepresentation(CFAllocator alloc, CFString theString, int encoding, byte lossByte);
    @GlobalFunction("CFStringGetSmallestEncoding")
    protected native int getSmallestEncoding();
    @GlobalFunction("CFStringGetFastestEncoding")
    protected native int getFastestEncoding();
    @GlobalFunction("CFStringGetSystemEncoding")
    protected static native int getSystemEncoding();
    @GlobalFunction("CFStringGetMaximumSizeForEncoding")
    protected static native @MachineSizedSInt long getMaximumSizeForEncoding(@MachineSizedSInt long length, int encoding);
    @GlobalFunction("CFStringGetFileSystemRepresentation")
    protected static native boolean getFileSystemRepresentation(String string, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFStringGetMaximumSizeOfFileSystemRepresentation")
    protected static native @MachineSizedSInt long getMaximumSizeOfFileSystemRepresentation(String string);
    @GlobalFunction("CFStringCreateWithFileSystemRepresentation")
    protected static native String createWithFileSystemRepresentation(CFAllocator alloc, Todo buffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringCompareWithOptionsAndLocale")
    protected static native CFComparisonResult compareWithOptionsAndLocale(String theString1, String theString2, CFRange rangeToCompare, CFStringCompareFlags compareOptions, CFLocale locale);
    @GlobalFunction("CFStringCompareWithOptions")
    protected static native CFComparisonResult compareWithOptions(String theString1, String theString2, CFRange rangeToCompare, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringCompare")
    protected static native CFComparisonResult compare(String theString1, String theString2, CFStringCompareFlags compareOptions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFindWithOptionsAndLocale")
    protected native boolean findWithOptionsAndLocale(String stringToFind, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFLocale locale, CFRange result);
    @GlobalFunction("CFStringFindWithOptions")
    protected native boolean findWithOptions(String stringToFind, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFRange result);
    @GlobalFunction("CFStringCreateArrayWithFindResults")
    protected static native CFArray createArrayWithFindResults(CFAllocator alloc, CFString theString, String stringToFind, CFRange rangeToSearch, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringFind")
    protected native CFRange find(String stringToFind, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringHasPrefix")
    protected native boolean hasPrefix(String prefix);
    @GlobalFunction("CFStringHasSuffix")
    protected native boolean hasSuffix(String suffix);
    @GlobalFunction("CFStringGetRangeOfComposedCharactersAtIndex")
    protected native CFRange getRangeOfComposedCharactersAtIndex(@MachineSizedSInt long theIndex);
    @GlobalFunction("CFStringFindCharacterFromSet")
    protected native boolean findCharacterFromSet(CFCharacterSet theSet, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFRange result);
    @GlobalFunction("CFStringGetLineBounds")
    protected native void getLineBounds(CFRange range, Todo lineBeginIndex, Todo lineEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringGetParagraphBounds")
    protected static native void getParagraphBounds(String string, CFRange range, Todo parBeginIndex, Todo parEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("CFStringGetHyphenationLocationBeforeIndex")
    protected native @MachineSizedSInt long getHyphenationLocationBeforeIndex(@MachineSizedSInt long location, CFRange limitRange, @MachineSizedUInt long options, CFLocale locale, Todo character);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("CFStringIsHyphenationAvailableForLocale")
    protected static native boolean isHyphenationAvailableForLocale(CFLocale locale);
    @GlobalFunction("CFStringCreateByCombiningStrings")
    protected static native String createByCombiningStrings(CFAllocator alloc, CFArray theArray, String separatorString);
    @GlobalFunction("CFStringCreateArrayBySeparatingStrings")
    protected static native CFArray createArrayBySeparatingStrings(CFAllocator alloc, CFString theString, String separatorString);
    @GlobalFunction("CFStringGetIntValue")
    protected static native int getIntValue(String str);
    @GlobalFunction("CFStringGetDoubleValue")
    protected static native double getDoubleValue(String str);
    @GlobalFunction("CFStringIsEncodingAvailable")
    protected static native boolean isEncodingAvailable(int encoding);
    @GlobalFunction("CFStringGetListOfAvailableEncodings")
    protected static native Todo getListOfAvailableEncodings();
    @GlobalFunction("CFStringGetNameOfEncoding")
    protected static native String getNameOfEncoding(int encoding);
    @GlobalFunction("CFStringConvertEncodingToNSStringEncoding")
    protected static native @MachineSizedUInt long convertEncodingToNSStringEncoding(int encoding);
    @GlobalFunction("CFStringConvertNSStringEncodingToEncoding")
    protected static native int convertNSStringEncodingToEncoding(@MachineSizedUInt long encoding);
    @GlobalFunction("CFStringConvertEncodingToWindowsCodepage")
    protected static native int convertEncodingToWindowsCodepage(int encoding);
    @GlobalFunction("CFStringConvertWindowsCodepageToEncoding")
    protected static native int convertWindowsCodepageToEncoding(int codepage);
    @GlobalFunction("CFStringConvertIANACharSetNameToEncoding")
    protected native int convertIANACharSetNameToEncoding();
    @GlobalFunction("CFStringConvertEncodingToIANACharSetName")
    protected static native String convertEncodingToIANACharSetName(int encoding);
    @GlobalFunction("CFStringGetMostCompatibleMacStringEncoding")
    protected static native int getMostCompatibleMacStringEncoding(int encoding);
    @GlobalFunction("CFShowStr")
    public native void show();
    
}
