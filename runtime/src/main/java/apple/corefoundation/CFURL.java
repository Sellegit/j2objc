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
    public static native CFURL createWithString(CFAllocator allocator, String URLString, CFURL baseURL);
    @GlobalFunction("CFURLCreateAbsoluteURLWithBytes")
    public static native CFURL createAbsoluteURLWithBytes(CFAllocator alloc, Todo relativeURLBytes, @MachineSizedSInt long length, int encoding, CFURL baseURL, boolean useCompatibilityMode);
    @GlobalFunction("CFURLCreateWithFileSystemPath")
    public static native CFURL createWithFileSystemPath(CFAllocator allocator, String filePath, @Representing("CFURLPathStyle") long pathStyle, boolean isDirectory);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentation")
    public static native CFURL createFromFileSystemRepresentation(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory);
    @GlobalFunction("CFURLCreateWithFileSystemPathRelativeToBase")
    public static native CFURL createWithFileSystemPathRelativeToBase(CFAllocator allocator, String filePath, @Representing("CFURLPathStyle") long pathStyle, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentationRelativeToBase")
    public static native CFURL createFromFileSystemRepresentationRelativeToBase(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLGetFileSystemRepresentation")
    public static native boolean getFileSystemRepresentation(CFURL url, boolean resolveAgainstBase, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFURLCopyAbsoluteURL")
    public static native CFURL copyAbsoluteURL(CFURL relativeURL);
    @GlobalFunction("CFURLGetString")
    public static native String getString(CFURL anURL);
    @GlobalFunction("CFURLGetBaseURL")
    public static native CFURL getBaseURL(CFURL anURL);
    @GlobalFunction("CFURLCanBeDecomposed")
    public static native boolean canBeDecomposed(CFURL anURL);
    @GlobalFunction("CFURLCopyScheme")
    public static native String copyScheme(CFURL anURL);
    @GlobalFunction("CFURLCopyNetLocation")
    public static native String copyNetLocation(CFURL anURL);
    @GlobalFunction("CFURLCopyPath")
    public static native String copyPath(CFURL anURL);
    @GlobalFunction("CFURLCopyStrictPath")
    public static native String copyStrictPath(CFURL anURL, Todo isAbsolute);
    @GlobalFunction("CFURLCopyFileSystemPath")
    public static native String copyFileSystemPath(CFURL anURL, @Representing("CFURLPathStyle") long pathStyle);
    @GlobalFunction("CFURLHasDirectoryPath")
    public static native boolean hasDirectoryPath(CFURL anURL);
    @GlobalFunction("CFURLCopyResourceSpecifier")
    public static native String copyResourceSpecifier(CFURL anURL);
    @GlobalFunction("CFURLCopyHostName")
    public static native String copyHostName(CFURL anURL);
    @GlobalFunction("CFURLGetPortNumber")
    public static native int getPortNumber(CFURL anURL);
    @GlobalFunction("CFURLCopyUserName")
    public static native String copyUserName(CFURL anURL);
    @GlobalFunction("CFURLCopyPassword")
    public static native String copyPassword(CFURL anURL);
    @GlobalFunction("CFURLCopyParameterString")
    public static native String copyParameterString(CFURL anURL, String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyQueryString")
    public static native String copyQueryString(CFURL anURL, String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyFragment")
    public static native String copyFragment(CFURL anURL, String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyLastPathComponent")
    public static native String copyLastPathComponent(CFURL url);
    @GlobalFunction("CFURLCopyPathExtension")
    public static native String copyPathExtension(CFURL url);
    @GlobalFunction("CFURLCreateCopyAppendingPathComponent")
    public static native CFURL createCopyAppendingPathComponent(CFAllocator allocator, CFURL url, String pathComponent, boolean isDirectory);
    @GlobalFunction("CFURLCreateCopyDeletingLastPathComponent")
    public static native CFURL createCopyDeletingLastPathComponent(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLCreateCopyAppendingPathExtension")
    public static native CFURL createCopyAppendingPathExtension(CFAllocator allocator, CFURL url, String extension);
    @GlobalFunction("CFURLCreateCopyDeletingPathExtension")
    public static native CFURL createCopyDeletingPathExtension(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLGetBytes")
    public static native @MachineSizedSInt long getBytes(CFURL url, Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFURLGetByteRangeForComponent")
    public static native CFRange getByteRangeForComponent(CFURL url, @Representing("CFURLComponentType") long component, CFRange rangeIncludingSeparators);
    @GlobalFunction("CFURLCreateStringByReplacingPercentEscapes")
    public static native String createStringByReplacingPercentEscapes(CFAllocator allocator, String originalString, String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCreateStringByReplacingPercentEscapesUsingEncoding")
    public static native String createStringByReplacingPercentEscapesUsingEncoding(CFAllocator allocator, String origString, String charsToLeaveEscaped, int encoding);
    @GlobalFunction("CFURLCreateStringByAddingPercentEscapes")
    public static native String createStringByAddingPercentEscapes(CFAllocator allocator, String originalString, String charactersToLeaveUnescaped, String legalURLCharactersToBeEscaped, int encoding);
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
    public static native boolean copyResourcePropertyForKey(CFURL url, String key, Todo propertyValueTypeRefPtr, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCopyResourcePropertiesForKeys")
    public static native CFDictionary copyResourcePropertiesForKeys(CFURL url, CFArray keys, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertyForKey")
    public static native boolean setResourcePropertyForKey(CFURL url, String key, CFType propertyValue, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertiesForKeys")
    public static native boolean setResourcePropertiesForKeys(CFURL url, CFDictionary keyedPropertyValues, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCacheForKey")
    public static native void clearResourcePropertyCacheForKey(CFURL url, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCache")
    public static native void clearResourcePropertyCache(CFURL url);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetTemporaryResourcePropertyForKey")
    public static native void setTemporaryResourcePropertyForKey(CFURL url, String key, CFType propertyValue);
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
    public static native CFType createResourcePropertyForKeyFromBookmarkData(CFAllocator allocator, String resourcePropertyKey, CFData bookmark);
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
    public static native CFType createPropertyFromResource(CFAllocator alloc, CFURL url, String property, Todo errorCode);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CFCopyHomeDirectoryURL")
    public static native CFURL copyHomeDirectoryURL();
    
}
