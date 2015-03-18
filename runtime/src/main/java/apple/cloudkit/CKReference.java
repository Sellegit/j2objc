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

@Library("CloudKit/CloudKit.h") @Mapping("CKReference")
public class CKReference 
    extends NSObject 
    implements NSCopying, CKRecordValue {

    
    
    @Mapping("initWithRecordID:action:")
    public CKReference(CKRecordID recordID, @Representing("CKReferenceAction") @MachineSizedUInt long action) { }
    @Mapping("initWithRecord:action:")
    public CKReference(CKRecord record, @Representing("CKReferenceAction") @MachineSizedUInt long action) { }
    @Mapping("init")
    public CKReference() { }
    
    
    @Mapping("referenceAction")
    public native @Representing("CKReferenceAction") @MachineSizedUInt long getReferenceAction();
    @Mapping("recordID")
    public native CKRecordID getRecordID();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
