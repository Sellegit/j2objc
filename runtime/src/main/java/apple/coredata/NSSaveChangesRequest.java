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
 * @since Available in iOS 5.0 and later.
 */

@Library("CoreData") @Mapping("NSSaveChangesRequest")
public class NSSaveChangesRequest 
    extends NSPersistentStoreRequest 
     {

    
    
    public NSSaveChangesRequest() {}
    @Mapping("initWithInsertedObjects:updatedObjects:deletedObjects:lockedObjects:")
    public NSSaveChangesRequest(NSSet<NSManagedObject> insertedObjects, NSSet<NSManagedObject> updatedObjects, NSSet<NSManagedObject> deletedObjects, NSSet<NSManagedObject> lockedObjects) { }
    
    
    @Mapping("insertedObjects")
    public native NSSet<NSManagedObject> getInsertedObjects();
    @Mapping("updatedObjects")
    public native NSSet<NSManagedObject> getUpdatedObjects();
    @Mapping("deletedObjects")
    public native NSSet<NSManagedObject> getDeletedObjects();
    @Mapping("lockedObjects")
    public native NSSet<NSManagedObject> getLockedObjects();
    
    
    
    
    
}
