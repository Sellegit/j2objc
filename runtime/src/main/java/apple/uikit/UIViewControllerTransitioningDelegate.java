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


@Library("UIKit/UIKit.h") @Mapping("UIViewControllerTransitioningDelegate")
public interface UIViewControllerTransitioningDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("animationControllerForPresentedController:presentingController:sourceController:")
    UIViewControllerAnimatedTransitioning getAnimationControllerForPresentedController(UIViewController presented, UIViewController presenting, UIViewController source);
    @Mapping("animationControllerForDismissedController:")
    UIViewControllerAnimatedTransitioning getAnimationControllerForDismissedController(UIViewController dismissed);
    @Mapping("interactionControllerForPresentation:")
    UIViewControllerInteractiveTransitioning getInteractionControllerForPresentation(UIViewControllerAnimatedTransitioning animator);
    @Mapping("interactionControllerForDismissal:")
    UIViewControllerInteractiveTransitioning getInteractionControllerForDismissal(UIViewControllerAnimatedTransitioning animator);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    UIPresentationController getPresentationControllerForPresentedViewController(UIViewController presented, UIViewController presenting, UIViewController source);

    /*<adapter>*/
    /*</adapter>*/
}
