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





@Library("UIKit/UIKit.h") @Mapping("UINavigationControllerDelegate")
public interface UINavigationControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("navigationController:willShowViewController:animated:")
    void willShowViewController(UINavigationController navigationController, UIViewController viewController, boolean animated);
    @Mapping("navigationController:didShowViewController:animated:")
    void didShowViewController(UINavigationController navigationController, UIViewController viewController, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("navigationControllerSupportedInterfaceOrientations:")
    UIInterfaceOrientationMask getSupportedInterfaceOrientations(UINavigationController navigationController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("navigationControllerPreferredInterfaceOrientationForPresentation:")
    @Representing("UIInterfaceOrientation") @MachineSizedSInt long getPreferredInterfaceOrientation(UINavigationController navigationController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("navigationController:interactionControllerForAnimationController:")
    UIViewControllerInteractiveTransitioning getInteractionController(UINavigationController navigationController, UIViewControllerAnimatedTransitioning animationController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("navigationController:animationControllerForOperation:fromViewController:toViewController:")
    UIViewControllerAnimatedTransitioning getAnimationController(UINavigationController navigationController, @Representing("UINavigationControllerOperation") @MachineSizedSInt long operation, UIViewController fromVC, UIViewController toVC);
    
    /*<adapter>*/
    /*</adapter>*/
}
