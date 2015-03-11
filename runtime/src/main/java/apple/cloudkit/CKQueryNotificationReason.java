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
@Mapping("CKQueryNotificationReason")
public final class CKQueryNotificationReason extends ObjCEnum {
    
    @GlobalConstant("CKQueryNotificationReasonRecordCreated")
    public static final long Created = 1L;
    @GlobalConstant("CKQueryNotificationReasonRecordUpdated")
    public static final long Updated = 2L;
    @GlobalConstant("CKQueryNotificationReasonRecordDeleted")
    public static final long Deleted = 3L;
    

}
