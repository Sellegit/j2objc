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
public abstract class UIViewControllerTransitionCoordinatorContextAdapter 
    extends Object 
    implements UIViewControllerTransitionCoordinatorContext {

    
    
    
    
    
    
    
    @NotImplemented("isAnimated")
    public boolean isAnimated() { throw new UnsupportedOperationException(); }
    @NotImplemented("presentationStyle")
    public @Representing("UIModalPresentationStyle") long getPresentationStyle() { throw new UnsupportedOperationException(); }
    @NotImplemented("initiallyInteractive")
    public boolean isInitiallyInteractive() { throw new UnsupportedOperationException(); }
    @NotImplemented("isInteractive")
    public boolean isInteractive() { throw new UnsupportedOperationException(); }
    @NotImplemented("isCancelled")
    public boolean isCancelled() { throw new UnsupportedOperationException(); }
    @NotImplemented("transitionDuration")
    public double getTransitionDuration() { throw new UnsupportedOperationException(); }
    @NotImplemented("percentComplete")
    public @MachineSizedFloat double getPercentComplete() { throw new UnsupportedOperationException(); }
    @NotImplemented("completionVelocity")
    public @MachineSizedFloat double getCompletionVelocity() { throw new UnsupportedOperationException(); }
    @NotImplemented("completionCurve")
    public @Representing("UIViewAnimationCurve") long getCompletionCurve() { throw new UnsupportedOperationException(); }
    @NotImplemented("viewControllerForKey:")
    public UIViewController getViewController(String key) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("viewForKey:")
    public UIView getView(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("containerView")
    public UIView getContainerView() { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("targetTransform")
    public CGAffineTransform getTargetTransform() { throw new UnsupportedOperationException(); }
    
}
