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

@Library("CoreData") @Mapping("NSManagedObjectContext")
public class NSManagedObjectContext 
    extends NSObject 
    implements NSCoding, NSLocking {

    
    
    public NSManagedObjectContext() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithConcurrencyType:")
    public NSManagedObjectContext(@Representing("NSManagedObjectContextConcurrencyType") @MachineSizedUInt long ct) { }
    
    
    @Mapping("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator getPersistentStoreCoordinator();
    @Mapping("setPersistentStoreCoordinator:")
    public native void setPersistentStoreCoordinator(NSPersistentStoreCoordinator v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("parentContext")
    public native NSManagedObjectContext getParentContext();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setParentContext:")
    public native void setParentContext(NSManagedObjectContext v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("undoManager")
    public native NSUndoManager getUndoManager();
    @Mapping("setUndoManager:")
    public native void setUndoManager(NSUndoManager v);
    @Mapping("hasChanges")
    public native boolean hasChanges();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("userInfo")
    public native NSMutableDictionary<?, ?> getUserInfo();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("concurrencyType")
    public native @Representing("NSManagedObjectContextConcurrencyType") @MachineSizedUInt long getConcurrencyType();
    @Mapping("insertedObjects")
    public native NSSet<NSManagedObject> getInsertedObjects();
    @Mapping("updatedObjects")
    public native NSSet<NSManagedObject> getUpdatedObjects();
    @Mapping("deletedObjects")
    public native NSSet<NSManagedObject> getDeletedObjects();
    @Mapping("registeredObjects")
    public native NSSet<NSManagedObject> getRegisteredObjects();
    @Mapping("propagatesDeletesAtEndOfEvent")
    public native boolean propagatesDeletesAtEndOfEvent();
    @Mapping("setPropagatesDeletesAtEndOfEvent:")
    public native void setPropagatesDeletesAtEndOfEvent(boolean v);
    @Mapping("retainsRegisteredObjects")
    public native NSSet<NSManagedObject> getRetainsRegisteredObjects();
    @Mapping("setRetainsRegisteredObjects:")
    public native void setRetainsRegisteredObjects(NSSet<NSManagedObject> v);
    @Mapping("stalenessInterval")
    public native double getStalenessInterval();
    @Mapping("setStalenessInterval:")
    public native void setStalenessInterval(double v);
    @Mapping("mergePolicy")
    public native Object getMergePolicy();
    @Mapping("setMergePolicy:")
    public native void setMergePolicy(Object v);
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSManagedObjectContextWillSaveNotification")
    protected static native NSString WillSaveNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSManagedObjectContextDidSaveNotification")
    protected static native NSString DidSaveNotification();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSManagedObjectContextObjectsDidChangeNotification")
    protected static native NSString ObjectsDidChangeNotification();
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("performBlock:")
    public native void performBlock(@Block Runnable block);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("performBlockAndWait:")
    public native void performBlockAndWait(@Block Runnable block);
    @Mapping("objectRegisteredForID:")
    public native NSManagedObject getObjectRegisteredForID(NSManagedObjectID objectID);
    @Mapping("objectWithID:")
    public native NSManagedObject getObjectWithId(NSManagedObjectID objectID);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("existingObjectWithID:error:")
    protected native NSManagedObject getExistingObjectWithID(NSManagedObjectID objectID, Todo error);
    @Mapping("executeFetchRequest:error:")
    protected native NSArray<NSManagedObject> executeFetchRequest(NSFetchRequest request, Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("countForFetchRequest:error:")
    protected native @MachineSizedUInt long getCountForFetchRequest(NSFetchRequest request, Todo error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("executeRequest:error:")
    protected native NSPersistentStoreResult executeRequest(NSPersistentStoreRequest request, Todo error);
    @Mapping("insertObject:")
    public native void insertObject(NSManagedObject object);
    @Mapping("deleteObject:")
    public native void deleteObject(NSManagedObject object);
    @Mapping("refreshObject:mergeChanges:")
    public native void refreshObject(NSManagedObject object, boolean flag);
    @Mapping("detectConflictsForObject:")
    public native void detectConflicts(NSManagedObject object);
    @Mapping("processPendingChanges")
    public native void processPendingChanges();
    @Mapping("assignObject:toPersistentStore:")
    public native void assignObjectToPersistentStore(Object object, NSPersistentStore store);
    @Mapping("undo")
    public native void undo();
    @Mapping("redo")
    public native void redo();
    @Mapping("reset")
    public native void reset();
    @Mapping("rollback")
    public native void rollback();
    @Mapping("save:")
    protected native boolean save(Todo error);
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
    @Mapping("obtainPermanentIDsForObjects:error:")
    protected native boolean obtainPermanentIDsForObjects(NSArray<NSManagedObject> objects, Todo error);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("mergeChangesFromContextDidSaveNotification:")
    public native void mergeChangesFromContextDidSaveNotification(NSNotification notification);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
