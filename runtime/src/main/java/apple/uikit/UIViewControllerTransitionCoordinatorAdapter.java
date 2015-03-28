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
public abstract class UIViewControllerTransitionCoordinatorAdapter 
    extends UIViewControllerTransitionCoordinatorContextAdapter 
    implements UIViewControllerTransitionCoordinator {

    
    
    


    
    
    @NotImplemented("animateAlongsideTransition:completion:")
    public boolean animateAlongsideTransition(@Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> animation, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> completion) { throw new UnsupportedOperationException(); }
    @NotImplemented("animateAlongsideTransitionInView:animation:completion:")
    public boolean animateAlongsideTransition(UIView view, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> animation, @Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> completion) { throw new UnsupportedOperationException(); }
    @NotImplemented("notifyWhenInteractionEndsUsingBlock:")
    public void notifyWhenInteractionEnds(@Block VoidBlock1<UIViewControllerTransitionCoordinatorContext> handler) { throw new UnsupportedOperationException(); }

}
