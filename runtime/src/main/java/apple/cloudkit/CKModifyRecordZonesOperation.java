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

@Library("CloudKit/CloudKit.h") @Mapping("CKModifyRecordZonesOperation")
public class CKModifyRecordZonesOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKModifyRecordZonesOperation() {}
    @Mapping("initWithRecordZonesToSave:recordZoneIDsToDelete:")
    public CKModifyRecordZonesOperation(NSArray<?> recordZonesToSave, NSArray<?> recordZoneIDsToDelete) { }
    
    
    @Mapping("recordZonesToSave")
    public native NSArray<CKRecordZone> getRecordZonesToSave();
    @Mapping("setRecordZonesToSave:")
    public native void setRecordZonesToSave(NSArray<CKRecordZone> v);
    @Mapping("recordZoneIDsToDelete")
    public native NSArray<CKRecordZoneID> getRecordZoneIDsToDelete();
    @Mapping("setRecordZoneIDsToDelete:")
    public native void setRecordZoneIDsToDelete(NSArray<CKRecordZoneID> v);
    @Mapping("modifyRecordZonesCompletionBlock")
    public native @Block VoidBlock3<NSArray<CKRecordZone>, NSArray<CKRecordZoneID>, NSError> getModifyRecordZonesCompletionBlock();
    @Mapping("setModifyRecordZonesCompletionBlock:")
    public native void setModifyRecordZonesCompletionBlock(@Block VoidBlock3<NSArray<CKRecordZone>, NSArray<CKRecordZoneID>, NSError> v);
    
    
    
    
    
}
