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

@Library("CloudKit") @Mapping("CKDiscoverUserInfosOperation")
public class CKDiscoverUserInfosOperation 
    extends CKOperation 
     {

    
    
    public CKDiscoverUserInfosOperation() {}
    @Mapping("initWithEmailAddresses:userRecordIDs:")
    public CKDiscoverUserInfosOperation(List<String> emailAddresses, NSArray<CKRecordID> userRecordIDs) { }
    
    
    @Mapping("emailAddresses")
    public native List<String> getEmailAddresses();
    public native void setEmailAddresses(List<String> v);
    @Mapping("userRecordIDs")
    public native NSArray<CKRecordID> getUserRecordIDs();
    public native void setUserRecordIDs(NSArray<CKRecordID> v);
    @Mapping("discoverUserInfosCompletionBlock")
    public native @Block VoidBlock3<NSDictionary<NSString, CKDiscoveredUserInfo>, NSDictionary<CKRecordID, CKDiscoveredUserInfo>, NSError> getDiscoverUserInfosCompletionBlock();
    public native void setDiscoverUserInfosCompletionBlock(@Block VoidBlock3<NSDictionary<NSString, CKDiscoveredUserInfo>, NSDictionary<CKRecordID, CKDiscoveredUserInfo>, NSError> v);
    
    
    
    
    
}
