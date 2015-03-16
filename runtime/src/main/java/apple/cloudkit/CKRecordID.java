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

@Library("CloudKit/CloudKit.h") @Mapping("CKRecordID")
public class CKRecordID 
    extends NSObject 
    implements NSCopying {

    
    
    public CKRecordID() {}
    @Mapping("initWithRecordName:")
    public CKRecordID(String recordName) { }
    @Mapping("initWithRecordName:zoneID:")
    public CKRecordID(String recordName, CKRecordZoneID zoneID) { }
    
    
    @Mapping("recordName")
    public native String getRecordName();
    @Mapping("zoneID")
    public native CKRecordZoneID getZoneID();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
