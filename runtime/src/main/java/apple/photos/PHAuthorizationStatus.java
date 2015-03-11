package apple.photos;


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
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("PHAuthorizationStatus")
public final class PHAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("PHAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("PHAuthorizationStatusRestricted")
    public static final long Restricted = 1L;
    @GlobalConstant("PHAuthorizationStatusDenied")
    public static final long Denied = 2L;
    @GlobalConstant("PHAuthorizationStatusAuthorized")
    public static final long Authorized = 3L;
    

}
