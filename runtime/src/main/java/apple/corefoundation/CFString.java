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
public class CFString 
    extends CFPropertyList 
     {

    
    
    protected CFString() {}
    
    
    
    
    @GlobalFunction("CFStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFStringCreateWithPascalString")
    public static native String createWithPascalString(CFAllocator alloc, Todo pStr, int encoding);
    @GlobalFunction("CFStringCreateWithCString")
    public static native String createWithCString(CFAllocator alloc, Todo cStr, int encoding);
    @GlobalFunction("CFStringCreateWithBytes")
    public static native String createWithBytes(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation);
    @GlobalFunction("CFStringCreateWithCharacters")
    public static native String createWithCharacters(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringCreateWithPascalStringNoCopy")
    public static native String createWithPascalStringNoCopy(CFAllocator alloc, Todo pStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCStringNoCopy")
    public static native String createWithCStringNoCopy(CFAllocator alloc, Todo cStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithBytesNoCopy")
    public static native String createWithBytesNoCopy(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCharactersNoCopy")
    public static native String createWithCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithSubstring")
    public static native String createWithSubstring(CFAllocator alloc, String str, CFRange range);
    @GlobalFunction("CFStringCreateCopy")
    public static native String createCopy(CFAllocator alloc, String theString);
    @GlobalFunction("CFStringGetLength")
    public static native @MachineSizedSInt long length(String theString);
    @GlobalFunction("CFStringGetCharacterAtIndex")
    public static native short getCharacterAtIndex(String theString, @MachineSizedSInt long idx);
    @GlobalFunction("CFStringGetCharacters")
    public static native void getCharacters(String theString, CFRange range, Todo buffer);
    @GlobalFunction("CFStringGetPascalString")
    public static native boolean getPascalString(String theString, Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetCString")
    public static native boolean getCString(String theString, Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetPascalStringPtr")
    public static native Todo getPascalStringPtr(String theString, int encoding);
    @GlobalFunction("CFStringGetCStringPtr")
    public static native Todo getCStringPtr(String theString, int encoding);
    @GlobalFunction("CFStringGetCharactersPtr")
    public static native Todo getCharactersPtr(String theString);
    @GlobalFunction("CFStringGetBytes")
    public static native @MachineSizedSInt long getBytes(String theString, CFRange range, int encoding, byte lossByte, boolean isExternalRepresentation, Todo buffer, @MachineSizedSInt long maxBufLen, Todo usedBufLen);
    @GlobalFunction("CFStringCreateFromExternalRepresentation")
    public static native String createFromExternalRepresentation(CFAllocator alloc, CFData data, int encoding);
    @GlobalFunction("CFStringCreateExternalRepresentation")
    public static native CFData createExternalRepresentation(CFAllocator alloc, String theString, int encoding, byte lossByte);
    @GlobalFunction("CFStringGetSmallestEncoding")
    public static native int getSmallestEncoding(String theString);
    @GlobalFunction("CFStringGetFastestEncoding")
    public static native int getFastestEncoding(String theString);
    @GlobalFunction("CFStringGetSystemEncoding")
    public static native int getSystemEncoding();
    @GlobalFunction("CFStringGetMaximumSizeForEncoding")
    public static native @MachineSizedSInt long getMaximumSizeForEncoding(@MachineSizedSInt long length, int encoding);
    @GlobalFunction("CFStringGetFileSystemRepresentation")
    public static native boolean getFileSystemRepresentation(String string, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFStringGetMaximumSizeOfFileSystemRepresentation")
    public static native @MachineSizedSInt long getMaximumSizeOfFileSystemRepresentation(String string);
    @GlobalFunction("CFStringCreateWithFileSystemRepresentation")
    public static native String createWithFileSystemRepresentation(CFAllocator alloc, Todo buffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringCompareWithOptionsAndLocale")
    public static native CFComparisonResult compareWithOptionsAndLocale(String theString1, String theString2, CFRange rangeToCompare, CFStringCompareFlags compareOptions, CFLocale locale);
    @GlobalFunction("CFStringCompareWithOptions")
    public static native CFComparisonResult compareWithOptions(String theString1, String theString2, CFRange rangeToCompare, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringCompare")
    public static native CFComparisonResult compare(String theString1, String theString2, CFStringCompareFlags compareOptions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFindWithOptionsAndLocale")
    public static native boolean findWithOptionsAndLocale(String theString, String stringToFind, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFLocale locale, CFRange result);
    @GlobalFunction("CFStringFindWithOptions")
    public static native boolean findWithOptions(String theString, String stringToFind, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFRange result);
    @GlobalFunction("CFStringCreateArrayWithFindResults")
    public static native CFArray createArrayWithFindResults(CFAllocator alloc, String theString, String stringToFind, CFRange rangeToSearch, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringFind")
    public static native CFRange find(String theString, String stringToFind, CFStringCompareFlags compareOptions);
    @GlobalFunction("CFStringHasPrefix")
    public static native boolean hasPrefix(String theString, String prefix);
    @GlobalFunction("CFStringHasSuffix")
    public static native boolean hasSuffix(String theString, String suffix);
    @GlobalFunction("CFStringGetRangeOfComposedCharactersAtIndex")
    public static native CFRange getRangeOfComposedCharactersAtIndex(String theString, @MachineSizedSInt long theIndex);
    @GlobalFunction("CFStringFindCharacterFromSet")
    public static native boolean findCharacterFromSet(String theString, CFCharacterSet theSet, CFRange rangeToSearch, CFStringCompareFlags searchOptions, CFRange result);
    @GlobalFunction("CFStringGetLineBounds")
    public static native void getLineBounds(String theString, CFRange range, Todo lineBeginIndex, Todo lineEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringGetParagraphBounds")
    public static native void getParagraphBounds(String string, CFRange range, Todo parBeginIndex, Todo parEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("CFStringGetHyphenationLocationBeforeIndex")
    public static native @MachineSizedSInt long getHyphenationLocationBeforeIndex(String string, @MachineSizedSInt long location, CFRange limitRange, @MachineSizedUInt long options, CFLocale locale, Todo character);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("CFStringIsHyphenationAvailableForLocale")
    public static native boolean isHyphenationAvailableForLocale(CFLocale locale);
    @GlobalFunction("CFStringCreateByCombiningStrings")
    public static native String createByCombiningStrings(CFAllocator alloc, CFArray theArray, String separatorString);
    @GlobalFunction("CFStringCreateArrayBySeparatingStrings")
    public static native CFArray createArrayBySeparatingStrings(CFAllocator alloc, String theString, String separatorString);
    @GlobalFunction("CFStringGetIntValue")
    public static native int getIntValue(String str);
    @GlobalFunction("CFStringGetDoubleValue")
    public static native double getDoubleValue(String str);
    @GlobalFunction("CFStringIsEncodingAvailable")
    public static native boolean isEncodingAvailable(int encoding);
    @GlobalFunction("CFStringGetListOfAvailableEncodings")
    public static native Todo getListOfAvailableEncodings();
    @GlobalFunction("CFStringGetNameOfEncoding")
    public static native String getNameOfEncoding(int encoding);
    @GlobalFunction("CFStringConvertEncodingToNSStringEncoding")
    public static native @MachineSizedUInt long convertEncodingToNSStringEncoding(int encoding);
    @GlobalFunction("CFStringConvertNSStringEncodingToEncoding")
    public static native int convertNSStringEncodingToEncoding(@MachineSizedUInt long encoding);
    @GlobalFunction("CFStringConvertEncodingToWindowsCodepage")
    public static native int convertEncodingToWindowsCodepage(int encoding);
    @GlobalFunction("CFStringConvertWindowsCodepageToEncoding")
    public static native int convertWindowsCodepageToEncoding(int codepage);
    @GlobalFunction("CFStringConvertIANACharSetNameToEncoding")
    public static native int convertIANACharSetNameToEncoding(String theString);
    @GlobalFunction("CFStringConvertEncodingToIANACharSetName")
    public static native String convertEncodingToIANACharSetName(int encoding);
    @GlobalFunction("CFStringGetMostCompatibleMacStringEncoding")
    public static native int getMostCompatibleMacStringEncoding(int encoding);
    @GlobalFunction("CFShowStr")
    public static native void show(String str);
    
}
