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

@Library("CloudKit/CloudKit.h") @Mapping("CKSubscription")
public class CKSubscription 
    extends NSObject 
    implements NSCopying {

    
    
    public CKSubscription() {}
    @Mapping("initWithCoder:")
    public CKSubscription(NSCoder aDecoder) { }
    @Mapping("initWithRecordType:predicate:options:")
    public CKSubscription(String recordType, NSPredicate predicate, @Representing("CKSubscriptionOptions") @MachineSizedUInt long subscriptionOptions) { }
    @Mapping("initWithRecordType:predicate:subscriptionID:options:")
    public CKSubscription(String recordType, NSPredicate predicate, String subscriptionID, @Representing("CKSubscriptionOptions") @MachineSizedUInt long subscriptionOptions) { }
    @Mapping("initWithZoneID:options:")
    public CKSubscription(CKRecordZoneID zoneID, @Representing("CKSubscriptionOptions") @MachineSizedUInt long subscriptionOptions) { }
    @Mapping("initWithZoneID:subscriptionID:options:")
    public CKSubscription(CKRecordZoneID zoneID, String subscriptionID, @Representing("CKSubscriptionOptions") @MachineSizedUInt long subscriptionOptions) { }
    
    
    @Mapping("subscriptionID")
    public native String getSubscriptionID();
    @Mapping("subscriptionType")
    public native @Representing("CKSubscriptionType") @MachineSizedSInt long getSubscriptionType();
    @Mapping("recordType")
    public native String getRecordType();
    @Mapping("predicate")
    public native NSPredicate getPredicate();
    @Mapping("subscriptionOptions")
    public native @Representing("CKSubscriptionOptions") @MachineSizedUInt long getSubscriptionOptions();
    @Mapping("notificationInfo")
    public native CKNotificationInfo getNotificationInfo();
    @Mapping("setNotificationInfo:")
    public native void setNotificationInfo(CKNotificationInfo v);
    @Mapping("zoneID")
    public native CKRecordZoneID getZoneID();
    @Mapping("setZoneID:")
    public native void setZoneID(CKRecordZoneID v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
