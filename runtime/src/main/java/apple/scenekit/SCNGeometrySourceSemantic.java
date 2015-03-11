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
public class SCNGeometrySourceSemantic 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("SCNGeometrySourceSemanticVertex")
    protected static native NSString VertexValue();
    @GlobalConstant("SCNGeometrySourceSemanticNormal")
    protected static native NSString NormalValue();
    @GlobalConstant("SCNGeometrySourceSemanticColor")
    protected static native NSString ColorValue();
    @GlobalConstant("SCNGeometrySourceSemanticTexcoord")
    protected static native NSString TexcoordValue();
    @GlobalConstant("SCNGeometrySourceSemanticVertexCrease")
    protected static native NSString VertexCreaseValue();
    @GlobalConstant("SCNGeometrySourceSemanticEdgeCrease")
    protected static native NSString EdgeCreaseValue();
    @GlobalConstant("SCNGeometrySourceSemanticBoneWeights")
    protected static native NSString BoneWeightsValue();
    @GlobalConstant("SCNGeometrySourceSemanticBoneIndices")
    protected static native NSString BoneIndicesValue();
    
}
