package apple.gamekit;


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
import apple.uikit.*;





@Library("GameKit/GameKit.h")
@Mapping("GKErrorCode")
public final class GKErrorCode extends ObjCEnum {
    
    @GlobalConstant("GKErrorUnknown")
    public static final long Unknown = 1L;
    @GlobalConstant("GKErrorCancelled")
    public static final long Cancelled = 2L;
    @GlobalConstant("GKErrorCommunicationsFailure")
    public static final long CommunicationsFailure = 3L;
    @GlobalConstant("GKErrorUserDenied")
    public static final long UserDenied = 4L;
    @GlobalConstant("GKErrorInvalidCredentials")
    public static final long InvalidCredentials = 5L;
    @GlobalConstant("GKErrorNotAuthenticated")
    public static final long NotAuthenticated = 6L;
    @GlobalConstant("GKErrorAuthenticationInProgress")
    public static final long AuthenticationInProgress = 7L;
    @GlobalConstant("GKErrorInvalidPlayer")
    public static final long InvalidPlayer = 8L;
    @GlobalConstant("GKErrorScoreNotSet")
    public static final long ScoreNotSet = 9L;
    @GlobalConstant("GKErrorParentalControlsBlocked")
    public static final long ParentalControlsBlocked = 10L;
    @GlobalConstant("GKErrorPlayerStatusExceedsMaximumLength")
    public static final long PlayerStatusExceedsMaximumLength = 11L;
    @GlobalConstant("GKErrorPlayerStatusInvalid")
    public static final long PlayerStatusInvalid = 12L;
    @GlobalConstant("GKErrorMatchRequestInvalid")
    public static final long MatchRequestInvalid = 13L;
    @GlobalConstant("GKErrorUnderage")
    public static final long Underage = 14L;
    @GlobalConstant("GKErrorGameUnrecognized")
    public static final long GameUnrecognized = 15L;
    @GlobalConstant("GKErrorNotSupported")
    public static final long NotSupported = 16L;
    @GlobalConstant("GKErrorInvalidParameter")
    public static final long InvalidParameter = 17L;
    @GlobalConstant("GKErrorUnexpectedConnection")
    public static final long UnexpectedConnection = 18L;
    @GlobalConstant("GKErrorChallengeInvalid")
    public static final long ChallengeInvalid = 19L;
    @GlobalConstant("GKErrorTurnBasedMatchDataTooLarge")
    public static final long TurnBasedMatchDataTooLarge = 20L;
    @GlobalConstant("GKErrorTurnBasedTooManySessions")
    public static final long TurnBasedTooManySessions = 21L;
    @GlobalConstant("GKErrorTurnBasedInvalidParticipant")
    public static final long TurnBasedInvalidParticipant = 22L;
    @GlobalConstant("GKErrorTurnBasedInvalidTurn")
    public static final long TurnBasedInvalidTurn = 23L;
    @GlobalConstant("GKErrorTurnBasedInvalidState")
    public static final long TurnBasedInvalidState = 24L;
    @GlobalConstant("GKErrorInvitationsDisabled")
    public static final long InvitationsDisabled = 25L;
    @GlobalConstant("GKErrorPlayerPhotoFailure")
    public static final long PlayerPhotoFailure = 26L;
    @GlobalConstant("GKErrorUbiquityContainerUnavailable")
    public static final long UbiquityContainerUnavailable = 27L;
    

}
