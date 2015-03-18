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

@Library("CoreData/CoreData.h") @Mapping("NSAtomicStoreCacheNode")
public class NSAtomicStoreCacheNode 
    extends NSObject 
     {

    
    
    @Mapping("initWithObjectID:")
    public NSAtomicStoreCacheNode(NSManagedObjectID moid) { }
    @Mapping("init")
    public NSAtomicStoreCacheNode() { }
    
    
    @Mapping("objectID")
    public native NSManagedObjectID getObjectID();
    @Mapping("propertyCache")
    public native Map<String, NSObject> getPropertyCache();
    @Mapping("setPropertyCache:")
    public native void setPropertyCache(Map<String, NSObject> v);
    
    
    
    @Mapping("valueForKey:")
    public native Object getValue(String key);
    @Mapping("setValue:forKey:")
    public native void setValue(Object value, String key);
    
}
