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





@Library("SceneKit/SceneKit.h") @Mapping("SCNTube")
public class SCNTube 
    extends SCNGeometry 
     {

    
    
    @Mapping("init")
    public SCNTube() { }
    
    
    @Mapping("innerRadius")
    public native @MachineSizedFloat double getInnerRadius();
    @Mapping("setInnerRadius:")
    public native void setInnerRadius(@MachineSizedFloat double v);
    @Mapping("outerRadius")
    public native @MachineSizedFloat double getOuterRadius();
    @Mapping("setOuterRadius:")
    public native void setOuterRadius(@MachineSizedFloat double v);
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
    
    
    
    @Mapping("tubeWithInnerRadius:outerRadius:height:")
    public static native SCNTube create(@MachineSizedFloat double innerRadius, @MachineSizedFloat double outerRadius, @MachineSizedFloat double height);
    
}
