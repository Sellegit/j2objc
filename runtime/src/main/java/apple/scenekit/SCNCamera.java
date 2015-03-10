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





@Library("SceneKit") @Mapping("SCNCamera")
public class SCNCamera 
    extends NSObject 
    implements SCNAnimatable, SCNTechniqueSupport, NSCopying {

    
    
    public SCNCamera() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("xFov")
    public native double getXFov();
    public native void setXFov(double v);
    @Mapping("yFov")
    public native double getYFov();
    public native void setYFov(double v);
    @Mapping("zNear")
    public native double getZNear();
    public native void setZNear(double v);
    @Mapping("zFar")
    public native double getZFar();
    public native void setZFar(double v);
    @Mapping("automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();
    public native void setAutomaticallyAdjustsZRange(boolean v);
    @Mapping("usesOrthographicProjection")
    public native boolean usesOrthographicProjection();
    public native void setUsesOrthographicProjection(boolean v);
    @Mapping("orthographicScale")
    public native double getOrthographicScale();
    public native void setOrthographicScale(double v);
    @Mapping("focalDistance")
    public native @MachineSizedFloat double getFocalDistance();
    public native void setFocalDistance(@MachineSizedFloat double v);
    @Mapping("focalSize")
    public native @MachineSizedFloat double getFocalSize();
    public native void setFocalSize(@MachineSizedFloat double v);
    @Mapping("focalBlurRadius")
    public native @MachineSizedFloat double getFocalBlurRadius();
    public native void setFocalBlurRadius(@MachineSizedFloat double v);
    @Mapping("aperture")
    public native @MachineSizedFloat double getAperture();
    public native void setAperture(@MachineSizedFloat double v);
    @Mapping("categoryBitMask")
    public native @MachineSizedUInt long getCategoryBitMask();
    public native void setCategoryBitMask(@MachineSizedUInt long v);
    @Mapping("technique")
    public native SCNTechnique getTechnique();
    public native void setTechnique(SCNTechnique v);
    
    
    
    @Mapping("projectionTransform")
    public native SCNMatrix4 getProjectionTransform();
    @Mapping("setProjectionTransform:")
    public native void setProjectionTransform(SCNMatrix4 projectionTransform);
    @Mapping("camera")
    public static native SCNCamera create();
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
