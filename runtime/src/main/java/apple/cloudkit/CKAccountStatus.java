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

@Library("CloudKit/CloudKit.h")
@Mapping("CKAccountStatus")
public final class CKAccountStatus extends ObjCEnum {
    
    @GlobalConstant("CKAccountStatusCouldNotDetermine")
    public static final long CouldNotDetermine = 0L;
    @GlobalConstant("CKAccountStatusAvailable")
    public static final long Available = 1L;
    @GlobalConstant("CKAccountStatusRestricted")
    public static final long Restricted = 2L;
    @GlobalConstant("CKAccountStatusNoAccount")
    public static final long NoAccount = 3L;
    

}
