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

@Library("EventKit") @Mapping("EKRecurrenceRule")
public class EKRecurrenceRule 
    extends EKObject 
    implements NSCopying {

    
    
    public EKRecurrenceRule() {}
    @Mapping("initRecurrenceWithFrequency:interval:end:")
    public EKRecurrenceRule(EKRecurrenceFrequency type, @MachineSizedSInt long interval, EKRecurrenceEnd end) { }
    @Mapping("initRecurrenceWithFrequency:interval:daysOfTheWeek:daysOfTheMonth:monthsOfTheYear:weeksOfTheYear:daysOfTheYear:setPositions:end:")
    public EKRecurrenceRule(EKRecurrenceFrequency type, @MachineSizedSInt long interval, NSArray<EKRecurrenceDayOfWeek> days, NSArray<NSNumber> monthDays, NSArray<NSNumber> months, NSArray<NSNumber> weeksOfTheYear, NSArray<NSNumber> daysOfTheYear, NSArray<NSNumber> setPositions, EKRecurrenceEnd end) { }
    
    
    @Mapping("calendarIdentifier")
    public native String getCalendarIdentifier();
    @Mapping("recurrenceEnd")
    public native EKRecurrenceEnd getRecurrenceEnd();
    public native void setRecurrenceEnd(EKRecurrenceEnd v);
    @Mapping("frequency")
    public native EKRecurrenceFrequency getFrequency();
    @Mapping("interval")
    public native @MachineSizedSInt long getInterval();
    @Mapping("firstDayOfTheWeek")
    public native @MachineSizedSInt long getFirstDayOfTheWeek();
    @Mapping("daysOfTheWeek")
    public native NSArray<EKRecurrenceDayOfWeek> getDaysOfTheWeek();
    @Mapping("daysOfTheMonth")
    public native NSArray<NSNumber> getDaysOfTheMonth();
    @Mapping("daysOfTheYear")
    public native NSArray<NSNumber> getDaysOfTheYear();
    @Mapping("weeksOfTheYear")
    public native NSArray<NSNumber> getWeeksOfTheYear();
    @Mapping("monthsOfTheYear")
    public native NSArray<NSNumber> getMonthsOfTheYear();
    @Mapping("setPositions")
    public native NSArray<NSNumber> getSetPositions();
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
