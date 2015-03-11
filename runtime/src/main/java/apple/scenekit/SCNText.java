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





@Library("SceneKit") @Mapping("SCNText")
public class SCNText 
    extends SCNGeometry 
     {

    
    
    public SCNText() {}
    
    
    @Mapping("extrusionDepth")
    public native @MachineSizedFloat double getExtrusionDepth();
    public native void setExtrusionDepth(@MachineSizedFloat double v);
    @Mapping("string")
    public native NSAttributedString getString();
    public native void setString(NSAttributedString v);
    @Mapping("font")
    public native UIFont getFont();
    public native void setFont(UIFont v);
    @Mapping("isWrapped")
    public native boolean isWrapped();
    public native void setWrapped(boolean v);
    @Mapping("containerFrame")
    public native CGRect getContainerFrame();
    public native void setContainerFrame(CGRect v);
    @Mapping("truncationMode")
    public native String getTruncationMode();
    public native void setTruncationMode(String v);
    @Mapping("alignmentMode")
    public native String getAlignmentMode();
    public native void setAlignmentMode(String v);
    @Mapping("chamferRadius")
    public native @MachineSizedFloat double getChamferRadius();
    public native void setChamferRadius(@MachineSizedFloat double v);
    @Mapping("chamferProfile")
    public native UIBezierPath getChamferProfile();
    public native void setChamferProfile(UIBezierPath v);
    @Mapping("flatness")
    public native @MachineSizedFloat double getFlatness();
    public native void setFlatness(@MachineSizedFloat double v);
    
    
    
    @Mapping("textWithString:extrusionDepth:")
    public static native SCNText create(NSAttributedString string, @MachineSizedFloat double extrusionDepth);
    
}
