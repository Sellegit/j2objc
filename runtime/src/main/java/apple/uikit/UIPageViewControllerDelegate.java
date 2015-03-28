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


@Library("UIKit/UIKit.h") @Mapping("UIPageViewControllerDelegate")
public interface UIPageViewControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("pageViewController:willTransitionToViewControllers:")
    void willTransition(UIPageViewController pageViewController, NSArray<?> pendingViewControllers);
    @Mapping("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    void didFinishAnimating(UIPageViewController pageViewController, boolean finished, NSArray<?> previousViewControllers, boolean completed);
    @Mapping("pageViewController:spineLocationForInterfaceOrientation:")
    @Representing("UIPageViewControllerSpineLocation") long getSpineLocation(UIPageViewController pageViewController, @Representing("UIInterfaceOrientation") long orientation);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("pageViewControllerSupportedInterfaceOrientations:")
    UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIPageViewController pageViewController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    @Representing("UIInterfaceOrientation") long getPreferredInterfaceOrientation(UIPageViewController pageViewController);

    /*<adapter>*/
    /*</adapter>*/
}
