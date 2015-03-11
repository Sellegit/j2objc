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

@Library("CoreData") @Mapping("NSPersistentStoreRequest")
public class NSPersistentStoreRequest 
    extends NSObject 
    implements NSCopying {

    
    
    public NSPersistentStoreRequest() {}
    
    
    @Mapping("affectedStores")
    public native List<String> getAffectedStores();
    @Mapping("setAffectedStores:")
    public native void setAffectedStores(List<String> v);
    @Mapping("requestType")
    public native @Representing("NSPersistentStoreRequestType") @MachineSizedUInt long getRequestType();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
