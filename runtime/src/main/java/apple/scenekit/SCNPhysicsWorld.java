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





@Library("SceneKit") @Mapping("SCNPhysicsWorld")
public class SCNPhysicsWorld 
    extends NSObject 
     {

    
    
    public SCNPhysicsWorld() {}
    
    
    @Mapping("gravity")
    public native SCNVector3 getGravity();
    public native void setGravity(SCNVector3 v);
    @Mapping("speed")
    public native @MachineSizedFloat double getSpeed();
    public native void setSpeed(@MachineSizedFloat double v);
    @Mapping("timeStep")
    public native double getTimeStep();
    public native void setTimeStep(double v);
    @Mapping("contactDelegate")
    public native SCNPhysicsContactDelegate getContactDelegate();
    public native void setContactDelegate(SCNPhysicsContactDelegate v);
    
    
    
    @Mapping("addBehavior:")
    public native void addBehavior(SCNPhysicsBehavior behavior);
    @Mapping("removeBehavior:")
    public native void removeBehavior(SCNPhysicsBehavior behavior);
    @Mapping("removeAllBehaviors")
    public native void removeAllBehaviors();
    @Mapping("allBehaviors")
    public native NSArray<SCNPhysicsBehavior> getAllBehaviors();
    @Mapping("rayTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<SCNHitTestResult> rayTestWithSegment(SCNVector3 origin, SCNVector3 dest, SCNPhysicsTestOptions options);
    @Mapping("contactTestBetweenBody:andBody:options:")
    public native NSArray<SCNHitTestResult> contactTestBetweenBodies(SCNPhysicsBody bodyA, SCNPhysicsBody bodyB, SCNPhysicsTestOptions options);
    @Mapping("contactTestWithBody:options:")
    public native NSArray<SCNHitTestResult> contactTestWithBody(SCNPhysicsBody body, SCNPhysicsTestOptions options);
    @Mapping("convexSweepTestWithShape:fromTransform:toTransform:options:")
    public native NSArray<SCNHitTestResult> convexSweepTestWithShape(SCNPhysicsShape shape, SCNMatrix4 from, SCNMatrix4 to, SCNPhysicsTestOptions options);
    @Mapping("updateCollisionPairs")
    public native void updateCollisionPairs();
    
}
