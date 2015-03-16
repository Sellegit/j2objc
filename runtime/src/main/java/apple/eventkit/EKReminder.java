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
 * @since Available in iOS 6.0 and later.
 */

@Library("EventKit/EventKit.h") @Mapping("EKReminder")
public class EKReminder 
    extends EKCalendarItem 
     {

    
    
    public EKReminder() {}
    
    
    @Mapping("startDateComponents")
    public native NSDateComponents getStartDateComponents();
    @Mapping("setStartDateComponents:")
    public native void setStartDateComponents(NSDateComponents v);
    @Mapping("dueDateComponents")
    public native NSDateComponents getDueDateComponents();
    @Mapping("setDueDateComponents:")
    public native void setDueDateComponents(NSDateComponents v);
    @Mapping("isCompleted")
    public native boolean isCompleted();
    @Mapping("setCompleted:")
    public native void setCompleted(boolean v);
    @Mapping("completionDate")
    public native NSDate getCompletionDate();
    @Mapping("setCompletionDate:")
    public native void setCompletionDate(NSDate v);
    @Mapping("priority")
    public native @MachineSizedSInt long getPriority();
    @Mapping("setPriority:")
    public native void setPriority(@MachineSizedSInt long v);
    
    
    
    @Mapping("reminderWithEventStore:")
    public static native EKReminder create(EKEventStore eventStore);
    
}
