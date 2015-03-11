package apple.homekit;


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





@Library("HomeKit")
@Mapping("HMErrorCode")
public final class HMErrorCode extends ObjCEnum {
    
    @GlobalConstant("HMErrorCodeAlreadyExists")
    public static final long AlreadyExists = 1L;
    @GlobalConstant("HMErrorCodeNotFound")
    public static final long NotFound = 2L;
    @GlobalConstant("HMErrorCodeInvalidParameter")
    public static final long InvalidParameter = 3L;
    @GlobalConstant("HMErrorCodeAccessoryNotReachable")
    public static final long AccessoryNotReachable = 4L;
    @GlobalConstant("HMErrorCodeReadOnlyCharacteristic")
    public static final long ReadOnlyCharacteristic = 5L;
    @GlobalConstant("HMErrorCodeWriteOnlyCharacteristic")
    public static final long WriteOnlyCharacteristic = 6L;
    @GlobalConstant("HMErrorCodeNotificationNotSupported")
    public static final long NotificationNotSupported = 7L;
    @GlobalConstant("HMErrorCodeOperationTimedOut")
    public static final long OperationTimedOut = 8L;
    @GlobalConstant("HMErrorCodeAccessoryPoweredOff")
    public static final long AccessoryPoweredOff = 9L;
    @GlobalConstant("HMErrorCodeAccessDenied")
    public static final long AccessDenied = 10L;
    @GlobalConstant("HMErrorCodeObjectAssociatedToAnotherHome")
    public static final long ObjectAssociatedToAnotherHome = 11L;
    @GlobalConstant("HMErrorCodeObjectNotAssociatedToAnyHome")
    public static final long ObjectNotAssociatedToAnyHome = 12L;
    @GlobalConstant("HMErrorCodeObjectAlreadyAssociatedToHome")
    public static final long ObjectAlreadyAssociatedToHome = 13L;
    @GlobalConstant("HMErrorCodeAccessoryIsBusy")
    public static final long AccessoryIsBusy = 14L;
    @GlobalConstant("HMErrorCodeOperationInProgress")
    public static final long OperationInProgress = 15L;
    @GlobalConstant("HMErrorCodeAccessoryOutOfResources")
    public static final long AccessoryOutOfResources = 16L;
    @GlobalConstant("HMErrorCodeInsufficientPrivileges")
    public static final long InsufficientPrivileges = 17L;
    @GlobalConstant("HMErrorCodeAccessoryPairingFailed")
    public static final long AccessoryPairingFailed = 18L;
    @GlobalConstant("HMErrorCodeInvalidDataFormatSpecified")
    public static final long InvalidDataFormatSpecified = 19L;
    @GlobalConstant("HMErrorCodeNilParameter")
    public static final long NilParameter = 20L;
    @GlobalConstant("HMErrorCodeUnconfiguredParameter")
    public static final long UnconfiguredParameter = 21L;
    @GlobalConstant("HMErrorCodeInvalidClass")
    public static final long InvalidClass = 22L;
    @GlobalConstant("HMErrorCodeOperationCancelled")
    public static final long OperationCancelled = 23L;
    @GlobalConstant("HMErrorCodeRoomForHomeCannotBeInZone")
    public static final long RoomForHomeCannotBeInZone = 24L;
    @GlobalConstant("HMErrorCodeNoActionsInActionSet")
    public static final long NoActionsInActionSet = 25L;
    @GlobalConstant("HMErrorCodeNoRegisteredActionSets")
    public static final long NoRegisteredActionSets = 26L;
    @GlobalConstant("HMErrorCodeMissingParameter")
    public static final long MissingParameter = 27L;
    @GlobalConstant("HMErrorCodeFireDateInPast")
    public static final long FireDateInPast = 28L;
    @GlobalConstant("HMErrorCodeRoomForHomeCannotBeUpdated")
    public static final long RoomForHomeCannotBeUpdated = 29L;
    @GlobalConstant("HMErrorCodeActionInAnotherActionSet")
    public static final long ActionInAnotherActionSet = 30L;
    @GlobalConstant("HMErrorCodeObjectWithSimilarNameExistsInHome")
    public static final long ObjectWithSimilarNameExistsInHome = 31L;
    @GlobalConstant("HMErrorCodeHomeWithSimilarNameExists")
    public static final long HomeWithSimilarNameExists = 32L;
    @GlobalConstant("HMErrorCodeRenameWithSimilarName")
    public static final long RenameWithSimilarName = 33L;
    @GlobalConstant("HMErrorCodeCannotRemoveNonBridgeAccessory")
    public static final long CannotRemoveNonBridgeAccessory = 34L;
    @GlobalConstant("HMErrorCodeNameContainsProhibitedCharacters")
    public static final long NameContainsProhibitedCharacters = 35L;
    @GlobalConstant("HMErrorCodeNameDoesNotStartWithValidCharacters")
    public static final long NameDoesNotStartWithValidCharacters = 36L;
    @GlobalConstant("HMErrorCodeUserIDNotEmailAddress")
    public static final long UserIDNotEmailAddress = 37L;
    @GlobalConstant("HMErrorCodeUserDeclinedAddingUser")
    public static final long UserDeclinedAddingUser = 38L;
    @GlobalConstant("HMErrorCodeUserDeclinedRemovingUser")
    public static final long UserDeclinedRemovingUser = 39L;
    @GlobalConstant("HMErrorCodeUserDeclinedInvite")
    public static final long UserDeclinedInvite = 40L;
    @GlobalConstant("HMErrorCodeUserManagementFailed")
    public static final long UserManagementFailed = 41L;
    @GlobalConstant("HMErrorCodeRecurrenceTooSmall")
    public static final long RecurrenceTooSmall = 42L;
    @GlobalConstant("HMErrorCodeInvalidValueType")
    public static final long InvalidValueType = 43L;
    @GlobalConstant("HMErrorCodeValueLowerThanMinimum")
    public static final long ValueLowerThanMinimum = 44L;
    @GlobalConstant("HMErrorCodeValueHigherThanMaximum")
    public static final long ValueHigherThanMaximum = 45L;
    @GlobalConstant("HMErrorCodeStringLongerThanMaximum")
    public static final long StringLongerThanMaximum = 46L;
    @GlobalConstant("HMErrorCodeHomeAccessNotAuthorized")
    public static final long HomeAccessNotAuthorized = 47L;
    @GlobalConstant("HMErrorCodeOperationNotSupported")
    public static final long OperationNotSupported = 48L;
    @GlobalConstant("HMErrorCodeMaximumObjectLimitReached")
    public static final long MaximumObjectLimitReached = 49L;
    @GlobalConstant("HMErrorCodeAccessorySentInvalidResponse")
    public static final long AccessorySentInvalidResponse = 50L;
    @GlobalConstant("HMErrorCodeStringShorterThanMinimum")
    public static final long StringShorterThanMinimum = 51L;
    @GlobalConstant("HMErrorCodeGenericError")
    public static final long GenericError = 52L;
    @GlobalConstant("HMErrorCodeSecurityFailure")
    public static final long SecurityFailure = 53L;
    @GlobalConstant("HMErrorCodeCommunicationFailure")
    public static final long CommunicationFailure = 54L;
    @GlobalConstant("HMErrorCodeMessageAuthenticationFailed")
    public static final long MessageAuthenticationFailed = 55L;
    @GlobalConstant("HMErrorCodeInvalidMessageSize")
    public static final long InvalidMessageSize = 56L;
    @GlobalConstant("HMErrorCodeAccessoryDiscoveryFailed")
    public static final long AccessoryDiscoveryFailed = 57L;
    @GlobalConstant("HMErrorCodeClientRequestError")
    public static final long ClientRequestError = 58L;
    @GlobalConstant("HMErrorCodeAccessoryResponseError")
    public static final long AccessoryResponseError = 59L;
    @GlobalConstant("HMErrorCodeNameDoesNotEndWithValidCharacters")
    public static final long NameDoesNotEndWithValidCharacters = 60L;
    @GlobalConstant("HMErrorCodeAccessoryIsBlocked")
    public static final long AccessoryIsBlocked = 61L;
    @GlobalConstant("HMErrorCodeInvalidAssociatedServiceType")
    public static final long InvalidAssociatedServiceType = 62L;
    @GlobalConstant("HMErrorCodeActionSetExecutionFailed")
    public static final long ActionSetExecutionFailed = 63L;
    @GlobalConstant("HMErrorCodeActionSetExecutionPartialSuccess")
    public static final long ActionSetExecutionPartialSuccess = 64L;
    @GlobalConstant("HMErrorCodeActionSetExecutionInProgress")
    public static final long ActionSetExecutionInProgress = 65L;
    @GlobalConstant("HMErrorCodeAccessoryOutOfCompliance")
    public static final long AccessoryOutOfCompliance = 66L;
    @GlobalConstant("HMErrorCodeDataResetFailure")
    public static final long DataResetFailure = 67L;
    @GlobalConstant("HMErrorCodeNotificationAlreadyEnabled")
    public static final long NotificationAlreadyEnabled = 68L;
    @GlobalConstant("HMErrorCodeRecurrenceMustBeOnSpecifiedBoundaries")
    public static final long RecurrenceMustBeOnSpecifiedBoundaries = 69L;
    @GlobalConstant("HMErrorCodeDateMustBeOnSpecifiedBoundaries")
    public static final long DateMustBeOnSpecifiedBoundaries = 70L;
    @GlobalConstant("HMErrorCodeCannotActivateTriggerTooFarInFuture")
    public static final long CannotActivateTriggerTooFarInFuture = 71L;
    @GlobalConstant("HMErrorCodeRecurrenceTooLarge")
    public static final long RecurrenceTooLarge = 72L;
    @GlobalConstant("HMErrorCodeReadWritePartialSuccess")
    public static final long ReadWritePartialSuccess = 73L;
    @GlobalConstant("HMErrorCodeReadWriteFailure")
    public static final long ReadWriteFailure = 74L;
    @GlobalConstant("HMErrorCodeNotSignedIntoiCloud")
    public static final long NotSignedIntoiCloud = 75L;
    @GlobalConstant("HMErrorCodeKeychainSyncNotEnabled")
    public static final long KeychainSyncNotEnabled = 76L;
    @GlobalConstant("HMErrorCodeCloudDataSyncInProgress")
    public static final long CloudDataSyncInProgress = 77L;
    @GlobalConstant("HMErrorCodeNetworkUnavailable")
    public static final long NetworkUnavailable = 78L;
    @GlobalConstant("HMErrorCodeAddAccessoryFailed")
    public static final long AddAccessoryFailed = 79L;
    @GlobalConstant("HMErrorCodeMissingEntitlement")
    public static final long MissingEntitlement = 80L;
    

}
