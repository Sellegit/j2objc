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





@Library("SceneKit") @Mapping("SCNCone")
public class SCNCone 
    extends SCNGeometry 
     {

    
    
    public SCNCone() {}
    
    
    @Mapping("topRadius")
    public native @MachineSizedFloat double getTopRadius();
    @Mapping("setTopRadius:")
    public native void setTopRadius(@MachineSizedFloat double v);
    @Mapping("bottomRadius")
    public native @MachineSizedFloat double getBottomRadius();
    @Mapping("setBottomRadius:")
    public native void setBottomRadius(@MachineSizedFloat double v);
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
    
    
    
    @Mapping("coneWithTopRadius:bottomRadius:height:")
    public static native SCNCone create(@MachineSizedFloat double topRadius, @MachineSizedFloat double bottomRadius, @MachineSizedFloat double height);
    
}
