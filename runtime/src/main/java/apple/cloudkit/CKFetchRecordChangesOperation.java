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

@Library("CloudKit") @Mapping("CKFetchRecordChangesOperation")
public class CKFetchRecordChangesOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKFetchRecordChangesOperation() {}
    @Mapping("initWithRecordZoneID:previousServerChangeToken:")
    public CKFetchRecordChangesOperation(CKRecordZoneID recordZoneID, CKServerChangeToken previousServerChangeToken) { }
    
    
    @Mapping("recordZoneID")
    public native CKRecordZoneID getRecordZoneID();
    public native void setRecordZoneID(CKRecordZoneID v);
    @Mapping("previousServerChangeToken")
    public native CKServerChangeToken getPreviousServerChangeToken();
    public native void setPreviousServerChangeToken(CKServerChangeToken v);
    @Mapping("resultsLimit")
    public native @MachineSizedUInt long getResultsLimit();
    public native void setResultsLimit(@MachineSizedUInt long v);
    @Mapping("desiredKeys")
    public native List<String> getDesiredKeys();
    public native void setDesiredKeys(List<String> v);
    @Mapping("recordChangedBlock")
    public native @Block VoidBlock1<CKRecord> getRecordChangedBlock();
    public native void setRecordChangedBlock(@Block VoidBlock1<CKRecord> v);
    @Mapping("recordWithIDWasDeletedBlock")
    public native @Block VoidBlock1<CKRecordID> getRecordWithIDWasDeletedBlock();
    public native void setRecordWithIDWasDeletedBlock(@Block VoidBlock1<CKRecordID> v);
    @Mapping("moreComing")
    public native boolean isMoreComing();
    @Mapping("fetchRecordChangesCompletionBlock")
    public native @Block VoidBlock3<CKServerChangeToken, NSData, NSError> getFetchRecordChangesCompletionBlock();
    public native void setFetchRecordChangesCompletionBlock(@Block VoidBlock3<CKServerChangeToken, NSData, NSError> v);
    
    
    
    
    
}
