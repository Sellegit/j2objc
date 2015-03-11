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

@Library("EventKitUI") @Mapping("EKEventEditViewController")
public class EKEventEditViewController 
    extends UINavigationController 
     {

    
    
    public EKEventEditViewController() {}
    @Mapping("initWithRootViewController:")
    public EKEventEditViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public EKEventEditViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("editViewDelegate")
    public native EKEventEditViewDelegate getEditViewDelegate();
    @Mapping("setEditViewDelegate:")
    public native void setEditViewDelegate(EKEventEditViewDelegate v);
    @Mapping("eventStore")
    public native EKEventStore getEventStore();
    @Mapping("setEventStore:")
    public native void setEventStore(EKEventStore v);
    @Mapping("event")
    public native EKEvent getEvent();
    @Mapping("setEvent:")
    public native void setEvent(EKEvent v);
    
    
    
    @Mapping("cancelEditing")
    public native void cancelEditing();
    
}
