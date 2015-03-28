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
@Library("UIKit/UIKit.h") @Mapping("UIDynamicItemBehavior")
public class UIDynamicItemBehavior 
    extends UIDynamicBehavior 
     {

    
    
    @Mapping("initWithItems:")
    public UIDynamicItemBehavior(NSArray<?> items) { }
    @Mapping("init")
    public UIDynamicItemBehavior() { }

    
    @Mapping("items")
    public native List<UIDynamicItem> getItems();
    @Mapping("elasticity")
    public native @MachineSizedFloat double getElasticity();
    @Mapping("setElasticity:")
    public native void setElasticity(@MachineSizedFloat double v);
    @Mapping("friction")
    public native @MachineSizedFloat double getFriction();
    @Mapping("setFriction:")
    public native void setFriction(@MachineSizedFloat double v);
    @Mapping("density")
    public native @MachineSizedFloat double getDensity();
    @Mapping("setDensity:")
    public native void setDensity(@MachineSizedFloat double v);
    @Mapping("resistance")
    public native @MachineSizedFloat double getResistance();
    @Mapping("setResistance:")
    public native void setResistance(@MachineSizedFloat double v);
    @Mapping("angularResistance")
    public native @MachineSizedFloat double getAngularResistance();
    @Mapping("setAngularResistance:")
    public native void setAngularResistance(@MachineSizedFloat double v);
    @Mapping("allowsRotation")
    public native boolean allowsRotation();
    @Mapping("setAllowsRotation:")
    public native void setAllowsRotation(boolean v);

    
    
    @Mapping("addItem:")
    public native void addItem(UIDynamicItem item);
    @Mapping("removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Mapping("addLinearVelocity:forItem:")
    public native void addLinearVelocityForItem(CGPoint velocity, UIDynamicItem item);
    @Mapping("linearVelocityForItem:")
    public native CGPoint getLinearVelocityForItem(UIDynamicItem item);
    @Mapping("addAngularVelocity:forItem:")
    public native void addAngularVelocityForItem(@MachineSizedFloat double velocity, UIDynamicItem item);
    @Mapping("angularVelocityForItem:")
    public native @MachineSizedFloat double getAngularVelocityForItem(UIDynamicItem item);

}
