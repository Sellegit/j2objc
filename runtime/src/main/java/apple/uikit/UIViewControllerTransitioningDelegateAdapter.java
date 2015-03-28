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
public abstract class UIViewControllerTransitioningDelegateAdapter 
    extends Object 
    implements UIViewControllerTransitioningDelegate {

    
    
    


    
    
    @NotImplemented("animationControllerForPresentedController:presentingController:sourceController:")
    public UIViewControllerAnimatedTransitioning getAnimationControllerForPresentedController(UIViewController presented, UIViewController presenting, UIViewController source) { throw new UnsupportedOperationException(); }
    @NotImplemented("animationControllerForDismissedController:")
    public UIViewControllerAnimatedTransitioning getAnimationControllerForDismissedController(UIViewController dismissed) { throw new UnsupportedOperationException(); }
    @NotImplemented("interactionControllerForPresentation:")
    public UIViewControllerInteractiveTransitioning getInteractionControllerForPresentation(UIViewControllerAnimatedTransitioning animator) { throw new UnsupportedOperationException(); }
    @NotImplemented("interactionControllerForDismissal:")
    public UIViewControllerInteractiveTransitioning getInteractionControllerForDismissal(UIViewControllerAnimatedTransitioning animator) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    public UIPresentationController getPresentationControllerForPresentedViewController(UIViewController presented, UIViewController presenting, UIViewController source) { throw new UnsupportedOperationException(); }

}
