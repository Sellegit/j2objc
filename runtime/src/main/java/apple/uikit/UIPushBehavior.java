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

@Library("UIKit/UIKit.h") @Mapping("UIPushBehavior")
public class UIPushBehavior 
    extends UIDynamicBehavior 
     {

    
    
    @Mapping("initWithItems:mode:")
    public UIPushBehavior(NSArray<?> items, @Representing("UIPushBehaviorMode") long mode) { }
    @Mapping("init")
    public UIPushBehavior() { }
    
    
    @Mapping("items")
    public native List<UIDynamicItem> getItems();
    @Mapping("mode")
    public native @Representing("UIPushBehaviorMode") long getMode();
    @Mapping("active")
    public native boolean isActive();
    @Mapping("setActive:")
    public native void setActive(boolean v);
    @Mapping("angle")
    public native @MachineSizedFloat double getAngle();
    @Mapping("setAngle:")
    public native void setAngle(@MachineSizedFloat double v);
    @Mapping("magnitude")
    public native @MachineSizedFloat double getMagnitude();
    @Mapping("setMagnitude:")
    public native void setMagnitude(@MachineSizedFloat double v);
    @Mapping("pushDirection")
    public native CGVector getPushDirection();
    @Mapping("setPushDirection:")
    public native void setPushDirection(CGVector v);
    
    
    
    @Mapping("addItem:")
    public native void addItem(UIDynamicItem item);
    @Mapping("removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Mapping("targetOffsetFromCenterForItem:")
    public native UIOffset getTargetOffset(UIDynamicItem item);
    @Mapping("setTargetOffsetFromCenter:forItem:")
    public native void setTargetOffset(UIOffset o, UIDynamicItem item);
    @Mapping("setAngle:magnitude:")
    public native void setAngleAndMagnitude(@MachineSizedFloat double angle, @MachineSizedFloat double magnitude);
    
}
