package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Library("AVFoundation")
@Mapping("AVErrorCode")
public final class AVErrorCode extends ObjCEnum {
    
    @GlobalConstant("AVErrorUnknown")
    public static final long Unknown = -11800L;
    @GlobalConstant("AVErrorOutOfMemory")
    public static final long OutOfMemory = -11801L;
    @GlobalConstant("AVErrorSessionNotRunning")
    public static final long SessionNotRunning = -11803L;
    @GlobalConstant("AVErrorDeviceAlreadyUsedByAnotherSession")
    public static final long DeviceAlreadyUsedByAnotherSession = -11804L;
    @GlobalConstant("AVErrorNoDataCaptured")
    public static final long NoDataCaptured = -11805L;
    @GlobalConstant("AVErrorSessionConfigurationChanged")
    public static final long SessionConfigurationChanged = -11806L;
    @GlobalConstant("AVErrorDiskFull")
    public static final long DiskFull = -11807L;
    @GlobalConstant("AVErrorDeviceWasDisconnected")
    public static final long DeviceWasDisconnected = -11808L;
    @GlobalConstant("AVErrorMediaChanged")
    public static final long MediaChanged = -11809L;
    @GlobalConstant("AVErrorMaximumDurationReached")
    public static final long MaximumDurationReached = -11810L;
    @GlobalConstant("AVErrorMaximumFileSizeReached")
    public static final long MaximumFileSizeReached = -11811L;
    @GlobalConstant("AVErrorMediaDiscontinuity")
    public static final long MediaDiscontinuity = -11812L;
    @GlobalConstant("AVErrorMaximumNumberOfSamplesForFileFormatReached")
    public static final long MaximumNumberOfSamplesForFileFormatReached = -11813L;
    @GlobalConstant("AVErrorDeviceNotConnected")
    public static final long DeviceNotConnected = -11814L;
    @GlobalConstant("AVErrorDeviceInUseByAnotherApplication")
    public static final long DeviceInUseByAnotherApplication = -11815L;
    @GlobalConstant("AVErrorDeviceLockedForConfigurationByAnotherProcess")
    public static final long DeviceLockedForConfigurationByAnotherProcess = -11817L;
    @GlobalConstant("AVErrorSessionWasInterrupted")
    public static final long SessionWasInterrupted = -11818L;
    @GlobalConstant("AVErrorMediaServicesWereReset")
    public static final long MediaServicesWereReset = -11819L;
    @GlobalConstant("AVErrorExportFailed")
    public static final long ExportFailed = -11820L;
    @GlobalConstant("AVErrorDecodeFailed")
    public static final long DecodeFailed = -11821L;
    @GlobalConstant("AVErrorInvalidSourceMedia")
    public static final long InvalidSourceMedia = -11822L;
    @GlobalConstant("AVErrorFileAlreadyExists")
    public static final long FileAlreadyExists = -11823L;
    @GlobalConstant("AVErrorCompositionTrackSegmentsNotContiguous")
    public static final long CompositionTrackSegmentsNotContiguous = -11824L;
    @GlobalConstant("AVErrorInvalidCompositionTrackSegmentDuration")
    public static final long InvalidCompositionTrackSegmentDuration = -11825L;
    @GlobalConstant("AVErrorInvalidCompositionTrackSegmentSourceStartTime")
    public static final long InvalidCompositionTrackSegmentSourceStartTime = -11826L;
    @GlobalConstant("AVErrorInvalidCompositionTrackSegmentSourceDuration")
    public static final long InvalidCompositionTrackSegmentSourceDuration = -11827L;
    @GlobalConstant("AVErrorFileFormatNotRecognized")
    public static final long FileFormatNotRecognized = -11828L;
    @GlobalConstant("AVErrorFileFailedToParse")
    public static final long FileFailedToParse = -11829L;
    @GlobalConstant("AVErrorMaximumStillImageCaptureRequestsExceeded")
    public static final long MaximumStillImageCaptureRequestsExceeded = -11830L;
    @GlobalConstant("AVErrorContentIsProtected")
    public static final long ContentIsProtected = -11831L;
    @GlobalConstant("AVErrorNoImageAtTime")
    public static final long NoImageAtTime = -11832L;
    @GlobalConstant("AVErrorDecoderNotFound")
    public static final long DecoderNotFound = -11833L;
    @GlobalConstant("AVErrorEncoderNotFound")
    public static final long EncoderNotFound = -11834L;
    @GlobalConstant("AVErrorContentIsNotAuthorized")
    public static final long ContentIsNotAuthorized = -11835L;
    @GlobalConstant("AVErrorApplicationIsNotAuthorized")
    public static final long ApplicationIsNotAuthorized = -11836L;
    @GlobalConstant("AVErrorDeviceIsNotAvailableInBackground")
    public static final long DeviceIsNotAvailableInBackground = -11837L;
    @GlobalConstant("AVErrorOperationNotSupportedForAsset")
    public static final long OperationNotSupportedForAsset = -11838L;
    @GlobalConstant("AVErrorDecoderTemporarilyUnavailable")
    public static final long DecoderTemporarilyUnavailable = -11839L;
    @GlobalConstant("AVErrorEncoderTemporarilyUnavailable")
    public static final long EncoderTemporarilyUnavailable = -11840L;
    @GlobalConstant("AVErrorInvalidVideoComposition")
    public static final long InvalidVideoComposition = -11841L;
    @GlobalConstant("AVErrorReferenceForbiddenByReferencePolicy")
    public static final long ReferenceForbiddenByReferencePolicy = -11842L;
    @GlobalConstant("AVErrorInvalidOutputURLPathExtension")
    public static final long InvalidOutputURLPathExtension = -11843L;
    @GlobalConstant("AVErrorScreenCaptureFailed")
    public static final long ScreenCaptureFailed = -11844L;
    @GlobalConstant("AVErrorDisplayWasDisabled")
    public static final long DisplayWasDisabled = -11845L;
    @GlobalConstant("AVErrorTorchLevelUnavailable")
    public static final long TorchLevelUnavailable = -11846L;
    @GlobalConstant("AVErrorOperationInterrupted")
    public static final long OperationInterrupted = -11847L;
    @GlobalConstant("AVErrorIncompatibleAsset")
    public static final long IncompatibleAsset = -11848L;
    @GlobalConstant("AVErrorFailedToLoadMediaData")
    public static final long FailedToLoadMediaData = -11849L;
    @GlobalConstant("AVErrorServerIncorrectlyConfigured")
    public static final long ServerIncorrectlyConfigured = -11850L;
    @GlobalConstant("AVErrorApplicationIsNotAuthorizedToUseDevice")
    public static final long ApplicationIsNotAuthorizedToUseDevice = -11852L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVErrorFailedToParse")
    public static final long FailedToParse = -11853L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVErrorFileTypeDoesNotSupportSampleReferences")
    public static final long FileTypeDoesNotSupportSampleReferences = -11854L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVErrorUndecodableMediaData")
    public static final long UndecodableMediaData = -11855L;
    

}
