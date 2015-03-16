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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("EventKit/EventKit.h") @Mapping("EKRecurrenceDayOfWeek")
public class EKRecurrenceDayOfWeek 
    extends NSObject 
    implements NSCopying {

    
    
    public EKRecurrenceDayOfWeek() {}
    @Mapping("initWithDayOfTheWeek:weekNumber:")
    public EKRecurrenceDayOfWeek(@MachineSizedSInt long dayOfTheWeek, @MachineSizedSInt long weekNumber) { }
    
    
    @Mapping("dayOfTheWeek")
    public native @MachineSizedSInt long getDayOfTheWeek();
    @Mapping("weekNumber")
    public native @MachineSizedSInt long getWeekNumber();
    
    
    
    @Mapping("dayOfWeek:")
    public static native EKRecurrenceDayOfWeek create(@MachineSizedSInt long dayOfTheWeek);
    @Mapping("dayOfWeek:weekNumber:")
    public static native EKRecurrenceDayOfWeek create(@MachineSizedSInt long dayOfTheWeek, @MachineSizedSInt long weekNumber);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
