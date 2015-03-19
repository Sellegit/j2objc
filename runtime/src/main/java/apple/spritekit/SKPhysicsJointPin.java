package apple.spritekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;





@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsJointPin")
public class SKPhysicsJointPin 
    extends SKPhysicsJoint 
     {

    
    
    @Mapping("initWithCoder:")
    public SKPhysicsJointPin(NSCoder aDecoder) { }
    @Mapping("init")
    public SKPhysicsJointPin() { }
    
    
    @Mapping("shouldEnableLimits")
    public native boolean shouldEnableLimits();
    @Mapping("setShouldEnableLimits:")
    public native void setShouldEnableLimits(boolean v);
    @Mapping("lowerAngleLimit")
    public native @MachineSizedFloat double getLowerAngleLimit();
    @Mapping("setLowerAngleLimit:")
    public native void setLowerAngleLimit(@MachineSizedFloat double v);
    @Mapping("upperAngleLimit")
    public native @MachineSizedFloat double getUpperAngleLimit();
    @Mapping("setUpperAngleLimit:")
    public native void setUpperAngleLimit(@MachineSizedFloat double v);
    @Mapping("frictionTorque")
    public native @MachineSizedFloat double getFrictionTorque();
    @Mapping("setFrictionTorque:")
    public native void setFrictionTorque(@MachineSizedFloat double v);
    @Mapping("rotationSpeed")
    public native @MachineSizedFloat double getRotationSpeed();
    @Mapping("setRotationSpeed:")
    public native void setRotationSpeed(@MachineSizedFloat double v);
    
    
    
    @Mapping("jointWithBodyA:bodyB:anchor:")
    public static native SKPhysicsJointPin create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, CGPoint anchor);
    
}
