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


@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsJointFixed")
public class SKPhysicsJointFixed 
    extends SKPhysicsJoint 
     {

    
    
    @Mapping("initWithCoder:")
    public SKPhysicsJointFixed(NSCoder aDecoder) { }
    @Mapping("init")
    public SKPhysicsJointFixed() { }

    


    
    
    @Mapping("jointWithBodyA:bodyB:anchor:")
    public static native SKPhysicsJointFixed create(SKPhysicsBody bodyA, SKPhysicsBody bodyB, CGPoint anchor);

}
