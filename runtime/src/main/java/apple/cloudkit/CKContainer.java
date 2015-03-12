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

@Library("CloudKit") @Mapping("CKContainer")
public class CKContainer 
    extends NSObject 
     {

    
    
    public CKContainer() {}
    
    
    @Mapping("containerIdentifier")
    public native String getContainerIdentifier();
    @Mapping("privateCloudDatabase")
    public native CKDatabase getPrivateCloudDatabase();
    @Mapping("publicCloudDatabase")
    public native CKDatabase getPublicCloudDatabase();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CKOwnerDefaultName")
    public static native String getDefaultOwnerName();
    
    @Mapping("addOperation:")
    public native void addOperation(CKOperation operation);
    @Mapping("defaultContainer")
    public static native CKContainer getDefaultContainer();
    @Mapping("containerWithIdentifier:")
    public static native CKContainer create(String containerIdentifier);
    @Mapping("accountStatusWithCompletionHandler:")
    public native void getAccountStatus(@Block VoidBlock2<CKAccountStatus, NSError> completionHandler);
    @Mapping("fetchUserRecordIDWithCompletionHandler:")
    public native void fetchUserRecordID(@Block VoidBlock2<CKRecordID, NSError> completionHandler);
    @Mapping("discoverAllContactUserInfosWithCompletionHandler:")
    public native void discoverAllContactUserInfos(Todo completionHandler);
    @Mapping("discoverUserInfoWithEmailAddress:completionHandler:")
    public native void discoverUserInfo(String email, @Block VoidBlock2<CKDiscoveredUserInfo, NSError> completionHandler);
    @Mapping("discoverUserInfoWithUserRecordID:completionHandler:")
    public native void discoverUserInfo(CKRecordID userRecordID, @Block VoidBlock2<CKDiscoveredUserInfo, NSError> completionHandler);
    
}
