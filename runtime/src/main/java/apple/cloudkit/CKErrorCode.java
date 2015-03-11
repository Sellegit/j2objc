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
@Mapping("CKErrorCode")
public final class CKErrorCode extends ObjCEnum {
    
    @GlobalConstant("CKErrorInternalError")
    public static final long InternalError = 1L;
    @GlobalConstant("CKErrorPartialFailure")
    public static final long PartialFailure = 2L;
    @GlobalConstant("CKErrorNetworkUnavailable")
    public static final long NetworkUnavailable = 3L;
    @GlobalConstant("CKErrorNetworkFailure")
    public static final long NetworkFailure = 4L;
    @GlobalConstant("CKErrorBadContainer")
    public static final long BadContainer = 5L;
    @GlobalConstant("CKErrorServiceUnavailable")
    public static final long ServiceUnavailable = 6L;
    @GlobalConstant("CKErrorRequestRateLimited")
    public static final long RequestRateLimited = 7L;
    @GlobalConstant("CKErrorMissingEntitlement")
    public static final long MissingEntitlement = 8L;
    @GlobalConstant("CKErrorNotAuthenticated")
    public static final long NotAuthenticated = 9L;
    @GlobalConstant("CKErrorPermissionFailure")
    public static final long PermissionFailure = 10L;
    @GlobalConstant("CKErrorUnknownItem")
    public static final long UnknownItem = 11L;
    @GlobalConstant("CKErrorInvalidArguments")
    public static final long InvalidArguments = 12L;
    @GlobalConstant("CKErrorResultsTruncated")
    public static final long ResultsTruncated = 13L;
    @GlobalConstant("CKErrorServerRecordChanged")
    public static final long ServerRecordChanged = 14L;
    @GlobalConstant("CKErrorServerRejectedRequest")
    public static final long ServerRejectedRequest = 15L;
    @GlobalConstant("CKErrorAssetFileNotFound")
    public static final long AssetFileNotFound = 16L;
    @GlobalConstant("CKErrorAssetFileModified")
    public static final long AssetFileModified = 17L;
    @GlobalConstant("CKErrorIncompatibleVersion")
    public static final long IncompatibleVersion = 18L;
    @GlobalConstant("CKErrorConstraintViolation")
    public static final long ConstraintViolation = 19L;
    @GlobalConstant("CKErrorOperationCancelled")
    public static final long OperationCancelled = 20L;
    @GlobalConstant("CKErrorChangeTokenExpired")
    public static final long ChangeTokenExpired = 21L;
    @GlobalConstant("CKErrorBatchRequestFailed")
    public static final long BatchRequestFailed = 22L;
    @GlobalConstant("CKErrorZoneBusy")
    public static final long ZoneBusy = 23L;
    @GlobalConstant("CKErrorBadDatabase")
    public static final long BadDatabase = 24L;
    @GlobalConstant("CKErrorQuotaExceeded")
    public static final long QuotaExceeded = 25L;
    @GlobalConstant("CKErrorZoneNotFound")
    public static final long ZoneNotFound = 26L;
    @GlobalConstant("CKErrorLimitExceeded")
    public static final long LimitExceeded = 27L;
    @GlobalConstant("CKErrorUserDeletedZone")
    public static final long UserDeletedZone = 28L;
    

}
