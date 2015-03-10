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

@Library("UIKit") @Mapping("UINavigationController")
public class UINavigationController 
    extends UIViewController 
     {

    
    
    public UINavigationController() {}
    @Mapping("initWithRootViewController:")
    public UINavigationController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public UINavigationController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("topViewController")
    public native UIViewController getTopViewController();
    @Mapping("visibleViewController")
    public native UIViewController getVisibleViewController();
    @Mapping("viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Mapping("setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Mapping("isNavigationBarHidden")
    public native boolean isNavigationBarHidden();
    @Mapping("setNavigationBarHidden:")
    public native void setNavigationBarHidden(boolean v);
    @Mapping("navigationBar")
    public native UINavigationBar getNavigationBar();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isToolbarHidden")
    public native boolean isToolbarHidden();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setToolbarHidden:")
    public native void setToolbarHidden(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("toolbar")
    public native UIToolbar getToolbar();
    @Mapping("delegate")
    public native UINavigationControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UINavigationControllerDelegate v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("interactivePopGestureRecognizer")
    public native UIGestureRecognizer getInteractivePopGestureRecognizer();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hidesBarsWhenKeyboardAppears")
    public native boolean hidesBarsWhenKeyboardAppears();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHidesBarsWhenKeyboardAppears:")
    public native void setHidesBarsWhenKeyboardAppears(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hidesBarsOnSwipe")
    public native boolean hidesBarsOnSwipe();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHidesBarsOnSwipe:")
    public native void setHidesBarsOnSwipe(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("barHideOnSwipeGestureRecognizer")
    public native UIPanGestureRecognizer getBarHideOnSwipeGestureRecognizer();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hidesBarsWhenVerticallyCompact")
    public native boolean hidesBarsWhenVerticallyCompact();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHidesBarsWhenVerticallyCompact:")
    public native void setHidesBarsWhenVerticallyCompact(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("hidesBarsOnTap")
    public native boolean hidesBarsOnTap();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setHidesBarsOnTap:")
    public native void setHidesBarsOnTap(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("barHideOnTapGestureRecognizer")
    public native UITapGestureRecognizer getBarHideOnTapGestureRecognizer();
    
    
    
    @GlobalConstant("UINavigationControllerHideShowBarDuration")
    public static native @MachineSizedFloat double getHideShowBarDuration();
    
    @Mapping("pushViewController:animated:")
    public native void pushViewController(UIViewController viewController, boolean animated);
    @Mapping("popViewControllerAnimated:")
    public native UIViewController popViewController(boolean animated);
    @Mapping("popToViewController:animated:")
    public native NSArray<UIViewController> popToViewController(UIViewController viewController, boolean animated);
    @Mapping("popToRootViewControllerAnimated:")
    public native NSArray<UIViewController> popToRootViewController(boolean animated);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setViewControllers:animated:")
    public native void setViewControllers(NSArray<UIViewController> viewControllers, boolean animated);
    @Mapping("setNavigationBarHidden:animated:")
    public native void setNavigationBarHidden(boolean hidden, boolean animated);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setToolbarHidden:animated:")
    public native void setToolbarHidden(boolean hidden, boolean animated);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showViewController:sender:")
    public native void showViewController(UIViewController vc, Object sender);
    
}
