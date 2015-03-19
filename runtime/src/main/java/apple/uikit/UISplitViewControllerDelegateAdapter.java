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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UISplitViewControllerDelegateAdapter 
    extends Object 
    implements UISplitViewControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("splitViewController:willChangeToDisplayMode:")
    public void willChangeToDisplayMode(UISplitViewController svc, @Representing("UISplitViewControllerDisplayMode") long displayMode) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("targetDisplayModeForActionInSplitViewController:")
    public @Representing("UISplitViewControllerDisplayMode") long getTargetDisplayMode(UISplitViewController svc) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("splitViewController:showViewController:sender:")
    public boolean showViewController(UISplitViewController splitViewController, UIViewController vc, Object sender) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("splitViewController:showDetailViewController:sender:")
    public boolean showDetailViewController(UISplitViewController splitViewController, UIViewController vc, Object sender) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("primaryViewControllerForCollapsingSplitViewController:")
    public UIViewController getPrimaryViewControllerForCollapsing(UISplitViewController splitViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("primaryViewControllerForExpandingSplitViewController:")
    public UIViewController getPrimaryViewControllerForExpanding(UISplitViewController splitViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    public boolean collapseSecondaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    public UIViewController separateSecondaryViewController(UISplitViewController splitViewController, UIViewController primaryViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("splitViewControllerSupportedInterfaceOrientations:")
    public @MachineSizedUInt long getSupportedInterfaceOrientations(UISplitViewController splitViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("splitViewControllerPreferredInterfaceOrientationForPresentation:")
    public @Representing("UIInterfaceOrientation") long getPreferredInterfaceOrientation(UISplitViewController splitViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    public void willHideViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("splitViewController:willShowViewController:invalidatingBarButtonItem:")
    public void willShowViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("splitViewController:popoverController:willPresentViewController:")
    public void willPresentViewController(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("splitViewController:shouldHideViewController:inOrientation:")
    public boolean shouldHideViewController(UISplitViewController svc, UIViewController vc, @Representing("UIInterfaceOrientation") long orientation) { throw new UnsupportedOperationException(); }
    
}
