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
@Mapping("CKRecordSavePolicy")
public final class CKRecordSavePolicy extends ObjCEnum {
    
    @GlobalConstant("CKRecordSaveIfServerRecordUnchanged")
    public static final long IfServerRecordUnchanged = 0L;
    @GlobalConstant("CKRecordSaveChangedKeys")
    public static final long ChangedKeys = 1L;
    @GlobalConstant("CKRecordSaveAllKeys")
    public static final long AllKeys = 2L;
    

}
