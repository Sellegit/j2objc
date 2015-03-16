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

@Library("EventKit/EventKit.h") @Mapping("EKAlarm")
public class EKAlarm 
    extends EKObject 
    implements NSCopying {

    
    
    public EKAlarm() {}
    
    
    @Mapping("relativeOffset")
    public native double getRelativeOffset();
    @Mapping("setRelativeOffset:")
    public native void setRelativeOffset(double v);
    @Mapping("absoluteDate")
    public native NSDate getAbsoluteDate();
    @Mapping("setAbsoluteDate:")
    public native void setAbsoluteDate(NSDate v);
    @Mapping("structuredLocation")
    public native EKStructuredLocation getStructuredLocation();
    @Mapping("setStructuredLocation:")
    public native void setStructuredLocation(EKStructuredLocation v);
    @Mapping("proximity")
    public native @Representing("EKAlarmProximity") int getProximity();
    @Mapping("setProximity:")
    public native void setProximity(@Representing("EKAlarmProximity") int v);
    
    
    
    @Mapping("alarmWithAbsoluteDate:")
    public static native EKAlarm create(NSDate date);
    @Mapping("alarmWithRelativeOffset:")
    public static native EKAlarm create(double offset);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
