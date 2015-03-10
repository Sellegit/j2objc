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

@Library("CloudKit") @Mapping("CKQueryNotification")
public class CKQueryNotification 
    extends CKNotification 
     {

    
    
    public CKQueryNotification() {}
    
    
    @Mapping("queryNotificationReason")
    public native @Representing("CKQueryNotificationReason") @MachineSizedSInt long getQueryNotificationReason();
    @Mapping("recordFields")
    public native Map<String, NSObject> getRecordFields();
    @Mapping("recordID")
    public native CKRecordID getRecordID();
    @Mapping("isPublicDatabase")
    public native boolean isPublicDatabase();
    
    
    
    
    
}
