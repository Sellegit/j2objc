package apple.eventkitui;


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
import apple.eventkit.*;
import apple.uikit.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("EventKitUI/EventKitUI.h") @Mapping("EKCalendarChooser")
public class EKCalendarChooser 
    extends UIViewController 
     {

    
    
    public EKCalendarChooser() {}
    @Mapping("initWithSelectionStyle:displayStyle:eventStore:")
    public EKCalendarChooser(EKCalendarChooserSelectionStyle selectionStyle, EKCalendarChooserDisplayStyle displayStyle, EKEventStore eventStore) { }
    @Mapping("initWithSelectionStyle:displayStyle:entityType:eventStore:")
    public EKCalendarChooser(EKCalendarChooserSelectionStyle style, EKCalendarChooserDisplayStyle displayStyle, @Representing("EKEntityType") int entityType, EKEventStore eventStore) { }
    @Mapping("initWithNibName:bundle:")
    public EKCalendarChooser(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("selectionStyle")
    public native EKCalendarChooserSelectionStyle getSelectionStyle();
    @Mapping("delegate")
    public native EKCalendarChooserDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(EKCalendarChooserDelegate v);
    @Mapping("showsDoneButton")
    public native boolean showsDoneButton();
    @Mapping("setShowsDoneButton:")
    public native void setShowsDoneButton(boolean v);
    @Mapping("showsCancelButton")
    public native boolean showsCancelButton();
    @Mapping("setShowsCancelButton:")
    public native void setShowsCancelButton(boolean v);
    @Mapping("selectedCalendars")
    public native NSSet<EKCalendar> getSelectedCalendars();
    @Mapping("setSelectedCalendars:")
    public native void setSelectedCalendars(NSSet<EKCalendar> v);
    
    
    
    
    
}
