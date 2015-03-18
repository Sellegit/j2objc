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





@Library("SceneKit/SceneKit.h") @Mapping("SCNPhysicsSliderJoint")
public class SCNPhysicsSliderJoint 
    extends SCNPhysicsBehavior 
     {

    
    
    @Mapping("init")
    public SCNPhysicsSliderJoint() { }
    
    
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
    @Mapping("minimumLinearLimit")
    public native @MachineSizedFloat double getMinimumLinearLimit();
    @Mapping("setMinimumLinearLimit:")
    public native void setMinimumLinearLimit(@MachineSizedFloat double v);
    @Mapping("maximumLinearLimit")
    public native @MachineSizedFloat double getMaximumLinearLimit();
    @Mapping("setMaximumLinearLimit:")
    public native void setMaximumLinearLimit(@MachineSizedFloat double v);
    @Mapping("minimumAngularLimit")
    public native @MachineSizedFloat double getMinimumAngularLimit();
    @Mapping("setMinimumAngularLimit:")
    public native void setMinimumAngularLimit(@MachineSizedFloat double v);
    @Mapping("maximumAngularLimit")
    public native @MachineSizedFloat double getMaximumAngularLimit();
    @Mapping("setMaximumAngularLimit:")
    public native void setMaximumAngularLimit(@MachineSizedFloat double v);
    @Mapping("motorTargetLinearVelocity")
    public native @MachineSizedFloat double getMotorTargetLinearVelocity();
    @Mapping("setMotorTargetLinearVelocity:")
    public native void setMotorTargetLinearVelocity(@MachineSizedFloat double v);
    @Mapping("motorMaximumForce")
    public native @MachineSizedFloat double getMotorMaximumForce();
    @Mapping("setMotorMaximumForce:")
    public native void setMotorMaximumForce(@MachineSizedFloat double v);
    @Mapping("motorTargetAngularVelocity")
    public native @MachineSizedFloat double getMotorTargetAngularVelocity();
    @Mapping("setMotorTargetAngularVelocity:")
    public native void setMotorTargetAngularVelocity(@MachineSizedFloat double v);
    @Mapping("motorMaximumTorque")
    public native @MachineSizedFloat double getMotorMaximumTorque();
    @Mapping("setMotorMaximumTorque:")
    public native void setMotorMaximumTorque(@MachineSizedFloat double v);
    
    
    
    @Mapping("jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:")
    public static native SCNPhysicsSliderJoint create(SCNPhysicsBody bodyA, SCNVector3 axisA, SCNVector3 anchorA, SCNPhysicsBody bodyB, SCNVector3 axisB, SCNVector3 anchorB);
    @Mapping("jointWithBody:axis:anchor:")
    public static native SCNPhysicsSliderJoint create(SCNPhysicsBody body, SCNVector3 axis, SCNVector3 anchor);
    
}
