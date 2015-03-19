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

@Library("UIKit/UIKit.h") @Mapping("UIAlertView")
public class UIAlertView 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:")
    public UIAlertView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIAlertView(NSCoder aDecoder) { }
    @Mapping("init")
    public UIAlertView() { }
    
    
    @Mapping("delegate")
    public native UIAlertViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIAlertViewDelegate v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("message")
    public native String getMessage();
    @Mapping("setMessage:")
    public native void setMessage(String v);
    @Mapping("numberOfButtons")
    public native @MachineSizedSInt long getNumberOfButtons();
    @Mapping("cancelButtonIndex")
    public native @MachineSizedSInt long getCancelButtonIndex();
    @Mapping("setCancelButtonIndex:")
    public native void setCancelButtonIndex(@MachineSizedSInt long v);
    @Mapping("firstOtherButtonIndex")
    public native @MachineSizedSInt long getFirstOtherButtonIndex();
    @Mapping("isVisible")
    public native boolean isVisible();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("alertViewStyle")
    public native @Representing("UIAlertViewStyle") long getAlertViewStyle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setAlertViewStyle:")
    public native void setAlertViewStyle(@Representing("UIAlertViewStyle") long v);
    
    
    
    @Mapping("addButtonWithTitle:")
    public native @MachineSizedSInt long addButton(String title);
    @Mapping("buttonTitleAtIndex:")
    public native String getButtonTitle(@MachineSizedSInt long buttonIndex);
    @Mapping("show")
    public native void show();
    @Mapping("dismissWithClickedButtonIndex:animated:")
    public native void dismiss(@MachineSizedSInt long buttonIndex, boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("textFieldAtIndex:")
    public native UITextField getTextField(@MachineSizedSInt long textFieldIndex);
    
}
