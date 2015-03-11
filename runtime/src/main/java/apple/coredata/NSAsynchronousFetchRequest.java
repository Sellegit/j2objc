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

@Library("CoreData") @Mapping("NSAsynchronousFetchRequest")
public class NSAsynchronousFetchRequest 
    extends NSPersistentStoreRequest 
     {

    
    
    public NSAsynchronousFetchRequest() {}
    @Mapping("initWithFetchRequest:completionBlock:")
    public NSAsynchronousFetchRequest(NSFetchRequest request, @Block VoidBlock1<NSAsynchronousFetchResult> blk) { }
    
    
    @Mapping("fetchRequest")
    public native NSFetchRequest getFetchRequest();
    @Mapping("completionBlock")
    public native @Block VoidBlock1<NSAsynchronousFetchResult> getCompletionBlock();
    @Mapping("estimatedResultCount")
    public native @MachineSizedSInt long getEstimatedResultCount();
    public native void setEstimatedResultCount(@MachineSizedSInt long v);
    
    
    
    
    
}
