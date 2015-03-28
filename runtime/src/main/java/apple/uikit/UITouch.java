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
 * @since Available in iOS 2.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UITouch")
public class UITouch 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UITouch() { }

    
    @Mapping("timestamp")
    public native double getTimestamp();
    @Mapping("phase")
    public native @Representing("UITouchPhase") long getPhase();
    @Mapping("tapCount")
    public native @MachineSizedUInt long getTapCount();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("majorRadius")
    public native @MachineSizedFloat double getMajorRadius();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("majorRadiusTolerance")
    public native @MachineSizedFloat double getMajorRadiusTolerance();
    @Mapping("window")
    public native UIWindow getWindow();
    @Mapping("view")
    public native UIView getView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();

    
    
    @Mapping("locationInView:")
    public native CGPoint getLocationInView(UIView view);
    @Mapping("previousLocationInView:")
    public native CGPoint getPreviousLocationInView(UIView view);

}
