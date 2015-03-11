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





@Library("GameKit")
@Mapping("GKVoiceChatServiceErrorCode")
public final class GKVoiceChatServiceErrorCode extends ObjCEnum {
    
    @GlobalConstant("GKVoiceChatServiceInternalError")
    public static final long Internal = 32000L;
    @GlobalConstant("GKVoiceChatServiceNoRemotePacketsError")
    public static final long NoRemotePackets = 32001L;
    @GlobalConstant("GKVoiceChatServiceUnableToConnectError")
    public static final long UnableToConnect = 32002L;
    @GlobalConstant("GKVoiceChatServiceRemoteParticipantHangupError")
    public static final long RemoteParticipantHangup = 32003L;
    @GlobalConstant("GKVoiceChatServiceInvalidCallIDError")
    public static final long InvalidCallID = 32004L;
    @GlobalConstant("GKVoiceChatServiceAudioUnavailableError")
    public static final long AudioUnavailable = 32005L;
    @GlobalConstant("GKVoiceChatServiceUninitializedClientError")
    public static final long UninitializedClient = 32006L;
    @GlobalConstant("GKVoiceChatServiceClientMissingRequiredMethodsError")
    public static final long ClientMissingRequiredMethods = 32007L;
    @GlobalConstant("GKVoiceChatServiceRemoteParticipantBusyError")
    public static final long RemoteParticipantBusy = 32008L;
    @GlobalConstant("GKVoiceChatServiceRemoteParticipantCancelledError")
    public static final long RemoteParticipantCancelled = 32009L;
    @GlobalConstant("GKVoiceChatServiceRemoteParticipantResponseInvalidError")
    public static final long RemoteParticipantResponseInvalid = 32010L;
    @GlobalConstant("GKVoiceChatServiceRemoteParticipantDeclinedInviteError")
    public static final long RemoteParticipantDeclinedInvite = 32011L;
    @GlobalConstant("GKVoiceChatServiceMethodCurrentlyInvalidError")
    public static final long MethodCurrentlyInvalid = 32012L;
    @GlobalConstant("GKVoiceChatServiceNetworkConfigurationError")
    public static final long NetworkConfiguration = 32013L;
    @GlobalConstant("GKVoiceChatServiceUnsupportedRemoteVersionError")
    public static final long UnsupportedRemoteVersion = 32014L;
    @GlobalConstant("GKVoiceChatServiceOutOfMemoryError")
    public static final long OutOfMemory = 32015L;
    @GlobalConstant("GKVoiceChatServiceInvalidParameterError")
    public static final long InvalidParameter = 32016L;
    

}
