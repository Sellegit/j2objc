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





@Library("UIKit/UIKit.h") @Mapping("UIViewControllerContextTransitioning")
public interface UIViewControllerContextTransitioning 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("containerView")
    UIView getContainerView();
    @Mapping("isAnimated")
    boolean isAnimated();
    @Mapping("isInteractive")
    boolean isInteractive();
    @Mapping("transitionWasCancelled")
    boolean transitionWasCancelled();
    @Mapping("presentationStyle")
    @Representing("UIModalPresentationStyle") long getPresentationStyle();
    @Mapping("updateInteractiveTransition:")
    void updateInteractiveTransition(@MachineSizedFloat double percentComplete);
    @Mapping("finishInteractiveTransition")
    void finishInteractiveTransition();
    @Mapping("cancelInteractiveTransition")
    void cancelInteractiveTransition();
    @Mapping("completeTransition:")
    void completeTransition(boolean didComplete);
    @Mapping("viewControllerForKey:")
    UIViewController getViewController(String key);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("viewForKey:")
    UIView getView(String key);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("targetTransform")
    CGAffineTransform getTargetTransform();
    @Mapping("initialFrameForViewController:")
    CGRect getInitialFrame(UIViewController vc);
    @Mapping("finalFrameForViewController:")
    CGRect getFinalFrame(UIViewController vc);
    
    /*<adapter>*/
    /*</adapter>*/
}
