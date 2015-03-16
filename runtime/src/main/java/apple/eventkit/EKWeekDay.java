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
@Mapping("EKWeekDay")
public final class EKWeekDay extends ObjCEnum {
    
    @GlobalConstant("EKSunday")
    public static final long Sunday = 1L;
    @GlobalConstant("EKMonday")
    public static final long Monday = 2L;
    @GlobalConstant("EKTuesday")
    public static final long Tuesday = 3L;
    @GlobalConstant("EKWednesday")
    public static final long Wednesday = 4L;
    @GlobalConstant("EKThursday")
    public static final long Thursday = 5L;
    @GlobalConstant("EKFriday")
    public static final long Friday = 6L;
    @GlobalConstant("EKSaturday")
    public static final long Saturday = 7L;
    

}
