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

@Library("CloudKit") @Mapping("CKFetchRecordsOperation")
public class CKFetchRecordsOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKFetchRecordsOperation() {}
    @Mapping("initWithRecordIDs:")
    public CKFetchRecordsOperation(NSArray<?> recordIDs) { }
    
    
    @Mapping("recordIDs")
    public native NSArray<CKRecordID> getRecordIDs();
    @Mapping("setRecordIDs:")
    public native void setRecordIDs(NSArray<CKRecordID> v);
    @Mapping("desiredKeys")
    public native List<String> getDesiredKeys();
    @Mapping("setDesiredKeys:")
    public native void setDesiredKeys(List<String> v);
    @Mapping("perRecordProgressBlock")
    public native @Block VoidBlock2<CKRecordID, Double> getPerRecordProgressBlock();
    @Mapping("setPerRecordProgressBlock:")
    public native void setPerRecordProgressBlock(@Block VoidBlock2<CKRecordID, Double> v);
    @Mapping("perRecordCompletionBlock")
    public native @Block VoidBlock3<CKRecord, CKRecordID, NSError> getPerRecordCompletionBlock();
    @Mapping("setPerRecordCompletionBlock:")
    public native void setPerRecordCompletionBlock(@Block VoidBlock3<CKRecord, CKRecordID, NSError> v);
    @Mapping("fetchRecordsCompletionBlock")
    public native @Block VoidBlock2<NSDictionary<CKRecordID, CKRecord>, NSError> getFetchRecordsCompletionBlock();
    @Mapping("setFetchRecordsCompletionBlock:")
    public native void setFetchRecordsCompletionBlock(@Block VoidBlock2<NSDictionary<CKRecordID, CKRecord>, NSError> v);
    
    
    
    @Mapping("fetchCurrentUserRecordOperation")
    public static native CKFetchRecordsOperation createFetchCurrentUserRecordOperation();
    
}
