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





@Library("SceneKit/SceneKit.h") @Mapping("SCNTorus")
public class SCNTorus 
    extends SCNGeometry 
     {

    
    
    public SCNTorus() {}
    
    
    @Mapping("ringRadius")
    public native @MachineSizedFloat double getRingRadius();
    @Mapping("setRingRadius:")
    public native void setRingRadius(@MachineSizedFloat double v);
    @Mapping("pipeRadius")
    public native @MachineSizedFloat double getPipeRadius();
    @Mapping("setPipeRadius:")
    public native void setPipeRadius(@MachineSizedFloat double v);
    @Mapping("ringSegmentCount")
    public native @MachineSizedSInt long getRingSegmentCount();
    @Mapping("setRingSegmentCount:")
    public native void setRingSegmentCount(@MachineSizedSInt long v);
    @Mapping("pipeSegmentCount")
    public native @MachineSizedSInt long getPipeSegmentCount();
    @Mapping("setPipeSegmentCount:")
    public native void setPipeSegmentCount(@MachineSizedSInt long v);
    
    
    
    @Mapping("torusWithRingRadius:pipeRadius:")
    public static native SCNTorus create(@MachineSizedFloat double ringRadius, @MachineSizedFloat double pipeRadius);
    
}
