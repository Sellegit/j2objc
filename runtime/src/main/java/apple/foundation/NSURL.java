package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation") @Mapping("NSURL")
public class NSURL 
    extends NSObject 
    implements NSCopying {

    
    
    public NSURL() {}
    @Mapping("initWithScheme:host:path:")
    public NSURL(String scheme, String host, String path) { }
    @Mapping("initWithString:")
    public NSURL(String URLString) { }
    @Mapping("initWithString:relativeToURL:")
    public NSURL(String URLString, NSURL baseURL) { }
    
    
    @Mapping("absoluteString")
    public native String getAbsoluteString();
    @Mapping("relativeString")
    public native String getRelativeString();
    @Mapping("baseURL")
    public native NSURL getBaseURL();
    @Mapping("absoluteURL")
    public native NSURL getAbsoluteURL();
    @Mapping("scheme")
    public native String getScheme();
    @Mapping("resourceSpecifier")
    public native String getResourceSpecifier();
    @Mapping("host")
    public native String getHost();
    @Mapping("port")
    public native NSNumber getPort();
    @Mapping("user")
    public native String getUser();
    @Mapping("password")
    public native String getPassword();
    @Mapping("path")
    public native String getPath();
    @Mapping("fragment")
    public native String getFragment();
    @Mapping("parameterString")
    public native String getParameterString();
    @Mapping("query")
    public native String getQuery();
    @Mapping("relativePath")
    public native String getRelativePath();
    @Mapping("isFileURL")
    public native boolean isFileURL();
    @Mapping("standardizedURL")
    public native NSURL getStandardizedURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("filePathURL")
    public native NSURL getFilePathURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("pathComponents")
    public native List<String> getPathComponents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("lastPathComponent")
    public native String getLastPathComponent();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("pathExtension")
    public native String getPathExtension();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByDeletingLastPathComponent")
    public native NSURL getURLByDeletingLastPathComponent();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByDeletingPathExtension")
    public native NSURL getURLByDeletingPathExtension();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByStandardizingPath")
    public native NSURL getURLByStandardizingPath();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByResolvingSymlinksInPath")
    public native NSURL getURLByResolvingSymlinksInPath();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("checkResourceIsReachableAndReturnError:")
    protected native boolean checkResourceIsReachable(Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("isFileReferenceURL")
    public native boolean isFileReferenceURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileReferenceURL")
    public native NSURL getFileReferenceURL();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("getResourceValue:forKey:error:")
    private native boolean getResourceValue(Todo value, String key, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("resourceValuesForKeys:error:")
    protected native NSDictionary<?, ?> getResourceValues(NSArray<?> keys, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setResourceValue:forKey:error:")
    protected native boolean setResourceValue(Object value, String key, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setResourceValues:error:")
    protected native boolean setResourceValues(NSDictionary<?, ?> keyedValues, Todo error);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("removeCachedResourceValueForKey:")
    protected native void removeCachedResourceValue(String key);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTemporaryResourceValue:forKey:")
    protected native void setTemporaryResourceValue(Object value, String key);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    protected native NSData toBookmarkData(@Representing("NSURLBookmarkCreationOptions") @MachineSizedUInt long options, NSArray<?> keys, NSURL relativeURL, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("startAccessingSecurityScopedResource")
    public native boolean startAccessingSecurityScopedResource();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("stopAccessingSecurityScopedResource")
    public native void stopAccessingSecurityScopedResource();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("resourceValuesForKeys:fromBookmarkData:")
    public static native NSDictionary<?, ?> getResourceValuesFromBookmarkData(NSArray<?> keys, NSData bookmarkData);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("writeBookmarkData:toURL:options:error:")
    protected static native boolean writeBookmarkData(NSData bookmarkData, NSURL bookmarkFileURL, @MachineSizedUInt long options, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("bookmarkDataWithContentsOfURL:error:")
    protected static native NSData createBookmarkData(NSURL bookmarkFileURL, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getPromisedItemResourceValue:forKey:error:")
    protected native boolean getPromisedItemResourceValue(Todo value, String key, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("promisedItemResourceValuesForKeys:error:")
    protected native NSDictionary<?, ?> getPromisedItemResourceValues(NSArray<?> keys, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("checkPromisedItemIsReachableAndReturnError:")
    protected native boolean isPromisedItemReachable(Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByAppendingPathComponent:")
    public native NSURL newURLByAppendingPathComponent(String pathComponent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("URLByAppendingPathComponent:isDirectory:")
    public native NSURL newURLByAppendingPathComponent(String pathComponent, boolean isDirectory);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLByAppendingPathExtension:")
    public native NSURL newURLByAppendingPathExtension(String pathExtension);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
