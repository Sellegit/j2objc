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
@Library("EventKit/EventKit.h") @Mapping("EKSource")
public class EKSource 
    extends EKObject 
     {

    
    
    @Mapping("init")
    public EKSource() { }

    
    @Mapping("sourceIdentifier")
    public native String getSourceIdentifier();
    @Mapping("sourceType")
    public native EKSourceType getSourceType();
    @Mapping("title")
    public native String getTitle();
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("calendars")
    public native NSSet<EKCalendar> getCalendars();

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("calendarsForEntityType:")
    public native NSSet<EKCalendar> getCalendars(@Representing("EKEntityType") long entityType);

}
