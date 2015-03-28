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
public abstract class UIGestureRecognizerDelegateAdapter 
    extends Object 
    implements UIGestureRecognizerDelegate {

    
    
    


    
    
    @NotImplemented("gestureRecognizerShouldBegin:")
    public boolean shouldBegin(UIGestureRecognizer gestureRecognizer) { throw new UnsupportedOperationException(); }
    @NotImplemented("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer) { throw new UnsupportedOperationException(); }
    @NotImplemented("gestureRecognizer:shouldReceiveTouch:")
    public boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch) { throw new UnsupportedOperationException(); }

}
