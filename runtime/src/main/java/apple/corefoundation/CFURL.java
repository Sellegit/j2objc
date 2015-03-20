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
@Mapping("CFURLRef") @Library("CoreFoundation/CoreFoundation.h")
public class CFURL 
    extends CFType 
     {

    
    
    protected CFURL() {}
    
    
    
    
    @GlobalFunction("CFURLGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFURLCreateWithBytes")
    public static native CFURL createWithBytes(CFAllocator allocator, Todo URLBytes, @MachineSizedSInt long length, int encoding, CFURL baseURL);
    @GlobalFunction("CFURLCreateData")
    public static native CFData createData(CFAllocator allocator, CFURL url, int encoding, boolean escapeWhitespace);
    @GlobalFunction("CFURLCreateWithString")
    public static native CFURL createWithString(CFAllocator allocator, CFString URLString, CFURL baseURL);
    @GlobalFunction("CFURLCreateAbsoluteURLWithBytes")
    public static native CFURL createAbsoluteURLWithBytes(CFAllocator alloc, Todo relativeURLBytes, @MachineSizedSInt long length, int encoding, CFURL baseURL, boolean useCompatibilityMode);
    @GlobalFunction("CFURLCreateWithFileSystemPath")
    public static native CFURL createWithFileSystemPath(CFAllocator allocator, CFString filePath, @Representing("CFURLPathStyle") long pathStyle, boolean isDirectory);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentation")
    public static native CFURL createFromFileSystemRepresentation(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory);
    @GlobalFunction("CFURLCreateWithFileSystemPathRelativeToBase")
    public static native CFURL createWithFileSystemPathRelativeToBase(CFAllocator allocator, CFString filePath, @Representing("CFURLPathStyle") long pathStyle, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentationRelativeToBase")
    public static native CFURL createFromFileSystemRepresentationRelativeToBase(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLGetFileSystemRepresentation")
    public static native boolean getFileSystemRepresentation(CFURL url, boolean resolveAgainstBase, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFURLCopyAbsoluteURL")
    public static native CFURL copyAbsoluteURL(CFURL relativeURL);
    @GlobalFunction("CFURLGetString")
    public static native CFString getString(CFURL anURL);
    @GlobalFunction("CFURLGetBaseURL")
    public static native CFURL getBaseURL(CFURL anURL);
    @GlobalFunction("CFURLCanBeDecomposed")
    public static native boolean canBeDecomposed(CFURL anURL);
    @GlobalFunction("CFURLCopyScheme")
    public static native CFString copyScheme(CFURL anURL);
    @GlobalFunction("CFURLCopyNetLocation")
    public static native CFString copyNetLocation(CFURL anURL);
    @GlobalFunction("CFURLCopyPath")
    public static native CFString copyPath(CFURL anURL);
    @GlobalFunction("CFURLCopyStrictPath")
    public static native CFString copyStrictPath(CFURL anURL, Todo isAbsolute);
    @GlobalFunction("CFURLCopyFileSystemPath")
    public static native CFString copyFileSystemPath(CFURL anURL, @Representing("CFURLPathStyle") long pathStyle);
    @GlobalFunction("CFURLHasDirectoryPath")
    public static native boolean hasDirectoryPath(CFURL anURL);
    @GlobalFunction("CFURLCopyResourceSpecifier")
    public static native CFString copyResourceSpecifier(CFURL anURL);
    @GlobalFunction("CFURLCopyHostName")
    public static native CFString copyHostName(CFURL anURL);
    @GlobalFunction("CFURLGetPortNumber")
    public static native int getPortNumber(CFURL anURL);
    @GlobalFunction("CFURLCopyUserName")
    public static native CFString copyUserName(CFURL anURL);
    @GlobalFunction("CFURLCopyPassword")
    public static native CFString copyPassword(CFURL anURL);
    @GlobalFunction("CFURLCopyParameterString")
    public static native CFString copyParameterString(CFURL anURL, CFString charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyQueryString")
    public static native CFString copyQueryString(CFURL anURL, CFString charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyFragment")
    public static native CFString copyFragment(CFURL anURL, CFString charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyLastPathComponent")
    public static native CFString copyLastPathComponent(CFURL url);
    @GlobalFunction("CFURLCopyPathExtension")
    public static native CFString copyPathExtension(CFURL url);
    @GlobalFunction("CFURLCreateCopyAppendingPathComponent")
    public static native CFURL createCopyAppendingPathComponent(CFAllocator allocator, CFURL url, CFString pathComponent, boolean isDirectory);
    @GlobalFunction("CFURLCreateCopyDeletingLastPathComponent")
    public static native CFURL createCopyDeletingLastPathComponent(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLCreateCopyAppendingPathExtension")
    public static native CFURL createCopyAppendingPathExtension(CFAllocator allocator, CFURL url, CFString extension);
    @GlobalFunction("CFURLCreateCopyDeletingPathExtension")
    public static native CFURL createCopyDeletingPathExtension(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLGetBytes")
    public static native @MachineSizedSInt long getBytes(CFURL url, Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFURLGetByteRangeForComponent")
    public static native CFRange getByteRangeForComponent(CFURL url, @Representing("CFURLComponentType") long component, CFRange rangeIncludingSeparators);
    @GlobalFunction("CFURLCreateStringByReplacingPercentEscapes")
    public static native CFString createStringByReplacingPercentEscapes(CFAllocator allocator, CFString originalString, CFString charactersToLeaveEscaped);
    @GlobalFunction("CFURLCreateStringByReplacingPercentEscapesUsingEncoding")
    public static native CFString createStringByReplacingPercentEscapesUsingEncoding(CFAllocator allocator, CFString origString, CFString charsToLeaveEscaped, int encoding);
    @GlobalFunction("CFURLCreateStringByAddingPercentEscapes")
    public static native CFString createStringByAddingPercentEscapes(CFAllocator allocator, CFString originalString, CFString charactersToLeaveUnescaped, CFString legalURLCharactersToBeEscaped, int encoding);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CFURLIsFileReferenceURL")
    public static native boolean isFileReferenceURL(CFURL url);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateFileReferenceURL")
    public static native CFURL createFileReferenceURL(CFAllocator allocator, CFURL url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateFilePathURL")
    public static native CFURL createFilePathURL(CFAllocator allocator, CFURL url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCopyResourcePropertyForKey")
    public static native boolean copyResourcePropertyForKey(CFURL url, CFString key, Todo propertyValueTypeRefPtr, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCopyResourcePropertiesForKeys")
    public static native CFDictionary copyResourcePropertiesForKeys(CFURL url, CFArray keys, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertyForKey")
    public static native boolean setResourcePropertyForKey(CFURL url, CFString key, CFType propertyValue, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertiesForKeys")
    public static native boolean setResourcePropertiesForKeys(CFURL url, CFDictionary keyedPropertyValues, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCacheForKey")
    public static native void clearResourcePropertyCacheForKey(CFURL url, CFString key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCache")
    public static native void clearResourcePropertyCache(CFURL url);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetTemporaryResourcePropertyForKey")
    public static native void setTemporaryResourcePropertyForKey(CFURL url, CFString key, CFType propertyValue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLResourceIsReachable")
    public static native boolean resourceIsReachable(CFURL url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateBookmarkData")
    public static native CFData createBookmarkData(CFAllocator allocator, CFURL url, @Representing("CFURLBookmarkCreationOptions") long options, CFArray resourcePropertiesToInclude, CFURL relativeToURL, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateByResolvingBookmarkData")
    public static native CFURL createByResolvingBookmarkData(CFAllocator allocator, CFData bookmark, @Representing("CFURLBookmarkResolutionOptions") long options, CFURL relativeToURL, CFArray resourcePropertiesToInclude, Todo isStale, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateResourcePropertiesForKeysFromBookmarkData")
    public static native CFDictionary createResourcePropertiesForKeysFromBookmarkData(CFAllocator allocator, CFArray resourcePropertiesToReturn, CFData bookmark);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateResourcePropertyForKeyFromBookmarkData")
    public static native CFType createResourcePropertyForKeyFromBookmarkData(CFAllocator allocator, CFString resourcePropertyKey, CFData bookmark);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFURLCreateBookmarkDataFromFile")
    public static native CFData createBookmarkDataFromFile(CFAllocator allocator, CFURL fileURL, Todo errorRef);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFURLWriteBookmarkDataToFile")
    public static native boolean writeBookmarkDataToFile(CFData bookmarkRef, CFURL fileURL, @MachineSizedUInt long options, Todo errorRef);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CFURLStartAccessingSecurityScopedResource")
    public static native boolean startAccessingSecurityScopedResource(CFURL url);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CFURLStopAccessingSecurityScopedResource")
    public static native void stopAccessingSecurityScopedResource(CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFURLCreateDataAndPropertiesFromResource")
    public static native boolean createDataAndPropertiesFromResource(CFAllocator alloc, CFURL url, Todo resourceData, Todo properties, CFArray desiredProperties, Todo errorCode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFURLWriteDataAndPropertiesToResource")
    public static native boolean writeDataAndPropertiesToResource(CFURL url, CFData dataToWrite, CFDictionary propertiesToWrite, Todo errorCode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFURLDestroyResource")
    public static native boolean destroyResource(CFURL url, Todo errorCode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFURLCreatePropertyFromResource")
    public static native CFType createPropertyFromResource(CFAllocator alloc, CFURL url, CFString property, Todo errorCode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFCopyHomeDirectoryURL")
    public static native CFURL copyHomeDirectoryURL();
    
}
