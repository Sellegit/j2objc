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





@Library("SceneKit/SceneKit.h") @Mapping("SCNSceneRendererDelegate")
public interface SCNSceneRendererDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("renderer:updateAtTime:")
    void update(SCNSceneRenderer aRenderer, double time);
    @Mapping("renderer:didApplyAnimationsAtTime:")
    void didApplyAnimations(SCNSceneRenderer aRenderer, double time);
    @Mapping("renderer:didSimulatePhysicsAtTime:")
    void didSimulatePhysics(SCNSceneRenderer aRenderer, double time);
    @Mapping("renderer:willRenderScene:atTime:")
    void willRenderScene(SCNSceneRenderer aRenderer, SCNScene scene, double time);
    @Mapping("renderer:didRenderScene:atTime:")
    void didRenderScene(SCNSceneRenderer aRenderer, SCNScene scene, double time);
    
    /*<adapter>*/
    /*</adapter>*/
}
