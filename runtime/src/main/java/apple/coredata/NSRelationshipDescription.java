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

@Library("CoreData") @Mapping("NSRelationshipDescription")
public class NSRelationshipDescription 
    extends NSPropertyDescription 
     {

    
    
    public NSRelationshipDescription() {}
    
    
    @Mapping("destinationEntity")
    public native NSEntityDescription getDestinationEntity();
    public native void setDestinationEntity(NSEntityDescription v);
    @Mapping("inverseRelationship")
    public native NSRelationshipDescription getInverseRelationship();
    public native void setInverseRelationship(NSRelationshipDescription v);
    @Mapping("maxCount")
    public native @MachineSizedUInt long getMaxCount();
    public native void setMaxCount(@MachineSizedUInt long v);
    @Mapping("minCount")
    public native @MachineSizedUInt long getMinCount();
    public native void setMinCount(@MachineSizedUInt long v);
    @Mapping("deleteRule")
    public native @Representing("NSDeleteRule") @MachineSizedUInt long getDeleteRule();
    public native void setDeleteRule(@Representing("NSDeleteRule") @MachineSizedUInt long v);
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
    public native void setOrdered(boolean v);
    
    
    
    
    
}
