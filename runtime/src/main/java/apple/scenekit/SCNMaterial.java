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





@Library("SceneKit") @Mapping("SCNMaterial")
public class SCNMaterial 
    extends NSObject 
    implements SCNAnimatable, SCNShadable, NSCopying {

    
    
    public SCNMaterial() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("diffuse")
    public native SCNMaterialProperty getDiffuse();
    @Mapping("ambient")
    public native SCNMaterialProperty getAmbient();
    @Mapping("specular")
    public native SCNMaterialProperty getSpecular();
    @Mapping("emission")
    public native SCNMaterialProperty getEmission();
    @Mapping("transparent")
    public native SCNMaterialProperty getTransparent();
    @Mapping("reflective")
    public native SCNMaterialProperty getReflective();
    @Mapping("multiply")
    public native SCNMaterialProperty getMultiply();
    @Mapping("normal")
    public native SCNMaterialProperty getNormal();
    @Mapping("shininess")
    public native @MachineSizedFloat double getShininess();
    public native void setShininess(@MachineSizedFloat double v);
    @Mapping("transparency")
    public native @MachineSizedFloat double getTransparency();
    public native void setTransparency(@MachineSizedFloat double v);
    @Mapping("lightingModelName")
    public native String getLightingModelName();
    public native void setLightingModelName(String v);
    @Mapping("isLitPerPixel")
    public native boolean isLitPerPixel();
    public native void setLitPerPixel(boolean v);
    @Mapping("isDoubleSided")
    public native boolean isDoubleSided();
    public native void setDoubleSided(boolean v);
    @Mapping("cullMode")
    public native @Representing("SCNCullMode") @MachineSizedSInt long getCullMode();
    public native void setCullMode(@Representing("SCNCullMode") @MachineSizedSInt long v);
    @Mapping("transparencyMode")
    public native @Representing("SCNTransparencyMode") @MachineSizedSInt long getTransparencyMode();
    public native void setTransparencyMode(@Representing("SCNTransparencyMode") @MachineSizedSInt long v);
    @Mapping("locksAmbientWithDiffuse")
    public native boolean locksAmbientWithDiffuse();
    public native void setLocksAmbientWithDiffuse(boolean v);
    @Mapping("writesToDepthBuffer")
    public native boolean writesToDepthBuffer();
    public native void setWritesToDepthBuffer(boolean v);
    @Mapping("readsFromDepthBuffer")
    public native boolean readsFromDepthBuffer();
    public native void setReadsFromDepthBuffer(boolean v);
    @Mapping("fresnelExponent")
    public native @MachineSizedFloat double getFresnelExponent();
    public native void setFresnelExponent(@MachineSizedFloat double v);
    @Mapping("shaderModifiers")
    public native Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    public native void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v);
    @Mapping("program")
    public native SCNProgram getProgram();
    public native void setProgram(SCNProgram v);
    
    
    
    @Mapping("material")
    public static native SCNMaterial create();
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
    @Mapping("handleBindingOfSymbol:usingBlock:")
    public native void handleBindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Mapping("handleUnbindingOfSymbol:usingBlock:")
    public native void handleUnbindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
