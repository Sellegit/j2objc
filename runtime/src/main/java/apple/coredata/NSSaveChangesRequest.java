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

@Library("CoreData/CoreData.h") @Mapping("NSSaveChangesRequest")
public class NSSaveChangesRequest 
    extends NSPersistentStoreRequest 
     {

    
    
    @Mapping("initWithInsertedObjects:updatedObjects:deletedObjects:lockedObjects:")
    public NSSaveChangesRequest(NSSet<?> insertedObjects, NSSet<?> updatedObjects, NSSet<?> deletedObjects, NSSet<?> lockedObjects) { }
    @Mapping("init")
    public NSSaveChangesRequest() { }
    
    
    @Mapping("insertedObjects")
    public native NSSet<NSManagedObject> getInsertedObjects();
    @Mapping("updatedObjects")
    public native NSSet<NSManagedObject> getUpdatedObjects();
    @Mapping("deletedObjects")
    public native NSSet<NSManagedObject> getDeletedObjects();
    @Mapping("lockedObjects")
    public native NSSet<NSManagedObject> getLockedObjects();
    
    
    
    
    
}
