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
 * @since Available in iOS 5.0 and later.
 */
@Library("CoreData/CoreData.h") @Mapping("NSIncrementalStoreNode")
public class NSIncrementalStoreNode 
    extends NSObject 
     {

    
    
    @Mapping("initWithObjectID:withValues:version:")
    public NSIncrementalStoreNode(NSManagedObjectID objectID, NSDictionary<?, ?> values, long version) { }
    @Mapping("init")
    public NSIncrementalStoreNode() { }

    
    @Mapping("objectID")
    public native NSManagedObjectID getObjectID();
    @Mapping("version")
    public native long getVersion();

    
    
    @Mapping("updateWithValues:version:")
    public native void update(NSDictionary<?, ?> values, long version);
    @Mapping("valueForPropertyDescription:")
    public native Object getValue(NSPropertyDescription prop);

}
