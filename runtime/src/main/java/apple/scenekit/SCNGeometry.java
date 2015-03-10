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





@Library("SceneKit") @Mapping("SCNGeometry")
public class SCNGeometry 
    extends NSObject 
    implements SCNAnimatable, SCNBoundingVolume, SCNShadable, NSCopying {

    
    
    public SCNGeometry() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("materials")
    public native NSArray<SCNMaterial> getMaterials();
    public native void setMaterials(NSArray<SCNMaterial> v);
    @Mapping("firstMaterial")
    public native SCNMaterial getFirstMaterial();
    public native void setFirstMaterial(SCNMaterial v);
    @Mapping("geometryElementCount")
    public native @MachineSizedSInt long getGeometryElementCount();
    @Mapping("levelsOfDetail")
    public native NSArray<SCNLevelOfDetail> getLevelsOfDetail();
    public native void setLevelsOfDetail(NSArray<SCNLevelOfDetail> v);
    @Mapping("subdivisionLevel")
    public native @MachineSizedUInt long getSubdivisionLevel();
    public native void setSubdivisionLevel(@MachineSizedUInt long v);
    @Mapping("edgeCreasesElement")
    public native SCNGeometryElement getEdgeCreasesElement();
    public native void setEdgeCreasesElement(SCNGeometryElement v);
    @Mapping("edgeCreasesSource")
    public native SCNGeometrySource getEdgeCreasesSource();
    public native void setEdgeCreasesSource(SCNGeometrySource v);
    @Mapping("shaderModifiers")
    public native Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    public native void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v);
    @Mapping("program")
    public native SCNProgram getProgram();
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
    public static native SCNGeometry create(NSArray<SCNGeometrySource> sources, NSArray<SCNGeometryElement> elements);
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
    public native boolean getBoundingBox(Todo min, Todo max);
    @Mapping("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphere(Todo center, Todo radius);
    @Mapping("setBoundingBoxMin:max:")
    public native void setBoundingBox(Todo min, Todo max);
    @Mapping("handleBindingOfSymbol:usingBlock:")
    public native void handleBindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Mapping("handleUnbindingOfSymbol:usingBlock:")
    public native void handleUnbindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
