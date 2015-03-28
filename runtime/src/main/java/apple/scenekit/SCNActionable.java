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


@Library("SceneKit/SceneKit.h") @Mapping("SCNActionable")
public interface SCNActionable 
    extends NSObjectProtocol {

    
    


    
    @Mapping("runAction:")
    void runAction(SCNAction action);
    @Mapping("runAction:completionHandler:")
    void runAction(SCNAction action, @Block Runnable block);
    @Mapping("runAction:forKey:")
    void runAction(SCNAction action, String key);
    @Mapping("runAction:forKey:completionHandler:")
    void runAction(SCNAction action, String key, @Block Runnable block);
    @Mapping("hasActions")
    boolean hasActions();
    @Mapping("actionForKey:")
    SCNAction getAction(String key);
    @Mapping("removeActionForKey:")
    void removeAction(String key);
    @Mapping("removeAllActions")
    void removeAllActions();

    /*<adapter>*/
    /*</adapter>*/
}
