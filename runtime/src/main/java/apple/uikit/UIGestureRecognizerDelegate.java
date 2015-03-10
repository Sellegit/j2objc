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





@Library("UIKit") @Mapping("UIGestureRecognizerDelegate")
public interface UIGestureRecognizerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("gestureRecognizerShouldBegin:")
    boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Mapping("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Mapping("gestureRecognizer:shouldReceiveTouch:")
    boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    
    /*<adapter>*/
    /*</adapter>*/
}
