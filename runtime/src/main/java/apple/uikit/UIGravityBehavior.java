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
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit") @Mapping("UIGravityBehavior")
public class UIGravityBehavior 
    extends UIDynamicBehavior 
     {

    
    
    public UIGravityBehavior() {}
    @Mapping("initWithItems:")
    public UIGravityBehavior(NSArray<?> items) { }
    
    
    @Mapping("items")
    public native List<UIDynamicItem> getItems();
    @Mapping("gravityDirection")
    public native CGVector getGravityDirection();
    @Mapping("setGravityDirection:")
    public native void setGravityDirection(CGVector v);
    @Mapping("angle")
    public native @MachineSizedFloat double getAngle();
    @Mapping("setAngle:")
    public native void setAngle(@MachineSizedFloat double v);
    @Mapping("magnitude")
    public native @MachineSizedFloat double getMagnitude();
    @Mapping("setMagnitude:")
    public native void setMagnitude(@MachineSizedFloat double v);
    
    
    
    @Mapping("addItem:")
    public native void addItem(UIDynamicItem item);
    @Mapping("removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Mapping("setAngle:magnitude:")
    public native void setAngle(@MachineSizedFloat double angle, @MachineSizedFloat double magnitude);
    
}
