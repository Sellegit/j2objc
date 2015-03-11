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

@Library("CloudKit")
@Mapping("CKRecordZoneCapabilities")
public final class CKRecordZoneCapabilities extends ObjCEnum {
    
    @GlobalConstant("CKRecordZoneCapabilityFetchChanges")
    public static final long FetchChanges = 1L;
    @GlobalConstant("CKRecordZoneCapabilityAtomic")
    public static final long Atomic = 2L;
    

}
