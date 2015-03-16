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

@Library("CoreData/CoreData.h") @Mapping("NSEntityDescription")
public class NSEntityDescription 
    extends NSObject 
    implements NSCoding, NSCopying, NSFastEnumeration {

    
    
    public NSEntityDescription() {}
    
    
    @Mapping("managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @Mapping("managedObjectClassName")
    public native String getManagedObjectClassName();
    @Mapping("setManagedObjectClassName:")
    public native void setManagedObjectClassName(String v);
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("isAbstract")
    public native boolean isAbstract();
    @Mapping("setAbstract:")
    public native void setAbstract(boolean v);
    @Mapping("subentitiesByName")
    public native Map<String, NSEntityDescription> getSubentitiesByName();
    @Mapping("subentities")
    public native NSArray<NSEntityDescription> getSubentities();
    @Mapping("setSubentities:")
    public native void setSubentities(NSArray<NSEntityDescription> v);
    @Mapping("superentity")
    public native NSEntityDescription getSuperentity();
    @Mapping("propertiesByName")
    public native Map<String, NSPropertyDescription> getPropertiesByName();
    @Mapping("properties")
    public native NSArray<NSPropertyDescription> getProperties();
    @Mapping("setProperties:")
    public native void setProperties(NSArray<NSPropertyDescription> v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    @Mapping("attributesByName")
    public native Map<String, NSAttributeDescription> getAttributesByName();
    @Mapping("relationshipsByName")
    public native Map<String, NSRelationshipDescription> getRelationshipsByName();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHash")
    public native NSData getVersionHash();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHashModifier")
    public native String getVersionHashModifier();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setVersionHashModifier:")
    public native void setVersionHashModifier(String v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("renamingIdentifier")
    public native String getRenamingIdentifier();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setRenamingIdentifier:")
    public native void setRenamingIdentifier(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("compoundIndexes")
    public native NSArray<?> getCompoundIndexes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setCompoundIndexes:")
    public native void setCompoundIndexes(NSArray<?> v);
    
    
    
    @Mapping("relationshipsWithDestinationEntity:")
    public native NSArray<NSRelationshipDescription> getRelationshipsWith(NSEntityDescription entity);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isKindOfEntity:")
    public native boolean isKindOfEntity(NSEntityDescription entity);
    @Mapping("entityForName:inManagedObjectContext:")
    public static native NSEntityDescription getEntityByNameInContext(String entityName, NSManagedObjectContext context);
    @Mapping("insertNewObjectForEntityForName:inManagedObjectContext:")
    public static native NSEntityDescription insertNewEntityInContext(String entityName, NSManagedObjectContext context);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
