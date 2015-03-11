package apple.healthkit;


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



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("HKAuthorizationStatus")
public final class HKAuthorizationStatus extends ObjCEnum {
    
    @GlobalConstant("HKAuthorizationStatusNotDetermined")
    public static final long NotDetermined = 0L;
    @GlobalConstant("HKAuthorizationStatusSharingDenied")
    public static final long SharingDenied = 1L;
    @GlobalConstant("HKAuthorizationStatusSharingAuthorized")
    public static final long SharingAuthorized = 2L;
    

}
