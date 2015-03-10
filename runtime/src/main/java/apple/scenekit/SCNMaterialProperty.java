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





@Library("SceneKit") @Mapping("SCNMaterialProperty")
public class SCNMaterialProperty 
    extends NSObject 
    implements SCNAnimatable {

    
    
    public SCNMaterialProperty() {}
    
    
    @Mapping("contents")
    public native Object getContents();
    public native void setContents(Object v);
    @Mapping("intensity")
    public native @MachineSizedFloat double getIntensity();
    public native void setIntensity(@MachineSizedFloat double v);
    @Mapping("minificationFilter")
    public native @Representing("SCNFilterMode") @MachineSizedSInt long getMinificationFilter();
    public native void setMinificationFilter(@Representing("SCNFilterMode") @MachineSizedSInt long v);
    @Mapping("magnificationFilter")
    public native @Representing("SCNFilterMode") @MachineSizedSInt long getMagnificationFilter();
    public native void setMagnificationFilter(@Representing("SCNFilterMode") @MachineSizedSInt long v);
    @Mapping("mipFilter")
    public native @Representing("SCNFilterMode") @MachineSizedSInt long getMipFilter();
    public native void setMipFilter(@Representing("SCNFilterMode") @MachineSizedSInt long v);
    @Mapping("contentsTransform")
    public native SCNMatrix4 getContentsTransform();
    public native void setContentsTransform(SCNMatrix4 v);
    @Mapping("wrapS")
    public native @Representing("SCNWrapMode") @MachineSizedSInt long getWrapS();
    public native void setWrapS(@Representing("SCNWrapMode") @MachineSizedSInt long v);
    @Mapping("wrapT")
    public native @Representing("SCNWrapMode") @MachineSizedSInt long getWrapT();
    public native void setWrapT(@Representing("SCNWrapMode") @MachineSizedSInt long v);
    @Mapping("borderColor")
    public native Object getBorderColor();
    public native void setBorderColor(Object v);
    @Mapping("mappingChannel")
    public native @MachineSizedSInt long getMappingChannel();
    public native void setMappingChannel(@MachineSizedSInt long v);
    @Mapping("maxAnisotropy")
    public native @MachineSizedFloat double getMaxAnisotropy();
    public native void setMaxAnisotropy(@MachineSizedFloat double v);
    
    
    
    @Mapping("materialPropertyWithContents:")
    public static native SCNMaterialProperty create(Object contents);
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
    
}
