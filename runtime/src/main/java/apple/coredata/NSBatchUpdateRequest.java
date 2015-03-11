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

@Library("CoreData") @Mapping("NSBatchUpdateRequest")
public class NSBatchUpdateRequest 
    extends NSPersistentStoreRequest 
     {

    
    
    public NSBatchUpdateRequest() {}
    @Mapping("initWithEntityName:")
    public NSBatchUpdateRequest(String entityName) { }
    @Mapping("initWithEntity:")
    public NSBatchUpdateRequest(NSEntityDescription entity) { }
    
    
    @Mapping("entityName")
    public native String getEntityName();
    @Mapping("entity")
    public native NSEntityDescription getEntity();
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    public native void setPredicate(NSPredicate v);
    @Mapping("includesSubentities")
    public native boolean includesSubentities();
    public native void setIncludesSubentities(boolean v);
    @Mapping("resultType")
    public native @Representing("NSBatchUpdateRequestResultType") @MachineSizedUInt long getResultType();
    public native void setResultType(@Representing("NSBatchUpdateRequestResultType") @MachineSizedUInt long v);
    @Mapping("propertiesToUpdate")
    public native Map<String, NSExpression> getPropertiesToUpdate();
    public native void setPropertiesToUpdate(Map<String, NSExpression> v);
    
    
    
    @Mapping("batchUpdateRequestWithEntityName:")
    public static native NSBatchUpdateRequest create(String entityName);
    
}
