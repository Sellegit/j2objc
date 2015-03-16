package apple.eventkit;


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
import apple.addressbook.*;
import apple.corelocation.*;





@Library("EventKit/EventKit.h")
@Mapping("EKParticipantStatus")
public final class EKParticipantStatus extends ObjCEnum {
    
    @GlobalConstant("EKParticipantStatusUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("EKParticipantStatusPending")
    public static final long Pending = 1L;
    @GlobalConstant("EKParticipantStatusAccepted")
    public static final long Accepted = 2L;
    @GlobalConstant("EKParticipantStatusDeclined")
    public static final long Declined = 3L;
    @GlobalConstant("EKParticipantStatusTentative")
    public static final long Tentative = 4L;
    @GlobalConstant("EKParticipantStatusDelegated")
    public static final long Delegated = 5L;
    @GlobalConstant("EKParticipantStatusCompleted")
    public static final long Completed = 6L;
    @GlobalConstant("EKParticipantStatusInProcess")
    public static final long InProcess = 7L;
    

}
