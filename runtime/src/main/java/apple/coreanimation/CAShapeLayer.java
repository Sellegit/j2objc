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


@Library("QuartzCore/QuartzCore.h") @Mapping("CAShapeLayer")
public class CAShapeLayer 
    extends CALayer 
     {

    
    
    @Mapping("init")
    public CAShapeLayer() { }
    @Mapping("initWithLayer:")
    public CAShapeLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CAShapeLayer(NSCoder aDecoder) { }

    
    @Mapping("path")
    public native CGPath getPath();
    @Mapping("setPath:")
    public native void setPath(CGPath v);
    @Mapping("fillColor")
    public native CGColor getFillColor();
    @Mapping("setFillColor:")
    public native void setFillColor(CGColor v);
    @Mapping("fillRule")
    public native CAShapeFillRule getFillRule();
    @Mapping("setFillRule:")
    public native void setFillRule(CAShapeFillRule v);
    @Mapping("strokeColor")
    public native CGColor getStrokeColor();
    @Mapping("setStrokeColor:")
    public native void setStrokeColor(CGColor v);
    @Mapping("strokeStart")
    public native @MachineSizedFloat double getStrokeStart();
    @Mapping("setStrokeStart:")
    public native void setStrokeStart(@MachineSizedFloat double v);
    @Mapping("strokeEnd")
    public native @MachineSizedFloat double getStrokeEnd();
    @Mapping("setStrokeEnd:")
    public native void setStrokeEnd(@MachineSizedFloat double v);
    @Mapping("lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Mapping("setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Mapping("miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    @Mapping("setMiterLimit:")
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Mapping("lineCap")
    public native CALineCap getLineCap();
    @Mapping("setLineCap:")
    public native void setLineCap(CALineCap v);
    @Mapping("lineJoin")
    public native CALineJoin getLineJoin();
    @Mapping("setLineJoin:")
    public native void setLineJoin(CALineJoin v);
    @Mapping("lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    @Mapping("setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Mapping("lineDashPattern")
    public native NSArray<NSNumber> getLineDashPattern();
    @Mapping("setLineDashPattern:")
    public native void setLineDashPattern(NSArray<NSNumber> v);

    
    


}
