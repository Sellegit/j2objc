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

    
    
    public NSEntityMigrationPolicy() {}
    
    
    
    
    
    
    @Mapping("beginEntityMapping:manager:error:")
    protected native boolean beginEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("createDestinationInstancesForSourceInstance:entityMapping:manager:error:")
    protected native boolean createDestinationInstances(NSManagedObject sInstance, NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endInstanceCreationForEntityMapping:manager:error:")
    protected native boolean endInstanceCreation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("createRelationshipsForDestinationInstance:entityMapping:manager:error:")
    protected native boolean createRelationships(NSManagedObject dInstance, NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endRelationshipCreationForEntityMapping:manager:error:")
    protected native boolean endRelationshipCreation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("performCustomValidationForEntityMapping:manager:error:")
    protected native boolean performCustomValidation(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    @Mapping("endEntityMapping:manager:error:")
    protected native boolean endEntityMapping(NSEntityMapping mapping, NSMigrationManager manager, Todo error);
    
}
