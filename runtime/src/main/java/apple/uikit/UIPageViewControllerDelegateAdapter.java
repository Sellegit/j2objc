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
public abstract class UIPageViewControllerDelegateAdapter 
    extends Object 
    implements UIPageViewControllerDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("pageViewController:willTransitionToViewControllers:")
    public void willTransition(UIPageViewController pageViewController, NSArray<?> pendingViewControllers) { throw new UnsupportedOperationException(); }
    @NotImplemented("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    public void didFinishAnimating(UIPageViewController pageViewController, boolean finished, NSArray<?> previousViewControllers, boolean completed) { throw new UnsupportedOperationException(); }
    @NotImplemented("pageViewController:spineLocationForInterfaceOrientation:")
    public @Representing("UIPageViewControllerSpineLocation") long getSpineLocation(UIPageViewController pageViewController, @Representing("UIInterfaceOrientation") long orientation) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIPageViewController pageViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    public @Representing("UIInterfaceOrientation") long getPreferredInterfaceOrientation(UIPageViewController pageViewController) { throw new UnsupportedOperationException(); }
    
}
