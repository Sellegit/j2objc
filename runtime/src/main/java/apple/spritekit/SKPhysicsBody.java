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





@Library("SpriteKit") @Mapping("SKPhysicsBody")
public class SKPhysicsBody 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public SKPhysicsBody() {}
    
    
    @Mapping("isDynamic")
    public native boolean isDynamic();
    @Mapping("setDynamic:")
    public native void setDynamic(boolean v);
    @Mapping("usesPreciseCollisionDetection")
    public native boolean usesPreciseCollisionDetection();
    @Mapping("setUsesPreciseCollisionDetection:")
    public native void setUsesPreciseCollisionDetection(boolean v);
    @Mapping("allowsRotation")
    public native boolean allowsRotation();
    @Mapping("setAllowsRotation:")
    public native void setAllowsRotation(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("pinned")
    public native boolean isPinned();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPinned:")
    public native void setPinned(boolean v);
    @Mapping("isResting")
    public native boolean isResting();
    @Mapping("setResting:")
    public native void setResting(boolean v);
    @Mapping("friction")
    public native @MachineSizedFloat double getFriction();
    @Mapping("setFriction:")
    public native void setFriction(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("charge")
    public native @MachineSizedFloat double getCharge();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setCharge:")
    public native void setCharge(@MachineSizedFloat double v);
    @Mapping("restitution")
    public native @MachineSizedFloat double getRestitution();
    @Mapping("setRestitution:")
    public native void setRestitution(@MachineSizedFloat double v);
    @Mapping("linearDamping")
    public native @MachineSizedFloat double getLinearDamping();
    @Mapping("setLinearDamping:")
    public native void setLinearDamping(@MachineSizedFloat double v);
    @Mapping("angularDamping")
    public native @MachineSizedFloat double getAngularDamping();
    @Mapping("setAngularDamping:")
    public native void setAngularDamping(@MachineSizedFloat double v);
    @Mapping("density")
    public native @MachineSizedFloat double getDensity();
    @Mapping("setDensity:")
    public native void setDensity(@MachineSizedFloat double v);
    @Mapping("mass")
    public native @MachineSizedFloat double getMass();
    @Mapping("setMass:")
    public native void setMass(@MachineSizedFloat double v);
    @Mapping("area")
    public native @MachineSizedFloat double getArea();
    @Mapping("affectedByGravity")
    public native boolean isAffectedByGravity();
    @Mapping("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("fieldBitMask")
    public native int getFieldBitMask();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setFieldBitMask:")
    public native void setFieldBitMask(int v);
    @Mapping("categoryBitMask")
    public native int getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
    public native void setCategoryBitMask(int v);
    @Mapping("collisionBitMask")
    public native int getCollisionBitMask();
    @Mapping("setCollisionBitMask:")
    public native void setCollisionBitMask(int v);
    @Mapping("contactTestBitMask")
    public native int getContactTestBitMask();
    @Mapping("setContactTestBitMask:")
    public native void setContactTestBitMask(int v);
    @Mapping("joints")
    public native NSArray<SKPhysicsJoint> getJoints();
    @Mapping("node")
    public native SKNode getNode();
    @Mapping("velocity")
    public native CGVector getVelocity();
    @Mapping("setVelocity:")
    public native void setVelocity(CGVector v);
    @Mapping("angularVelocity")
    public native @MachineSizedFloat double getAngularVelocity();
    @Mapping("setAngularVelocity:")
    public native void setAngularVelocity(@MachineSizedFloat double v);
    
    
    
    @Mapping("applyForce:")
    public native void applyForce(CGVector force);
    @Mapping("applyForce:atPoint:")
    public native void applyForce(CGVector force, CGPoint point);
    @Mapping("applyTorque:")
    public native void applyTorque(@MachineSizedFloat double torque);
    @Mapping("applyImpulse:")
    public native void applyImpulse(CGVector impulse);
    @Mapping("applyImpulse:atPoint:")
    public native void applyImpulse(CGVector impulse, CGPoint point);
    @Mapping("applyAngularImpulse:")
    public native void applyAngularImpulse(@MachineSizedFloat double impulse);
    @Mapping("allContactedBodies")
    public native NSArray<SKPhysicsBody> getAllContactedBodies();
    @Mapping("bodyWithCircleOfRadius:")
    public static native SKPhysicsBody createCircle(@MachineSizedFloat double r);
    @Mapping("bodyWithCircleOfRadius:center:")
    public static native SKPhysicsBody createCircle(@MachineSizedFloat double r, CGPoint center);
    @Mapping("bodyWithRectangleOfSize:")
    public static native SKPhysicsBody createRectangle(CGSize s);
    @Mapping("bodyWithRectangleOfSize:center:")
    public static native SKPhysicsBody createRectangle(CGSize s, CGPoint center);
    @Mapping("bodyWithPolygonFromPath:")
    public static native SKPhysicsBody createPolygon(CGPath path);
    @Mapping("bodyWithEdgeFromPoint:toPoint:")
    public static native SKPhysicsBody createEdge(CGPoint p1, CGPoint p2);
    @Mapping("bodyWithEdgeChainFromPath:")
    public static native SKPhysicsBody createEdgeChain(CGPath path);
    @Mapping("bodyWithEdgeLoopFromPath:")
    public static native SKPhysicsBody createEdgeLoop(CGPath path);
    @Mapping("bodyWithEdgeLoopFromRect:")
    public static native SKPhysicsBody createEdgeLoop(CGRect rect);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("bodyWithTexture:size:")
    public static native SKPhysicsBody createWithTexture(SKTexture texture, CGSize size);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("bodyWithTexture:alphaThreshold:size:")
    public static native SKPhysicsBody createWithTexture(SKTexture texture, float alphaThreshold, CGSize size);
    @Mapping("bodyWithBodies:")
    public static native SKPhysicsBody createWithBodies(NSArray<?> bodies);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
