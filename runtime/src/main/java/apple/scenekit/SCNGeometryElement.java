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





@Library("SceneKit/SceneKit.h") @Mapping("SCNGeometryElement")
public class SCNGeometryElement 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public SCNGeometryElement() { }
    
    
    @Mapping("data")
    public native NSData getData();
    @Mapping("primitiveType")
    public native @Representing("SCNGeometryPrimitiveType") @MachineSizedSInt long getPrimitiveType();
    @Mapping("primitiveCount")
    public native @MachineSizedSInt long getPrimitiveCount();
    @Mapping("bytesPerIndex")
    public native @MachineSizedSInt long getBytesPerIndex();
    
    
    
    @Mapping("geometryElementWithData:primitiveType:primitiveCount:bytesPerIndex:")
    public static native SCNGeometryElement create(NSData data, @Representing("SCNGeometryPrimitiveType") @MachineSizedSInt long primitiveType, @MachineSizedSInt long primitiveCount, @MachineSizedSInt long bytesPerIndex);
    
}
