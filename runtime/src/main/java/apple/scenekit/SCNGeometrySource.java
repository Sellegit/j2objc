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





@Library("SceneKit") @Mapping("SCNGeometrySource")
public class SCNGeometrySource 
    extends NSObject 
     {

    
    
    public SCNGeometrySource() {}
    
    
    @Mapping("data")
    public native NSData getData();
    @Mapping("semantic")
    public native String getSemantic();
    @Mapping("vectorCount")
    public native @MachineSizedSInt long getVectorCount();
    @Mapping("floatComponents")
    public native boolean usesFloatComponents();
    @Mapping("componentsPerVector")
    public native @MachineSizedSInt long getComponentsPerVector();
    @Mapping("bytesPerComponent")
    public native @MachineSizedSInt long getBytesPerComponent();
    @Mapping("dataOffset")
    public native @MachineSizedSInt long getDataOffset();
    @Mapping("dataStride")
    public native @MachineSizedSInt long getDataStride();
    
    
    
    @Mapping("geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:")
    public static native SCNGeometrySource createWithData(NSData data, String semantic, @MachineSizedSInt long vectorCount, boolean floatComponents, @MachineSizedSInt long componentsPerVector, @MachineSizedSInt long bytesPerComponent, @MachineSizedSInt long offset, @MachineSizedSInt long stride);
    @Mapping("geometrySourceWithVertices:count:")
    public static native SCNGeometrySource createWithVertices(SCNVector3 vertices, @MachineSizedSInt long count);
    @Mapping("geometrySourceWithNormals:count:")
    public static native SCNGeometrySource createWithNormals(SCNVector3 normals, @MachineSizedSInt long count);
    @Mapping("geometrySourceWithTextureCoordinates:count:")
    public static native SCNGeometrySource createWithTextureCoordinates(CGPoint texcoord, @MachineSizedSInt long count);
    
}
