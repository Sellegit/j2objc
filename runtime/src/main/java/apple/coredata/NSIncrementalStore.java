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

@Library("CoreData/CoreData.h") @Mapping("NSIncrementalStore")
public class NSIncrementalStore 
    extends NSPersistentStore 
     {

    
    
    public NSIncrementalStore() {}
    @Mapping("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public NSIncrementalStore(NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options) { }
    
    
    
    
    
    
    @Mapping("loadMetadata:")
    protected native boolean loadMetadata(Todo error);
    @Mapping("executeRequest:withContext:error:")
    protected native Object executeRequest(NSPersistentStoreRequest request, NSManagedObjectContext context, Todo error);
    @Mapping("newValuesForObjectWithID:withContext:error:")
    protected native NSIncrementalStoreNode newValuesForObjectID(NSManagedObjectID objectID, NSManagedObjectContext context, Todo error);
    @Mapping("newValueForRelationship:forObjectWithID:withContext:error:")
    protected native Object newValueForRelationship(NSRelationshipDescription relationship, NSManagedObjectID objectID, NSManagedObjectContext context, Todo error);
    @Mapping("obtainPermanentIDsForObjects:error:")
    protected native NSArray<NSManagedObjectID> obtainPermanentIDsForObjects(NSArray<?> array, Todo error);
    @Mapping("managedObjectContextDidRegisterObjectsWithIDs:")
    public native void didRegisterObjects(NSArray<?> objectIDs);
    @Mapping("managedObjectContextDidUnregisterObjectsWithIDs:")
    public native void didUnregisterObjects(NSArray<?> objectIDs);
    @Mapping("newObjectIDForEntity:referenceObject:")
    public native NSManagedObjectID newObjectIDForEntity(NSEntityDescription entity, Object data);
    @Mapping("referenceObjectForObjectID:")
    public native Object getReferenceObjectForID(NSManagedObjectID objectID);
    @Mapping("identifierForNewStoreAtURL:")
    public static native Object getIdentifierForNewStore(NSURL storeURL);
    
}
