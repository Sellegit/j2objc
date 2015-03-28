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
@Mapping("EKCalendarEventAvailabilityMask")
public final class EKCalendarEventAvailabilityMask extends ObjCEnum {
    
    @GlobalConstant("EKCalendarEventAvailabilityNone")
    public static final long None = 0L;
    @GlobalConstant("EKCalendarEventAvailabilityBusy")
    public static final long Busy = 1L;
    @GlobalConstant("EKCalendarEventAvailabilityFree")
    public static final long Free = 2L;
    @GlobalConstant("EKCalendarEventAvailabilityTentative")
    public static final long Tentative = 4L;
    @GlobalConstant("EKCalendarEventAvailabilityUnavailable")
    public static final long Unavailable = 8L;


}
