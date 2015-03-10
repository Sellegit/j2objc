package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit") @Mapping("UIBezierPath")
public class UIBezierPath 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    public UIBezierPath() {}
    
    
    @Mapping("CGPath")
    public native CGPath getCGPath();
    @Mapping("setCGPath:")
    public native void setCGPath(CGPath v);
    @Mapping("isEmpty")
    public native boolean isEmpty();
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("currentPoint")
    public native CGPoint getCurrentPoint();
    @Mapping("lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Mapping("setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Mapping("lineCapStyle")
    public native @Representing("CGLineCap") int getLineCapStyle();
    @Mapping("setLineCapStyle:")
    public native void setLineCapStyle(@Representing("CGLineCap") int v);
    @Mapping("lineJoinStyle")
    public native @Representing("CGLineJoin") int getLineJoinStyle();
    @Mapping("setLineJoinStyle:")
    public native void setLineJoinStyle(@Representing("CGLineJoin") int v);
    @Mapping("miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    @Mapping("setMiterLimit:")
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Mapping("flatness")
    public native @MachineSizedFloat double getFlatness();
    @Mapping("setFlatness:")
    public native void setFlatness(@MachineSizedFloat double v);
    @Mapping("usesEvenOddFillRule")
    public native boolean usesEvenOddFillRule();
    @Mapping("setUsesEvenOddFillRule:")
    public native void setUsesEvenOddFillRule(boolean v);
    
    
    
    @Mapping("moveToPoint:")
    public native void move(CGPoint point);
    @Mapping("addLineToPoint:")
    public native void addLine(CGPoint point);
    @Mapping("addCurveToPoint:controlPoint1:controlPoint2:")
    public native void addCurve(CGPoint endPoint, CGPoint controlPoint1, CGPoint controlPoint2);
    @Mapping("addQuadCurveToPoint:controlPoint:")
    public native void addQuadCurve(CGPoint endPoint, CGPoint controlPoint);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("addArcWithCenter:radius:startAngle:endAngle:clockwise:")
    public native void addArc(CGPoint center, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, boolean clockwise);
    @Mapping("closePath")
    public native void closePath();
    @Mapping("removeAllPoints")
    public native void removeAllPoints();
    @Mapping("appendPath:")
    public native void appendPath(UIBezierPath bezierPath);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("bezierPathByReversingPath")
    public native UIBezierPath reverse();
    @Mapping("applyTransform:")
    public native void applyTransform(CGAffineTransform transform);
    @Mapping("containsPoint:")
    public native boolean containsPoint(CGPoint point);
    @Mapping("setLineDash:count:phase:")
    protected native void setLineDash(Todo pattern, @MachineSizedSInt long count, @MachineSizedFloat double phase);
    @Mapping("getLineDash:count:phase:")
    protected native void getLineDash(Todo pattern, Todo count, Todo phase);
    @Mapping("fill")
    public native void fill();
    @Mapping("stroke")
    public native void stroke();
    @Mapping("fillWithBlendMode:alpha:")
    public native void fill(@Representing("CGBlendMode") int blendMode, @MachineSizedFloat double alpha);
    @Mapping("strokeWithBlendMode:alpha:")
    public native void stroke(@Representing("CGBlendMode") int blendMode, @MachineSizedFloat double alpha);
    @Mapping("addClip")
    public native void addClip();
    @Mapping("bezierPathWithRect:")
    public static native UIBezierPath createFromRect(CGRect rect);
    @Mapping("bezierPathWithOvalInRect:")
    public static native UIBezierPath createFromOval(CGRect rect);
    @Mapping("bezierPathWithRoundedRect:cornerRadius:")
    public static native UIBezierPath createFromRoundedRect(CGRect rect, @MachineSizedFloat double cornerRadius);
    @Mapping("bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:")
    public static native UIBezierPath createFromRoundedRect(CGRect rect, @Representing("UIRectCorner") @MachineSizedUInt long corners, CGSize cornerRadii);
    @Mapping("bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:")
    public static native UIBezierPath createFromArc(CGPoint center, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, boolean clockwise);
    @Mapping("bezierPathWithCGPath:")
    public static native UIBezierPath createFromPath(CGPath CGPath);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
