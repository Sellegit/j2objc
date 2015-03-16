package apple.uikit;


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
import apple.foundation.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("NSFileProviderExtension")
public class NSFileProviderExtension 
    extends NSObject 
     {

    
    
    public NSFileProviderExtension() {}
    
    
    
    
    
    
    @Mapping("providerIdentifier")
    public native String getProviderIdentifier();
    @Mapping("documentStorageURL")
    public native NSURL getDocumentStorageURL();
    @Mapping("URLForItemWithPersistentIdentifier:")
    public native NSURL getURLForItem(String identifier);
    @Mapping("persistentIdentifierForItemAtURL:")
    public native String getPersistentIdentifierForItem(NSURL url);
    @Mapping("providePlaceholderAtURL:completionHandler:")
    public native void providePlaceholder(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("startProvidingItemAtURL:completionHandler:")
    public native void startProvidingItem(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("itemChangedAtURL:")
    public native void itemChanged(NSURL url);
    @Mapping("stopProvidingItemAtURL:")
    public native void stopProvidingItem(NSURL url);
    @Mapping("writePlaceholderAtURL:withMetadata:error:")
    protected static native boolean writePlaceholder(NSURL placeholderURL, NSDictionary<?, ?> metadata, Todo error);
    @Mapping("placeholderURLForURL:")
    public static native NSURL getPlaceholderURL(NSURL url);
    
}
