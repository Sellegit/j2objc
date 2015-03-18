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

@Library("CoreData/CoreData.h") @Mapping("NSManagedObjectModel")
public class NSManagedObjectModel 
    extends NSObject 
    implements NSCoding, NSCopying, NSFastEnumeration {

    
    
    @Mapping("initWithContentsOfURL:")
    public NSManagedObjectModel(NSURL url) { }
    @Mapping("init")
    public NSManagedObjectModel() { }
    
    
    @Mapping("entitiesByName")
    public native Map<String, NSEntityDescription> getEntitiesByName();
    @Mapping("entities")
    public native NSArray<NSEntityDescription> getEntities();
    @Mapping("setEntities:")
    public native void setEntities(NSArray<NSEntityDescription> v);
    @Mapping("configurations")
    public native List<String> getConfigurations();
    @Mapping("localizationDictionary")
    public native Map<String, String> getLocalizationDictionary();
    @Mapping("setLocalizationDictionary:")
    public native void setLocalizationDictionary(Map<String, String> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("fetchRequestTemplatesByName")
    public native Map<String, NSFetchRequest> getFetchRequestTemplatesByName();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionIdentifiers")
    public native NSSet<?> getVersionIdentifiers();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setVersionIdentifiers:")
    public native void setVersionIdentifiers(NSSet<?> v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("entityVersionHashesByName")
    public native NSDictionary<?, ?> getEntityVersionHashesByName();
    
    
    
    @Mapping("entitiesForConfiguration:")
    public native NSArray<NSEntityDescription> getEntitiesForConfiguration(String configuration);
    @Mapping("setEntities:forConfiguration:")
    public native void setEntitiesForConfiguration(NSArray<?> entities, String configuration);
    @Mapping("setFetchRequestTemplate:forName:")
    public native void setFetchRequestTemplate(NSFetchRequest fetchRequestTemplate, String name);
    @Mapping("fetchRequestTemplateForName:")
    public native NSFetchRequest getFetchRequestTemplate(String name);
    @Mapping("fetchRequestFromTemplateWithName:substitutionVariables:")
    public native NSFetchRequest getFetchRequestTemplate(String name, NSDictionary<?, ?> variables);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isConfiguration:compatibleWithStoreMetadata:")
    public native boolean isConfigurationCompatibleWithStoreMetadata(String configuration, NSDictionary<?, ?> metadata);
    @Mapping("mergedModelFromBundles:")
    public static native NSManagedObjectModel createFromBundles(NSArray<?> bundles);
    @Mapping("modelByMergingModels:")
    public static native NSManagedObjectModel createByMergingModels(NSArray<?> models);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("mergedModelFromBundles:forStoreMetadata:")
    public static native NSManagedObjectModel createFromBundles(NSArray<?> bundles, NSDictionary<?, ?> metadata);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("modelByMergingModels:forStoreMetadata:")
    public static native NSManagedObjectModel createByMergingModels(NSArray<?> models, NSDictionary<?, ?> metadata);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
