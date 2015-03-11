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
@Mapping("EKErrorCode")
public final class EKErrorCode extends ObjCEnum {
    
    @GlobalConstant("EKErrorEventNotMutable")
    public static final long EventNotMutable = 0L;
    @GlobalConstant("EKErrorNoCalendar")
    public static final long NoCalendar = 1L;
    @GlobalConstant("EKErrorNoStartDate")
    public static final long NoStartDate = 2L;
    @GlobalConstant("EKErrorNoEndDate")
    public static final long NoEndDate = 3L;
    @GlobalConstant("EKErrorDatesInverted")
    public static final long DatesInverted = 4L;
    @GlobalConstant("EKErrorInternalFailure")
    public static final long InternalFailure = 5L;
    @GlobalConstant("EKErrorCalendarReadOnly")
    public static final long CalendarReadOnly = 6L;
    @GlobalConstant("EKErrorDurationGreaterThanRecurrence")
    public static final long DurationGreaterThanRecurrence = 7L;
    @GlobalConstant("EKErrorAlarmGreaterThanRecurrence")
    public static final long AlarmGreaterThanRecurrence = 8L;
    @GlobalConstant("EKErrorStartDateTooFarInFuture")
    public static final long StartDateTooFarInFuture = 9L;
    @GlobalConstant("EKErrorStartDateCollidesWithOtherOccurrence")
    public static final long StartDateCollidesWithOtherOccurrence = 10L;
    @GlobalConstant("EKErrorObjectBelongsToDifferentStore")
    public static final long ObjectBelongsToDifferentStore = 11L;
    @GlobalConstant("EKErrorInvitesCannotBeMoved")
    public static final long InvitesCannotBeMoved = 12L;
    @GlobalConstant("EKErrorInvalidSpan")
    public static final long InvalidSpan = 13L;
    @GlobalConstant("EKErrorCalendarHasNoSource")
    public static final long CalendarHasNoSource = 14L;
    @GlobalConstant("EKErrorCalendarSourceCannotBeModified")
    public static final long CalendarSourceCannotBeModified = 15L;
    @GlobalConstant("EKErrorCalendarIsImmutable")
    public static final long CalendarIsImmutable = 16L;
    @GlobalConstant("EKErrorSourceDoesNotAllowCalendarAddDelete")
    public static final long SourceDoesNotAllowCalendarAddDelete = 17L;
    @GlobalConstant("EKErrorRecurringReminderRequiresDueDate")
    public static final long RecurringReminderRequiresDueDate = 18L;
    @GlobalConstant("EKErrorStructuredLocationsNotSupported")
    public static final long StructuredLocationsNotSupported = 19L;
    @GlobalConstant("EKErrorReminderLocationsNotSupported")
    public static final long ReminderLocationsNotSupported = 20L;
    @GlobalConstant("EKErrorAlarmProximityNotSupported")
    public static final long AlarmProximityNotSupported = 21L;
    @GlobalConstant("EKErrorCalendarDoesNotAllowEvents")
    public static final long CalendarDoesNotAllowEvents = 22L;
    @GlobalConstant("EKErrorCalendarDoesNotAllowReminders")
    public static final long CalendarDoesNotAllowReminders = 23L;
    @GlobalConstant("EKErrorSourceDoesNotAllowReminders")
    public static final long SourceDoesNotAllowReminders = 24L;
    @GlobalConstant("EKErrorPriorityIsInvalid")
    public static final long PriorityIsInvalid = 25L;
    @GlobalConstant("EKErrorInvalidEntityType")
    public static final long InvalidEntityType = 26L;
    @GlobalConstant("EKErrorLast")
    public static final long Last = 27L;
    

}
