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

@Library("UIKit") @Mapping("UIRotationGestureRecognizer")
public class UIRotationGestureRecognizer 
    extends UIGestureRecognizer 
     {

    
    
    public UIRotationGestureRecognizer() {}
    @Mapping("initWithTarget:action:")
    public UIRotationGestureRecognizer(Object target, Selector action) { }
    
    
    @Mapping("rotation")
    public native @MachineSizedFloat double getRotation();
    @Mapping("setRotation:")
    public native void setRotation(@MachineSizedFloat double v);
    @Mapping("velocity")
    public native @MachineSizedFloat double getVelocity();
    
    
    
    
    
}
