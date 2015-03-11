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





@Library("SceneKit") @Mapping("SCNNode")
public class SCNNode 
    extends NSObject 
    implements NSCopying, SCNAnimatable, SCNActionable, SCNBoundingVolume {

    
    
    public SCNNode() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("light")
    public native SCNLight getLight();
    public native void setLight(SCNLight v);
    @Mapping("camera")
    public native SCNCamera getCamera();
    public native void setCamera(SCNCamera v);
    @Mapping("geometry")
    public native SCNGeometry getGeometry();
    public native void setGeometry(SCNGeometry v);
    @Mapping("skinner")
    public native SCNSkinner getSkinner();
    public native void setSkinner(SCNSkinner v);
    @Mapping("morpher")
    public native SCNMorpher getMorpher();
    public native void setMorpher(SCNMorpher v);
    @Mapping("transform")
    public native SCNMatrix4 getTransform();
    public native void setTransform(SCNMatrix4 v);
    @Mapping("position")
    public native SCNVector3 getPosition();
    public native void setPosition(SCNVector3 v);
    @Mapping("rotation")
    public native SCNVector4 getRotation();
    public native void setRotation(SCNVector4 v);
    @Mapping("orientation")
    public native SCNVector4 getOrientation();
    public native void setOrientation(SCNVector4 v);
    @Mapping("eulerAngles")
    public native SCNVector3 getEulerAngles();
    public native void setEulerAngles(SCNVector3 v);
    @Mapping("scale")
    public native SCNVector3 getScale();
    public native void setScale(SCNVector3 v);
    @Mapping("pivot")
    public native SCNMatrix4 getPivot();
    public native void setPivot(SCNMatrix4 v);
    @Mapping("worldTransform")
    public native SCNMatrix4 getWorldTransform();
    @Mapping("isHidden")
    public native boolean isHidden();
    public native void setHidden(boolean v);
    @Mapping("opacity")
    public native @MachineSizedFloat double getOpacity();
    public native void setOpacity(@MachineSizedFloat double v);
    @Mapping("renderingOrder")
    public native @MachineSizedSInt long getRenderingOrder();
    public native void setRenderingOrder(@MachineSizedSInt long v);
    @Mapping("castsShadow")
    public native boolean castsShadow();
    public native void setCastsShadow(boolean v);
    @Mapping("parentNode")
    public native SCNNode getParentNode();
    @Mapping("childNodes")
    public native NSArray<SCNNode> getChildNodes();
    @Mapping("physicsBody")
    public native SCNPhysicsBody getPhysicsBody();
    public native void setPhysicsBody(SCNPhysicsBody v);
    @Mapping("physicsField")
    public native SCNPhysicsField getPhysicsField();
    public native void setPhysicsField(SCNPhysicsField v);
    @Mapping("constraints")
    public native NSArray<SCNConstraint> getConstraints();
    public native void setConstraints(NSArray<SCNConstraint> v);
    @Mapping("filters")
    public native NSArray<apple.coreimage.CIFilter> getFilters();
    public native void setFilters(NSArray<apple.coreimage.CIFilter> v);
    @Mapping("isPaused")
    public native boolean isPaused();
    public native void setPaused(boolean v);
    @Mapping("rendererDelegate")
    public native SCNNodeRendererDelegate getRendererDelegate();
    public native void setRendererDelegate(SCNNodeRendererDelegate v);
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    @Mapping("particleSystems")
    public native NSArray<SCNParticleSystem> getParticleSystems();
    
    
    
    @Mapping("addChildNode:")
    public native void addChildNode(SCNNode child);
    @Mapping("insertChildNode:atIndex:")
    public native void insertChildNode(SCNNode child, @MachineSizedUInt long index);
    @Mapping("removeFromParentNode")
    public native void removeFromParentNode();
    @Mapping("replaceChildNode:with:")
    public native void replaceChildNode(SCNNode oldChild, SCNNode newChild);
    @Mapping("childNodeWithName:recursively:")
    public native SCNNode findChildNodeWithName(String name, boolean recursively);
    @Mapping("childNodesPassingTest:")
    public native NSArray<SCNNode> getChildNodesPassingTest(@Block Block2<SCNNode, Todo, Boolean> predicate);
    @Mapping("enumerateChildNodesUsingBlock:")
    public native void enumerateChildNodes(@Block VoidBlock2<SCNNode, Todo> block);
    @Mapping("convertPosition:toNode:")
    public native SCNVector3 convertPositionToNode(SCNVector3 position, SCNNode node);
    @Mapping("convertPosition:fromNode:")
    public native SCNVector3 convertPositionFromNode(SCNVector3 position, SCNNode node);
    @Mapping("convertTransform:toNode:")
    public native SCNMatrix4 convertTransformToNode(SCNMatrix4 transform, SCNNode node);
    @Mapping("convertTransform:fromNode:")
    public native SCNMatrix4 convertTransformFromNode(SCNMatrix4 transform, SCNNode node);
    @Mapping("presentationNode")
    public native SCNNode getPresentationNode();
    @Mapping("hitTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<SCNHitTestResult> hitTestWithSegment(SCNVector3 pointA, SCNVector3 pointB, SCNHitTestOptions options);
    @Mapping("node")
    public static native SCNNode create();
    @Mapping("nodeWithGeometry:")
    public static native SCNNode create(SCNGeometry geometry);
    @Mapping("addParticleSystem:")
    public native void addParticleSystem(SCNParticleSystem system);
    @Mapping("removeAllParticleSystems")
    public native void removeAllParticleSystems();
    @Mapping("removeParticleSystem:")
    public native void removeParticleSystem(SCNParticleSystem system);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("addAnimation:forKey:")
    public native void addAnimation(CAAnimation animation, String key);
    @Mapping("removeAllAnimations")
    public native void removeAllAnimations();
    @Mapping("removeAnimationForKey:")
    public native void removeAnimation(String key);
    @Mapping("animationKeys")
    public native List<String> getAnimationKeys();
    @Mapping("animationForKey:")
    public native CAAnimation getAnimation(String key);
    @Mapping("pauseAnimationForKey:")
    public native void pauseAnimation(String key);
    @Mapping("resumeAnimationForKey:")
    public native void resumeAnimation(String key);
    @Mapping("isAnimationForKeyPaused:")
    public native boolean isAnimationPaused(String key);
    @Mapping("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimation(String key, @MachineSizedFloat double duration);
    @Mapping("runAction:")
    public native void runAction(SCNAction action);
    @Mapping("runAction:completionHandler:")
    public native void runAction(SCNAction action, @Block Runnable block);
    @Mapping("runAction:forKey:")
    public native void runAction(SCNAction action, String key);
    @Mapping("runAction:forKey:completionHandler:")
    public native void runAction(SCNAction action, String key, @Block Runnable block);
    @Mapping("hasActions")
    public native boolean hasActions();
    @Mapping("actionForKey:")
    public native SCNAction getAction(String key);
    @Mapping("removeActionForKey:")
    public native void removeAction(String key);
    @Mapping("removeAllActions")
    public native void removeAllActions();
    @Mapping("getBoundingBoxMin:max:")
    public native boolean getBoundingBox(Todo min, Todo max);
    @Mapping("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(Todo center, Todo radius);
    @Mapping("setBoundingBoxMin:max:")
    public native void setBoundingBox(Todo min, Todo max);
    
}
