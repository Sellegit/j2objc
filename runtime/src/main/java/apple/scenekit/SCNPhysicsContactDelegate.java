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





@Library("SceneKit/SceneKit.h") @Mapping("SCNPhysicsContactDelegate")
public interface SCNPhysicsContactDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("physicsWorld:didBeginContact:")
    void didBeginContact(SCNPhysicsWorld world, SCNPhysicsContact contact);
    @Mapping("physicsWorld:didUpdateContact:")
    void didUpdateContact(SCNPhysicsWorld world, SCNPhysicsContact contact);
    @Mapping("physicsWorld:didEndContact:")
    void didEndContact(SCNPhysicsWorld world, SCNPhysicsContact contact);
    
    /*<adapter>*/
    /*</adapter>*/
}
