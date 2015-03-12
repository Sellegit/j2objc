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

@Library("CoreData") @Mapping("NSMappingModel")
public class NSMappingModel 
    extends NSObject 
     {

    
    
    public NSMappingModel() {}
    @Mapping("initWithContentsOfURL:")
    public NSMappingModel(NSURL url) { }
    
    
    @Mapping("entityMappings")
    public native NSArray<NSEntityMapping> getEntityMappings();
    @Mapping("setEntityMappings:")
    public native void setEntityMappings(NSArray<NSEntityMapping> v);
    @Mapping("entityMappingsByName")
    public native Map<String, NSEntityMapping> getEntityMappingsByName();
    
    
    
    @Mapping("mappingModelFromBundles:forSourceModel:destinationModel:")
    public static native NSMappingModel create(NSArray<?> bundles, NSManagedObjectModel sourceModel, NSManagedObjectModel destinationModel);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("inferredMappingModelForSourceModel:destinationModel:error:")
    protected static native NSMappingModel createInferred(NSManagedObjectModel sourceModel, NSManagedObjectModel destinationModel, Todo error);
    
}
