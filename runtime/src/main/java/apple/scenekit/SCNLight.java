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





@Library("SceneKit") @Mapping("SCNLight")
public class SCNLight 
    extends NSObject 
    implements SCNAnimatable, SCNTechniqueSupport, NSCopying {

    
    
    public SCNLight() {}
    
    
    @Mapping("type")
    public native SCNLightType getType();
    public native void setType(SCNLightType v);
    @Mapping("color")
    public native UIColor getColor();
    public native void setColor(UIColor v);
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("castsShadow")
    public native boolean castsShadow();
    public native void setCastsShadow(boolean v);
    @Mapping("shadowColor")
    public native Object getShadowColor();
    public native void setShadowColor(Object v);
    @Mapping("shadowRadius")
    public native @MachineSizedFloat double getShadowRadius();
    public native void setShadowRadius(@MachineSizedFloat double v);
    @Mapping("shadowMapSize")
    public native CGSize getShadowMapSize();
    public native void setShadowMapSize(CGSize v);
    @Mapping("shadowSampleCount")
    public native @MachineSizedUInt long getShadowSampleCount();
    public native void setShadowSampleCount(@MachineSizedUInt long v);
    @Mapping("shadowMode")
    public native @Representing("SCNShadowMode") @MachineSizedSInt long getShadowMode();
    public native void setShadowMode(@Representing("SCNShadowMode") @MachineSizedSInt long v);
    @Mapping("shadowBias")
    public native @MachineSizedFloat double getShadowBias();
    public native void setShadowBias(@MachineSizedFloat double v);
    @Mapping("orthographicScale")
    public native @MachineSizedFloat double getOrthographicScale();
    public native void setOrthographicScale(@MachineSizedFloat double v);
    @Mapping("zNear")
    public native @MachineSizedFloat double getZNear();
    public native void setZNear(@MachineSizedFloat double v);
    @Mapping("zFar")
    public native @MachineSizedFloat double getZFar();
    public native void setZFar(@MachineSizedFloat double v);
    @Mapping("attenuationStartDistance")
    public native @MachineSizedFloat double getAttenuationStartDistance();
    public native void setAttenuationStartDistance(@MachineSizedFloat double v);
    @Mapping("attenuationEndDistance")
    public native @MachineSizedFloat double getAttenuationEndDistance();
    public native void setAttenuationEndDistance(@MachineSizedFloat double v);
    @Mapping("attenuationFalloffExponent")
    public native @MachineSizedFloat double getAttenuationFalloffExponent();
    public native void setAttenuationFalloffExponent(@MachineSizedFloat double v);
    @Mapping("spotInnerAngle")
    public native @MachineSizedFloat double getSpotInnerAngle();
    public native void setSpotInnerAngle(@MachineSizedFloat double v);
    @Mapping("spotOuterAngle")
    public native @MachineSizedFloat double getSpotOuterAngle();
    public native void setSpotOuterAngle(@MachineSizedFloat double v);
    @Mapping("gobo")
    public native SCNMaterialProperty getGobo();
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    @Mapping("technique")
    public native SCNTechnique getTechnique();
    public native void setTechnique(SCNTechnique v);
    
    
    
    @Mapping("light")
    public static native SCNLight create();
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
