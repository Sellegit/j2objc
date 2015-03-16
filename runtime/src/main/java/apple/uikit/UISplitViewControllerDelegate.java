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





@Library("UIKit/UIKit.h") @Mapping("UISplitViewControllerDelegate")
public interface UISplitViewControllerDelegate 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("splitViewController:willChangeToDisplayMode:")
    void willChangeToDisplayMode(UISplitViewController svc, @Representing("UISplitViewControllerDisplayMode") @MachineSizedSInt long displayMode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("targetDisplayModeForActionInSplitViewController:")
    @Representing("UISplitViewControllerDisplayMode") @MachineSizedSInt long getTargetDisplayMode(UISplitViewController svc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("splitViewController:showViewController:sender:")
    boolean showViewController(UISplitViewController splitViewController, UIViewController vc, Object sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("splitViewController:showDetailViewController:sender:")
    boolean showDetailViewController(UISplitViewController splitViewController, UIViewController vc, Object sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("primaryViewControllerForCollapsingSplitViewController:")
    UIViewController getPrimaryViewControllerForCollapsing(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("primaryViewControllerForExpandingSplitViewController:")
    UIViewController getPrimaryViewControllerForExpanding(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    boolean collapseSecondaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    UIViewController separateSecondaryViewController(UISplitViewController splitViewController, UIViewController primaryViewController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("splitViewControllerSupportedInterfaceOrientations:")
    @MachineSizedUInt long getSupportedInterfaceOrientations(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("splitViewControllerPreferredInterfaceOrientationForPresentation:")
    @Representing("UIInterfaceOrientation") @MachineSizedSInt long getPreferredInterfaceOrientation(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    void willHideViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("splitViewController:willShowViewController:invalidatingBarButtonItem:")
    void willShowViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("splitViewController:popoverController:willPresentViewController:")
    void willPresentViewController(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("splitViewController:shouldHideViewController:inOrientation:")
    boolean shouldHideViewController(UISplitViewController svc, UIViewController vc, @Representing("UIInterfaceOrientation") @MachineSizedSInt long orientation);
    
    /*<adapter>*/
    /*</adapter>*/
}
