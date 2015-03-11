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


/*<javadoc>*/
/*</javadoc>*/
@Library("SceneKit")
public final class CAAnimationExtensions 
    extends NSExtensions 
     {

    
    
    private CAAnimationExtensions() {}
    
    
    @Mapping("usesSceneTimeBase")
    public static native boolean usesSceneTimeBase(CAAnimation thiz);
    @Mapping("setUsesSceneTimeBase:")
    public static native void setUsesSceneTimeBase(CAAnimation thiz, boolean v);
    @Mapping("fadeInDuration")
    public static native @MachineSizedFloat double getFadeInDuration(CAAnimation thiz);
    @Mapping("setFadeInDuration:")
    public static native void setFadeInDuration(CAAnimation thiz, @MachineSizedFloat double v);
    @Mapping("fadeOutDuration")
    public static native @MachineSizedFloat double getFadeOutDuration(CAAnimation thiz);
    @Mapping("setFadeOutDuration:")
    public static native void setFadeOutDuration(CAAnimation thiz, @MachineSizedFloat double v);
    @Mapping("animationEvents")
    public static native NSArray<SCNAnimationEvent> getAnimationEvents(CAAnimation thiz);
    @Mapping("setAnimationEvents:")
    public static native void setAnimationEvents(CAAnimation thiz, NSArray<SCNAnimationEvent> v);
    
    
    
    
    
}
