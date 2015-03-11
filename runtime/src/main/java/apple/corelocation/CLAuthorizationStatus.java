package apple.corelocation;


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
import apple.corebluetooth.*;





@Library("CoreLocation")
@Mapping("CLAuthorizationStatus")
public final class CLAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("kCLAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("kCLAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("kCLAuthorizationStatusDenied")
    public static final long Denied = 2L;
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalConstant("kCLAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCLAuthorizationStatusAuthorizedAlways")
    public static final long AuthorizedAlways = 3L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("kCLAuthorizationStatusAuthorizedWhenInUse")
    public static final long AuthorizedWhenInUse = 4L;
    

}
