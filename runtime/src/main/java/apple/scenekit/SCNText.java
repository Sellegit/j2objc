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


@Library("SceneKit/SceneKit.h") @Mapping("SCNText")
public class SCNText 
    extends SCNGeometry 
     {

    
    
    @Mapping("init")
    public SCNText() { }

    
    @Mapping("extrusionDepth")
    public native @MachineSizedFloat double getExtrusionDepth();
    @Mapping("setExtrusionDepth:")
    public native void setExtrusionDepth(@MachineSizedFloat double v);
    @Mapping("string")
    public native NSAttributedString getString();
    @Mapping("setString:")
    public native void setString(NSAttributedString v);
    @Mapping("font")
    public native UIFont getFont();
    @Mapping("setFont:")
    public native void setFont(UIFont v);
    @Mapping("isWrapped")
    public native boolean isWrapped();
    @Mapping("setWrapped:")
    public native void setWrapped(boolean v);
    @Mapping("containerFrame")
    public native CGRect getContainerFrame();
    @Mapping("setContainerFrame:")
    public native void setContainerFrame(CGRect v);
    @Mapping("truncationMode")
    public native String getTruncationMode();
    @Mapping("setTruncationMode:")
    public native void setTruncationMode(String v);
    @Mapping("alignmentMode")
    public native String getAlignmentMode();
    @Mapping("setAlignmentMode:")
    public native void setAlignmentMode(String v);
    @Mapping("chamferRadius")
    public native @MachineSizedFloat double getChamferRadius();
    @Mapping("setChamferRadius:")
    public native void setChamferRadius(@MachineSizedFloat double v);
    @Mapping("chamferProfile")
    public native UIBezierPath getChamferProfile();
    @Mapping("setChamferProfile:")
    public native void setChamferProfile(UIBezierPath v);
    @Mapping("flatness")
    public native @MachineSizedFloat double getFlatness();
    @Mapping("setFlatness:")
    public native void setFlatness(@MachineSizedFloat double v);

    
    
    @Mapping("textWithString:extrusionDepth:")
    public static native SCNText create(Object string, @MachineSizedFloat double extrusionDepth);

}
