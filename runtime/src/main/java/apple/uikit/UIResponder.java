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

@Library("UIKit") @Mapping("UIResponder")
public class UIResponder 
    extends NSObject 
     {

    
    
    public UIResponder() {}
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("undoManager")
    public native NSUndoManager getUndoManager();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("keyCommands")
    public native NSArray<UIKeyCommand> getKeyCommands();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("inputView")
    public native UIView getInputView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("inputAccessoryView")
    public native UIView getInputAccessoryView();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("inputViewController")
    public native UIInputViewController getInputViewController();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("inputAccessoryViewController")
    public native UIInputViewController getInputAccessoryViewController();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textInputMode")
    public native UITextInputMode getTextInputMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textInputContextIdentifier")
    public native String getTextInputContextIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("userActivity")
    public native NSUserActivity getUserActivity();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setUserActivity:")
    public native void setUserActivity(NSUserActivity v);
    
    
    
    @Mapping("nextResponder")
    public native UIResponder getNextResponder();
    @Mapping("canBecomeFirstResponder")
    public native boolean canBecomeFirstResponder();
    @Mapping("becomeFirstResponder")
    public native boolean becomeFirstResponder();
    @Mapping("canResignFirstResponder")
    public native boolean canResignFirstResponder();
    @Mapping("resignFirstResponder")
    public native boolean resignFirstResponder();
    @Mapping("isFirstResponder")
    public native boolean isFirstResponder();
    @Mapping("touchesBegan:withEvent:")
    public native void touchesBegan(NSSet<?> touches, UIEvent event);
    @Mapping("touchesMoved:withEvent:")
    public native void touchesMoved(NSSet<?> touches, UIEvent event);
    @Mapping("touchesEnded:withEvent:")
    public native void touchesEnded(NSSet<?> touches, UIEvent event);
    @Mapping("touchesCancelled:withEvent:")
    public native void touchesCancelled(NSSet<?> touches, UIEvent event);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("motionBegan:withEvent:")
    public native void motionBegan(@Representing("UIEventSubtype") @MachineSizedSInt long motion, UIEvent event);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("motionEnded:withEvent:")
    public native void motionEnded(@Representing("UIEventSubtype") @MachineSizedSInt long motion, UIEvent event);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("motionCancelled:withEvent:")
    public native void motionCancelled(@Representing("UIEventSubtype") @MachineSizedSInt long motion, UIEvent event);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("remoteControlReceivedWithEvent:")
    public native void remoteControlReceived(UIEvent event);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("canPerformAction:withSender:")
    public native boolean canPerformAction(Selector action, Object sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("targetForAction:withSender:")
    public native Object getActionTarget(Selector action, Object sender);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("reloadInputViews")
    public native void reloadInputViews();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("updateUserActivityState:")
    public native void updateUserActivityState(NSUserActivity activity);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("restoreUserActivityState:")
    public native void restoreUserActivityState(NSUserActivity activity);
    
}
