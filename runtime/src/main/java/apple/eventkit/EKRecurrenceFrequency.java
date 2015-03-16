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
@Mapping("EKRecurrenceFrequency")
public final class EKRecurrenceFrequency extends ObjCEnum {
    
    @GlobalConstant("EKRecurrenceFrequencyDaily")
    public static final long Daily = 0L;
    @GlobalConstant("EKRecurrenceFrequencyWeekly")
    public static final long Weekly = 1L;
    @GlobalConstant("EKRecurrenceFrequencyMonthly")
    public static final long Monthly = 2L;
    @GlobalConstant("EKRecurrenceFrequencyYearly")
    public static final long Yearly = 3L;
    

}
