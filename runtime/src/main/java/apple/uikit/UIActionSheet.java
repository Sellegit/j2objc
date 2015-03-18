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

@Library("UIKit/UIKit.h") @Mapping("UIActionSheet")
public class UIActionSheet 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:")
    public UIActionSheet(CGRect frame) { }
    @Mapping("init")
    public UIActionSheet() { }
    
    
    @Mapping("delegate")
    public native UIActionSheetDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIActionSheetDelegate v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("actionSheetStyle")
    public native @Representing("UIActionSheetStyle") @MachineSizedSInt long getActionSheetStyle();
    @Mapping("setActionSheetStyle:")
    public native void setActionSheetStyle(@Representing("UIActionSheetStyle") @MachineSizedSInt long v);
    @Mapping("numberOfButtons")
    public native @MachineSizedSInt long getNumberOfButtons();
    @Mapping("cancelButtonIndex")
    public native @MachineSizedSInt long getCancelButtonIndex();
    @Mapping("setCancelButtonIndex:")
    public native void setCancelButtonIndex(@MachineSizedSInt long v);
    @Mapping("destructiveButtonIndex")
    public native @MachineSizedSInt long getDestructiveButtonIndex();
    @Mapping("setDestructiveButtonIndex:")
    public native void setDestructiveButtonIndex(@MachineSizedSInt long v);
    @Mapping("firstOtherButtonIndex")
    public native @MachineSizedSInt long getFirstOtherButtonIndex();
    @Mapping("isVisible")
    public native boolean isVisible();
    
    
    
    @Mapping("addButtonWithTitle:")
    public native @MachineSizedSInt long addButton(String title);
    @Mapping("buttonTitleAtIndex:")
    public native String getButtonTitle(@MachineSizedSInt long buttonIndex);
    @Mapping("showFromToolbar:")
    public native void showFrom(UIToolbar view);
    @Mapping("showFromTabBar:")
    public native void showFrom(UITabBar view);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("showFromBarButtonItem:animated:")
    public native void showFrom(UIBarButtonItem item, boolean animated);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("showFromRect:inView:animated:")
    public native void showFrom(CGRect rect, UIView view, boolean animated);
    @Mapping("showInView:")
    public native void showIn(UIView view);
    @Mapping("dismissWithClickedButtonIndex:animated:")
    public native void dismiss(@MachineSizedSInt long buttonIndex, boolean animated);
    
}
