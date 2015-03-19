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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsJointSpring")
public class SKPhysicsJointSpring 
    extends SKPhysicsJoint 
     {

    
    
    @Mapping("initWithCoder:")
    public SKPhysicsJointSpring(NSCoder aDecoder) { }
    @Mapping("init")
    public SKPhysicsJointSpring() { }
    
    
    @Mapping("damping")
    public native @MachineSizedFloat double getDamping();
    @Mapping("setDamping:")
    public native void setDamping(@MachineSizedFloat double v);
    @Mapping("frequency")
    public native @MachineSizedFloat double getFrequency();
    @Mapping("setFrequency:")
    public native void setFrequency(@MachineSizedFloat double v);
    
    
    
    @Mapping("jointWithBodyA:bodyB:anchorA:anchorB:")
    public static native SKPhysicsJointSpring create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, CGPoint anchorA, CGPoint anchorB);
    
}
