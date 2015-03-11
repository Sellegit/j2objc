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





@Library("SpriteKit") @Mapping("SKPhysicsJoint")
public class SKPhysicsJoint 
    extends NSObject 
    implements NSCoding {

    
    
    public SKPhysicsJoint() {}
    
    
    @Mapping("bodyA")
    public native SKPhysicsBody getBodyA();
    @Mapping("setBodyA:")
    public native void setBodyA(SKPhysicsBody v);
    @Mapping("bodyB")
    public native SKPhysicsBody getBodyB();
    @Mapping("setBodyB:")
    public native void setBodyB(SKPhysicsBody v);
    @Mapping("reactionForce")
    public native CGVector getReactionForce();
    @Mapping("reactionTorque")
    public native @MachineSizedFloat double getReactionTorque();
    
    
    
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
