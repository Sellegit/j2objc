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
@Mapping("EKParticipantType")
public final class EKParticipantType extends ObjCEnum {
    
    @GlobalConstant("EKParticipantTypeUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("EKParticipantTypePerson")
    public static final long Person = 1L;
    @GlobalConstant("EKParticipantTypeRoom")
    public static final long Room = 2L;
    @GlobalConstant("EKParticipantTypeResource")
    public static final long Resource = 3L;
    @GlobalConstant("EKParticipantTypeGroup")
    public static final long Group = 4L;


}
