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
@Mapping("EKCalendarType")
public final class EKCalendarType extends ObjCEnum {
    
    @GlobalConstant("EKCalendarTypeLocal")
    public static final long Local = 0L;
    @GlobalConstant("EKCalendarTypeCalDAV")
    public static final long CalDAV = 1L;
    @GlobalConstant("EKCalendarTypeExchange")
    public static final long Exchange = 2L;
    @GlobalConstant("EKCalendarTypeSubscription")
    public static final long Subscription = 3L;
    @GlobalConstant("EKCalendarTypeBirthday")
    public static final long Birthday = 4L;
    

}
