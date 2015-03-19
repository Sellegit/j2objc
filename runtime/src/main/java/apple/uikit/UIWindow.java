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

@Library("UIKit/UIKit.h") @Mapping("UIWindow")
public class UIWindow 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:")
    public UIWindow(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIWindow(NSCoder aDecoder) { }
    @Mapping("init")
    public UIWindow() { }
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("screen")
    public native UIScreen getScreen();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setScreen:")
    public native void setScreen(UIScreen v);
    @Mapping("windowLevel")
    public native @MachineSizedFloat double getWindowLevel();
    @Mapping("setWindowLevel:")
    public native void setWindowLevel(@MachineSizedFloat double v);
    @Mapping("isKeyWindow")
    public native boolean isKeyWindow();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("rootViewController")
    public native UIViewController getRootViewController();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("setRootViewController:")
    public native void setRootViewController(UIViewController v);
    
    
    
    @GlobalConstant("UIWindowDidBecomeVisibleNotification")
    public static native NSString DidBecomeVisibleNotification();
    @GlobalConstant("UIWindowDidBecomeHiddenNotification")
    public static native NSString DidBecomeHiddenNotification();
    @GlobalConstant("UIWindowDidBecomeKeyNotification")
    public static native NSString DidBecomeKeyNotification();
    @GlobalConstant("UIWindowDidResignKeyNotification")
    public static native NSString DidResignKeyNotification();
    @GlobalConstant("UIKeyboardWillShowNotification")
    public static native NSString KeyboardWillShowNotification();
    @GlobalConstant("UIKeyboardDidShowNotification")
    public static native NSString KeyboardDidShowNotification();
    @GlobalConstant("UIKeyboardWillHideNotification")
    public static native NSString KeyboardWillHideNotification();
    @GlobalConstant("UIKeyboardDidHideNotification")
    public static native NSString KeyboardDidHideNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIKeyboardWillChangeFrameNotification")
    public static native NSString KeyboardWillChangeFrameNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("UIKeyboardDidChangeFrameNotification")
    public static native NSString KeyboardDidChangeFrameNotification();
    
    @Mapping("becomeKeyWindow")
    public native void becomeKeyWindow();
    @Mapping("resignKeyWindow")
    public native void resignKeyWindow();
    @Mapping("makeKeyWindow")
    public native void makeKeyWindow();
    @Mapping("makeKeyAndVisible")
    public native void makeKeyAndVisible();
    @Mapping("sendEvent:")
    public native void sendEvent(UIEvent event);
    @Mapping("convertPoint:toWindow:")
    public native CGPoint convertPointToWindow(CGPoint point, UIWindow window);
    @Mapping("convertPoint:fromWindow:")
    public native CGPoint convertPointFromWindow(CGPoint point, UIWindow window);
    @Mapping("convertRect:toWindow:")
    public native CGRect convertRectToWindow(CGRect rect, UIWindow window);
    @Mapping("convertRect:fromWindow:")
    public native CGRect convertRectFromWindow(CGRect rect, UIWindow window);
    
}
