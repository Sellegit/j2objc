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


@Mapping("CKSubscriptionOptions")
public final class CKSubscriptionOptions extends ObjCEnum {
    
    @GlobalConstant("CKSubscriptionOptionsFiresOnRecordCreation")
    public static final long RecordCreation = 1L;
    @GlobalConstant("CKSubscriptionOptionsFiresOnRecordUpdate")
    public static final long RecordUpdate = 2L;
    @GlobalConstant("CKSubscriptionOptionsFiresOnRecordDeletion")
    public static final long RecordDeletion = 4L;
    @GlobalConstant("CKSubscriptionOptionsFiresOnce")
    public static final long ce = 8L;
    

}
