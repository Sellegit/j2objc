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

@Library("UIKit/UIKit.h") @Mapping("UISwipeGestureRecognizer")
public class UISwipeGestureRecognizer 
    extends UIGestureRecognizer 
     {

    
    
    public UISwipeGestureRecognizer() {}
    @Mapping("initWithTarget:action:")
    public UISwipeGestureRecognizer(Object target, Selector action) { }
    
    
    @Mapping("numberOfTouchesRequired")
    public native @MachineSizedUInt long getNumberOfTouchesRequired();
    @Mapping("setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@MachineSizedUInt long v);
    @Mapping("direction")
    public native @Representing("UISwipeGestureRecognizerDirection") @MachineSizedUInt long getDirection();
    @Mapping("setDirection:")
    public native void setDirection(@Representing("UISwipeGestureRecognizerDirection") @MachineSizedUInt long v);
    
    
    
    
    
}
