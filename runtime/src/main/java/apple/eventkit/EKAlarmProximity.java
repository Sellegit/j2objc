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
@Mapping("EKAlarmProximity")
public final class EKAlarmProximity extends ObjCEnum {
    
    @GlobalConstant("EKAlarmProximityNone")
    public static final long None = 0L;
    @GlobalConstant("EKAlarmProximityEnter")
    public static final long Enter = 1L;
    @GlobalConstant("EKAlarmProximityLeave")
    public static final long Leave = 2L;
    

}
