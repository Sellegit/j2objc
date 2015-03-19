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
public abstract class UIViewControllerContextTransitioningAdapter 
    extends Object 
    implements UIViewControllerContextTransitioning {

    
    
    
    
    
    
    
    @NotImplemented("containerView")
    public UIView getContainerView() { throw new UnsupportedOperationException(); }
    @NotImplemented("isAnimated")
    public boolean isAnimated() { throw new UnsupportedOperationException(); }
    @NotImplemented("isInteractive")
    public boolean isInteractive() { throw new UnsupportedOperationException(); }
    @NotImplemented("transitionWasCancelled")
    public boolean transitionWasCancelled() { throw new UnsupportedOperationException(); }
    @NotImplemented("presentationStyle")
    public @Representing("UIModalPresentationStyle") long getPresentationStyle() { throw new UnsupportedOperationException(); }
    @NotImplemented("updateInteractiveTransition:")
    public void updateInteractiveTransition(@MachineSizedFloat double percentComplete) { throw new UnsupportedOperationException(); }
    @NotImplemented("finishInteractiveTransition")
    public void finishInteractiveTransition() { throw new UnsupportedOperationException(); }
    @NotImplemented("cancelInteractiveTransition")
    public void cancelInteractiveTransition() { throw new UnsupportedOperationException(); }
    @NotImplemented("completeTransition:")
    public void completeTransition(boolean didComplete) { throw new UnsupportedOperationException(); }
    @NotImplemented("viewControllerForKey:")
    public UIViewController getViewController(String key) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("viewForKey:")
    public UIView getView(String key) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("targetTransform")
    public CGAffineTransform getTargetTransform() { throw new UnsupportedOperationException(); }
    @NotImplemented("initialFrameForViewController:")
    public CGRect getInitialFrame(UIViewController vc) { throw new UnsupportedOperationException(); }
    @NotImplemented("finalFrameForViewController:")
    public CGRect getFinalFrame(UIViewController vc) { throw new UnsupportedOperationException(); }
    
}
