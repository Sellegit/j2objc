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

@Library("UIKit") @Mapping("UIPinchGestureRecognizer")
public class UIPinchGestureRecognizer 
    extends UIGestureRecognizer 
     {

    
    
    public UIPinchGestureRecognizer() {}
    @Mapping("initWithTarget:action:")
    public UIPinchGestureRecognizer(Object target, Selector action) { }
    
    
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    @Mapping("setScale:")
    public native void setScale(@MachineSizedFloat double v);
    @Mapping("velocity")
    public native @MachineSizedFloat double getVelocity();
    
    
    
    
    
}
