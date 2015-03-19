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





@Library("SceneKit/SceneKit.h") @Mapping("SCNMorpher")
public class SCNMorpher 
    extends NSObject 
    implements SCNAnimatable {

    
    
    @Mapping("init")
    public SCNMorpher() { }
    
    
    @Mapping("targets")
    public native NSArray<SCNGeometry> getTargets();
    @Mapping("setTargets:")
    public native void setTargets(NSArray<SCNGeometry> v);
    @Mapping("calculationMode")
    public native @Representing("SCNMorpherCalculationMode") long getCalculationMode();
    @Mapping("setCalculationMode:")
    public native void setCalculationMode(@Representing("SCNMorpherCalculationMode") long v);
    
    
    
    @Mapping("setWeight:forTargetAtIndex:")
    public native void setWeightForTarget(@MachineSizedFloat double weight, @MachineSizedUInt long targetIndex);
    @Mapping("weightForTargetAtIndex:")
    public native @MachineSizedFloat double getWeightForTarget(@MachineSizedUInt long targetIndex);
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
