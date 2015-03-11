package apple.coregraphics;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics")
public class CGMutablePath 
    extends CGPath 
     {

    
    
    protected CGMutablePath() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathCreateMutable")
    public static native CGMutablePath createMutable();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathCreateMutableCopy")
    public static native CGMutablePath createMutableCopy(CGPath path);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateMutableCopyByTransformingPath")
    public static native CGMutablePath createMutableCopyByTransformingPath(CGPath path, CGAffineTransform transform);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGPathAddRoundedRect")
    public native void addRoundedRect(CGAffineTransform transform, CGRect rect, @MachineSizedFloat double cornerWidth, @MachineSizedFloat double cornerHeight);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathMoveToPoint")
    public native void moveToPoint(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddLineToPoint")
    public native void addLineToPoint(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddQuadCurveToPoint")
    public native void addQuadCurveToPoint(CGAffineTransform m, @MachineSizedFloat double cpx, @MachineSizedFloat double cpy, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddCurveToPoint")
    public native void addCurveToPoint(CGAffineTransform m, @MachineSizedFloat double cp1x, @MachineSizedFloat double cp1y, @MachineSizedFloat double cp2x, @MachineSizedFloat double cp2y, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathCloseSubpath")
    public native void closeSubpath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddRect")
    public native void addRect(CGAffineTransform m, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddRects")
    protected native void addRects(CGAffineTransform m, CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddLines")
    protected native void addLines(CGAffineTransform m, CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddEllipseInRect")
    public native void addEllipseInRect(CGAffineTransform m, CGRect rect);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathAddRelativeArc")
    public native void addRelativeArc(CGAffineTransform matrix, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double delta);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddArc")
    public native void addArc(CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, boolean clockwise);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddArcToPoint")
    public native void addArcToPoint(CGAffineTransform m, @MachineSizedFloat double x1, @MachineSizedFloat double y1, @MachineSizedFloat double x2, @MachineSizedFloat double y2, @MachineSizedFloat double radius);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddPath")
    public native void addPath(CGAffineTransform m, CGPath path2);
    
}
