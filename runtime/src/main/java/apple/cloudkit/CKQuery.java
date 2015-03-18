package apple.cloudkit;


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
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit/CloudKit.h") @Mapping("CKQuery")
public class CKQuery 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("initWithCoder:")
    public CKQuery(NSCoder aDecoder) { }
    @Mapping("initWithRecordType:predicate:")
    public CKQuery(String recordType, NSPredicate predicate) { }
    @Mapping("init")
    public CKQuery() { }
    
    
    @Mapping("recordType")
    public native String getRecordType();
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    @Mapping("sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Mapping("setSortDescriptors:")
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
