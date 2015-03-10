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
 * @since Available in iOS 4.0 and later.
 */

@Library("EventKitUI") @Mapping("EKEventViewController")
public class EKEventViewController 
    extends UIViewController 
     {

    
    
    public EKEventViewController() {}
    @Mapping("initWithNibName:bundle:")
    public EKEventViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @Mapping("delegate")
    public native EKEventViewDelegate getDelegate();
    /**
     * @since Available in iOS 4.2 and later.
     */
    public native void setDelegate(EKEventViewDelegate v);
    @Mapping("event")
    public native EKEvent getEvent();
    public native void setEvent(EKEvent v);
    @Mapping("allowsEditing")
    public native boolean allowsEditing();
    public native void setAllowsEditing(boolean v);
    @Mapping("allowsCalendarPreview")
    public native boolean allowsCalendarPreview();
    public native void setAllowsCalendarPreview(boolean v);
    
    
    
    
    
}
