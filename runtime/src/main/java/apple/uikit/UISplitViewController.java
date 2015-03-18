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

@Library("UIKit/UIKit.h") @Mapping("UISplitViewController")
public class UISplitViewController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithNibName:bundle:")
    public UISplitViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public UISplitViewController() { }
    
    
    @Mapping("viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Mapping("setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Mapping("delegate")
    public native UISplitViewControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UISplitViewControllerDelegate v);
    /**
     * @since Available in iOS 5.1 and later.
     */
    @Mapping("presentsWithGesture")
    public native boolean presentsWithGesture();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @Mapping("setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isCollapsed")
    public native boolean isCollapsed();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredDisplayMode")
    public native @Representing("UISplitViewControllerDisplayMode") @MachineSizedSInt long getPreferredDisplayMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreferredDisplayMode:")
    public native void setPreferredDisplayMode(@Representing("UISplitViewControllerDisplayMode") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("displayMode")
    public native @Representing("UISplitViewControllerDisplayMode") @MachineSizedSInt long getDisplayMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredPrimaryColumnWidthFraction")
    public native @MachineSizedFloat double getPreferredPrimaryColumnWidthFraction();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPreferredPrimaryColumnWidthFraction:")
    public native void setPreferredPrimaryColumnWidthFraction(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("minimumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMinimumPrimaryColumnWidth();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setMinimumPrimaryColumnWidth:")
    public native void setMinimumPrimaryColumnWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("maximumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMaximumPrimaryColumnWidth();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setMaximumPrimaryColumnWidth:")
    public native void setMaximumPrimaryColumnWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("primaryColumnWidth")
    public native @MachineSizedFloat double getPrimaryColumnWidth();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UISplitViewControllerAutomaticDimension")
    public static native @MachineSizedFloat double getAutomaticDimension();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("displayModeButtonItem")
    public native UIBarButtonItem getDisplayModeButtonItem();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showViewController:sender:")
    public native void showViewController(UIViewController vc, Object sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("showDetailViewController:sender:")
    public native void showDetailViewController(UIViewController vc, Object sender);
    
}
