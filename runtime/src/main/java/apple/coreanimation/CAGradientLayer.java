package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;





@Library("QuartzCore") @Mapping("CAGradientLayer")
public class CAGradientLayer 
    extends CALayer 
     {

    
    
    public CAGradientLayer() {}
    @Mapping("initWithLayer:")
    public CAGradientLayer(Object layer) { }
    
    
    @Mapping("colors")
    public native List<CGColor> getColors();
    public native void setColors(List<CGColor> v);
    @Mapping("locations")
    public native NSArray<NSNumber> getLocations();
    public native void setLocations(NSArray<NSNumber> v);
    @Mapping("startPoint")
    public native CGPoint getStartPoint();
    public native void setStartPoint(CGPoint v);
    @Mapping("endPoint")
    public native CGPoint getEndPoint();
    public native void setEndPoint(CGPoint v);
    @Mapping("type")
    public native CAGradientType getType();
    public native void setType(CAGradientType v);
    
    
    
    
    
}
