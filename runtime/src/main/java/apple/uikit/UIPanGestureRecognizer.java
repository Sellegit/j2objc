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
@Library("UIKit/UIKit.h") @Mapping("UIPanGestureRecognizer")
public class UIPanGestureRecognizer 
    extends UIGestureRecognizer 
     {

    
    
    @Mapping("initWithTarget:action:")
    public UIPanGestureRecognizer(Object target, Selector action) { }
    @Mapping("init")
    public UIPanGestureRecognizer() { }

    
    @Mapping("minimumNumberOfTouches")
    public native @MachineSizedUInt long getMinimumNumberOfTouches();
    @Mapping("setMinimumNumberOfTouches:")
    public native void setMinimumNumberOfTouches(@MachineSizedUInt long v);
    @Mapping("maximumNumberOfTouches")
    public native @MachineSizedUInt long getMaximumNumberOfTouches();
    @Mapping("setMaximumNumberOfTouches:")
    public native void setMaximumNumberOfTouches(@MachineSizedUInt long v);

    
    
    @Mapping("translationInView:")
    public native CGPoint getTranslation(UIView view);
    @Mapping("setTranslation:inView:")
    public native void setTranslation(CGPoint translation, UIView view);
    @Mapping("velocityInView:")
    public native CGPoint getVelocity(UIView view);

}
