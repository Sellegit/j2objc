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

@Library("CloudKit") @Mapping("CKFetchSubscriptionsOperation")
public class CKFetchSubscriptionsOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKFetchSubscriptionsOperation() {}
    @Mapping("initWithSubscriptionIDs:")
    public CKFetchSubscriptionsOperation(NSArray<?> subscriptionIDs) { }
    
    
    @Mapping("subscriptionIDs")
    public native List<String> getSubscriptionIDs();
    @Mapping("setSubscriptionIDs:")
    public native void setSubscriptionIDs(List<String> v);
    @Mapping("fetchSubscriptionCompletionBlock")
    public native @Block VoidBlock2<NSDictionary<NSString, CKSubscription>, NSError> getFetchSubscriptionCompletionBlock();
    @Mapping("setFetchSubscriptionCompletionBlock:")
    public native void setFetchSubscriptionCompletionBlock(@Block VoidBlock2<NSDictionary<NSString, CKSubscription>, NSError> v);
    
    
    
    @Mapping("fetchAllSubscriptionsOperation")
    public static native CKFetchSubscriptionsOperation createFetchAllSubscriptionsOperation();
    
}
