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





@Library("EventKit")
@Mapping("EKSourceType")
public final class EKSourceType extends ObjCEnum {
    
    @GlobalConstant("EKSourceTypeLocal")
    public static final long Local = 0L;
    @GlobalConstant("EKSourceTypeExchange")
    public static final long Exchange = 1L;
    @GlobalConstant("EKSourceTypeCalDAV")
    public static final long CalDAV = 2L;
    @GlobalConstant("EKSourceTypeMobileMe")
    public static final long MobileMe = 3L;
    @GlobalConstant("EKSourceTypeSubscribed")
    public static final long Subscribed = 4L;
    @GlobalConstant("EKSourceTypeBirthdays")
    public static final long Birthdays = 5L;
    

}
