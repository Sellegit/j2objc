package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation")
@Mapping("NSURLErrorCode")
public final class NSURLErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSURLErrorUnknown")
    public static final long Unknown = -1L;
    @GlobalConstant("NSURLErrorCancelled")
    public static final long Cancelled = -999L;
    @GlobalConstant("NSURLErrorBadURL")
    public static final long BadURL = -1000L;
    @GlobalConstant("NSURLErrorTimedOut")
    public static final long TimedOut = -1001L;
    @GlobalConstant("NSURLErrorUnsupportedURL")
    public static final long UnsupportedURL = -1002L;
    @GlobalConstant("NSURLErrorCannotFindHost")
    public static final long CannotFindHost = -1003L;
    @GlobalConstant("NSURLErrorCannotConnectToHost")
    public static final long CannotConnectToHost = -1004L;
    @GlobalConstant("NSURLErrorNetworkConnectionLost")
    public static final long NetworkConnectionLost = -1005L;
    @GlobalConstant("NSURLErrorDNSLookupFailed")
    public static final long DNSLookupFailed = -1006L;
    @GlobalConstant("NSURLErrorHTTPTooManyRedirects")
    public static final long HTTPTooManyRedirects = -1007L;
    @GlobalConstant("NSURLErrorResourceUnavailable")
    public static final long ResourceUnavailable = -1008L;
    @GlobalConstant("NSURLErrorNotConnectedToInternet")
    public static final long NotConnectedToInternet = -1009L;
    @GlobalConstant("NSURLErrorRedirectToNonExistentLocation")
    public static final long RedirectToNonExistentLocation = -1010L;
    @GlobalConstant("NSURLErrorBadServerResponse")
    public static final long BadServerResponse = -1011L;
    @GlobalConstant("NSURLErrorUserCancelledAuthentication")
    public static final long UserCancelledAuthentication = -1012L;
    @GlobalConstant("NSURLErrorUserAuthenticationRequired")
    public static final long UserAuthenticationRequired = -1013L;
    @GlobalConstant("NSURLErrorZeroByteResource")
    public static final long ZeroByteResource = -1014L;
    @GlobalConstant("NSURLErrorCannotDecodeRawData")
    public static final long CannotDecodeRawData = -1015L;
    @GlobalConstant("NSURLErrorCannotDecodeContentData")
    public static final long CannotDecodeContentData = -1016L;
    @GlobalConstant("NSURLErrorCannotParseResponse")
    public static final long CannotParseResponse = -1017L;
    @GlobalConstant("NSURLErrorFileDoesNotExist")
    public static final long FileDoesNotExist = -1100L;
    @GlobalConstant("NSURLErrorFileIsDirectory")
    public static final long FileIsDirectory = -1101L;
    @GlobalConstant("NSURLErrorNoPermissionsToReadFile")
    public static final long NoPermissionsToReadFile = -1102L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSURLErrorDataLengthExceedsMaximum")
    public static final long DataLengthExceedsMaximum = -1103L;
    @GlobalConstant("NSURLErrorSecureConnectionFailed")
    public static final long SecureConnectionFailed = -1200L;
    @GlobalConstant("NSURLErrorServerCertificateHasBadDate")
    public static final long ServerCertificateHasBadDate = -1201L;
    @GlobalConstant("NSURLErrorServerCertificateUntrusted")
    public static final long ServerCertificateUntrusted = -1202L;
    @GlobalConstant("NSURLErrorServerCertificateHasUnknownRoot")
    public static final long ServerCertificateHasUnknownRoot = -1203L;
    @GlobalConstant("NSURLErrorServerCertificateNotYetValid")
    public static final long ServerCertificateNotYetValid = -1204L;
    @GlobalConstant("NSURLErrorClientCertificateRejected")
    public static final long ClientCertificateRejected = -1205L;
    @GlobalConstant("NSURLErrorClientCertificateRequired")
    public static final long ClientCertificateRequired = -1206L;
    @GlobalConstant("NSURLErrorCannotLoadFromNetwork")
    public static final long CannotLoadFromNetwork = -2000L;
    @GlobalConstant("NSURLErrorCannotCreateFile")
    public static final long CannotCreateFile = -3000L;
    @GlobalConstant("NSURLErrorCannotOpenFile")
    public static final long CannotOpenFile = -3001L;
    @GlobalConstant("NSURLErrorCannotCloseFile")
    public static final long CannotCloseFile = -3002L;
    @GlobalConstant("NSURLErrorCannotWriteToFile")
    public static final long CannotWriteToFile = -3003L;
    @GlobalConstant("NSURLErrorCannotRemoveFile")
    public static final long CannotRemoveFile = -3004L;
    @GlobalConstant("NSURLErrorCannotMoveFile")
    public static final long CannotMoveFile = -3005L;
    @GlobalConstant("NSURLErrorDownloadDecodingFailedMidStream")
    public static final long DownloadDecodingFailedMidStream = -3006L;
    @GlobalConstant("NSURLErrorDownloadDecodingFailedToComplete")
    public static final long DownloadDecodingFailedToComplete = -3007L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLErrorInternationalRoamingOff")
    public static final long InternationalRoamingOff = -1018L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLErrorCallIsActive")
    public static final long CallIsActive = -1019L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLErrorDataNotAllowed")
    public static final long DataNotAllowed = -1020L;
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("NSURLErrorRequestBodyStreamExhausted")
    public static final long RequestBodyStreamExhausted = -1021L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLErrorBackgroundSessionRequiresSharedContainer")
    public static final long BackgroundSessionRequiresSharedContainer = -995L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLErrorBackgroundSessionInUseByAnotherProcess")
    public static final long BackgroundSessionInUseByAnotherProcess = -996L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSURLErrorBackgroundSessionWasDisconnected")
    public static final long BackgroundSessionWasDisconnected = -997L;
    

}
