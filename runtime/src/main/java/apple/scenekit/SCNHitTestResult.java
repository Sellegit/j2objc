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


@Library("SceneKit/SceneKit.h") @Mapping("SCNHitTestResult")
public class SCNHitTestResult 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SCNHitTestResult() { }

    
    @Mapping("node")
    public native SCNNode getNode();
    @Mapping("geometryIndex")
    public native @MachineSizedSInt long getGeometryIndex();
    @Mapping("faceIndex")
    public native @MachineSizedSInt long getFaceIndex();
    @Mapping("localCoordinates")
    public native SCNVector3 getLocalCoordinates();
    @Mapping("worldCoordinates")
    public native SCNVector3 getWorldCoordinates();
    @Mapping("localNormal")
    public native SCNVector3 getLocalNormal();
    @Mapping("worldNormal")
    public native SCNVector3 getWorldNormal();
    @Mapping("modelTransform")
    public native SCNMatrix4 getModelTransform();

    
    
    @Mapping("textureCoordinatesWithMappingChannel:")
    public native CGPoint getTextureCoordinatesWithMappingChannel(@MachineSizedSInt long channel);

}
