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
@Library("CoreData/CoreData.h") @Mapping("NSEntityMapping")
public class NSEntityMapping 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSEntityMapping() { }

    
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("mappingType")
    public native @Representing("NSEntityMappingType") long getMappingType();
    @Mapping("setMappingType:")
    public native void setMappingType(@Representing("NSEntityMappingType") long v);
    @Mapping("sourceEntityName")
    public native String getSourceEntityName();
    @Mapping("setSourceEntityName:")
    public native void setSourceEntityName(String v);
    @Mapping("sourceEntityVersionHash")
    public native NSData getSourceEntityVersionHash();
    @Mapping("setSourceEntityVersionHash:")
    public native void setSourceEntityVersionHash(NSData v);
    @Mapping("destinationEntityName")
    public native String getDestinationEntityName();
    @Mapping("setDestinationEntityName:")
    public native void setDestinationEntityName(String v);
    @Mapping("destinationEntityVersionHash")
    public native NSData getDestinationEntityVersionHash();
    @Mapping("setDestinationEntityVersionHash:")
    public native void setDestinationEntityVersionHash(NSData v);
    @Mapping("attributeMappings")
    public native NSArray<NSPropertyMapping> getAttributeMappings();
    @Mapping("setAttributeMappings:")
    public native void setAttributeMappings(NSArray<NSPropertyMapping> v);
    @Mapping("relationshipMappings")
    public native NSArray<NSPropertyMapping> getRelationshipMappings();
    @Mapping("setRelationshipMappings:")
    public native void setRelationshipMappings(NSArray<NSPropertyMapping> v);
    @Mapping("sourceExpression")
    public native NSExpression getSourceExpression();
    @Mapping("setSourceExpression:")
    public native void setSourceExpression(NSExpression v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    @Mapping("entityMigrationPolicyClassName")
    public native String getEntityMigrationPolicyClassName();
    @Mapping("setEntityMigrationPolicyClassName:")
    public native void setEntityMigrationPolicyClassName(String v);

    
    


}
