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





@Library("QuartzCore") @Mapping("CAShapeLayer")
public class CAShapeLayer 
    extends CALayer 
     {

    
    
    public CAShapeLayer() {}
    @Mapping("initWithLayer:")
    public CAShapeLayer(Object layer) { }
    
    
    @Mapping("path")
    public native CGPath getPath();
    public native void setPath(CGPath v);
    @Mapping("fillColor")
    public native CGColor getFillColor();
    public native void setFillColor(CGColor v);
    @Mapping("fillRule")
    public native CAShapeFillRule getFillRule();
    public native void setFillRule(CAShapeFillRule v);
    @Mapping("strokeColor")
    public native CGColor getStrokeColor();
    public native void setStrokeColor(CGColor v);
    @Mapping("strokeStart")
    public native @MachineSizedFloat double getStrokeStart();
    public native void setStrokeStart(@MachineSizedFloat double v);
    @Mapping("strokeEnd")
    public native @MachineSizedFloat double getStrokeEnd();
    public native void setStrokeEnd(@MachineSizedFloat double v);
    @Mapping("lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    public native void setLineWidth(@MachineSizedFloat double v);
    @Mapping("miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Mapping("lineCap")
    public native CALineCap getLineCap();
    public native void setLineCap(CALineCap v);
    @Mapping("lineJoin")
    public native CALineJoin getLineJoin();
    public native void setLineJoin(CALineJoin v);
    @Mapping("lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Mapping("lineDashPattern")
    public native NSArray<NSNumber> getLineDashPattern();
    public native void setLineDashPattern(NSArray<NSNumber> v);
    
    
    
    
    
}
