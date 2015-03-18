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





@Library("SceneKit/SceneKit.h") @Mapping("SCNTransformConstraint")
public class SCNTransformConstraint 
    extends SCNConstraint 
     {

    
    
    @Mapping("init")
    public SCNTransformConstraint() { }
    
    
    
    
    
    
    @Mapping("transformConstraintInWorldSpace:withBlock:")
    public static native SCNTransformConstraint create(boolean world, @Block Block2<SCNNode, SCNMatrix4, SCNMatrix4> block);
    
}
