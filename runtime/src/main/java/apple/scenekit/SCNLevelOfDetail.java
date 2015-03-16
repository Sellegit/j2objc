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





@Library("SceneKit/SceneKit.h") @Mapping("SCNLevelOfDetail")
public class SCNLevelOfDetail 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNLevelOfDetail() {}
    
    
    @Mapping("geometry")
    public native SCNGeometry getGeometry();
    @Mapping("screenSpaceRadius")
    public native @MachineSizedFloat double getScreenSpaceRadius();
    @Mapping("worldSpaceDistance")
    public native @MachineSizedFloat double getWorldSpaceDistance();
    
    
    
    @Mapping("levelOfDetailWithGeometry:screenSpaceRadius:")
    public static native SCNLevelOfDetail createWithGeometryAndRadius(SCNGeometry geometry, @MachineSizedFloat double radius);
    @Mapping("levelOfDetailWithGeometry:worldSpaceDistance:")
    public static native SCNLevelOfDetail createWithGeometryAndDistance(SCNGeometry geometry, @MachineSizedFloat double distance);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
