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
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit") @Mapping("UIGestureRecognizer")
public class UIGestureRecognizer 
    extends NSObject 
     {

    
    
    public UIGestureRecognizer() {}
    @Mapping("initWithTarget:action:")
    public UIGestureRecognizer(NSObject target, Selector action) { }
    
    
    @Mapping("state")
    public native @Representing("UIGestureRecognizerState") @MachineSizedSInt long getState();
    @Mapping("delegate")
    public native UIGestureRecognizerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIGestureRecognizerDelegate v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("view")
    public native UIView getView();
    @Mapping("cancelsTouchesInView")
    public native boolean cancelsTouchesInView();
    @Mapping("setCancelsTouchesInView:")
    public native void setCancelsTouchesInView(boolean v);
    @Mapping("delaysTouchesBegan")
    public native boolean delaysTouchesBegan();
    @Mapping("setDelaysTouchesBegan:")
    public native void setDelaysTouchesBegan(boolean v);
    @Mapping("delaysTouchesEnded")
    public native boolean delaysTouchesEnded();
    @Mapping("setDelaysTouchesEnded:")
    public native void setDelaysTouchesEnded(boolean v);
    
    
    
    @Mapping("addTarget:action:")
    public native void addTarget(Object target, Selector action);
    @Mapping("removeTarget:action:")
    public native void removeTarget(Object target, Selector action);
    @Mapping("requireGestureRecognizerToFail:")
    public native void requireGestureRecognizerToFail(UIGestureRecognizer otherGestureRecognizer);
    @Mapping("locationInView:")
    public native CGPoint getLocationInView(UIView view);
    @Mapping("numberOfTouches")
    public native @MachineSizedUInt long getNumberOfTouches();
    @Mapping("locationOfTouch:inView:")
    public native CGPoint getLocationOfTouch(@MachineSizedUInt long touchIndex, UIView view);
    
}
