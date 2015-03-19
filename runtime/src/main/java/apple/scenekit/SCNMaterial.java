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





@Library("SceneKit/SceneKit.h") @Mapping("SCNMaterial")
public class SCNMaterial 
    extends NSObject 
    implements SCNAnimatable, SCNShadable, NSCopying {

    
    
    @Mapping("init")
    public SCNMaterial() { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
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
    @Mapping("setShininess:")
    public native void setShininess(@MachineSizedFloat double v);
    @Mapping("transparency")
    public native @MachineSizedFloat double getTransparency();
    @Mapping("setTransparency:")
    public native void setTransparency(@MachineSizedFloat double v);
    @Mapping("lightingModelName")
    public native String getLightingModelName();
    @Mapping("setLightingModelName:")
    public native void setLightingModelName(String v);
    @Mapping("isLitPerPixel")
    public native boolean isLitPerPixel();
    @Mapping("setLitPerPixel:")
    public native void setLitPerPixel(boolean v);
    @Mapping("isDoubleSided")
    public native boolean isDoubleSided();
    @Mapping("setDoubleSided:")
    public native void setDoubleSided(boolean v);
    @Mapping("cullMode")
    public native @Representing("SCNCullMode") long getCullMode();
    @Mapping("setCullMode:")
    public native void setCullMode(@Representing("SCNCullMode") long v);
    @Mapping("transparencyMode")
    public native @Representing("SCNTransparencyMode") long getTransparencyMode();
    @Mapping("setTransparencyMode:")
    public native void setTransparencyMode(@Representing("SCNTransparencyMode") long v);
    @Mapping("locksAmbientWithDiffuse")
    public native boolean locksAmbientWithDiffuse();
    @Mapping("setLocksAmbientWithDiffuse:")
    public native void setLocksAmbientWithDiffuse(boolean v);
    @Mapping("writesToDepthBuffer")
    public native boolean writesToDepthBuffer();
    @Mapping("setWritesToDepthBuffer:")
    public native void setWritesToDepthBuffer(boolean v);
    @Mapping("readsFromDepthBuffer")
    public native boolean readsFromDepthBuffer();
    @Mapping("setReadsFromDepthBuffer:")
    public native void setReadsFromDepthBuffer(boolean v);
    @Mapping("fresnelExponent")
    public native @MachineSizedFloat double getFresnelExponent();
    @Mapping("setFresnelExponent:")
    public native void setFresnelExponent(@MachineSizedFloat double v);
    @Mapping("shaderModifiers")
    public native Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    @Mapping("setShaderModifiers:")
    public native void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v);
    @Mapping("program")
    public native SCNProgram getProgram();
    @Mapping("setProgram:")
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
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
