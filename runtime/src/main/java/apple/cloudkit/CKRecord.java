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

@Library("CloudKit") @Mapping("CKRecord")
public class CKRecord 
    extends NSObject 
    implements NSCopying {

    
    
    public CKRecord() {}
    @Mapping("initWithRecordType:")
    public CKRecord(String recordType) { }
    @Mapping("initWithRecordType:recordID:")
    public CKRecord(String recordType, CKRecordID recordID) { }
    @Mapping("initWithRecordType:zoneID:")
    public CKRecord(String recordType, CKRecordZoneID zoneID) { }
    
    
    @Mapping("recordType")
    public native String getRecordType();
    @Mapping("recordID")
    public native CKRecordID getRecordID();
    @Mapping("recordChangeTag")
    public native String getRecordChangeTag();
    @Mapping("creatorUserRecordID")
    public native CKRecordID getCreatorUserRecordID();
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    @Mapping("lastModifiedUserRecordID")
    public native CKRecordID getLastModifiedUserRecordID();
    @Mapping("modificationDate")
    public native NSDate getModificationDate();
    
    
    
    @Mapping("objectForKey:")
    public native Object get(String key);
    @Mapping("setObject:forKey:")
    protected native void put(NSObject object, String key);
    @Mapping("allKeys")
    public native List<String> getAllKeys();
    @Mapping("allTokens")
    public native List<String> getAllTokens();
    @Mapping("changedKeys")
    public native List<String> getChangedKeys();
    @Mapping("encodeSystemFieldsWithCoder:")
    public native void encodeSystemFields(NSCoder coder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
