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
@Mapping("EKParticipantRole")
public final class EKParticipantRole extends ObjCEnum {
    
    @GlobalConstant("EKParticipantRoleUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("EKParticipantRoleRequired")
    public static final long Required = 1L;
    @GlobalConstant("EKParticipantRoleOptional")
    public static final long Optional = 2L;
    @GlobalConstant("EKParticipantRoleChair")
    public static final long Chair = 3L;
    @GlobalConstant("EKParticipantRoleNonParticipant")
    public static final long NonParticipant = 4L;
    

}
