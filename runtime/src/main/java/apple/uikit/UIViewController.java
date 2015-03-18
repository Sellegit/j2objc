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

@Library("UIKit/UIKit.h") @Mapping("UIViewController")
public class UIViewController 
    extends UIResponder 
    implements NSCoding, UIAppearanceContainer, UITraitEnvironment, UIStateRestoring, NSExtensionRequestHandling {

    
    
    @Mapping("initWithNibName:bundle:")
    public UIViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public UIViewController() { }
    
    
    @Mapping("view")
    public native UIView getView();
    @Mapping("setView:")
    public native void setView(UIView v);
    @Mapping("nibName")
    public native String getNibName();
    @Mapping("nibBundle")
    public native NSBundle getNibBundle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("storyboard")
    public native UIStoryboard getStoryboard();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("parentViewController")
    public native UIViewController getParentViewController();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("modalViewController")
    public native UIViewController getModalViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("presentedViewController")
    public native UIViewController getPresentedViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("presentingViewController")
    public native UIViewController getPresentingViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("definesPresentationContext")
    public native boolean definesPresentationContext();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setDefinesPresentationContext:")
    public native void setDefinesPresentationContext(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("providesPresentationContextTransitionStyle")
    public native boolean providesPresentationContextTransitionStyle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setProvidesPresentationContextTransitionStyle:")
    public native void setProvidesPresentationContextTransitionStyle(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("modalTransitionStyle")
    public native @Representing("UIModalTransitionStyle") @MachineSizedSInt long getModalTransitionStyle();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setModalTransitionStyle:")
    public native void setModalTransitionStyle(@Representing("UIModalTransitionStyle") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("modalPresentationStyle")
    public native @Representing("UIModalPresentationStyle") @MachineSizedSInt long getModalPresentationStyle();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setModalPresentationStyle:")
    public native void setModalPresentationStyle(@Representing("UIModalPresentationStyle") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("modalPresentationCapturesStatusBarAppearance")
    public native boolean modalPresentationCapturesStatusBarAppearance();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setModalPresentationCapturesStatusBarAppearance:")
    public native void setModalPresentationCapturesStatusBarAppearance(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("wantsFullScreenLayout")
    public native boolean wantsFullScreenLayout();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setWantsFullScreenLayout:")
    public native void setWantsFullScreenLayout(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("edgesForExtendedLayout")
    public native @Representing("UIRectEdge") @MachineSizedUInt long getEdgesForExtendedLayout();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setEdgesForExtendedLayout:")
    public native void setEdgesForExtendedLayout(@Representing("UIRectEdge") @MachineSizedUInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("extendedLayoutIncludesOpaqueBars")
    public native boolean extendedLayoutIncludesOpaqueBars();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setExtendedLayoutIncludesOpaqueBars:")
    public native void setExtendedLayoutIncludesOpaqueBars(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("automaticallyAdjustsScrollViewInsets")
    public native boolean automaticallyAdjustsScrollViewInsets();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setAutomaticallyAdjustsScrollViewInsets:")
    public native void setAutomaticallyAdjustsScrollViewInsets(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredContentSize")
    public native CGSize getPreferredContentSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setPreferredContentSize:")
    public native void setPreferredContentSize(CGSize v);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("interfaceOrientation")
    public native @Representing("UIInterfaceOrientation") @MachineSizedSInt long getInterfaceOrientation();
    @Mapping("isEditing")
    public native boolean isEditing();
    @Mapping("setEditing:")
    public native void setEditing(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("searchDisplayController")
    public native UISearchDisplayController getSearchDisplayController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("childViewControllers")
    public native NSArray<UIViewController> getChildViewControllers();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("restorationIdentifier")
    public native String getRestorationIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("restorationClass")
    public native ObjCClass getRestorationClass();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRestorationClass:")
    public native void setRestorationClass(ObjCClass v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("transitioningDelegate")
    public native UIViewControllerTransitioningDelegate getTransitioningDelegate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTransitioningDelegate:")
    public native void setTransitioningDelegate(UIViewControllerTransitioningDelegate v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("topLayoutGuide")
    public native UILayoutSupport getTopLayoutGuide();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("bottomLayoutGuide")
    public native UILayoutSupport getBottomLayoutGuide();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("extensionContext")
    public native NSExtensionContext getExtensionContext();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("presentationController")
    public native UIPresentationController getPresentationController();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("popoverPresentationController")
    public native UIPopoverPresentationController getPopoverPresentationController();
    @Mapping("navigationItem")
    public native UINavigationItem getNavigationItem();
    @Mapping("hidesBottomBarWhenPushed")
    public native boolean hidesBottomBarWhenPushed();
    @Mapping("setHidesBottomBarWhenPushed:")
    public native void setHidesBottomBarWhenPushed(boolean v);
    @Mapping("navigationController")
    public native UINavigationController getNavigationController();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("toolbarItems")
    public native NSArray<UIBarButtonItem> getToolbarItems();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setToolbarItems:")
    public native void setToolbarItems(NSArray<UIBarButtonItem> v);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("isModalInPopover")
    public native boolean isModalInPopover();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("setModalInPopover:")
    public native void setModalInPopover(boolean v);
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("contentSizeForViewInPopover")
    public native CGSize getContentSizeForViewInPopover();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setContentSizeForViewInPopover:")
    public native void setContentSizeForViewInPopover(CGSize v);
    @Mapping("splitViewController")
    public native UISplitViewController getSplitViewController();
    @Mapping("tabBarItem")
    public native UITabBarItem getTabBarItem();
    @Mapping("setTabBarItem:")
    public native void setTabBarItem(UITabBarItem v);
    @Mapping("tabBarController")
    public native UITabBarController getTabBarController();
    @Mapping("traitCollection")
    public native UITraitCollection getTraitCollection();
    @Mapping("restorationParent")
    public native UIStateRestoring getRestorationParent();
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIViewControllerShowDetailTargetDidChangeNotification")
    public static native NSString ShowDetailTargetDidChangeNotification();
    
    @Mapping("loadView")
    public native void loadView();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("viewWillUnload")
    public native void viewWillUnload();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("viewDidUnload")
    public native void viewDidUnload();
    @Mapping("viewDidLoad")
    public native void viewDidLoad();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("isViewLoaded")
    public native boolean isViewLoaded();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("performSegueWithIdentifier:sender:")
    public native void performSegue(String identifier, Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldPerformSegueWithIdentifier:sender:")
    public native boolean shouldPerformSegue(String identifier, Object sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("prepareForSegue:sender:")
    public native void prepareForSegue(UIStoryboardSegue segue, Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("canPerformUnwindSegueAction:fromViewController:withSender:")
    public native boolean canPerformUnwind(Selector action, UIViewController fromViewController, Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("viewControllerForUnwindSegueAction:fromViewController:withSender:")
    public native UIViewController getViewControllerForUnwind(Selector action, UIViewController fromViewController, Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("segueForUnwindingToViewController:fromViewController:identifier:")
    public native UIStoryboardSegue getSegueForUnwinding(UIViewController toViewController, UIViewController fromViewController, String identifier);
    @Mapping("viewWillAppear:")
    public native void viewWillAppear(boolean animated);
    @Mapping("viewDidAppear:")
    public native void viewDidAppear(boolean animated);
    @Mapping("viewWillDisappear:")
    public native void viewWillDisappear(boolean animated);
    @Mapping("viewDidDisappear:")
    public native void viewDidDisappear(boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("viewWillLayoutSubviews")
    public native void viewWillLayoutSubviews();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("viewDidLayoutSubviews")
    public native void viewDidLayoutSubviews();
    @Mapping("didReceiveMemoryWarning")
    public native void didReceiveMemoryWarning();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isBeingPresented")
    public native boolean isBeingPresented();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isBeingDismissed")
    public native boolean isBeingDismissed();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isMovingToParentViewController")
    public native boolean isMovingToParentViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("isMovingFromParentViewController")
    public native boolean isMovingFromParentViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("presentViewController:animated:completion:")
    public native void presentViewController(UIViewController viewControllerToPresent, boolean flag, @Block Runnable completion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("dismissViewControllerAnimated:completion:")
    public native void dismissViewController(boolean flag, @Block Runnable completion);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("presentModalViewController:animated:")
    public native void presentModalViewController(UIViewController modalViewController, boolean animated);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("dismissModalViewControllerAnimated:")
    public native void dismissModalViewController(boolean animated);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Mapping("disablesAutomaticKeyboardDismissal")
    public native boolean disablesAutomaticKeyboardDismissal();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredStatusBarStyle")
    public native @Representing("UIStatusBarStyle") @MachineSizedSInt long getPreferredStatusBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("prefersStatusBarHidden")
    public native boolean prefersStatusBarHidden();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredStatusBarUpdateAnimation")
    public native @Representing("UIStatusBarAnimation") @MachineSizedSInt long getPreferredStatusBarUpdateAnimation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setNeedsStatusBarAppearanceUpdate")
    public native void setNeedsStatusBarAppearanceUpdate();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("targetViewControllerForAction:sender:")
    public native UIViewController getTargetViewControllerForAction(Selector action, Object sender);
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
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("shouldAutorotateToInterfaceOrientation:")
    public native boolean shouldAutorotate(@Representing("UIInterfaceOrientation") @MachineSizedSInt long toInterfaceOrientation);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldAutorotate")
    public native boolean shouldAutorotate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("supportedInterfaceOrientations")
    public native UIInterfaceOrientationMask getSupportedInterfaceOrientations();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("preferredInterfaceOrientationForPresentation")
    public native @Representing("UIInterfaceOrientation") @MachineSizedSInt long getPreferredInterfaceOrientation();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("rotatingHeaderView")
    public native UIView getRotatingHeaderView();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("rotatingFooterView")
    public native UIView getRotatingFooterView();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("willRotateToInterfaceOrientation:duration:")
    public native void willRotate(@Representing("UIInterfaceOrientation") @MachineSizedSInt long toInterfaceOrientation, double duration);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("didRotateFromInterfaceOrientation:")
    public native void didRotate(@Representing("UIInterfaceOrientation") @MachineSizedSInt long fromInterfaceOrientation);
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("willAnimateRotationToInterfaceOrientation:duration:")
    public native void willAnimateRotation(@Representing("UIInterfaceOrientation") @MachineSizedSInt long toInterfaceOrientation, double duration);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();
    @Mapping("setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    @Mapping("editButtonItem")
    public native UIBarButtonItem getEditButtonItem();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("addChildViewController:")
    public native void addChildViewController(UIViewController childController);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("removeFromParentViewController")
    public native void removeFromParentViewController();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("transitionFromViewController:toViewController:duration:options:animations:completion:")
    public native void transition(UIViewController fromViewController, UIViewController toViewController, double duration, @Representing("UIViewAnimationOptions") @MachineSizedUInt long options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("beginAppearanceTransition:animated:")
    public native void beginAppearanceTransition(boolean isAppearing, boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("endAppearanceTransition")
    public native void endAppearanceTransition();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("childViewControllerForStatusBarStyle")
    public native UIViewController getChildViewControllerForStatusBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("childViewControllerForStatusBarHidden")
    public native UIViewController getChildViewControllerForStatusBarHidden();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setOverrideTraitCollection:forChildViewController:")
    public native void setOverrideTraitCollection(UITraitCollection collection, UIViewController childViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("overrideTraitCollectionForChildViewController:")
    public native UITraitCollection getOverrideTraitCollection(UIViewController childViewController);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers")
    public native boolean isAutomaticallyForwardAppearanceAndRotationMethodsToChildViewControllers();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("shouldAutomaticallyForwardRotationMethods")
    public native boolean shouldAutomaticallyForwardRotationMethods();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldAutomaticallyForwardAppearanceMethods")
    public native boolean shouldAutomaticallyForwardAppearanceMethods();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("willMoveToParentViewController:")
    public native void willMoveToParentViewController(UIViewController parent);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("didMoveToParentViewController:")
    public native void didMoveToParentViewController(UIViewController parent);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("encodeRestorableStateWithCoder:")
    public native void encodeRestorableState(NSCoder coder);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("decodeRestorableStateWithCoder:")
    public native void decodeRestorableState(NSCoder coder);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("applicationFinishedRestoringState")
    public native void applicationFinishedRestoringState();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("updateViewConstraints")
    public native void updateViewConstraints();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setToolbarItems:animated:")
    public native void setToolbarItems(NSArray<?> toolbarItems, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("transitionCoordinator")
    public native UIViewControllerTransitionCoordinator getTransitionCoordinator();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("collapseSecondaryViewController:forSplitViewController:")
    public native void collapseSecondaryViewController(UIViewController secondaryViewController, UISplitViewController splitViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("separateSecondaryViewControllerForSplitViewController:")
    public native UIViewController separateSecondaryViewController(UISplitViewController splitViewController);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    @Mapping("beginRequestWithExtensionContext:")
    public native void beginRequest(NSExtensionContext context);
    
}
