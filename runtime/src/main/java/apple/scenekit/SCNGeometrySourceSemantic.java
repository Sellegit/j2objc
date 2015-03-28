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
@Library("SceneKit/SceneKit.h")
public class SCNGeometrySourceSemantic 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNGeometrySourceSemanticVertex")
    public static native NSString VertexValue();
    @GlobalConstant("SCNGeometrySourceSemanticNormal")
    public static native NSString NormalValue();
    @GlobalConstant("SCNGeometrySourceSemanticColor")
    public static native NSString ColorValue();
    @GlobalConstant("SCNGeometrySourceSemanticTexcoord")
    public static native NSString TexcoordValue();
    @GlobalConstant("SCNGeometrySourceSemanticVertexCrease")
    public static native NSString VertexCreaseValue();
    @GlobalConstant("SCNGeometrySourceSemanticEdgeCrease")
    public static native NSString EdgeCreaseValue();
    @GlobalConstant("SCNGeometrySourceSemanticBoneWeights")
    public static native NSString BoneWeightsValue();
    @GlobalConstant("SCNGeometrySourceSemanticBoneIndices")
    public static native NSString BoneIndicesValue();

}
