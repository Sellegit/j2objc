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

@Library("CloudKit/CloudKit.h") @Mapping("CKRecordZone")
public class CKRecordZone 
    extends NSObject 
    implements NSCopying {

    
    
    public CKRecordZone() {}
    @Mapping("initWithZoneName:")
    public CKRecordZone(String zoneName) { }
    @Mapping("initWithZoneID:")
    public CKRecordZone(CKRecordZoneID zoneID) { }
    
    
    @Mapping("zoneID")
    public native CKRecordZoneID getZoneID();
    @Mapping("capabilities")
    public native @Representing("CKRecordZoneCapabilities") @MachineSizedUInt long getCapabilities();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("CKRecordZoneDefaultName")
    public static native String getDefaultName();
    
    @Mapping("defaultRecordZone")
    public static native CKRecordZone getDefaultRecordZone();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
