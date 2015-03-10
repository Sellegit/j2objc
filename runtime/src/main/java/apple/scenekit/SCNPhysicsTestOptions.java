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
public class SCNPhysicsTestOptions 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNPhysicsTestCollisionBitMaskKey")
    protected static native NSString CollisionBitMaskKey();
    @GlobalConstant("SCNPhysicsTestSearchModeKey")
    protected static native NSString SearchModeKey();
    @GlobalConstant("SCNPhysicsTestBackfaceCullingKey")
    protected static native NSString BackfaceCullingKey();
    
}
