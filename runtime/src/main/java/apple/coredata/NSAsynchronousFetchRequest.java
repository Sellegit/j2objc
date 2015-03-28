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
@Library("CoreData/CoreData.h") @Mapping("NSAsynchronousFetchRequest")
public class NSAsynchronousFetchRequest 
    extends NSPersistentStoreRequest 
     {

    
    
    @Mapping("init")
    public NSAsynchronousFetchRequest() { }

    
    @Mapping("fetchRequest")
    public native NSFetchRequest getFetchRequest();
    @Mapping("completionBlock")
    public native @Block VoidBlock1<NSAsynchronousFetchResult> getCompletionBlock();
    @Mapping("estimatedResultCount")
    public native @MachineSizedSInt long getEstimatedResultCount();
    @Mapping("setEstimatedResultCount:")
    public native void setEstimatedResultCount(@MachineSizedSInt long v);

    
    


}
