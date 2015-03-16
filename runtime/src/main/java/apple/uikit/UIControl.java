package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIControl")
public class UIControl 
    extends UIView 
     {

    
    
    public UIControl() {}
    @Mapping("initWithFrame:")
    public UIControl(CGRect frame) { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("isSelected")
    public native boolean isSelected();
    @Mapping("setSelected:")
    public native void setSelected(boolean v);
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    @Mapping("setHighlighted:")
    public native void setHighlighted(boolean v);
    @Mapping("contentVerticalAlignment")
    public native @Representing("UIControlContentVerticalAlignment") @MachineSizedSInt long getContentVerticalAlignment();
    @Mapping("setContentVerticalAlignment:")
    public native void setContentVerticalAlignment(@Representing("UIControlContentVerticalAlignment") @MachineSizedSInt long v);
    @Mapping("contentHorizontalAlignment")
    public native @Representing("UIControlContentHorizontalAlignment") @MachineSizedSInt long getContentHorizontalAlignment();
    @Mapping("setContentHorizontalAlignment:")
    public native void setContentHorizontalAlignment(@Representing("UIControlContentHorizontalAlignment") @MachineSizedSInt long v);
    @Mapping("state")
    public native @Representing("UIControlState") @MachineSizedUInt long getState();
    @Mapping("isTracking")
    public native boolean isTracking();
    @Mapping("isTouchInside")
    public native boolean isTouchInside();
    
    
    
    @Mapping("beginTrackingWithTouch:withEvent:")
    public native boolean beginTracking(UITouch touch, UIEvent event);
    @Mapping("continueTrackingWithTouch:withEvent:")
    public native boolean continueTracking(UITouch touch, UIEvent event);
    @Mapping("endTrackingWithTouch:withEvent:")
    public native void endTracking(UITouch touch, UIEvent event);
    @Mapping("cancelTrackingWithEvent:")
    public native void cancelTracking(UIEvent event);
    @Mapping("addTarget:action:forControlEvents:")
    public native void addTarget(Object target, Selector action, @Representing("UIControlEvents") @MachineSizedUInt long controlEvents);
    @Mapping("removeTarget:action:forControlEvents:")
    public native void removeTarget(Object target, Selector action, @Representing("UIControlEvents") @MachineSizedUInt long controlEvents);
    @Mapping("allTargets")
    public native NSSet<?> getAllTargets();
    @Mapping("allControlEvents")
    public native @Representing("UIControlEvents") @MachineSizedUInt long getAllControlEvents();
    @Mapping("actionsForTarget:forControlEvent:")
    public native List<String> getActions(Object target, @Representing("UIControlEvents") @MachineSizedUInt long controlEvent);
    @Mapping("sendAction:to:forEvent:")
    public native void sendAction(Selector action, Object target, UIEvent event);
    @Mapping("sendActionsForControlEvents:")
    public native void sendControlEventsActions(@Representing("UIControlEvents") @MachineSizedUInt long controlEvents);
    
}
