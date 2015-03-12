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
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("light")
    public native SCNLight getLight();
    @Mapping("setLight:")
    public native void setLight(SCNLight v);
    @Mapping("camera")
    public native SCNCamera getCamera();
    @Mapping("setCamera:")
    public native void setCamera(SCNCamera v);
    @Mapping("geometry")
    public native SCNGeometry getGeometry();
    @Mapping("setGeometry:")
    public native void setGeometry(SCNGeometry v);
    @Mapping("skinner")
    public native SCNSkinner getSkinner();
    @Mapping("setSkinner:")
    public native void setSkinner(SCNSkinner v);
    @Mapping("morpher")
    public native SCNMorpher getMorpher();
    @Mapping("setMorpher:")
    public native void setMorpher(SCNMorpher v);
    @Mapping("transform")
    public native SCNMatrix4 getTransform();
    @Mapping("setTransform:")
    public native void setTransform(SCNMatrix4 v);
    @Mapping("position")
    public native SCNVector3 getPosition();
    @Mapping("setPosition:")
    public native void setPosition(SCNVector3 v);
    @Mapping("rotation")
    public native SCNVector4 getRotation();
    @Mapping("setRotation:")
    public native void setRotation(SCNVector4 v);
    @Mapping("orientation")
    public native SCNVector4 getOrientation();
    @Mapping("setOrientation:")
    public native void setOrientation(SCNVector4 v);
    @Mapping("eulerAngles")
    public native SCNVector3 getEulerAngles();
    @Mapping("setEulerAngles:")
    public native void setEulerAngles(SCNVector3 v);
    @Mapping("scale")
    public native SCNVector3 getScale();
    @Mapping("setScale:")
    public native void setScale(SCNVector3 v);
    @Mapping("pivot")
    public native SCNMatrix4 getPivot();
    @Mapping("setPivot:")
    public native void setPivot(SCNMatrix4 v);
    @Mapping("worldTransform")
    public native SCNMatrix4 getWorldTransform();
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("opacity")
    public native @MachineSizedFloat double getOpacity();
    @Mapping("setOpacity:")
    public native void setOpacity(@MachineSizedFloat double v);
    @Mapping("renderingOrder")
    public native @MachineSizedSInt long getRenderingOrder();
    @Mapping("setRenderingOrder:")
    public native void setRenderingOrder(@MachineSizedSInt long v);
    @Mapping("castsShadow")
    public native boolean castsShadow();
    @Mapping("setCastsShadow:")
    public native void setCastsShadow(boolean v);
    @Mapping("parentNode")
    public native SCNNode getParentNode();
    @Mapping("childNodes")
    public native NSArray<SCNNode> getChildNodes();
    @Mapping("physicsBody")
    public native SCNPhysicsBody getPhysicsBody();
    @Mapping("setPhysicsBody:")
    public native void setPhysicsBody(SCNPhysicsBody v);
    @Mapping("physicsField")
    public native SCNPhysicsField getPhysicsField();
    @Mapping("setPhysicsField:")
    public native void setPhysicsField(SCNPhysicsField v);
    @Mapping("constraints")
    public native NSArray<SCNConstraint> getConstraints();
    @Mapping("setConstraints:")
    public native void setConstraints(NSArray<SCNConstraint> v);
    @Mapping("filters")
    public native NSArray<apple.coreimage.CIFilter> getFilters();
    @Mapping("setFilters:")
    public native void setFilters(NSArray<apple.coreimage.CIFilter> v);
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("setPaused:")
    public native void setPaused(boolean v);
    @Mapping("rendererDelegate")
    public native SCNNodeRendererDelegate getRendererDelegate();
    @Mapping("setRendererDelegate:")
    public native void setRendererDelegate(SCNNodeRendererDelegate v);
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    @Mapping("setCategoryBitMask:")
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
    public native NSArray<SCNHitTestResult> hitTestWithSegment(SCNVector3 pointA, SCNVector3 pointB, NSDictionary<?, ?> options);
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
    public native boolean getBoundingBox(SCNVector3 min, SCNVector3 max);
    @Mapping("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(SCNVector3 center, Todo radius);
    @Mapping("setBoundingBoxMin:max:")
    public native void setBoundingBox(SCNVector3 min, SCNVector3 max);
    
}
