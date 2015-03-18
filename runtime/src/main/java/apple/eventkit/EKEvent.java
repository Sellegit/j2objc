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

@Library("EventKit/EventKit.h") @Mapping("EKEvent")
public class EKEvent 
    extends EKCalendarItem 
     {

    
    
    @Mapping("init")
    public EKEvent() { }
    
    
    @Mapping("eventIdentifier")
    public native String getEventIdentifier();
    @Mapping("isAllDay")
    public native boolean isAllDay();
    @Mapping("setAllDay:")
    public native void setAllDay(boolean v);
    @Mapping("startDate")
    public native NSDate getStartDate();
    @Mapping("setStartDate:")
    public native void setStartDate(NSDate v);
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("setEndDate:")
    public native void setEndDate(NSDate v);
    @Mapping("organizer")
    public native EKParticipant getOrganizer();
    @Mapping("availability")
    public native EKEventAvailability getAvailability();
    @Mapping("setAvailability:")
    public native void setAvailability(EKEventAvailability v);
    @Mapping("status")
    public native EKEventStatus getStatus();
    @Mapping("isDetached")
    public native boolean isDetached();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("birthdayPersonID")
    public native @MachineSizedSInt long getBirthdayPersonID();
    
    
    
    @Mapping("compareStartDateWithEvent:")
    public native @Representing("NSComparisonResult") @MachineSizedSInt long compareStartDateWithEvent(EKEvent other);
    @Mapping("refresh")
    public native boolean refresh();
    @Mapping("eventWithEventStore:")
    public static native EKEvent create(EKEventStore eventStore);
    
}
