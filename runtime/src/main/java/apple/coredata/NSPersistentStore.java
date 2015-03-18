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

@Library("CoreData/CoreData.h") @Mapping("NSPersistentStore")
public class NSPersistentStore 
    extends NSObject 
     {

    
    
    @Mapping("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public NSPersistentStore(NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options) { }
    @Mapping("init")
    public NSPersistentStore() { }
    
    
    @Mapping("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator getPersistentStoreCoordinator();
    @Mapping("configurationName")
    public native String getConfigurationName();
    @Mapping("options")
    public native NSPersistentStoreOptions getOptions();
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("setURL:")
    public native void setURL(NSURL v);
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    @Mapping("type")
    public native String getType();
    @Mapping("isReadOnly")
    public native boolean isReadOnly();
    @Mapping("setReadOnly:")
    public native void setReadOnly(boolean v);
    @Mapping("metadata")
    public native NSPersistentStoreMetadata getMetadata();
    @Mapping("setMetadata:")
    public native void setMetadata(NSPersistentStoreMetadata v);
    
    
    
    @Mapping("loadMetadata:")
    public native boolean loadMetadata(Todo error);
    @Mapping("didAddToPersistentStoreCoordinator:")
    public native void didAddToPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);
    @Mapping("willRemoveFromPersistentStoreCoordinator:")
    public native void willRemoveFromPersistentStoreCoordinator(NSPersistentStoreCoordinator coordinator);
    @Mapping("metadataForPersistentStoreWithURL:error:")
    public static native NSPersistentStoreMetadata getMetadataForPersistentStore(NSURL url, Todo error);
    @Mapping("setMetadata:forPersistentStoreWithURL:error:")
    public static native boolean setMetadataForPersistentStore(NSDictionary<?, ?> metadata, NSURL url, Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("migrationManagerClass")
    public static native Class<? extends NSMigrationManager> getMigrationManagerClass();
    
}
