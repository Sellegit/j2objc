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
public abstract class UITabBarControllerDelegateAdapter 
    extends Object 
    implements UITabBarControllerDelegate {

    
    
    


    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tabBarController:shouldSelectViewController:")
    public boolean shouldSelectViewController(UITabBarController tabBarController, UIViewController viewController) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBarController:didSelectViewController:")
    public void didSelectViewController(UITabBarController tabBarController, UIViewController viewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tabBarController:willBeginCustomizingViewControllers:")
    public void willBeginCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("tabBarController:willEndCustomizingViewControllers:changed:")
    public void willEndCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers, boolean changed) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBarController:didEndCustomizingViewControllers:changed:")
    public void didEndCustomizingViewControllers(UITabBarController tabBarController, NSArray<?> viewControllers, boolean changed) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tabBarControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientation getSupportedInterfaceOrientations(UITabBarController tabBarController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tabBarControllerPreferredInterfaceOrientationForPresentation:")
    public @Representing("UIInterfaceOrientation") long getPreferredInterfaceOrientation(UITabBarController tabBarController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tabBarController:interactionControllerForAnimationController:")
    public UIViewControllerInteractiveTransitioning getInteractionController(UITabBarController tabBarController, UIViewControllerAnimatedTransitioning animationController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("tabBarController:animationControllerForTransitionFromViewController:toViewController:")
    public UIViewControllerAnimatedTransitioning getAnimationController(UITabBarController tabBarController, UIViewController fromVC, UIViewController toVC) { throw new UnsupportedOperationException(); }

}
