package apple.coreservices;


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





@Library("CFNetwork")
@Mapping("CFNetworkErrors")
public final class CFNetworkErrors extends ObjCEnum {
    
    @GlobalConstant("kCFHostErrorHostNotFound")
    public static final long HostErrorHostNotFound = 1L;
    @GlobalConstant("kCFHostErrorUnknown")
    public static final long HostErrorUnknown = 2L;
    @GlobalConstant("kCFSOCKSErrorUnknownClientVersion")
    public static final long SOCKSErrorUnknownClientVersion = 100L;
    @GlobalConstant("kCFSOCKSErrorUnsupportedServerVersion")
    public static final long SOCKSErrorUnsupportedServerVersion = 101L;
    @GlobalConstant("kCFSOCKS4ErrorRequestFailed")
    public static final long SOCKS4ErrorRequestFailed = 110L;
    @GlobalConstant("kCFSOCKS4ErrorIdentdFailed")
    public static final long SOCKS4ErrorIdentdFailed = 111L;
    @GlobalConstant("kCFSOCKS4ErrorIdConflict")
    public static final long SOCKS4ErrorIdConflict = 112L;
    @GlobalConstant("kCFSOCKS4ErrorUnknownStatusCode")
    public static final long SOCKS4ErrorUnknownStatusCode = 113L;
    @GlobalConstant("kCFSOCKS5ErrorBadState")
    public static final long SOCKS5ErrorBadState = 120L;
    @GlobalConstant("kCFSOCKS5ErrorBadResponseAddr")
    public static final long SOCKS5ErrorBadResponseAddr = 121L;
    @GlobalConstant("kCFSOCKS5ErrorBadCredentials")
    public static final long SOCKS5ErrorBadCredentials = 122L;
    @GlobalConstant("kCFSOCKS5ErrorUnsupportedNegotiationMethod")
    public static final long SOCKS5ErrorUnsupportedNegotiationMethod = 123L;
    @GlobalConstant("kCFSOCKS5ErrorNoAcceptableMethod")
    public static final long SOCKS5ErrorNoAcceptableMethod = 124L;
    @GlobalConstant("kCFFTPErrorUnexpectedStatusCode")
    public static final long FTPErrorUnexpectedStatusCode = 200L;
    @GlobalConstant("kCFErrorHTTPAuthenticationTypeUnsupported")
    public static final long ErrorHTTPAuthenticationTypeUnsupported = 300L;
    @GlobalConstant("kCFErrorHTTPBadCredentials")
    public static final long ErrorHTTPBadCredentials = 301L;
    @GlobalConstant("kCFErrorHTTPConnectionLost")
    public static final long ErrorHTTPConnectionLost = 302L;
    @GlobalConstant("kCFErrorHTTPParseFailure")
    public static final long ErrorHTTPParseFailure = 303L;
    @GlobalConstant("kCFErrorHTTPRedirectionLoopDetected")
    public static final long ErrorHTTPRedirectionLoopDetected = 304L;
    @GlobalConstant("kCFErrorHTTPBadURL")
    public static final long ErrorHTTPBadURL = 305L;
    @GlobalConstant("kCFErrorHTTPProxyConnectionFailure")
    public static final long ErrorHTTPProxyConnectionFailure = 306L;
    @GlobalConstant("kCFErrorHTTPBadProxyCredentials")
    public static final long ErrorHTTPBadProxyCredentials = 307L;
    @GlobalConstant("kCFErrorPACFileError")
    public static final long ErrorPACFileError = 308L;
    @GlobalConstant("kCFErrorPACFileAuth")
    public static final long ErrorPACFileAuth = 309L;
    @GlobalConstant("kCFErrorHTTPSProxyConnectionFailure")
    public static final long ErrorHTTPSProxyConnectionFailure = 310L;
    @GlobalConstant("kCFStreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod")
    public static final long StreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod = 311L;
    @GlobalConstant("kCFURLErrorBackgroundSessionInUseByAnotherProcess")
    public static final long URLErrorBackgroundSessionInUseByAnotherProcess = -996L;
    @GlobalConstant("kCFURLErrorBackgroundSessionWasDisconnected")
    public static final long URLErrorBackgroundSessionWasDisconnected = -997L;
    @GlobalConstant("kCFURLErrorUnknown")
    public static final long URLErrorUnknown = -998L;
    @GlobalConstant("kCFURLErrorCancelled")
    public static final long URLErrorCancelled = -999L;
    @GlobalConstant("kCFURLErrorBadURL")
    public static final long URLErrorBadURL = -1000L;
    @GlobalConstant("kCFURLErrorTimedOut")
    public static final long URLErrorTimedOut = -1001L;
    @GlobalConstant("kCFURLErrorUnsupportedURL")
    public static final long URLErrorUnsupportedURL = -1002L;
    @GlobalConstant("kCFURLErrorCannotFindHost")
    public static final long URLErrorCannotFindHost = -1003L;
    @GlobalConstant("kCFURLErrorCannotConnectToHost")
    public static final long URLErrorCannotConnectToHost = -1004L;
    @GlobalConstant("kCFURLErrorNetworkConnectionLost")
    public static final long URLErrorNetworkConnectionLost = -1005L;
    @GlobalConstant("kCFURLErrorDNSLookupFailed")
    public static final long URLErrorDNSLookupFailed = -1006L;
    @GlobalConstant("kCFURLErrorHTTPTooManyRedirects")
    public static final long URLErrorHTTPTooManyRedirects = -1007L;
    @GlobalConstant("kCFURLErrorResourceUnavailable")
    public static final long URLErrorResourceUnavailable = -1008L;
    @GlobalConstant("kCFURLErrorNotConnectedToInternet")
    public static final long URLErrorNotConnectedToInternet = -1009L;
    @GlobalConstant("kCFURLErrorRedirectToNonExistentLocation")
    public static final long URLErrorRedirectToNonExistentLocation = -1010L;
    @GlobalConstant("kCFURLErrorBadServerResponse")
    public static final long URLErrorBadServerResponse = -1011L;
    @GlobalConstant("kCFURLErrorUserCancelledAuthentication")
    public static final long URLErrorUserCancelledAuthentication = -1012L;
    @GlobalConstant("kCFURLErrorUserAuthenticationRequired")
    public static final long URLErrorUserAuthenticationRequired = -1013L;
    @GlobalConstant("kCFURLErrorZeroByteResource")
    public static final long URLErrorZeroByteResource = -1014L;
    @GlobalConstant("kCFURLErrorCannotDecodeRawData")
    public static final long URLErrorCannotDecodeRawData = -1015L;
    @GlobalConstant("kCFURLErrorCannotDecodeContentData")
    public static final long URLErrorCannotDecodeContentData = -1016L;
    @GlobalConstant("kCFURLErrorCannotParseResponse")
    public static final long URLErrorCannotParseResponse = -1017L;
    @GlobalConstant("kCFURLErrorInternationalRoamingOff")
    public static final long URLErrorInternationalRoamingOff = -1018L;
    @GlobalConstant("kCFURLErrorCallIsActive")
    public static final long URLErrorCallIsActive = -1019L;
    @GlobalConstant("kCFURLErrorDataNotAllowed")
    public static final long URLErrorDataNotAllowed = -1020L;
    @GlobalConstant("kCFURLErrorRequestBodyStreamExhausted")
    public static final long URLErrorRequestBodyStreamExhausted = -1021L;
    @GlobalConstant("kCFURLErrorFileDoesNotExist")
    public static final long URLErrorFileDoesNotExist = -1100L;
    @GlobalConstant("kCFURLErrorFileIsDirectory")
    public static final long URLErrorFileIsDirectory = -1101L;
    @GlobalConstant("kCFURLErrorNoPermissionsToReadFile")
    public static final long URLErrorNoPermissionsToReadFile = -1102L;
    @GlobalConstant("kCFURLErrorDataLengthExceedsMaximum")
    public static final long URLErrorDataLengthExceedsMaximum = -1103L;
    @GlobalConstant("kCFURLErrorSecureConnectionFailed")
    public static final long URLErrorSecureConnectionFailed = -1200L;
    @GlobalConstant("kCFURLErrorServerCertificateHasBadDate")
    public static final long URLErrorServerCertificateHasBadDate = -1201L;
    @GlobalConstant("kCFURLErrorServerCertificateUntrusted")
    public static final long URLErrorServerCertificateUntrusted = -1202L;
    @GlobalConstant("kCFURLErrorServerCertificateHasUnknownRoot")
    public static final long URLErrorServerCertificateHasUnknownRoot = -1203L;
    @GlobalConstant("kCFURLErrorServerCertificateNotYetValid")
    public static final long URLErrorServerCertificateNotYetValid = -1204L;
    @GlobalConstant("kCFURLErrorClientCertificateRejected")
    public static final long URLErrorClientCertificateRejected = -1205L;
    @GlobalConstant("kCFURLErrorClientCertificateRequired")
    public static final long URLErrorClientCertificateRequired = -1206L;
    @GlobalConstant("kCFURLErrorCannotLoadFromNetwork")
    public static final long URLErrorCannotLoadFromNetwork = -2000L;
    @GlobalConstant("kCFURLErrorCannotCreateFile")
    public static final long URLErrorCannotCreateFile = -3000L;
    @GlobalConstant("kCFURLErrorCannotOpenFile")
    public static final long URLErrorCannotOpenFile = -3001L;
    @GlobalConstant("kCFURLErrorCannotCloseFile")
    public static final long URLErrorCannotCloseFile = -3002L;
    @GlobalConstant("kCFURLErrorCannotWriteToFile")
    public static final long URLErrorCannotWriteToFile = -3003L;
    @GlobalConstant("kCFURLErrorCannotRemoveFile")
    public static final long URLErrorCannotRemoveFile = -3004L;
    @GlobalConstant("kCFURLErrorCannotMoveFile")
    public static final long URLErrorCannotMoveFile = -3005L;
    @GlobalConstant("kCFURLErrorDownloadDecodingFailedMidStream")
    public static final long URLErrorDownloadDecodingFailedMidStream = -3006L;
    @GlobalConstant("kCFURLErrorDownloadDecodingFailedToComplete")
    public static final long URLErrorDownloadDecodingFailedToComplete = -3007L;
    @GlobalConstant("kCFHTTPCookieCannotParseCookieFile")
    public static final long HTTPCookieCannotParseCookieFile = -4000L;
    @GlobalConstant("kCFNetServiceErrorUnknown")
    public static final long NetServiceErrorUnknown = -72000L;
    @GlobalConstant("kCFNetServiceErrorCollision")
    public static final long NetServiceErrorCollision = -72001L;
    @GlobalConstant("kCFNetServiceErrorNotFound")
    public static final long NetServiceErrorNotFound = -72002L;
    @GlobalConstant("kCFNetServiceErrorInProgress")
    public static final long NetServiceErrorInProgress = -72003L;
    @GlobalConstant("kCFNetServiceErrorBadArgument")
    public static final long NetServiceErrorBadArgument = -72004L;
    @GlobalConstant("kCFNetServiceErrorCancel")
    public static final long NetServiceErrorCancel = -72005L;
    @GlobalConstant("kCFNetServiceErrorInvalid")
    public static final long NetServiceErrorInvalid = -72006L;
    @GlobalConstant("kCFNetServiceErrorTimeout")
    public static final long NetServiceErrorTimeout = -72007L;
    @GlobalConstant("kCFNetServiceErrorDNSServiceFailure")
    public static final long NetServiceErrorDNSServiceFailure = -73000L;
    

}
