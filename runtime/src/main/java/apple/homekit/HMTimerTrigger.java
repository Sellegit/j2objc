package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HomeKit/HomeKit.h") @Mapping("HMTimerTrigger")
public class HMTimerTrigger 
    extends HMTrigger 
     {

    
    
    public HMTimerTrigger() {}
    @Mapping("initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:")
    public HMTimerTrigger(String name, NSDate fireDate, NSTimeZone timeZone, NSDateComponents recurrence, NSCalendar recurrenceCalendar) { }
    
    
    @Mapping("fireDate")
    public native NSDate getFireDate();
    @Mapping("timeZone")
    public native NSTimeZone getTimeZone();
    @Mapping("recurrence")
    public native NSDateComponents getRecurrence();
    @Mapping("recurrenceCalendar")
    public native NSCalendar getRecurrenceCalendar();
    
    
    
    @Mapping("updateFireDate:completionHandler:")
    public native void updateFireDate(NSDate fireDate, @Block VoidBlock1<NSError> completion);
    @Mapping("updateTimeZone:completionHandler:")
    public native void updateTimeZone(NSTimeZone timeZone, @Block VoidBlock1<NSError> completion);
    @Mapping("updateRecurrence:completionHandler:")
    public native void updateRecurrence(NSDateComponents recurrence, @Block VoidBlock1<NSError> completion);
    
}
