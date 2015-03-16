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

@Library("CloudKit/CloudKit.h") @Mapping("CKMarkNotificationsReadOperation")
public class CKMarkNotificationsReadOperation 
    extends CKOperation 
     {

    
    
    public CKMarkNotificationsReadOperation() {}
    @Mapping("initWithNotificationIDsToMarkRead:")
    public CKMarkNotificationsReadOperation(NSArray<?> notificationIDs) { }
    
    
    @Mapping("notificationIDs")
    public native NSArray<CKNotificationID> getNotificationIDs();
    @Mapping("setNotificationIDs:")
    public native void setNotificationIDs(NSArray<CKNotificationID> v);
    @Mapping("markNotificationsReadCompletionBlock")
    public native @Block VoidBlock2<NSArray<CKNotificationID>, NSError> getMarkNotificationsReadCompletionBlock();
    @Mapping("setMarkNotificationsReadCompletionBlock:")
    public native void setMarkNotificationsReadCompletionBlock(@Block VoidBlock2<NSArray<CKNotificationID>, NSError> v);
    
    
    
    
    
}
