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





@Library("SceneKit")
@Mapping("SCNPhysicsCollisionCategory")
public final class SCNPhysicsCollisionCategory extends ObjCEnum {
    
    @GlobalConstant("SCNPhysicsCollisionCategoryDefault")
    public static final long Default = 1L;
    @GlobalConstant("SCNPhysicsCollisionCategoryStatic")
    public static final long Static = 2L;
    @GlobalConstant("SCNPhysicsCollisionCategoryAll")
    public static final long All = -1L;
    

}
