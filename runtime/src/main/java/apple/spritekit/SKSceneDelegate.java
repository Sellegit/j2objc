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


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("SpriteKit/SpriteKit.h") @Mapping("SKSceneDelegate")
public interface SKSceneDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("update:forScene:")
    void update(double currentTime, SKScene scene);
    @Mapping("didEvaluateActionsForScene:")
    void didEvaluateActions(SKScene scene);
    @Mapping("didSimulatePhysicsForScene:")
    void didSimulatePhysics(SKScene scene);
    @Mapping("didApplyConstraintsForScene:")
    void didApplyConstraints(SKScene scene);
    @Mapping("didFinishUpdateForScene:")
    void didFinishUpdate(SKScene scene);

    /*<adapter>*/
    /*</adapter>*/
}
