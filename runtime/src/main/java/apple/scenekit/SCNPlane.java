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





@Library("SceneKit") @Mapping("SCNPlane")
public class SCNPlane 
    extends SCNGeometry 
     {

    
    
    public SCNPlane() {}
    
    
    @Mapping("width")
    public native @MachineSizedFloat double getWidth();
    @Mapping("setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    @Mapping("height")
    public native @MachineSizedFloat double getHeight();
    @Mapping("setHeight:")
    public native void setHeight(@MachineSizedFloat double v);
    @Mapping("widthSegmentCount")
    public native @MachineSizedSInt long getWidthSegmentCount();
    @Mapping("setWidthSegmentCount:")
    public native void setWidthSegmentCount(@MachineSizedSInt long v);
    @Mapping("heightSegmentCount")
    public native @MachineSizedSInt long getHeightSegmentCount();
    @Mapping("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@MachineSizedSInt long v);
    @Mapping("cornerRadius")
    public native @MachineSizedFloat double getCornerRadius();
    @Mapping("setCornerRadius:")
    public native void setCornerRadius(@MachineSizedFloat double v);
    @Mapping("cornerSegmentCount")
    public native @MachineSizedSInt long getCornerSegmentCount();
    @Mapping("setCornerSegmentCount:")
    public native void setCornerSegmentCount(@MachineSizedSInt long v);
    
    
    
    @Mapping("planeWithWidth:height:")
    public static native SCNPlane create(@MachineSizedFloat double width, @MachineSizedFloat double height);
    
}
