package apple.scenekit;


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
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Library("SceneKit/SceneKit.h") @Mapping("SCNPhysicsBallSocketJoint")
public class SCNPhysicsBallSocketJoint 
    extends SCNPhysicsBehavior 
     {

    
    
    @Mapping("init")
    public SCNPhysicsBallSocketJoint() { }
    
    
    @Mapping("bodyA")
    public native SCNPhysicsBody getBodyA();
    @Mapping("anchorA")
    public native SCNVector3 getAnchorA();
    @Mapping("setAnchorA:")
    public native void setAnchorA(SCNVector3 v);
    @Mapping("bodyB")
    public native SCNPhysicsBody getBodyB();
    @Mapping("anchorB")
    public native SCNVector3 getAnchorB();
    @Mapping("setAnchorB:")
    public native void setAnchorB(SCNVector3 v);
    
    
    
    @Mapping("jointWithBodyA:anchorA:bodyB:anchorB:")
    public static native SCNPhysicsBallSocketJoint create(SCNPhysicsBody bodyA, SCNVector3 anchorA, SCNPhysicsBody bodyB, SCNVector3 anchorB);
    @Mapping("jointWithBody:anchor:")
    public static native SCNPhysicsBallSocketJoint create(SCNPhysicsBody body, SCNVector3 anchor);
    
}
