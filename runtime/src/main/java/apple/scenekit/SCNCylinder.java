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





@Library("SceneKit/SceneKit.h") @Mapping("SCNCylinder")
public class SCNCylinder 
    extends SCNGeometry 
     {

    
    
    @Mapping("init")
    public SCNCylinder() { }
    
    
    @Mapping("radius")
    public native @MachineSizedFloat double getRadius();
    @Mapping("setRadius:")
    public native void setRadius(@MachineSizedFloat double v);
    @Mapping("height")
    public native @MachineSizedFloat double getHeight();
    @Mapping("setHeight:")
    public native void setHeight(@MachineSizedFloat double v);
    @Mapping("radialSegmentCount")
    public native @MachineSizedSInt long getRadialSegmentCount();
    @Mapping("setRadialSegmentCount:")
    public native void setRadialSegmentCount(@MachineSizedSInt long v);
    @Mapping("heightSegmentCount")
    public native @MachineSizedSInt long getHeightSegmentCount();
    @Mapping("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@MachineSizedSInt long v);
    
    
    
    @Mapping("cylinderWithRadius:height:")
    public static native SCNCylinder create(@MachineSizedFloat double radius, @MachineSizedFloat double height);
    
}
