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





@Library("UIKit") @Mapping("UIViewControllerAnimatedTransitioning")
public interface UIViewControllerAnimatedTransitioning 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("transitionDuration:")
    double getTransitionDuration(UIViewControllerContextTransitioning transitionContext);
    @Mapping("animateTransition:")
    void animateTransition(UIViewControllerContextTransitioning transitionContext);
    @Mapping("animationEnded:")
    void animationEnded(boolean transitionCompleted);
    
    /*<adapter>*/
    /*</adapter>*/
}
