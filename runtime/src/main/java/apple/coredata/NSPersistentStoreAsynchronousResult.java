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
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreData/CoreData.h") @Mapping("NSPersistentStoreAsynchronousResult")
public class NSPersistentStoreAsynchronousResult 
    extends NSPersistentStoreResult 
     {

    
    
    public NSPersistentStoreAsynchronousResult() {}
    
    
    @Mapping("managedObjectContext")
    public native NSManagedObjectContext getManagedObjectContext();
    @Mapping("operationError")
    public native NSError getOperationError();
    @Mapping("progress")
    public native NSProgress getProgress();
    
    
    
    @Mapping("cancel")
    public native void cancel();
    
}
