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





@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsJointSliding")
public class SKPhysicsJointSliding 
    extends SKPhysicsJoint 
     {

    
    
    @Mapping("init")
    public SKPhysicsJointSliding() { }
    
    
    @Mapping("shouldEnableLimits")
    public native boolean shouldEnableLimits();
    @Mapping("setShouldEnableLimits:")
    public native void setShouldEnableLimits(boolean v);
    @Mapping("lowerDistanceLimit")
    public native @MachineSizedFloat double getLowerDistanceLimit();
    @Mapping("setLowerDistanceLimit:")
    public native void setLowerDistanceLimit(@MachineSizedFloat double v);
    @Mapping("upperDistanceLimit")
    public native @MachineSizedFloat double getUpperDistanceLimit();
    @Mapping("setUpperDistanceLimit:")
    public native void setUpperDistanceLimit(@MachineSizedFloat double v);
    
    
    
    @Mapping("jointWithBodyA:bodyB:anchor:axis:")
    public static native SKPhysicsJointSliding create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, CGPoint anchor, CGVector axis);
    
}
