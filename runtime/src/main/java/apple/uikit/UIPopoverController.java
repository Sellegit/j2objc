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
 * @since Available in iOS 3.2 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIPopoverController")
public class UIPopoverController 
    extends NSObject 
    implements UIAppearanceContainer {

    
    
    @Mapping("initWithContentViewController:")
    public UIPopoverController(UIViewController viewController) { }
    @Mapping("init")
    public UIPopoverController() { }

    
    @Mapping("delegate")
    public native UIPopoverControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIPopoverControllerDelegate v);
    @Mapping("contentViewController")
    public native UIViewController getContentViewController();
    @Mapping("setContentViewController:")
    public native void setContentViewController(UIViewController v);
    @Mapping("popoverContentSize")
    public native CGSize getPopoverContentSize();
    @Mapping("setPopoverContentSize:")
    public native void setPopoverContentSize(CGSize v);
    @Mapping("isPopoverVisible")
    public native boolean isPopoverVisible();
    @Mapping("popoverArrowDirection")
    public native @Representing("UIPopoverArrowDirection") long getPopoverArrowDirection();
    @Mapping("passthroughViews")
    public native NSArray<UIView> getPassthroughViews();
    @Mapping("setPassthroughViews:")
    public native void setPassthroughViews(NSArray<UIView> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("backgroundColor")
    public native UIColor getBackgroundColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("popoverLayoutMargins")
    public native UIEdgeInsets getPopoverLayoutMargins();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setPopoverLayoutMargins:")
    public native void setPopoverLayoutMargins(UIEdgeInsets v);

    
    
    @Mapping("setContentViewController:animated:")
    public native void setContentViewController(UIViewController viewController, boolean animated);
    @Mapping("setPopoverContentSize:animated:")
    public native void setPopoverContentSize(CGSize size, boolean animated);
    @Mapping("presentPopoverFromRect:inView:permittedArrowDirections:animated:")
    public native void presentFromRectInView(CGRect rect, UIView view, @Representing("UIPopoverArrowDirection") long arrowDirections, boolean animated);
    @Mapping("presentPopoverFromBarButtonItem:permittedArrowDirections:animated:")
    public native void presentFromBarButtonItem(UIBarButtonItem item, @Representing("UIPopoverArrowDirection") long arrowDirections, boolean animated);
    @Mapping("dismissPopoverAnimated:")
    public native void dismiss(boolean animated);

}
