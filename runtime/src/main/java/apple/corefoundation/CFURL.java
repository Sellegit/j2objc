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
    public static native CFURL createWithFileSystemPath(CFAllocator allocator, String filePath, CFURLPathStyle pathStyle, boolean isDirectory);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentation")
    public static native CFURL createFromFileSystemRepresentation(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory);
    @GlobalFunction("CFURLCreateWithFileSystemPathRelativeToBase")
    public static native CFURL createWithFileSystemPathRelativeToBase(CFAllocator allocator, String filePath, CFURLPathStyle pathStyle, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLCreateFromFileSystemRepresentationRelativeToBase")
    public static native CFURL createFromFileSystemRepresentationRelativeToBase(CFAllocator allocator, Todo buffer, @MachineSizedSInt long bufLen, boolean isDirectory, CFURL baseURL);
    @GlobalFunction("CFURLGetFileSystemRepresentation")
    public native boolean getFileSystemRepresentation(boolean resolveAgainstBase, Todo buffer, @MachineSizedSInt long maxBufLen);
    @GlobalFunction("CFURLCopyAbsoluteURL")
    public native CFURL copyAbsoluteURL();
    @GlobalFunction("CFURLGetString")
    public native String getString();
    @GlobalFunction("CFURLGetBaseURL")
    public native CFURL getBaseURL();
    @GlobalFunction("CFURLCanBeDecomposed")
    public native boolean canBeDecomposed();
    @GlobalFunction("CFURLCopyScheme")
    public native String copyScheme();
    @GlobalFunction("CFURLCopyNetLocation")
    public native String copyNetLocation();
    @GlobalFunction("CFURLCopyPath")
    public native String copyPath();
    @GlobalFunction("CFURLCopyStrictPath")
    public native String copyStrictPath(Todo isAbsolute);
    @GlobalFunction("CFURLCopyFileSystemPath")
    public native String copyFileSystemPath(CFURLPathStyle pathStyle);
    @GlobalFunction("CFURLHasDirectoryPath")
    public native boolean hasDirectoryPath();
    @GlobalFunction("CFURLCopyResourceSpecifier")
    public native String copyResourceSpecifier();
    @GlobalFunction("CFURLCopyHostName")
    public native String copyHostName();
    @GlobalFunction("CFURLGetPortNumber")
    public native int getPortNumber();
    @GlobalFunction("CFURLCopyUserName")
    public native String copyUserName();
    @GlobalFunction("CFURLCopyPassword")
    public native String copyPassword();
    @GlobalFunction("CFURLCopyParameterString")
    public native String copyParameterString(String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyQueryString")
    public native String copyQueryString(String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyFragment")
    public native String copyFragment(String charactersToLeaveEscaped);
    @GlobalFunction("CFURLCopyLastPathComponent")
    public native String copyLastPathComponent();
    @GlobalFunction("CFURLCopyPathExtension")
    public native String copyPathExtension();
    @GlobalFunction("CFURLCreateCopyAppendingPathComponent")
    public static native CFURL createCopyAppendingPathComponent(CFAllocator allocator, CFURL url, String pathComponent, boolean isDirectory);
    @GlobalFunction("CFURLCreateCopyDeletingLastPathComponent")
    public static native CFURL createCopyDeletingLastPathComponent(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLCreateCopyAppendingPathExtension")
    public static native CFURL createCopyAppendingPathExtension(CFAllocator allocator, CFURL url, String extension);
    @GlobalFunction("CFURLCreateCopyDeletingPathExtension")
    public static native CFURL createCopyDeletingPathExtension(CFAllocator allocator, CFURL url);
    @GlobalFunction("CFURLGetBytes")
    public native @MachineSizedSInt long getBytes(Todo buffer, @MachineSizedSInt long bufferLength);
    @GlobalFunction("CFURLGetByteRangeForComponent")
    public native CFRange getByteRangeForComponent(CFURLComponentType component, CFRange rangeIncludingSeparators);
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
    public native boolean isFileReferenceURL();
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
    public native boolean copyResourcePropertyForKey(String key, Todo propertyValueTypeRefPtr, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCopyResourcePropertiesForKeys")
    public native CFDictionary copyResourcePropertiesForKeys(CFArray keys, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertyForKey")
    public native boolean setResourcePropertyForKey(String key, CFType propertyValue, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetResourcePropertiesForKeys")
    public native boolean setResourcePropertiesForKeys(CFDictionary keyedPropertyValues, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCacheForKey")
    public native void clearResourcePropertyCacheForKey(String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLClearResourcePropertyCache")
    public native void clearResourcePropertyCache();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLSetTemporaryResourcePropertyForKey")
    public native void setTemporaryResourcePropertyForKey(String key, CFType propertyValue);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLResourceIsReachable")
    public native boolean resourceIsReachable(Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateBookmarkData")
    public static native CFData createBookmarkData(CFAllocator allocator, CFURL url, CFURLBookmarkCreationOptions options, CFArray resourcePropertiesToInclude, CFURL relativeToURL, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFURLCreateByResolvingBookmarkData")
    public static native CFURL createByResolvingBookmarkData(CFAllocator allocator, CFData bookmark, CFURLBookmarkResolutionOptions options, CFURL relativeToURL, CFArray resourcePropertiesToInclude, Todo isStale, Todo error);
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
    public native boolean startAccessingSecurityScopedResource();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CFURLStopAccessingSecurityScopedResource")
    public native void stopAccessingSecurityScopedResource();
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
    public native boolean writeDataAndPropertiesToResource(CFData dataToWrite, CFDictionary propertiesToWrite, Todo errorCode);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFURLDestroyResource")
    public native boolean destroyResource(Todo errorCode);
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
