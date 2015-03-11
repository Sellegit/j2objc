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





@Library("SceneKit") @Mapping("SCNPhysicsBody")
public class SCNPhysicsBody 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNPhysicsBody() {}
    
    
    @Mapping("type")
    public native @Representing("SCNPhysicsBodyType") @MachineSizedSInt long getType();
    @Mapping("setType:")
    public native void setType(@Representing("SCNPhysicsBodyType") @MachineSizedSInt long v);
    @Mapping("mass")
    public native @MachineSizedFloat double getMass();
    @Mapping("setMass:")
    public native void setMass(@MachineSizedFloat double v);
    @Mapping("charge")
    public native @MachineSizedFloat double getCharge();
    @Mapping("setCharge:")
    public native void setCharge(@MachineSizedFloat double v);
    @Mapping("friction")
    public native @MachineSizedFloat double getFriction();
    @Mapping("setFriction:")
    public native void setFriction(@MachineSizedFloat double v);
    @Mapping("restitution")
    public native @MachineSizedFloat double getRestitution();
    @Mapping("setRestitution:")
    public native void setRestitution(@MachineSizedFloat double v);
    @Mapping("rollingFriction")
    public native @MachineSizedFloat double getRollingFriction();
    @Mapping("setRollingFriction:")
    public native void setRollingFriction(@MachineSizedFloat double v);
    @Mapping("physicsShape")
    public native SCNPhysicsShape getPhysicsShape();
    @Mapping("setPhysicsShape:")
    public native void setPhysicsShape(SCNPhysicsShape v);
    @Mapping("isResting")
    public native boolean isResting();
    @Mapping("allowsResting")
    public native boolean allowsResting();
    @Mapping("setAllowsResting:")
    public native void setAllowsResting(boolean v);
    @Mapping("velocity")
    public native SCNVector3 getVelocity();
    @Mapping("setVelocity:")
    public native void setVelocity(SCNVector3 v);
    @Mapping("angularVelocity")
    public native SCNVector4 getAngularVelocity();
    @Mapping("setAngularVelocity:")
    public native void setAngularVelocity(SCNVector4 v);
    @Mapping("damping")
    public native @MachineSizedFloat double getDamping();
    @Mapping("setDamping:")
    public native void setDamping(@MachineSizedFloat double v);
    @Mapping("angularDamping")
    public native @MachineSizedFloat double getAngularDamping();
    @Mapping("setAngularDamping:")
    public native void setAngularDamping(@MachineSizedFloat double v);
    @Mapping("velocityFactor")
    public native SCNVector3 getVelocityFactor();
    @Mapping("setVelocityFactor:")
    public native void setVelocityFactor(SCNVector3 v);
    @Mapping("angularVelocityFactor")
    public native SCNVector3 getAngularVelocityFactor();
    @Mapping("setAngularVelocityFactor:")
    public native void setAngularVelocityFactor(SCNVector3 v);
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    @Mapping("collisionBitMask")
    public native SCNPhysicsCollisionCategory getCollisionBitMask();
    @Mapping("setCollisionBitMask:")
    public native void setCollisionBitMask(SCNPhysicsCollisionCategory v);
    
    
    
    @Mapping("applyForce:impulse:")
    public native void applyForce(SCNVector3 direction, boolean impulse);
    @Mapping("applyForce:atPosition:impulse:")
    public native void applyForce(SCNVector3 direction, SCNVector3 position, boolean impulse);
    @Mapping("applyTorque:impulse:")
    public native void applyTorque(SCNVector4 torque, boolean impulse);
    @Mapping("clearAllForces")
    public native void clearAllForces();
    @Mapping("resetTransform")
    public native void resetTransform();
    @Mapping("staticBody")
    public static native SCNPhysicsBody createStaticBody();
    @Mapping("dynamicBody")
    public static native SCNPhysicsBody createDynamicBody();
    @Mapping("kinematicBody")
    public static native SCNPhysicsBody createKinematicBody();
    @Mapping("bodyWithType:shape:")
    public static native SCNPhysicsBody create(@Representing("SCNPhysicsBodyType") @MachineSizedSInt long type, SCNPhysicsShape shape);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
