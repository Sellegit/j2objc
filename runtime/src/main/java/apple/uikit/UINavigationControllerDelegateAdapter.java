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
public abstract class UINavigationControllerDelegateAdapter 
    extends Object 
    implements UINavigationControllerDelegate {

    
    
    


    
    
    @NotImplemented("navigationController:willShowViewController:animated:")
    public void willShowViewController(UINavigationController navigationController, UIViewController viewController, boolean animated) { throw new UnsupportedOperationException(); }
    @NotImplemented("navigationController:didShowViewController:animated:")
    public void didShowViewController(UINavigationController navigationController, UIViewController viewController, boolean animated) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("navigationControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UINavigationController navigationController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("navigationControllerPreferredInterfaceOrientationForPresentation:")
    public @Representing("UIInterfaceOrientation") long getPreferredInterfaceOrientation(UINavigationController navigationController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("navigationController:interactionControllerForAnimationController:")
    public UIViewControllerInteractiveTransitioning getInteractionController(UINavigationController navigationController, UIViewControllerAnimatedTransitioning animationController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("navigationController:animationControllerForOperation:fromViewController:toViewController:")
    public UIViewControllerAnimatedTransitioning getAnimationController(UINavigationController navigationController, @Representing("UINavigationControllerOperation") long operation, UIViewController fromVC, UIViewController toVC) { throw new UnsupportedOperationException(); }

}
