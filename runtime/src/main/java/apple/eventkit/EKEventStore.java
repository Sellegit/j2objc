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

@Library("EventKit") @Mapping("EKEventStore")
public class EKEventStore 
    extends NSObject 
     {

    
    
    public EKEventStore() {}
    
    
    @Mapping("eventStoreIdentifier")
    public native String getEventStoreIdentifier();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("calendars")
    public native NSArray<EKCalendar> getCalendars();
    @Mapping("defaultCalendarForNewEvents")
    public native EKCalendar getDefaultCalendarForNewEvents();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("EKEventStoreChangedNotification")
    public static native NSString ChangedNotification();
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("requestAccessToEntityType:completion:")
    public native void requestAccess(@Representing("EKEntityType") int entityType, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("sources")
    public native NSArray<EKSource> getSources();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("sourceWithIdentifier:")
    public native EKSource getSource(String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarsForEntityType:")
    public native NSArray<EKCalendar> getCalendars(@Representing("EKEntityType") int entityType);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("defaultCalendarForNewReminders")
    public native EKCalendar getDefaultCalendarForNewReminders();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("calendarWithIdentifier:")
    public native EKCalendar getCalendar(String identifier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("saveCalendar:commit:error:")
    protected native boolean saveCalendar(EKCalendar calendar, boolean commit, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("removeCalendar:commit:error:")
    protected native boolean removeCalendar(EKCalendar calendar, boolean commit, Todo error);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarItemWithIdentifier:")
    public native EKCalendarItem getCalendarItem(String identifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarItemsWithExternalIdentifier:")
    public native NSArray<EKCalendarItem> getCalendarItems(String externalIdentifier);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("saveEvent:span:error:")
    protected native boolean saveEvent(EKEvent event, EKSpan span, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("removeEvent:span:error:")
    protected native boolean removeEvent(EKEvent event, EKSpan span, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("saveEvent:span:commit:error:")
    protected native boolean saveEvent(EKEvent event, EKSpan span, boolean commit, Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("removeEvent:span:commit:error:")
    protected native boolean removeEvent(EKEvent event, EKSpan span, boolean commit, Todo error);
    @Mapping("eventWithIdentifier:")
    public native EKEvent getEvent(String identifier);
    @Mapping("eventsMatchingPredicate:")
    public native NSArray<EKEvent> getEvents(NSPredicate predicate);
    @Mapping("enumerateEventsMatchingPredicate:usingBlock:")
    public native void enumerateEvents(NSPredicate predicate, @Block VoidBlock2<EKEvent, Todo> block);
    @Mapping("predicateForEventsWithStartDate:endDate:calendars:")
    public native NSPredicate getPredicateForEvents(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("saveReminder:commit:error:")
    protected native boolean saveReminder(EKReminder reminder, boolean commit, Todo error);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("removeReminder:commit:error:")
    protected native boolean removeReminder(EKReminder reminder, boolean commit, Todo error);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("fetchRemindersMatchingPredicate:completion:")
    public native Object fetchReminders(NSPredicate predicate, @Block VoidBlock1<NSArray<EKReminder>> completion);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("cancelFetchRequest:")
    public native void cancelFetchRequest(Object fetchIdentifier);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("predicateForRemindersInCalendars:")
    public native NSPredicate getPredicateForReminders(NSArray<EKCalendar> calendars);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
    public native NSPredicate getPredicateForIncompleteReminders(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
    public native NSPredicate getPredicateForCompletedReminders(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("commit:")
    protected native boolean commit(Todo error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("reset")
    public native void reset();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("refreshSourcesIfNecessary")
    public native void refreshSourcesIfNecessary();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("authorizationStatusForEntityType:")
    public static native @Representing("EKAuthorizationStatus") @MachineSizedSInt long getAuthorizationStatusForEntityType(@Representing("EKEntityType") int entityType);
    
}
