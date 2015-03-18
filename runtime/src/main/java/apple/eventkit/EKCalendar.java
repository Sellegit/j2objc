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

@Library("EventKit/EventKit.h") @Mapping("EKCalendar")
public class EKCalendar 
    extends EKObject 
     {

    
    
    @Mapping("init")
    public EKCalendar() { }
    
    
    @Mapping("source")
    public native EKSource getSource();
    @Mapping("setSource:")
    public native void setSource(EKSource v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("calendarIdentifier")
    public native String getCalendarIdentifier();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("type")
    public native EKCalendarType getType();
    @Mapping("allowsContentModifications")
    public native boolean allowsContentModifications();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isSubscribed")
    public native boolean isSubscribed();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isImmutable")
    public native boolean isImmutable();
    @Mapping("CGColor")
    public native CGColor getCGColor();
    @Mapping("setCGColor:")
    public native void setCGColor(CGColor v);
    @Mapping("supportedEventAvailabilities")
    public native @Representing("EKCalendarEventAvailabilityMask") int getSupportedEventAvailabilities();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowedEntityTypes")
    public native @Representing("EKEntityMask") int getAllowedEntityTypes();
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("calendarWithEventStore:")
    public static native EKCalendar create(EKEventStore eventStore);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarForEntityType:eventStore:")
    public static native EKCalendar create(@Representing("EKEntityType") int entityType, EKEventStore eventStore);
    
}
