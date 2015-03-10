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





@Library("SpriteKit") @Mapping("SKPhysicsWorld")
public class SKPhysicsWorld 
    extends NSObject 
    implements NSCoding {

    
    
    public SKPhysicsWorld() {}
    
    
    @Mapping("gravity")
    public native CGVector getGravity();
    public native void setGravity(CGVector v);
    @Mapping("speed")
    public native @MachineSizedFloat double getSpeed();
    public native void setSpeed(@MachineSizedFloat double v);
    @Mapping("contactDelegate")
    public native SKPhysicsContactDelegate getContactDelegate();
    public native void setContactDelegate(SKPhysicsContactDelegate v);
    
    
    
    @Mapping("addJoint:")
    public native void addJoint(SKPhysicsJoint joint);
    @Mapping("removeJoint:")
    public native void removeJoint(SKPhysicsJoint joint);
    @Mapping("removeAllJoints")
    public native void removeAllJoints();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("sampleFieldsAt:")
    public native SKVector3 sampleFieldsAt(SKVector3 position);
    @Mapping("bodyAtPoint:")
    public native SKPhysicsBody getBodyAtPoint(CGPoint point);
    @Mapping("bodyInRect:")
    public native SKPhysicsBody getBodyInRect(CGRect rect);
    @Mapping("bodyAlongRayStart:end:")
    public native SKPhysicsBody getBodyAlongRay(CGPoint start, CGPoint end);
    @Mapping("enumerateBodiesAtPoint:usingBlock:")
    public native void enumerateBodiesAtPoint(CGPoint point, @Block VoidBlock2<SKPhysicsBody, Todo> block);
    @Mapping("enumerateBodiesInRect:usingBlock:")
    public native void enumerateBodiesInRect(CGRect rect, @Block VoidBlock2<SKPhysicsBody, Todo> block);
    @Mapping("enumerateBodiesAlongRayStart:end:usingBlock:")
    public native void enumerateBodiesAlongRay(CGPoint start, CGPoint end, @Block VoidBlock4<SKPhysicsBody, CGPoint, CGVector, Todo> block);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
