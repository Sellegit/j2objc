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





@Library("SceneKit/SceneKit.h") @Mapping("SCNGeometry")
public class SCNGeometry 
    extends NSObject 
    implements SCNAnimatable, SCNBoundingVolume, SCNShadable, NSCopying {

    
    
    @Mapping("init")
    public SCNGeometry() { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("materials")
    public native NSArray<SCNMaterial> getMaterials();
    @Mapping("setMaterials:")
    public native void setMaterials(NSArray<SCNMaterial> v);
    @Mapping("firstMaterial")
    public native SCNMaterial getFirstMaterial();
    @Mapping("setFirstMaterial:")
    public native void setFirstMaterial(SCNMaterial v);
    @Mapping("geometryElementCount")
    public native @MachineSizedSInt long getGeometryElementCount();
    @Mapping("levelsOfDetail")
    public native NSArray<SCNLevelOfDetail> getLevelsOfDetail();
    @Mapping("setLevelsOfDetail:")
    public native void setLevelsOfDetail(NSArray<SCNLevelOfDetail> v);
    @Mapping("subdivisionLevel")
    public native @MachineSizedUInt long getSubdivisionLevel();
    @Mapping("setSubdivisionLevel:")
    public native void setSubdivisionLevel(@MachineSizedUInt long v);
    @Mapping("edgeCreasesElement")
    public native SCNGeometryElement getEdgeCreasesElement();
    @Mapping("setEdgeCreasesElement:")
    public native void setEdgeCreasesElement(SCNGeometryElement v);
    @Mapping("edgeCreasesSource")
    public native SCNGeometrySource getEdgeCreasesSource();
    @Mapping("setEdgeCreasesSource:")
    public native void setEdgeCreasesSource(SCNGeometrySource v);
    @Mapping("shaderModifiers")
    public native Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    @Mapping("setShaderModifiers:")
    public native void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v);
    @Mapping("program")
    public native SCNProgram getProgram();
    @Mapping("setProgram:")
    public native void setProgram(SCNProgram v);
    
    
    
    @Mapping("insertMaterial:atIndex:")
    public native void insertMaterial(SCNMaterial material, @MachineSizedUInt long index);
    @Mapping("removeMaterialAtIndex:")
    public native void removeMaterial(@MachineSizedUInt long index);
    @Mapping("replaceMaterialAtIndex:withMaterial:")
    public native void replaceMaterial(@MachineSizedUInt long index, SCNMaterial material);
    @Mapping("materialWithName:")
    public native SCNMaterial getMaterial(String name);
    @Mapping("geometrySourcesForSemantic:")
    public native NSArray<SCNGeometrySource> getGeometrySourcesForSemantic(String semantic);
    @Mapping("geometryElementAtIndex:")
    public native SCNGeometryElement getGeometryElement(@MachineSizedSInt long elementIndex);
    @Mapping("geometry")
    public static native SCNGeometry create();
    @Mapping("geometryWithSources:elements:")
    public static native SCNGeometry create(NSArray<?> sources, NSArray<?> elements);
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
    @Mapping("getBoundingBoxMin:max:")
    public native boolean getBoundingBox(SCNVector3 min, SCNVector3 max);
    @Mapping("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(SCNVector3 center, Todo radius);
    @Mapping("setBoundingBoxMin:max:")
    public native void setBoundingBox(SCNVector3 min, SCNVector3 max);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
