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





@Library("UIKit/UIKit.h") @Mapping("UITabBarControllerDelegate")
public interface UITabBarControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tabBarController:shouldSelectViewController:")
    boolean shouldSelectViewController(UITabBarController tabBarController, UIViewController viewController);
    @Mapping("tabBarController:didSelectViewController:")
    void didSelectViewController(UITabBarController tabBarController, UIViewController viewController);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tabBarController:willBeginCustomizingViewControllers:")
    void willBeginCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("tabBarController:willEndCustomizingViewControllers:changed:")
    void willEndCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers, boolean changed);
    @Mapping("tabBarController:didEndCustomizingViewControllers:changed:")
    void didEndCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers, boolean changed);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabBarControllerSupportedInterfaceOrientations:")
    UIInterfaceOrientation getSupportedInterfaceOrientations(UITabBarController tabBarController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabBarControllerPreferredInterfaceOrientationForPresentation:")
    @Representing("UIInterfaceOrientation") @MachineSizedSInt long getPreferredInterfaceOrientation(UITabBarController tabBarController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabBarController:interactionControllerForAnimationController:")
    UIViewControllerInteractiveTransitioning getInteractionController(UITabBarController tabBarController, UIViewControllerAnimatedTransitioning animationController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("tabBarController:animationControllerForTransitionFromViewController:toViewController:")
    UIViewControllerAnimatedTransitioning getAnimationController(UITabBarController tabBarController, UIViewController fromVC, UIViewController toVC);
    
    /*<adapter>*/
    /*</adapter>*/
}
