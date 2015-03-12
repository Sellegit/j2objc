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

@Library("CoreData") @Mapping("NSAtomicStore")
public class NSAtomicStore 
    extends NSPersistentStore 
     {

    
    
    public NSAtomicStore() {}
    @Mapping("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public NSAtomicStore(NSPersistentStoreCoordinator coordinator, String configurationName, NSURL url, NSDictionary<?, ?> options) { }
    
    
    
    
    
    
    @Mapping("load:")
    protected native boolean load(Todo error);
    @Mapping("save:")
    protected native boolean save(Todo error);
    @Mapping("newCacheNodeForManagedObject:")
    public native NSAtomicStoreCacheNode newCacheNode(NSManagedObject managedObject);
    @Mapping("updateCacheNode:fromManagedObject:")
    public native void updateCacheNode(NSAtomicStoreCacheNode node, NSManagedObject managedObject);
    @Mapping("cacheNodes")
    public native NSSet<NSAtomicStoreCacheNode> getCacheNodes();
    @Mapping("addCacheNodes:")
    public native void addCacheNodes(NSSet<?> cacheNodes);
    @Mapping("willRemoveCacheNodes:")
    public native void willRemoveCacheNodes(NSSet<?> cacheNodes);
    @Mapping("cacheNodeForObjectID:")
    public native NSAtomicStoreCacheNode getCacheNode(NSManagedObjectID objectID);
    @Mapping("objectIDForEntity:referenceObject:")
    public native NSManagedObjectID getObjectID(NSEntityDescription entity, Object data);
    @Mapping("newReferenceObjectForManagedObject:")
    public native Object newReferenceObject(NSManagedObject managedObject);
    @Mapping("referenceObjectForObjectID:")
    public native Object getReferenceObject(NSManagedObjectID objectID);
    
}
