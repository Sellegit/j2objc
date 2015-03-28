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
@Library("CoreData/CoreData.h") @Mapping("NSEntityMigrationPolicy")
public class NSEntityMigrationPolicy 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSEntityMigrationPolicy() { }

    


    
    
    @Mapping("beginEntityMapping:manager:error:")
    public native boolean beginEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("createDestinationInstancesForSourceInstance:entityMapping:manager:error:")
    public native boolean createDestinationInstances(NSManagedObject sInstance, NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endInstanceCreationForEntityMapping:manager:error:")
    public native boolean endInstanceCreation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("createRelationshipsForDestinationInstance:entityMapping:manager:error:")
    public native boolean createRelationships(NSManagedObject dInstance, NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endRelationshipCreationForEntityMapping:manager:error:")
    public native boolean endRelationshipCreation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("performCustomValidationForEntityMapping:manager:error:")
    public native boolean performCustomValidation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endEntityMapping:manager:error:")
    public native boolean endEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, Todo error);

}
