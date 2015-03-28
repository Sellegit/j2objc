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
@Library("EventKit/EventKit.h") @Mapping("EKRecurrenceEnd")
public class EKRecurrenceEnd 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public EKRecurrenceEnd() { }

    
    @Mapping("endDate")
    public native NSDate getEndDate();
    @Mapping("occurrenceCount")
    public native @MachineSizedUInt long getOccurrenceCount();

    
    
    @Mapping("recurrenceEndWithEndDate:")
    public static native EKRecurrenceEnd create(NSDate endDate);
    @Mapping("recurrenceEndWithOccurrenceCount:")
    public static native EKRecurrenceEnd create(@MachineSizedUInt long occurrenceCount);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
