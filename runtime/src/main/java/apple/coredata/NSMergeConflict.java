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

@Library("CoreData/CoreData.h") @Mapping("NSMergeConflict")
public class NSMergeConflict 
    extends NSObject 
     {

    
    
    @Mapping("initWithSource:newVersion:oldVersion:cachedSnapshot:persistedSnapshot:")
    public NSMergeConflict(NSManagedObject srcObject, @MachineSizedUInt long newvers, @MachineSizedUInt long oldvers, NSDictionary<?, ?> cachesnap, NSDictionary<?, ?> persnap) { }
    @Mapping("init")
    public NSMergeConflict() { }
    
    
    @Mapping("sourceObject")
    public native NSManagedObject getSourceObject();
    @Mapping("objectSnapshot")
    public native Map<String, NSObject> getObjectSnapshot();
    @Mapping("cachedSnapshot")
    public native Map<String, NSObject> getCachedSnapshot();
    @Mapping("persistedSnapshot")
    public native Map<String, NSObject> getPersistedSnapshot();
    @Mapping("newVersionNumber")
    public native @MachineSizedUInt long getNewVersionNumber();
    @Mapping("oldVersionNumber")
    public native @MachineSizedUInt long getOldVersionNumber();
    
    
    
    
    
}
