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





@Library("SceneKit/SceneKit.h") @Mapping("SCNSkinner")
public class SCNSkinner 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SCNSkinner() { }
    
    
    @Mapping("skeleton")
    public native SCNNode getSkeleton();
    @Mapping("setSkeleton:")
    public native void setSkeleton(SCNNode v);
    @Mapping("baseGeometry")
    public native SCNGeometry getBaseGeometry();
    @Mapping("setBaseGeometry:")
    public native void setBaseGeometry(SCNGeometry v);
    @Mapping("baseGeometryBindTransform")
    public native SCNMatrix4 getBaseGeometryBindTransform();
    @Mapping("setBaseGeometryBindTransform:")
    public native void setBaseGeometryBindTransform(SCNMatrix4 v);
    @Mapping("boneInverseBindTransforms")
    public native List<SCNMatrix4> getBoneInverseBindTransforms();
    @Mapping("bones")
    public native NSArray<SCNNode> getBones();
    @Mapping("boneWeights")
    public native SCNGeometrySource getBoneWeights();
    @Mapping("boneIndices")
    public native SCNGeometrySource getBoneIndices();
    
    
    
    @Mapping("skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:")
    public static native SCNSkinner create(SCNGeometry baseGeometry, NSArray<?> bones, NSArray<?> boneInverseBindTransforms, SCNGeometrySource boneWeights, SCNGeometrySource boneIndices);
    
}
