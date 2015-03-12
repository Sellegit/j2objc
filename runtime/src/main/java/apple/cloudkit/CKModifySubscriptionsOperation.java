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

@Library("CloudKit") @Mapping("CKModifySubscriptionsOperation")
public class CKModifySubscriptionsOperation 
    extends CKDatabaseOperation 
     {

    
    
    public CKModifySubscriptionsOperation() {}
    @Mapping("initWithSubscriptionsToSave:subscriptionIDsToDelete:")
    public CKModifySubscriptionsOperation(NSArray<?> subscriptionsToSave, NSArray<?> subscriptionIDsToDelete) { }
    
    
    @Mapping("subscriptionsToSave")
    public native NSArray<CKSubscription> getSubscriptionsToSave();
    @Mapping("setSubscriptionsToSave:")
    public native void setSubscriptionsToSave(NSArray<CKSubscription> v);
    @Mapping("subscriptionIDsToDelete")
    public native List<String> getSubscriptionIDsToDelete();
    @Mapping("setSubscriptionIDsToDelete:")
    public native void setSubscriptionIDsToDelete(List<String> v);
    @Mapping("modifySubscriptionsCompletionBlock")
    public native @Block VoidBlock3<NSArray<CKSubscription>, NSArray<NSString>, NSError> getModifySubscriptionsCompletionBlock();
    @Mapping("setModifySubscriptionsCompletionBlock:")
    public native void setModifySubscriptionsCompletionBlock(@Block VoidBlock3<NSArray<CKSubscription>, NSArray<NSString>, NSError> v);
    
    
    
    
    
}
