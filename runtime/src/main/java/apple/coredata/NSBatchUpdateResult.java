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

@Library("CoreData") @Mapping("NSBatchUpdateResult")
public class NSBatchUpdateResult 
    extends NSPersistentStoreResult 
     {

    
    
    public NSBatchUpdateResult() {}
    
    
    @Mapping("result")
    public native Object getResult();
    @Mapping("resultType")
    public native @Representing("NSBatchUpdateRequestResultType") @MachineSizedUInt long getResultType();
    
    
    
    
    
}
