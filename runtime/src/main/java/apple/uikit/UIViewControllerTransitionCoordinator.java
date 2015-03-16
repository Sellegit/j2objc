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





@Library("UIKit/UIKit.h") @Mapping("UIViewControllerTransitionCoordinator")
public interface UIViewControllerTransitionCoordinator 
    extends UIViewControllerTransitionCoordinatorContext {

    
    
    
    
    
    @Mapping("animateAlongsideTransition:completion:")
    boolean animateAlongsideTransition(@Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> animation, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> completion);
    @Mapping("animateAlongsideTransitionInView:animation:completion:")
    boolean animateAlongsideTransition(UIView view, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> animation, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> completion);
    @Mapping("notifyWhenInteractionEndsUsingBlock:")
    void notifyWhenInteractionEnds(@Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> handler);
    
    /*<adapter>*/
    /*</adapter>*/
}
