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

@Library("CloudKit") @Mapping("CKDiscoveredUserInfo")
public class CKDiscoveredUserInfo 
    extends NSObject 
     {

    
    
    public CKDiscoveredUserInfo() {}
    
    
    @Mapping("userRecordID")
    public native CKRecordID getUserRecordID();
    @Mapping("firstName")
    public native String getFirstName();
    @Mapping("lastName")
    public native String getLastName();
    
    
    
    
    
}
