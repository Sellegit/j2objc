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
@Mapping("CFStringRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFString 
    extends CFPropertyList 
     {

    
    
    protected CFString() {}

    
    
    
    @GlobalFunction("CFStringGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFStringCreateWithPascalString")
    public static native CFString createWithPascalString(CFAllocator alloc, Todo pStr, int encoding);
    @GlobalFunction("CFStringCreateWithCString")
    public static native CFString createWithCString(CFAllocator alloc, Todo cStr, int encoding);
    @GlobalFunction("CFStringCreateWithBytes")
    public static native CFString createWithBytes(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation);
    @GlobalFunction("CFStringCreateWithCharacters")
    public static native CFString createWithCharacters(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars);
    @GlobalFunction("CFStringCreateWithPascalStringNoCopy")
    public static native CFString createWithPascalStringNoCopy(CFAllocator alloc, Todo pStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCStringNoCopy")
    public static native CFString createWithCStringNoCopy(CFAllocator alloc, Todo cStr, int encoding, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithBytesNoCopy")
    public static native CFString createWithBytesNoCopy(CFAllocator alloc, Todo bytes, @MachineSizedSInt long numBytes, int encoding, boolean isExternalRepresentation, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithCharactersNoCopy")
    public static native CFString createWithCharactersNoCopy(CFAllocator alloc, Todo chars, @MachineSizedSInt long numChars, CFAllocator contentsDeallocator);
    @GlobalFunction("CFStringCreateWithSubstring")
    public static native CFString createWithSubstring(CFAllocator alloc, CFString str, CFRange range);
    @GlobalFunction("CFStringCreateCopy")
    public static native CFString createCopy(CFAllocator alloc, CFString theString);
    @GlobalFunction("CFStringGetLength")
    public static native @MachineSizedSInt long length(CFString theString);
    @GlobalFunction("CFStringGetCharacterAtIndex")
    public static native short getCharacterAtIndex(CFString theString, @MachineSizedSInt long idx);
    @GlobalFunction("CFStringGetCharacters")
    public static native void getCharacters(CFString theString, CFRange range, Todo buffer);
    @GlobalFunction("CFStringGetPascalString")
    public static native boolean getPascalString(CFString theString, Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetCString")
    public static native boolean getCString(CFString theString, Todo buffer, @MachineSizedSInt long bufferSize, int encoding);
    @GlobalFunction("CFStringGetPascalStringPtr")
    public static native Todo getPascalStringPtr(CFString theString, int encoding);
    @GlobalFunction("CFStringGetCStringPtr")
    public static native Todo getCStringPtr(CFString theString, int encoding);
    @GlobalFunction("CFStringGetCharactersPtr")
    public static native Todo getCharactersPtr(CFString theString);
    @GlobalFunction("CFStringGetBytes")
    public static native @MachineSizedSInt long getBytes(CFString theString, CFRange range, int encoding, byte lossByte, boolean isExternalRepresentation, Todo buffer, @MachineSizedSInt long maxBufLen, Todo usedBufLen);
    @GlobalFunction("CFStringCreateFromExternalRepresentation")
    public static native CFString createFromExternalRepresentation(CFAllocator alloc, CFData data, int encoding);
    @GlobalFunction("CFStringCreateExternalRepresentation")
    public static native CFData createExternalRepresentation(CFAllocator alloc, CFString theString, int encoding, byte lossByte);
    @GlobalFunction("CFStringGetSmallestEncoding")
    public static native int getSmallestEncoding(CFString theString);
    @GlobalFunction("CFStringGetFastestEncoding")
    public static native int getFastestEncoding(CFString theString);
    @GlobalFunction("CFStringGetSystemEncoding")
    public static native int getSystemEncoding();
    @GlobalFunction("CFStringGetMaximumSizeForEncoding")
    public static native @MachineSizedSInt long getMaximumSizeForEncoding(@MachineSizedSInt long length, int encoding);
    @GlobalFunction("CFStringGetFileSystemRepresentation")
    public static native boolean getFileSystemRepresentation(CFString string, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFStringGetMaximumSizeOfFileSystemRepresentation")
    public static native @MachineSizedSInt long getMaximumSizeOfFileSystemRepresentation(CFString string);
    @GlobalFunction("CFStringCreateWithFileSystemRepresentation")
    public static native CFString createWithFileSystemRepresentation(CFAllocator alloc, Todo buffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringCompareWithOptionsAndLocale")
    public static native CFComparisonResult compareWithOptionsAndLocale(CFString theString1, CFString theString2, CFRange rangeToCompare, @Representing("CFStringCompareFlags") long compareOptions, CFLocale locale);
    @GlobalFunction("CFStringCompareWithOptions")
    public static native CFComparisonResult compareWithOptions(CFString theString1, CFString theString2, CFRange rangeToCompare, @Representing("CFStringCompareFlags") long compareOptions);
    @GlobalFunction("CFStringCompare")
    public static native CFComparisonResult compare(CFString theString1, CFString theString2, @Representing("CFStringCompareFlags") long compareOptions);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringFindWithOptionsAndLocale")
    public static native boolean findWithOptionsAndLocale(CFString theString, CFString stringToFind, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long searchOptions, CFLocale locale, CFRange result);
    @GlobalFunction("CFStringFindWithOptions")
    public static native boolean findWithOptions(CFString theString, CFString stringToFind, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long searchOptions, CFRange result);
    @GlobalFunction("CFStringCreateArrayWithFindResults")
    public static native CFArray createArrayWithFindResults(CFAllocator alloc, CFString theString, CFString stringToFind, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long compareOptions);
    @GlobalFunction("CFStringFind")
    public static native CFRange find(CFString theString, CFString stringToFind, @Representing("CFStringCompareFlags") long compareOptions);
    @GlobalFunction("CFStringHasPrefix")
    public static native boolean hasPrefix(CFString theString, CFString prefix);
    @GlobalFunction("CFStringHasSuffix")
    public static native boolean hasSuffix(CFString theString, CFString suffix);
    @GlobalFunction("CFStringGetRangeOfComposedCharactersAtIndex")
    public static native CFRange getRangeOfComposedCharactersAtIndex(CFString theString, @MachineSizedSInt long theIndex);
    @GlobalFunction("CFStringFindCharacterFromSet")
    public static native boolean findCharacterFromSet(CFString theString, CFCharacterSet theSet, CFRange rangeToSearch, @Representing("CFStringCompareFlags") long searchOptions, CFRange result);
    @GlobalFunction("CFStringGetLineBounds")
    public static native void getLineBounds(CFString theString, CFRange range, Todo lineBeginIndex, Todo lineEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFStringGetParagraphBounds")
    public static native void getParagraphBounds(CFString string, CFRange range, Todo parBeginIndex, Todo parEndIndex, Todo contentsEndIndex);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("CFStringGetHyphenationLocationBeforeIndex")
    public static native @MachineSizedSInt long getHyphenationLocationBeforeIndex(CFString string, @MachineSizedSInt long location, CFRange limitRange, @MachineSizedUInt long options, CFLocale locale, Todo character);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalFunction("CFStringIsHyphenationAvailableForLocale")
    public static native boolean isHyphenationAvailableForLocale(CFLocale locale);
    @GlobalFunction("CFStringCreateByCombiningStrings")
    public static native CFString createByCombiningStrings(CFAllocator alloc, CFArray theArray, CFString separatorString);
    @GlobalFunction("CFStringCreateArrayBySeparatingStrings")
    public static native CFArray createArrayBySeparatingStrings(CFAllocator alloc, CFString theString, CFString separatorString);
    @GlobalFunction("CFStringGetIntValue")
    public static native int getIntValue(CFString str);
    @GlobalFunction("CFStringGetDoubleValue")
    public static native double getDoubleValue(CFString str);
    @GlobalFunction("CFStringIsEncodingAvailable")
    public static native boolean isEncodingAvailable(int encoding);
    @GlobalFunction("CFStringGetListOfAvailableEncodings")
    public static native Todo getListOfAvailableEncodings();
    @GlobalFunction("CFStringGetNameOfEncoding")
    public static native CFString getNameOfEncoding(int encoding);
    @GlobalFunction("CFStringConvertEncodingToNSStringEncoding")
    public static native @MachineSizedUInt long convertEncodingToNSStringEncoding(int encoding);
    @GlobalFunction("CFStringConvertNSStringEncodingToEncoding")
    public static native int convertNSStringEncodingToEncoding(@MachineSizedUInt long encoding);
    @GlobalFunction("CFStringConvertEncodingToWindowsCodepage")
    public static native int convertEncodingToWindowsCodepage(int encoding);
    @GlobalFunction("CFStringConvertWindowsCodepageToEncoding")
    public static native int convertWindowsCodepageToEncoding(int codepage);
    @GlobalFunction("CFStringConvertIANACharSetNameToEncoding")
    public static native int convertIANACharSetNameToEncoding(CFString theString);
    @GlobalFunction("CFStringConvertEncodingToIANACharSetName")
    public static native CFString convertEncodingToIANACharSetName(int encoding);
    @GlobalFunction("CFStringGetMostCompatibleMacStringEncoding")
    public static native int getMostCompatibleMacStringEncoding(int encoding);
    @GlobalFunction("CFShowStr")
    public static native void show(CFString str);

}
