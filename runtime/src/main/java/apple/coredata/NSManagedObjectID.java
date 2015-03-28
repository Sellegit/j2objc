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
@Library("CoreData/CoreData.h") @Mapping("NSManagedObjectID")
public class NSManagedObjectID 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSManagedObjectID() { }

    
    @Mapping("entity")
    public native NSEntityDescription getEntity();
    @Mapping("persistentStore")
    public native NSPersistentStore getPersistentStore();
    @Mapping("isTemporaryID")
    public native boolean isTemporaryID();

    
    
    @Mapping("URIRepresentation")
    public native NSURL getURIRepresentation();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
