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





@Library("SceneKit") @Mapping("SCNPhysicsContact")
public class SCNPhysicsContact 
    extends NSObject 
     {

    
    
    public SCNPhysicsContact() {}
    
    
    @Mapping("nodeA")
    public native SCNNode getNodeA();
    @Mapping("nodeB")
    public native SCNNode getNodeB();
    @Mapping("contactPoint")
    public native SCNVector3 getContactPoint();
    @Mapping("contactNormal")
    public native SCNVector3 getContactNormal();
    @Mapping("collisionImpulse")
    public native @MachineSizedFloat double getCollisionImpulse();
    @Mapping("penetrationDistance")
    public native @MachineSizedFloat double getPenetrationDistance();
    
    
    
    
    
}
