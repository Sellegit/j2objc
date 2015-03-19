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

@Library("CoreData/CoreData.h") @Mapping("NSRelationshipDescription")
public class NSRelationshipDescription 
    extends NSPropertyDescription 
     {

    
    
    @Mapping("initWithCoder:")
    public NSRelationshipDescription(NSCoder aDecoder) { }
    @Mapping("init")
    public NSRelationshipDescription() { }
    
    
    @Mapping("destinationEntity")
    public native NSEntityDescription getDestinationEntity();
    @Mapping("setDestinationEntity:")
    public native void setDestinationEntity(NSEntityDescription v);
    @Mapping("inverseRelationship")
    public native NSRelationshipDescription getInverseRelationship();
    @Mapping("setInverseRelationship:")
    public native void setInverseRelationship(NSRelationshipDescription v);
    @Mapping("maxCount")
    public native @MachineSizedUInt long getMaxCount();
    @Mapping("setMaxCount:")
    public native void setMaxCount(@MachineSizedUInt long v);
    @Mapping("minCount")
    public native @MachineSizedUInt long getMinCount();
    @Mapping("setMinCount:")
    public native void setMinCount(@MachineSizedUInt long v);
    @Mapping("deleteRule")
    public native @Representing("NSDeleteRule") long getDeleteRule();
    @Mapping("setDeleteRule:")
    public native void setDeleteRule(@Representing("NSDeleteRule") long v);
    @Mapping("isToMany")
    public native boolean isToMany();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("versionHash")
    public native NSData getVersionHash();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isOrdered")
    public native boolean isOrdered();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setOrdered:")
    public native void setOrdered(boolean v);
    
    
    
    
    
}
