package apple.coredata;


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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("CoreData") @Mapping("NSPersistentStoreCoordinator")
public class NSPersistentStoreCoordinator 
    extends NSObject 
    implements NSLocking {

    
    
    public NSPersistentStoreCoordinator() {}
    @Mapping("initWithManagedObjectModel:")
    public NSPersistentStoreCoordinator(NSManagedObjectModel model) { }
    
    
    @Mapping("managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @Mapping("persistentStores")
    public native NSArray<NSPersistentStore> getPersistentStores();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    public native void setName(String v);
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPersistentStoreCoordinatorStoresWillChangeNotification")
    protected static native NSString StoresWillChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreCoordinatorStoresDidChangeNotification")
    protected static native NSString StoresDidChangeNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSPersistentStoreCoordinatorWillRemoveStoreNotification")
    protected static native NSString WillRemoveStoreNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSPersistentStoreDidImportUbiquitousContentChangesNotification")
    protected static native NSString DidImportUbiquitousContentChangesNotification();
    
    @Mapping("persistentStoreForURL:")
    public native NSPersistentStore getPersistentStoreForURL(NSURL URL);
    @Mapping("URLForPersistentStore:")
    public native NSURL getURLForPersistentStore(NSPersistentStore store);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(NSURL url, NSPersistentStore store);
    @Mapping("addPersistentStoreWithType:configuration:URL:options:error:")
    protected native NSPersistentStore addPersistentStore(String storeType, String configuration, NSURL storeURL, NSPersistentStoreOptions options, Todo error);
    @Mapping("removePersistentStore:error:")
    protected native boolean removePersistentStore(NSPersistentStore store, Todo error);
    @Mapping("setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(NSPersistentStoreMetadata metadata, NSPersistentStore store);
    @Mapping("metadataForPersistentStore:")
    public native NSDictionary<?, ?> getMetadataForPersistentStore(NSPersistentStore store);
    @Mapping("managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID getManagedObjectIDForURIRepresentation(NSURL url);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("executeRequest:withContext:error:")
    protected native Object executeRequest(NSPersistentStoreRequest request, NSManagedObjectContext context, Todo error);
    @Mapping("migratePersistentStore:toURL:options:withType:error:")
    protected native NSPersistentStore migratePersistentStore(NSPersistentStore store, NSURL URL, NSPersistentStoreOptions options, String storeType, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("performBlock:")
    public native void performBlock(@Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("performBlockAndWait:")
    public native void performBlockAndWait(@Block Runnable block);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("lock")
    public native void lock();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("unlock")
    public native void unlock();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("tryLock")
    public native boolean tryLock();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("registeredStoreTypes")
    public static native Map<String, NSPersistentStore> getRegisteredStoreTypes();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("registerStoreClass:forStoreType:")
    public static native void registerStoreClassForType(Class<? extends NSPersistentStore> storeClass, String storeType);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("metadataForPersistentStoreOfType:URL:error:")
    protected static native NSPersistentStoreMetadata getMetadataForPersistentStoreType(String storeType, NSURL url, Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setMetadata:forPersistentStoreOfType:URL:error:")
    protected static native boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, String storeType, NSURL url, Todo error);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    protected static native boolean removeUbiquitousContentAndPersistentStore(NSURL storeURL, NSPersistentStoreOptions options, Todo error);
    
}
