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



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPercentDrivenInteractiveTransition")
public class UIPercentDrivenInteractiveTransition 
    extends NSObject 
    implements UIViewControllerInteractiveTransitioning {

    
    
    @Mapping("init")
    public UIPercentDrivenInteractiveTransition() { }
    
    
    @Mapping("duration")
    public native @MachineSizedFloat double getDuration();
    @Mapping("percentComplete")
    public native @MachineSizedFloat double getPercentComplete();
    @Mapping("completionSpeed")
    public native @MachineSizedFloat double getCompletionSpeed();
    @Mapping("setCompletionSpeed:")
    public native void setCompletionSpeed(@MachineSizedFloat double v);
    @Mapping("completionCurve")
    public native @Representing("UIViewAnimationCurve") long getCompletionCurve();
    @Mapping("setCompletionCurve:")
    public native void setCompletionCurve(@Representing("UIViewAnimationCurve") long v);
    
    
    
    @Mapping("updateInteractiveTransition:")
    public native void updateInteractiveTransition(@MachineSizedFloat double percentComplete);
    @Mapping("cancelInteractiveTransition")
    public native void cancelInteractiveTransition();
    @Mapping("finishInteractiveTransition")
    public native void finishInteractiveTransition();
    @Mapping("startInteractiveTransition:")
    public native void startInteractiveTransition(UIViewControllerContextTransitioning transitionContext);
    
}
