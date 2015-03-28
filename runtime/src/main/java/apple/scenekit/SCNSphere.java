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


@Library("SceneKit/SceneKit.h") @Mapping("SCNSphere")
public class SCNSphere 
    extends SCNGeometry 
     {

    
    
    @Mapping("init")
    public SCNSphere() { }

    
    @Mapping("radius")
    public native @MachineSizedFloat double getRadius();
    @Mapping("setRadius:")
    public native void setRadius(@MachineSizedFloat double v);
    @Mapping("isGeodesic")
    public native boolean isGeodesic();
    @Mapping("setGeodesic:")
    public native void setGeodesic(boolean v);
    @Mapping("segmentCount")
    public native @MachineSizedSInt long getSegmentCount();
    @Mapping("setSegmentCount:")
    public native void setSegmentCount(@MachineSizedSInt long v);

    
    
    @Mapping("sphereWithRadius:")
    public static native SCNSphere create(@MachineSizedFloat double radius);

}
