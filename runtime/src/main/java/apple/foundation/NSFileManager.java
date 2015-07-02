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


@Library("Foundation/Foundation.h") @Mapping("NSFileManager")
public class NSFileManager 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSFileManager() { }

    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("delegate")
    public native NSFileManagerDelegate getDelegate();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setDelegate:")
    public native void setDelegate(NSFileManagerDelegate v);
    @Mapping("currentDirectoryPath")
    public native String getCurrentDirectoryPath();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("ubiquityIdentityToken")
    public native NSObject getUbiquityIdentityToken();

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSUbiquityIdentityDidChangeNotification")
    public static native NSString UbiquityIdentityDidChangeNotification();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("mountedVolumeURLsIncludingResourceValuesForKeys:options:")
    public native NSArray<NSURL> getMountedVolumeURLsIncludingResourceValues(NSArray<?> propertyKeys, @Representing("NSVolumeEnumerationOptions") long options);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray<NSURL> getContentsOfDirectoryAtURL(NSURL url, NSArray<?> keys, @Representing("NSDirectoryEnumerationOptions") long mask, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLsForDirectory:inDomains:")
    public native NSArray<NSURL> getURLsForDirectory(@Representing("NSSearchPathDirectory") long directory, @Representing("NSSearchPathDomainMask") long domainMask);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL getURLForDirectory(@Representing("NSSearchPathDirectory") long directory, @Representing("NSSearchPathDomainMask") long domain, NSURL url, boolean shouldCreate, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getRelationship:ofDirectoryAtURL:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryToItem(Todo outRelationship, NSURL directoryURL, NSURL otherURL, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getRelationship:ofDirectory:inDomain:toItemAtURL:error:")
    public native boolean getRelationshipOfDirectoryToItem(Todo outRelationship, @Representing("NSSearchPathDirectory") long directory, @Representing("NSSearchPathDomainMask") long domainMask, NSURL url, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtURL(NSURL url, boolean createIntermediates, NSDictionary<?, ?> attributes, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURL(NSURL url, NSURL destURL, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("setAttributes:ofItemAtPath:error:")
    public native boolean setAttributesForItem(NSDictionary<?, ?> attributes, String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPath(String path, boolean createIntermediates, NSDictionary<?, ?> attributes, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("contentsOfDirectoryAtPath:error:")
    public native NSArray<String> getContentsOfDirectoryAtPath(String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("subpathsOfDirectoryAtPath:error:")
    public native List<String> getSubpathsOfDirectoryAtPath(String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("attributesOfItemAtPath:error:")
    public native NSDictionary<?, ?> getAttributesOfItemAtPath(String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("attributesOfFileSystemForPath:error:")
    public native NSDictionary<?, ?> getAttributesOfFileSystemAtPath(String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPath(String path, String destPath, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("destinationOfSymbolicLinkAtPath:error:")
    public native String getDestinationOfSymbolicLinkAtPath(String path, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPath(String srcPath, String dstPath, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("moveItemAtPath:toPath:error:")
    public native boolean moveItemAtPath(String srcPath, String dstPath, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("linkItemAtPath:toPath:error:")
    public native boolean linkItemAtPath(String srcPath, String dstPath, Todo error);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("removeItemAtPath:error:")
    public native boolean removeItemAtPath(String path, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURL(NSURL srcURL, NSURL dstURL, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("moveItemAtURL:toURL:error:")
    public native boolean moveItemAtURL(NSURL srcURL, NSURL dstURL, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("linkItemAtURL:toURL:error:")
    public native boolean linkItemAtURL(NSURL srcURL, NSURL dstURL, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("removeItemAtURL:error:")
    public native boolean removeItemAtURL(NSURL URL, Todo error);
    @Mapping("changeCurrentDirectoryPath:")
    public native boolean changeCurrentDirectoryPath(String path);
    @Mapping("fileExistsAtPath:")
    public native boolean fileExists(String path);
    @Mapping("isReadableFileAtPath:")
    public native boolean fileIsReadable(String path);
    @Mapping("isWritableFileAtPath:")
    public native boolean fileIsWritable(String path);
    @Mapping("isExecutableFileAtPath:")
    public native boolean fileIsExecutable(String path);
    @Mapping("isDeletableFileAtPath:")
    public native boolean fileIsDeletable(String path);
    @Mapping("contentsEqualAtPath:andPath:")
    public native boolean contentsAtPathEqual(String path1, String path2);
    @Mapping("displayNameAtPath:")
    public native String getDisplayNameAtPath(String path);
    @Mapping("componentsToDisplayForPath:")
    public native List<String> getComponentsToDisplayForPath(String path);
    @Mapping("enumeratorAtPath:")
    public native NSDirectoryEnumerator getEnumeratorAtPath(String path);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator getEnumeratorAtURL(NSURL url, NSArray<?> keys, @Representing("NSDirectoryEnumerationOptions") long mask, @Block Block2<NSURL, NSError, Boolean> handler);
    @Mapping("subpathsAtPath:")
    public native List<String> getSubpathsAtPath(String path);
    @Mapping("contentsAtPath:")
    public native NSData getContentsAtPath(String path);
    @Mapping("createFileAtPath:contents:attributes:")
    public native boolean createFileAtPath(String path, NSData data, NSDictionary<?, ?> attr);
    @Mapping("fileSystemRepresentationWithPath:")
    public native String getFileSystemRepresentationForPath(String path);
    @Mapping("stringWithFileSystemRepresentation:length:")
    public native String getPathForFileSystemRepresentation(Todo str, @MachineSizedUInt long len);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURL(NSURL originalItemURL, NSURL newItemURL, String backupItemName, @Representing("NSFileManagerItemReplacementOptions") long options, Todo resultingURL, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitousItemAtURL(boolean flag, NSURL url, NSURL destinationURL, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isUbiquitousItemAtURL:")
    public native boolean isUbiquitousItemAtURL(NSURL url);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURL(NSURL url, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURL(NSURL url, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("URLForUbiquityContainerIdentifier:")
    public native NSURL getURLForUbiquityContainerIdentifier(String containerIdentifier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL getURLForPublishingUbiquitousItemAtURL(NSURL url, Todo outDate, Todo error);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL getContainerURLForSecurityApplication(String groupIdentifier);
    @Mapping("defaultManager")
    public static native NSFileManager getDefaultManager();

}
