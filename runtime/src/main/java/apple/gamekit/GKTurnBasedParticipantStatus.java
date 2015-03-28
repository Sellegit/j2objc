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
@Mapping("GKTurnBasedParticipantStatus")
public final class GKTurnBasedParticipantStatus extends ObjCEnum {
    
    @GlobalConstant("GKTurnBasedParticipantStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("GKTurnBasedParticipantStatusInvited")
    public static final long Invited = 1L;
    @GlobalConstant("GKTurnBasedParticipantStatusDeclined")
    public static final long Declined = 2L;
    @GlobalConstant("GKTurnBasedParticipantStatusMatching")
    public static final long Matching = 3L;
    @GlobalConstant("GKTurnBasedParticipantStatusActive")
    public static final long Active = 4L;
    @GlobalConstant("GKTurnBasedParticipantStatusDone")
    public static final long Done = 5L;


}
