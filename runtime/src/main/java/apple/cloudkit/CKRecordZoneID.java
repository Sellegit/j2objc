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

@Library("CloudKit/CloudKit.h") @Mapping("CKRecordZoneID")
public class CKRecordZoneID 
    extends NSObject 
    implements NSCopying {

    
    
    public CKRecordZoneID() {}
    @Mapping("initWithZoneName:ownerName:")
    public CKRecordZoneID(String zoneName, String ownerName) { }
    
    
    @Mapping("zoneName")
    public native String getZoneName();
    @Mapping("ownerName")
    public native String getOwnerName();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
