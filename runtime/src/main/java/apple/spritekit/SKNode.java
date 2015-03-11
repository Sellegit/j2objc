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





@Library("SpriteKit") @Mapping("SKNode")
public class SKNode 
    extends UIResponder 
    implements NSCopying, NSCoding {

    
    
    public SKNode() {}
    @Mapping("initWithCoder:")
    public SKNode(NSCoder aDecoder) { }
    
    
    @Mapping("frame")
    public native CGRect getFrame();
    @Mapping("position")
    public native CGPoint getPosition();
    @Mapping("setPosition:")
    public native void setPosition(CGPoint v);
    @Mapping("zPosition")
    public native @MachineSizedFloat double getZPosition();
    @Mapping("setZPosition:")
    public native void setZPosition(@MachineSizedFloat double v);
    @Mapping("zRotation")
    public native @MachineSizedFloat double getZRotation();
    @Mapping("setZRotation:")
    public native void setZRotation(@MachineSizedFloat double v);
    @Mapping("xScale")
    public native @MachineSizedFloat double getXScale();
    @Mapping("setXScale:")
    public native void setXScale(@MachineSizedFloat double v);
    @Mapping("yScale")
    public native @MachineSizedFloat double getYScale();
    @Mapping("setYScale:")
    public native void setYScale(@MachineSizedFloat double v);
    @Mapping("speed")
    public native @MachineSizedFloat double getSpeed();
    @Mapping("setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    @Mapping("alpha")
    public native @MachineSizedFloat double getAlpha();
    @Mapping("setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("setPaused:")
    public native void setPaused(boolean v);
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Mapping("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Mapping("parent")
    public native SKNode getParent();
    @Mapping("children")
    public native NSArray<SKNode> getChildren();
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("scene")
    public native SKScene getScene();
    @Mapping("physicsBody")
    public native SKPhysicsBody getPhysicsBody();
    @Mapping("setPhysicsBody:")
    public native void setPhysicsBody(SKPhysicsBody v);
    @Mapping("userData")
    public native NSMutableDictionary<?, ?> getUserData();
    @Mapping("setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> v);
    @Mapping("reachConstraints")
    public native SKReachConstraints getReachConstraints();
    @Mapping("setReachConstraints:")
    public native void setReachConstraints(SKReachConstraints v);
    @Mapping("constraints")
    public native NSArray<SKConstraint> getConstraints();
    @Mapping("setConstraints:")
    public native void setConstraints(NSArray<SKConstraint> v);
    
    
    
    @Mapping("calculateAccumulatedFrame")
    public native CGRect calculateAccumulatedFrame();
    @Mapping("setScale:")
    public native void setScale(@MachineSizedFloat double scale);
    @Mapping("addChild:")
    public native void addChild(SKNode node);
    @Mapping("insertChild:atIndex:")
    public native void insertChild(SKNode node, @MachineSizedSInt long index);
    @Mapping("removeChildrenInArray:")
    public native void removeChildren(NSArray<SKNode> nodes);
    @Mapping("removeAllChildren")
    public native void removeAllChildren();
    @Mapping("removeFromParent")
    public native void removeFromParent();
    @Mapping("childNodeWithName:")
    public native SKNode getChild(String name);
    @Mapping("enumerateChildNodesWithName:usingBlock:")
    public native void enumerateChildNodes(String name, @Block VoidBlock2<SKNode, Todo> block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("objectForKeyedSubscript:")
    public native NSArray<SKNode> findNodesByName(String name);
    @Mapping("inParentHierarchy:")
    public native boolean isInParentHierarchy(SKNode parent);
    @Mapping("runAction:")
    public native void runAction(SKAction action);
    @Mapping("runAction:completion:")
    public native void runAction(SKAction action, @Block Runnable block);
    @Mapping("runAction:withKey:")
    public native void runAction(SKAction action, String key);
    @Mapping("hasActions")
    public native boolean hasActions();
    @Mapping("actionForKey:")
    public native SKAction getAction(String key);
    @Mapping("removeActionForKey:")
    public native void removeAction(String key);
    @Mapping("removeAllActions")
    public native void removeAllActions();
    @Mapping("containsPoint:")
    public native boolean containsPoint(CGPoint p);
    @Mapping("nodeAtPoint:")
    public native SKNode getNodeAtPoint(CGPoint p);
    @Mapping("nodesAtPoint:")
    public native NSArray<SKNode> getNodesAtPoint(CGPoint p);
    @Mapping("convertPoint:fromNode:")
    public native CGPoint convertPointFromNode(CGPoint point, SKNode node);
    @Mapping("convertPoint:toNode:")
    public native CGPoint convertPointToNode(CGPoint point, SKNode node);
    @Mapping("intersectsNode:")
    public native boolean intersectsNode(SKNode node);
    @Mapping("node")
    public static native SKNode create();
    @Mapping("nodeWithFileNamed:")
    private static native SKNode create(String filename);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
