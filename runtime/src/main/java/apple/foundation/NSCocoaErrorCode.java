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
@Mapping("NSCocoaErrorCode")
public final class NSCocoaErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSFileNoSuchFileError")
    public static final long FileNoSuchFileError = 4L;
    @GlobalConstant("NSFileLockingError")
    public static final long FileLockingError = 255L;
    @GlobalConstant("NSFileReadUnknownError")
    public static final long FileReadUnknownError = 256L;
    @GlobalConstant("NSFileReadNoPermissionError")
    public static final long FileReadNoPermissionError = 257L;
    @GlobalConstant("NSFileReadInvalidFileNameError")
    public static final long FileReadInvalidFileNameError = 258L;
    @GlobalConstant("NSFileReadCorruptFileError")
    public static final long FileReadCorruptFileError = 259L;
    @GlobalConstant("NSFileReadNoSuchFileError")
    public static final long FileReadNoSuchFileError = 260L;
    @GlobalConstant("NSFileReadInapplicableStringEncodingError")
    public static final long FileReadInapplicableStringEncodingError = 261L;
    @GlobalConstant("NSFileReadUnsupportedSchemeError")
    public static final long FileReadUnsupportedSchemeError = 262L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSFileReadTooLargeError")
    public static final long FileReadTooLargeError = 263L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSFileReadUnknownStringEncodingError")
    public static final long FileReadUnknownStringEncodingError = 264L;
    @GlobalConstant("NSFileWriteUnknownError")
    public static final long FileWriteUnknownError = 512L;
    @GlobalConstant("NSFileWriteNoPermissionError")
    public static final long FileWriteNoPermissionError = 513L;
    @GlobalConstant("NSFileWriteInvalidFileNameError")
    public static final long FileWriteInvalidFileNameError = 514L;
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSFileWriteFileExistsError")
    public static final long FileWriteFileExistsError = 516L;
    @GlobalConstant("NSFileWriteInapplicableStringEncodingError")
    public static final long FileWriteInapplicableStringEncodingError = 517L;
    @GlobalConstant("NSFileWriteUnsupportedSchemeError")
    public static final long FileWriteUnsupportedSchemeError = 518L;
    @GlobalConstant("NSFileWriteOutOfSpaceError")
    public static final long FileWriteOutOfSpaceError = 640L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSFileWriteVolumeReadOnlyError")
    public static final long FileWriteVolumeReadOnlyError = 642L;
    @GlobalConstant("NSKeyValueValidationError")
    public static final long KeyValueValidationError = 1024L;
    @GlobalConstant("NSFormattingError")
    public static final long FormattingError = 2048L;
    @GlobalConstant("NSUserCancelledError")
    public static final long UserCancelledError = 3072L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSFeatureUnsupportedError")
    public static final long FeatureUnsupportedError = 3328L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableNotLoadableError")
    public static final long ExecutableNotLoadableError = 3584L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableArchitectureMismatchError")
    public static final long ExecutableArchitectureMismatchError = 3585L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableRuntimeMismatchError")
    public static final long ExecutableRuntimeMismatchError = 3586L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableLoadError")
    public static final long ExecutableLoadError = 3587L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableLinkError")
    public static final long ExecutableLinkError = 3588L;
    @GlobalConstant("NSFileErrorMinimum")
    public static final long FileErrorMinimum = 0L;
    @GlobalConstant("NSFileErrorMaximum")
    public static final long FileErrorMaximum = 1023L;
    @GlobalConstant("NSValidationErrorMinimum")
    public static final long ValidationErrorMinimum = 1024L;
    @GlobalConstant("NSValidationErrorMaximum")
    public static final long ValidationErrorMaximum = 2047L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableErrorMinimum")
    public static final long ExecutableErrorMinimum = 3584L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSExecutableErrorMaximum")
    public static final long ExecutableErrorMaximum = 3839L;
    @GlobalConstant("NSFormattingErrorMinimum")
    public static final long FormattingErrorMinimum = 2048L;
    @GlobalConstant("NSFormattingErrorMaximum")
    public static final long FormattingErrorMaximum = 2559L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListReadCorruptError")
    public static final long PropertyListReadCorruptError = 3840L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListReadUnknownVersionError")
    public static final long PropertyListReadUnknownVersionError = 3841L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListReadStreamError")
    public static final long PropertyListReadStreamError = 3842L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListWriteStreamError")
    public static final long PropertyListWriteStreamError = 3851L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSPropertyListWriteInvalidError")
    public static final long PropertyListWriteInvalidError = 3852L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListErrorMinimum")
    public static final long PropertyListErrorMinimum = 3840L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPropertyListErrorMaximum")
    public static final long PropertyListErrorMaximum = 4095L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSXPCConnectionInterrupted")
    public static final long XPCConnectionInterrupted = 4097L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSXPCConnectionInvalid")
    public static final long XPCConnectionInvalid = 4099L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSXPCConnectionReplyInvalid")
    public static final long XPCConnectionReplyInvalid = 4101L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSXPCConnectionErrorMinimum")
    public static final long XPCConnectionErrorMinimum = 4096L;
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("NSXPCConnectionErrorMaximum")
    public static final long XPCConnectionErrorMaximum = 4224L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUbiquitousFileUnavailableError")
    public static final long UbiquitousFileUnavailableError = 4353L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUbiquitousFileNotUploadedDueToQuotaError")
    public static final long UbiquitousFileNotUploadedDueToQuotaError = 4354L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUbiquitousFileUbiquityServerNotAvailable")
    public static final long UbiquitousFileUbiquityServerNotAvailable = 4355L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUbiquitousFileErrorMinimum")
    public static final long UbiquitousFileErrorMinimum = 4352L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSUbiquitousFileErrorMaximum")
    public static final long UbiquitousFileErrorMaximum = 4607L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityHandoffFailedError")
    public static final long UserActivityHandoffFailedError = 4608L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityConnectionUnavailableError")
    public static final long UserActivityConnectionUnavailableError = 4609L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityRemoteApplicationTimedOutError")
    public static final long UserActivityRemoteApplicationTimedOutError = 4610L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityHandoffUserInfoTooLargeError")
    public static final long UserActivityHandoffUserInfoTooLargeError = 4611L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityErrorMinimum")
    public static final long UserActivityErrorMinimum = 4608L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSUserActivityErrorMaximum")
    public static final long UserActivityErrorMaximum = 4863L;
    

}
