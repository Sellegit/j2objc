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

@Library("CloudKit") @Mapping("CKDatabase")
public class CKDatabase 
    extends NSObject 
     {

    
    
    public CKDatabase() {}
    
    
    
    
    
    
    @Mapping("addOperation:")
    public native void addOperation(CKDatabaseOperation operation);
    @Mapping("fetchRecordWithID:completionHandler:")
    public native void fetchRecord(CKRecordID recordID, @Block VoidBlock2<CKRecord, NSError> completionHandler);
    @Mapping("saveRecord:completionHandler:")
    public native void saveRecord(CKRecord record, @Block VoidBlock2<CKRecord, NSError> completionHandler);
    @Mapping("deleteRecordWithID:completionHandler:")
    public native void deleteRecord(CKRecordID recordID, @Block VoidBlock2<CKRecordID, NSError> completionHandler);
    @Mapping("performQuery:inZoneWithID:completionHandler:")
    public native void performQuery(CKQuery query, CKRecordZoneID zoneID, @Block VoidBlock2<NSArray<CKRecord>, NSError> completionHandler);
    @Mapping("fetchAllRecordZonesWithCompletionHandler:")
    public native void fetchAllRecordZones(@Block VoidBlock2<NSArray<CKRecordZone>, NSError> completionHandler);
    @Mapping("fetchRecordZoneWithID:completionHandler:")
    public native void fetchRecordZone(CKRecordZoneID zoneID, @Block VoidBlock2<CKRecordZone, NSError> completionHandler);
    @Mapping("saveRecordZone:completionHandler:")
    public native void saveRecordZone(CKRecordZone zone, @Block VoidBlock2<CKRecordZone, NSError> completionHandler);
    @Mapping("deleteRecordZoneWithID:completionHandler:")
    public native void deleteRecordZone(CKRecordZoneID zoneID, @Block VoidBlock2<CKRecordZoneID, NSError> completionHandler);
    @Mapping("fetchSubscriptionWithID:completionHandler:")
    public native void fetchSubscription(String subscriptionID, @Block VoidBlock2<CKSubscription, NSError> completionHandler);
    @Mapping("fetchAllSubscriptionsWithCompletionHandler:")
    public native void fetchAllSubscriptions(@Block VoidBlock2<NSArray<CKSubscription>, NSError> completionHandler);
    @Mapping("saveSubscription:completionHandler:")
    public native void saveSubscription(CKSubscription subscription, @Block VoidBlock2<CKSubscription, NSError> completionHandler);
    @Mapping("deleteSubscriptionWithID:completionHandler:")
    public native void deleteSubscription(String subscriptionID, @Block VoidBlock2<String, NSError> completionHandler);
    
}
