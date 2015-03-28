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


@Library("SceneKit/SceneKit.h") @Mapping("SCNAnimatable")
public interface SCNAnimatable 
    extends NSObjectProtocol {

    
    


    
    @Mapping("addAnimation:forKey:")
    void addAnimation(CAAnimation animation, String key);
    @Mapping("removeAllAnimations")
    void removeAllAnimations();
    @Mapping("removeAnimationForKey:")
    void removeAnimation(String key);
    @Mapping("animationKeys")
    List<String> getAnimationKeys();
    @Mapping("animationForKey:")
    CAAnimation getAnimation(String key);
    @Mapping("pauseAnimationForKey:")
    void pauseAnimation(String key);
    @Mapping("resumeAnimationForKey:")
    void resumeAnimation(String key);
    @Mapping("isAnimationForKeyPaused:")
    boolean isAnimationPaused(String key);
    @Mapping("removeAnimationForKey:fadeOutDuration:")
    void removeAnimation(String key, @MachineSizedFloat double duration);

    /*<adapter>*/
    /*</adapter>*/
}
