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
@Library("CoreData/CoreData.h") @Mapping("NSAsynchronousFetchResult")
public class NSAsynchronousFetchResult 
    extends NSPersistentStoreAsynchronousResult 
     {

    
    
    @Mapping("init")
    public NSAsynchronousFetchResult() { }

    
    @Mapping("fetchRequest")
    public native NSAsynchronousFetchRequest getFetchRequest();
    @Mapping("finalResult")
    public native NSArray<NSManagedObject> getFinalResult();

    
    


}
