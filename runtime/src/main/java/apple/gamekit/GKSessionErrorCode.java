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
@Mapping("GKSessionErrorCode")
public final class GKSessionErrorCode extends ObjCEnum {
    
    @GlobalConstant("GKSessionInvalidParameterError")
    public static final long InvalidParameter = 30500L;
    @GlobalConstant("GKSessionPeerNotFoundError")
    public static final long PeerNotFound = 30501L;
    @GlobalConstant("GKSessionDeclinedError")
    public static final long Declined = 30502L;
    @GlobalConstant("GKSessionTimedOutError")
    public static final long TimedOut = 30503L;
    @GlobalConstant("GKSessionCancelledError")
    public static final long Cancelled = 30504L;
    @GlobalConstant("GKSessionConnectionFailedError")
    public static final long ConnectionFailed = 30505L;
    @GlobalConstant("GKSessionConnectionClosedError")
    public static final long ConnectionClosed = 30506L;
    @GlobalConstant("GKSessionDataTooBigError")
    public static final long DataTooBig = 30507L;
    @GlobalConstant("GKSessionNotConnectedError")
    public static final long NotConnected = 30508L;
    @GlobalConstant("GKSessionCannotEnableError")
    public static final long CannotEnable = 30509L;
    @GlobalConstant("GKSessionInProgressError")
    public static final long InProgress = 30510L;
    @GlobalConstant("GKSessionConnectivityError")
    public static final long Connectivity = 30201L;
    @GlobalConstant("GKSessionTransportError")
    public static final long Transport = 30202L;
    @GlobalConstant("GKSessionInternalError")
    public static final long Internal = 30203L;
    @GlobalConstant("GKSessionUnknownError")
    public static final long Unknown = 30204L;
    @GlobalConstant("GKSessionSystemError")
    public static final long System = 30205L;
    

}
