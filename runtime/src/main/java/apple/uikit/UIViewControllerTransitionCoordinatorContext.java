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





@Library("UIKit") @Mapping("UIViewControllerTransitionCoordinatorContext")
public interface UIViewControllerTransitionCoordinatorContext 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("isAnimated")
    boolean isAnimated();
    @Mapping("presentationStyle")
    @Representing("UIModalPresentationStyle") @MachineSizedSInt long getPresentationStyle();
    @Mapping("initiallyInteractive")
    boolean isInitiallyInteractive();
    @Mapping("isInteractive")
    boolean isInteractive();
    @Mapping("isCancelled")
    boolean isCancelled();
    @Mapping("transitionDuration")
    double getTransitionDuration();
    @Mapping("percentComplete")
    @MachineSizedFloat double getPercentComplete();
    @Mapping("completionVelocity")
    @MachineSizedFloat double getCompletionVelocity();
    @Mapping("completionCurve")
    @Representing("UIViewAnimationCurve") @MachineSizedSInt long getCompletionCurve();
    @Mapping("viewControllerForKey:")
    UIViewController getViewController(String key);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("viewForKey:")
    UIView getView(String key);
    @Mapping("containerView")
    UIView getContainerView();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("targetTransform")
    CGAffineTransform getTargetTransform();
    
    /*<adapter>*/
    /*</adapter>*/
}
