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
@Mapping("GKInviteRecipientResponse")
public final class GKInviteRecipientResponse extends ObjCEnum {
    
    @GlobalConstant("GKInviteRecipientResponseAccepted")
    public static final long RecipientResponseAccepted = 0L;
    @GlobalConstant("GKInviteRecipientResponseDeclined")
    public static final long RecipientResponseDeclined = 1L;
    @GlobalConstant("GKInviteRecipientResponseFailed")
    public static final long RecipientResponseFailed = 2L;
    @GlobalConstant("GKInviteRecipientResponseIncompatible")
    public static final long RecipientResponseIncompatible = 3L;
    @GlobalConstant("GKInviteRecipientResponseUnableToConnect")
    public static final long RecipientResponseUnableToConnect = 4L;
    @GlobalConstant("GKInviteRecipientResponseNoAnswer")
    public static final long RecipientResponseNoAnswer = 5L;
    @GlobalConstant("GKInviteeResponseAccepted")
    public static final long eResponseAccepted = 0L;
    @GlobalConstant("GKInviteeResponseDeclined")
    public static final long eResponseDeclined = 1L;
    @GlobalConstant("GKInviteeResponseFailed")
    public static final long eResponseFailed = 2L;
    @GlobalConstant("GKInviteeResponseIncompatible")
    public static final long eResponseIncompatible = 3L;
    @GlobalConstant("GKInviteeResponseUnableToConnect")
    public static final long eResponseUnableToConnect = 4L;
    @GlobalConstant("GKInviteeResponseNoAnswer")
    public static final long eResponseNoAnswer = 5L;


}
