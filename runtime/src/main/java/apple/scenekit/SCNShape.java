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





@Library("SceneKit") @Mapping("SCNShape")
public class SCNShape 
    extends SCNGeometry 
     {

    
    
    public SCNShape() {}
    
    
    @Mapping("path")
    public native UIBezierPath getPath();
    public native void setPath(UIBezierPath v);
    @Mapping("extrusionDepth")
    public native @MachineSizedFloat double getExtrusionDepth();
    public native void setExtrusionDepth(@MachineSizedFloat double v);
    @Mapping("chamferMode")
    public native @Representing("SCNChamferMode") @MachineSizedSInt long getChamferMode();
    public native void setChamferMode(@Representing("SCNChamferMode") @MachineSizedSInt long v);
    @Mapping("chamferRadius")
    public native @MachineSizedFloat double getChamferRadius();
    public native void setChamferRadius(@MachineSizedFloat double v);
    @Mapping("chamferProfile")
    public native UIBezierPath getChamferProfile();
    public native void setChamferProfile(UIBezierPath v);
    
    
    
    @Mapping("shapeWithPath:extrusionDepth:")
    public static native SCNShape create(UIBezierPath path, @MachineSizedFloat double extrusionDepth);
    
}
