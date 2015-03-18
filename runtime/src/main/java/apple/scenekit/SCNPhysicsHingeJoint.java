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





@Library("SceneKit/SceneKit.h") @Mapping("SCNPhysicsHingeJoint")
public class SCNPhysicsHingeJoint 
    extends SCNPhysicsBehavior 
     {

    
    
    @Mapping("init")
    public SCNPhysicsHingeJoint() { }
    
    
    @Mapping("bodyA")
    public native SCNPhysicsBody getBodyA();
    @Mapping("axisA")
    public native SCNVector3 getAxisA();
    @Mapping("setAxisA:")
    public native void setAxisA(SCNVector3 v);
    @Mapping("anchorA")
    public native SCNVector3 getAnchorA();
    @Mapping("setAnchorA:")
    public native void setAnchorA(SCNVector3 v);
    @Mapping("bodyB")
    public native SCNPhysicsBody getBodyB();
    @Mapping("axisB")
    public native SCNVector3 getAxisB();
    @Mapping("setAxisB:")
    public native void setAxisB(SCNVector3 v);
    @Mapping("anchorB")
    public native SCNVector3 getAnchorB();
    @Mapping("setAnchorB:")
    public native void setAnchorB(SCNVector3 v);
    
    
    
    @Mapping("jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:")
    public static native SCNPhysicsHingeJoint create(SCNPhysicsBody bodyA, SCNVector3 axisA, SCNVector3 anchorA, SCNPhysicsBody bodyB, SCNVector3 axisB, SCNVector3 anchorB);
    @Mapping("jointWithBody:axis:anchor:")
    public static native SCNPhysicsHingeJoint create(SCNPhysicsBody body, SCNVector3 axis, SCNVector3 anchor);
    
}
