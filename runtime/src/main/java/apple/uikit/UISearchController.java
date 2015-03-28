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
 * @since Available in iOS 8.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UISearchController")
public class UISearchController 
    extends UIViewController 
    implements UIViewControllerTransitioningDelegate, UIViewControllerAnimatedTransitioning {

    
    
    @Mapping("initWithSearchResultsController:")
    public UISearchController(UIViewController searchResultsController) { }
    @Mapping("initWithNibName:bundle:")
    public UISearchController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UISearchController(NSCoder aDecoder) { }
    @Mapping("init")
    public UISearchController() { }

    
    @Mapping("searchResultsUpdater")
    public native UISearchResultsUpdating getSearchResultsUpdater();
    @Mapping("setSearchResultsUpdater:")
    public native void setSearchResultsUpdater(UISearchResultsUpdating v);
    @Mapping("isActive")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("delegate")
    public native UISearchControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UISearchControllerDelegate v);
    @Mapping("dimsBackgroundDuringPresentation")
    public native boolean dimsBackgroundDuringPresentation();
    @Mapping("setDimsBackgroundDuringPresentation:")
    public native void setDimsBackgroundDuringPresentation(boolean v);
    @Mapping("hidesNavigationBarDuringPresentation")
    public native boolean hidesNavigationBarDuringPresentation();
    @Mapping("setHidesNavigationBarDuringPresentation:")
    public native void setHidesNavigationBarDuringPresentation(boolean v);
    @Mapping("searchResultsController")
    public native UIViewController getSearchResultsController();
    @Mapping("searchBar")
    public native UISearchBar getSearchBar();

    
    
    @Mapping("animationControllerForPresentedController:presentingController:sourceController:")
    public native UIViewControllerAnimatedTransitioning getAnimationControllerForPresentedController(UIViewController presented, UIViewController presenting, UIViewController source);
    @Mapping("animationControllerForDismissedController:")
    public native UIViewControllerAnimatedTransitioning getAnimationControllerForDismissedController(UIViewController dismissed);
    @Mapping("interactionControllerForPresentation:")
    public native UIViewControllerInteractiveTransitioning getInteractionControllerForPresentation(UIViewControllerAnimatedTransitioning animator);
    @Mapping("interactionControllerForDismissal:")
    public native UIViewControllerInteractiveTransitioning getInteractionControllerForDismissal(UIViewControllerAnimatedTransitioning animator);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    public native UIPresentationController getPresentationControllerForPresentedViewController(UIViewController presented, UIViewController presenting, UIViewController source);
    @Mapping("transitionDuration:")
    public native double getTransitionDuration(UIViewControllerContextTransitioning transitionContext);
    @Mapping("animateTransition:")
    public native void animateTransition(UIViewControllerContextTransitioning transitionContext);
    @Mapping("animationEnded:")
    public native void animationEnded(boolean transitionCompleted);

}
