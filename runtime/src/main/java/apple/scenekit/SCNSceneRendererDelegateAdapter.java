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

public abstract class SCNSceneRendererDelegateAdapter 
    extends Object 
    implements SCNSceneRendererDelegate {

    
    
    
    
    
    
    
    @NotImplemented("renderer:updateAtTime:")
    public void update(SCNSceneRenderer aRenderer, double time) { throw new UnsupportedOperationException(); }
    @NotImplemented("renderer:didApplyAnimationsAtTime:")
    public void didApplyAnimations(SCNSceneRenderer aRenderer, double time) { throw new UnsupportedOperationException(); }
    @NotImplemented("renderer:didSimulatePhysicsAtTime:")
    public void didSimulatePhysics(SCNSceneRenderer aRenderer, double time) { throw new UnsupportedOperationException(); }
    @NotImplemented("renderer:willRenderScene:atTime:")
    public void willRenderScene(SCNSceneRenderer aRenderer, SCNScene scene, double time) { throw new UnsupportedOperationException(); }
    @NotImplemented("renderer:didRenderScene:atTime:")
    public void didRenderScene(SCNSceneRenderer aRenderer, SCNScene scene, double time) { throw new UnsupportedOperationException(); }
    
}
