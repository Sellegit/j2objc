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
@Library("HealthKit/HealthKit.h")
@Mapping("HKErrorCode")
public final class HKErrorCode extends ObjCEnum {
    
    @GlobalConstant("HKNoError")
    public static final long NoError = 0L;
    @GlobalConstant("HKErrorHealthDataUnavailable")
    public static final long ErrorHealthDataUnavailable = 1L;
    @GlobalConstant("HKErrorHealthDataRestricted")
    public static final long ErrorHealthDataRestricted = 2L;
    @GlobalConstant("HKErrorInvalidArgument")
    public static final long ErrorInvalidArgument = 3L;
    @GlobalConstant("HKErrorAuthorizationDenied")
    public static final long ErrorAuthorizationDenied = 4L;
    @GlobalConstant("HKErrorAuthorizationNotDetermined")
    public static final long ErrorAuthorizationNotDetermined = 5L;
    @GlobalConstant("HKErrorDatabaseInaccessible")
    public static final long ErrorDatabaseInaccessible = 6L;
    @GlobalConstant("HKErrorUserCanceled")
    public static final long ErrorUserCanceled = 7L;


}
