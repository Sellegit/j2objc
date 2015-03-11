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

@Library("CoreData") @Mapping("NSEntityMapping")
public class NSEntityMapping 
    extends NSObject 
     {

    
    
    public NSEntityMapping() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("mappingType")
    public native @Representing("NSEntityMappingType") @MachineSizedUInt long getMappingType();
    public native void setMappingType(@Representing("NSEntityMappingType") @MachineSizedUInt long v);
    @Mapping("sourceEntityName")
    public native String getSourceEntityName();
    public native void setSourceEntityName(String v);
    @Mapping("sourceEntityVersionHash")
    public native NSData getSourceEntityVersionHash();
    public native void setSourceEntityVersionHash(NSData v);
    @Mapping("destinationEntityName")
    public native String getDestinationEntityName();
    public native void setDestinationEntityName(String v);
    @Mapping("destinationEntityVersionHash")
    public native NSData getDestinationEntityVersionHash();
    public native void setDestinationEntityVersionHash(NSData v);
    @Mapping("attributeMappings")
    public native NSArray<NSPropertyMapping> getAttributeMappings();
    public native void setAttributeMappings(NSArray<NSPropertyMapping> v);
    @Mapping("relationshipMappings")
    public native NSArray<NSPropertyMapping> getRelationshipMappings();
    public native void setRelationshipMappings(NSArray<NSPropertyMapping> v);
    @Mapping("sourceExpression")
    public native NSExpression getSourceExpression();
    public native void setSourceExpression(NSExpression v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    public native void setUserInfo(NSDictionary<?, ?> v);
    @Mapping("entityMigrationPolicyClassName")
    public native String getEntityMigrationPolicyClassName();
    public native void setEntityMigrationPolicyClassName(String v);
    
    
    
    
    
}
