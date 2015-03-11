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

@Library("CloudKit") @Mapping("CKModifyRecordsOperation")
public class CKModifyRecordsOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKModifyRecordsOperation() {}
    @Mapping("initWithRecordsToSave:recordIDsToDelete:")
    public CKModifyRecordsOperation(NSArray<CKRecord> records, NSArray<CKRecordID> recordIDs) { }
    
    
    @Mapping("recordsToSave")
    public native NSArray<CKRecord> getRecordsToSave();
    @Mapping("setRecordsToSave:")
    public native void setRecordsToSave(NSArray<CKRecord> v);
    @Mapping("recordIDsToDelete")
    public native NSArray<CKRecordID> getRecordIDsToDelete();
    @Mapping("setRecordIDsToDelete:")
    public native void setRecordIDsToDelete(NSArray<CKRecordID> v);
    @Mapping("savePolicy")
    public native @Representing("CKRecordSavePolicy") @MachineSizedSInt long getSavePolicy();
    @Mapping("setSavePolicy:")
    public native void setSavePolicy(@Representing("CKRecordSavePolicy") @MachineSizedSInt long v);
    @Mapping("clientChangeTokenData")
    public native NSData getClientChangeTokenData();
    @Mapping("setClientChangeTokenData:")
    public native void setClientChangeTokenData(NSData v);
    @Mapping("atomic")
    public native boolean isAtomic();
    @Mapping("setAtomic:")
    public native void setAtomic(boolean v);
    @Mapping("perRecordProgressBlock")
    public native @Block VoidBlock2<CKRecord, Double> getPerRecordProgressBlock();
    @Mapping("setPerRecordProgressBlock:")
    public native void setPerRecordProgressBlock(@Block VoidBlock2<CKRecord, Double> v);
    @Mapping("perRecordCompletionBlock")
    public native @Block VoidBlock2<CKRecord, NSError> getPerRecordCompletionBlock();
    @Mapping("setPerRecordCompletionBlock:")
    public native void setPerRecordCompletionBlock(@Block VoidBlock2<CKRecord, NSError> v);
    @Mapping("modifyRecordsCompletionBlock")
    public native @Block VoidBlock3<NSArray<CKRecord>, NSArray<CKRecordID>, NSError> getModifyRecordsCompletionBlock();
    @Mapping("setModifyRecordsCompletionBlock:")
    public native void setModifyRecordsCompletionBlock(@Block VoidBlock3<NSArray<CKRecord>, NSArray<CKRecordID>, NSError> v);
    
    
    
    
    
}
