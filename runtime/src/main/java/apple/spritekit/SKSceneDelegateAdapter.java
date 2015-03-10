package apple.spritekit;


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
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class SKSceneDelegateAdapter 
    extends Object 
    implements SKSceneDelegate {

    
    
    
    
    
    
    
    @NotImplemented("update:forScene:")
    public void update(double currentTime, SKScene scene) { throw new UnsupportedOperationException(); }
    @NotImplemented("didEvaluateActionsForScene:")
    public void didEvaluateActions(SKScene scene) { throw new UnsupportedOperationException(); }
    @NotImplemented("didSimulatePhysicsForScene:")
    public void didSimulatePhysics(SKScene scene) { throw new UnsupportedOperationException(); }
    @NotImplemented("didApplyConstraintsForScene:")
    public void didApplyConstraints(SKScene scene) { throw new UnsupportedOperationException(); }
    @NotImplemented("didFinishUpdateForScene:")
    public void didFinishUpdate(SKScene scene) { throw new UnsupportedOperationException(); }
    
}
