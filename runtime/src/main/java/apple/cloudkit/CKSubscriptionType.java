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
@Mapping("CKSubscriptionType")
public final class CKSubscriptionType extends ObjCEnum {
    
    @GlobalConstant("CKSubscriptionTypeQuery")
    public static final long Query = 1L;
    @GlobalConstant("CKSubscriptionTypeRecordZone")
    public static final long RecordZone = 2L;
    

}
