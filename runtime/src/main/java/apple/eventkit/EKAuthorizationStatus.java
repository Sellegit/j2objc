package apple.eventkit;


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
import apple.addressbook.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("EventKit")
@Mapping("EKAuthorizationStatus")
public final class EKAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("EKAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("EKAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("EKAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("EKAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    

}
