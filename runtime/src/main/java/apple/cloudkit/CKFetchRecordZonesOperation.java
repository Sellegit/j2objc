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

@Library("CloudKit") @Mapping("CKFetchRecordZonesOperation")
public class CKFetchRecordZonesOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKFetchRecordZonesOperation() {}
    @Mapping("initWithRecordZoneIDs:")
    public CKFetchRecordZonesOperation(NSArray<?> zoneIDs) { }
    
    
    @Mapping("recordZoneIDs")
    public native NSArray<CKRecordZoneID> getRecordZoneIDs();
    @Mapping("setRecordZoneIDs:")
    public native void setRecordZoneIDs(NSArray<CKRecordZoneID> v);
    @Mapping("fetchRecordZonesCompletionBlock")
    public native @Block VoidBlock2<NSDictionary<CKRecordZoneID, CKRecordZone>, NSError> getFetchRecordZonesCompletionBlock();
    @Mapping("setFetchRecordZonesCompletionBlock:")
    public native void setFetchRecordZonesCompletionBlock(@Block VoidBlock2<NSDictionary<CKRecordZoneID, CKRecordZone>, NSError> v);
    
    
    
    @Mapping("fetchAllRecordZonesOperation")
    public static native CKFetchRecordZonesOperation createFetchAllRecordZonesOperation();
    
}
