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


@Library("QuartzCore/QuartzCore.h") @Mapping("CAGradientLayer")
public class CAGradientLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public CAGradientLayer() { }
    @Mapping("initWithLayer:")
    public CAGradientLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CAGradientLayer(NSCoder aDecoder) { }

    
    @Mapping("colors")
    public native NSArray<CGColor> getColors();
    @Mapping("setColors:")
    public native void setColors(NSArray<CGColor> v);
    @Mapping("locations")
    public native NSArray<NSNumber> getLocations();
    @Mapping("setLocations:")
    public native void setLocations(NSArray<NSNumber> v);
    @Mapping("startPoint")
    public native CGPoint getStartPoint();
    @Mapping("setStartPoint:")
    public native void setStartPoint(CGPoint v);
    @Mapping("endPoint")
    public native CGPoint getEndPoint();
    @Mapping("setEndPoint:")
    public native void setEndPoint(CGPoint v);
    @Mapping("type")
    public native CAGradientType getType();
    @Mapping("setType:")
    public native void setType(CAGradientType v);

    
    


}
