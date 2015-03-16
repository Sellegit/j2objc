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
 * @since Available in iOS 5.0 and later.
 */

@Library("EventKit/EventKit.h") @Mapping("EKCalendarItem")
public class EKCalendarItem 
    extends EKObject 
     {

    
    
    public EKCalendarItem() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("UUID")
    public native String getUUID();
    @Mapping("calendar")
    public native EKCalendar getCalendar();
    @Mapping("setCalendar:")
    public native void setCalendar(EKCalendar v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarItemIdentifier")
    public native String getCalendarItemIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarItemExternalIdentifier")
    public native String getCalendarItemExternalIdentifier();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("location")
    public native String getLocation();
    @Mapping("setLocation:")
    public native void setLocation(String v);
    @Mapping("notes")
    public native String getNotes();
    @Mapping("setNotes:")
    public native void setNotes(String v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("URL")
    public native NSURL getURL();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setURL:")
    public native void setURL(NSURL v);
    @Mapping("lastModifiedDate")
    public native NSDate getLastModifiedDate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("hasAlarms")
    public native boolean hasAlarms();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("hasRecurrenceRules")
    public native boolean hasRecurrenceRules();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("hasAttendees")
    public native boolean hasAttendees();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("hasNotes")
    public native boolean hasNotes();
    @Mapping("attendees")
    public native NSArray<EKParticipant> getAttendees();
    @Mapping("alarms")
    public native NSArray<EKAlarm> getAlarms();
    @Mapping("setAlarms:")
    public native void setAlarms(NSArray<EKAlarm> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("recurrenceRules")
    public native NSArray<EKRecurrenceRule> getRecurrenceRules();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRecurrenceRules:")
    public native void setRecurrenceRules(NSArray<EKRecurrenceRule> v);
    
    
    
    @Mapping("addAlarm:")
    public native void addAlarm(EKAlarm alarm);
    @Mapping("removeAlarm:")
    public native void removeAlarm(EKAlarm alarm);
    @Mapping("addRecurrenceRule:")
    public native void addRecurrenceRule(EKRecurrenceRule rule);
    @Mapping("removeRecurrenceRule:")
    public native void removeRecurrenceRule(EKRecurrenceRule rule);
    
}
