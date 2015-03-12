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

@Library("CoreData") @Mapping("NSMigrationManager")
public class NSMigrationManager 
    extends NSObject 
     {

    
    
    public NSMigrationManager() {}
    @Mapping("initWithSourceModel:destinationModel:")
    public NSMigrationManager(NSManagedObjectModel sourceModel, NSManagedObjectModel destinationModel) { }
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("usesStoreSpecificMigrationManager")
    public native boolean usesStoreSpecificMigrationManager();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setUsesStoreSpecificMigrationManager:")
    public native void setUsesStoreSpecificMigrationManager(boolean v);
    @Mapping("mappingModel")
    public native NSMappingModel getMappingModel();
    @Mapping("sourceModel")
    public native NSManagedObjectModel getSourceModel();
    @Mapping("destinationModel")
    public native NSManagedObjectModel getDestinationModel();
    @Mapping("sourceContext")
    public native NSManagedObjectContext getSourceContext();
    @Mapping("destinationContext")
    public native NSManagedObjectContext getDestinationContext();
    @Mapping("currentEntityMapping")
    public native NSEntityMapping getCurrentEntityMapping();
    @Mapping("migrationProgress")
    public native float getMigrationProgress();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    
    
    
    @Mapping("migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error:")
    protected native boolean migrateStore(NSURL sourceURL, String sStoreType, NSDictionary<?, ?> sOptions, NSMappingModel mappings, NSURL dURL, String dStoreType, NSDictionary<?, ?> dOptions, Todo error);
    @Mapping("reset")
    public native void reset();
    @Mapping("sourceEntityForEntityMapping:")
    public native NSEntityDescription getSourceEntity(NSEntityMapping mEntity);
    @Mapping("destinationEntityForEntityMapping:")
    public native NSEntityDescription getDestinationEntity(NSEntityMapping mEntity);
    @Mapping("associateSourceInstance:withDestinationInstance:forEntityMapping:")
    public native void associateInstances(NSManagedObject sourceInstance, NSManagedObject destinationInstance, NSEntityMapping entityMapping);
    @Mapping("destinationInstancesForEntityMappingNamed:sourceInstances:")
    public native NSArray<NSEntityMapping> getDestinationInstances(String mappingName, NSArray<?> sourceInstances);
    @Mapping("sourceInstancesForEntityMappingNamed:destinationInstances:")
    public native NSArray<NSEntityMapping> getSourceInstances(String mappingName, NSArray<?> destinationInstances);
    @Mapping("cancelMigrationWithError:")
    public native void cancelMigration(NSError error);
    
}
