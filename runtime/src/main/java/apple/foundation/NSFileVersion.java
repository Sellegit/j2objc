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



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("Foundation") @Mapping("NSFileVersion")
public class NSFileVersion 
    extends NSObject 
     {

    
    
    public NSFileVersion() {}
    
    
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("localizedName")
    public native String getLocalizedName();
    @Mapping("localizedNameOfSavingComputer")
    public native String getLocalizedNameOfSavingComputer();
    @Mapping("modificationDate")
    public native NSDate getModificationDate();
    @Mapping("persistentIdentifier")
    public native NSCoding getPersistentIdentifier();
    @Mapping("isConflict")
    public native boolean isConflict();
    @Mapping("isResolved")
    public native boolean isResolved();
    @Mapping("setResolved:")
    public native void setResolved(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hasLocalContents")
    public native boolean hasLocalContents();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hasThumbnail")
    public native boolean hasThumbnail();
    
    
    
    @Mapping("replaceItemAtURL:options:error:")
    protected native NSURL replaceItemAtURL(NSURL url, @Representing("NSFileVersionReplacingOptions") @MachineSizedUInt long options, Todo error);
    @Mapping("removeAndReturnError:")
    protected native boolean remove(Todo outError);
    @Mapping("currentVersionOfItemAtURL:")
    public static native NSFileVersion getCurrentItemVersionAtURL(NSURL url);
    @Mapping("otherVersionsOfItemAtURL:")
    public static native NSArray<NSFileVersion> getOtherItemVersionsAtURL(NSURL url);
    @Mapping("unresolvedConflictVersionsOfItemAtURL:")
    public static native NSArray<NSFileVersion> getUnresolvedConflictItemVersionsAtURL(NSURL url);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("getNonlocalVersionsOfItemAtURL:completionHandler:")
    public static native void getNonlocalItemVersionsAtURL(NSURL url, Todo completionHandler);
    @Mapping("versionOfItemAtURL:forPersistentIdentifier:")
    public static native NSFileVersion getItemVersionAtURL(NSURL url, Object persistentIdentifier);
    @Mapping("removeOtherVersionsOfItemAtURL:error:")
    protected static native boolean removeOtherItemVersionsAtURL(NSURL url, Todo outError);
    
}
