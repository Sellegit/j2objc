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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsJointLimit")
public class SKPhysicsJointLimit 
    extends SKPhysicsJoint 
     {

    
    
    @Mapping("initWithCoder:")
    public SKPhysicsJointLimit(NSCoder aDecoder) { }
    @Mapping("init")
    public SKPhysicsJointLimit() { }
    
    
    @Mapping("maxLength")
    public native @MachineSizedFloat double getMaxLength();
    @Mapping("setMaxLength:")
    public native void setMaxLength(@MachineSizedFloat double v);
    
    
    
    @Mapping("jointWithBodyA:bodyB:anchorA:anchorB:")
    public static native SKPhysicsJointLimit create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, CGPoint anchorA, CGPoint anchorB);
    
}
