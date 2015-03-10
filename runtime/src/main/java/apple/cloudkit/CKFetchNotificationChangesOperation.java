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

@Library("CloudKit") @Mapping("CKFetchNotificationChangesOperation")
public class CKFetchNotificationChangesOperation 
    extends CKOperation 
     {

    
    
    public CKFetchNotificationChangesOperation() {}
    @Mapping("initWithPreviousServerChangeToken:")
    public CKFetchNotificationChangesOperation(CKServerChangeToken previousServerChangeToken) { }
    
    
    @Mapping("previousServerChangeToken")
    public native CKServerChangeToken getPreviousServerChangeToken();
    public native void setPreviousServerChangeToken(CKServerChangeToken v);
    @Mapping("resultsLimit")
    public native @MachineSizedUInt long getResultsLimit();
    public native void setResultsLimit(@MachineSizedUInt long v);
    @Mapping("moreComing")
    public native boolean isMoreComing();
    @Mapping("notificationChangedBlock")
    public native @Block VoidBlock1<CKNotification> getNotificationChangedBlock();
    public native void setNotificationChangedBlock(@Block VoidBlock1<CKNotification> v);
    @Mapping("fetchNotificationChangesCompletionBlock")
    public native @Block VoidBlock2<CKServerChangeToken, NSError> getFetchNotificationChangesCompletionBlock();
    public native void setFetchNotificationChangesCompletionBlock(@Block VoidBlock2<CKServerChangeToken, NSError> v);
    
    
    
    
    
}
