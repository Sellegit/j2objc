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


@Library("SpriteKit/SpriteKit.h") @Mapping("SKPhysicsContact")
public class SKPhysicsContact 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SKPhysicsContact() { }

    
    @Mapping("bodyA")
    public native SKPhysicsBody getBodyA();
    @Mapping("bodyB")
    public native SKPhysicsBody getBodyB();
    @Mapping("contactPoint")
    public native CGPoint getContactPoint();
    @Mapping("contactNormal")
    public native CGVector getContactNormal();
    @Mapping("collisionImpulse")
    public native @MachineSizedFloat double getCollisionImpulse();

    
    


}
