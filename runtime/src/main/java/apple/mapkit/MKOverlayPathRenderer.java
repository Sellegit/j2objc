package apple.mapkit;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("MapKit/MapKit.h") @Mapping("MKOverlayPathRenderer")
public class MKOverlayPathRenderer 
    extends MKOverlayRenderer 
     {

    
    
    @Mapping("initWithOverlay:")
    public MKOverlayPathRenderer(MKOverlay overlay) { }
    @Mapping("init")
    public MKOverlayPathRenderer() { }
    
    
    @Mapping("fillColor")
    public native UIColor getFillColor();
    @Mapping("setFillColor:")
    public native void setFillColor(UIColor v);
    @Mapping("strokeColor")
    public native UIColor getStrokeColor();
    @Mapping("setStrokeColor:")
    public native void setStrokeColor(UIColor v);
    @Mapping("lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Mapping("setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Mapping("lineJoin")
    public native @Representing("CGLineJoin") long getLineJoin();
    @Mapping("setLineJoin:")
    public native void setLineJoin(@Representing("CGLineJoin") long v);
    @Mapping("lineCap")
    public native @Representing("CGLineCap") long getLineCap();
    @Mapping("setLineCap:")
    public native void setLineCap(@Representing("CGLineCap") long v);
    @Mapping("miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    @Mapping("setMiterLimit:")
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Mapping("lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    @Mapping("setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Mapping("lineDashPattern")
    public native NSArray<NSNumber> getLineDashPattern();
    @Mapping("setLineDashPattern:")
    public native void setLineDashPattern(NSArray<NSNumber> v);
    @Mapping("path")
    public native CGPath getPath();
    @Mapping("setPath:")
    public native void setPath(CGPath v);
    
    
    
    @Mapping("createPath")
    public native void createPath();
    @Mapping("invalidatePath")
    public native void invalidatePath();
    @Mapping("applyStrokePropertiesToContext:atZoomScale:")
    public native void applyStrokeProperties(CGContext context, @MachineSizedFloat double zoomScale);
    @Mapping("applyFillPropertiesToContext:atZoomScale:")
    public native void applyFillProperties(CGContext context, @MachineSizedFloat double zoomScale);
    @Mapping("strokePath:inContext:")
    public native void strokePath(CGPath path, CGContext context);
    @Mapping("fillPath:inContext:")
    public native void fillPath(CGPath path, CGContext context);
    
}
