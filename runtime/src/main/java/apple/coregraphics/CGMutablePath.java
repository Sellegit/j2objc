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
@Mapping("CGMutablePathRef") @Library("CoreGraphics/CoreGraphics.h")
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
    public static native void addRoundedRect(CGMutablePath path, CGAffineTransform transform, CGRect rect, @MachineSizedFloat double cornerWidth, @MachineSizedFloat double cornerHeight);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathMoveToPoint")
    public static native void moveToPoint(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddLineToPoint")
    public static native void addLineToPoint(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddQuadCurveToPoint")
    public static native void addQuadCurveToPoint(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double cpx, @MachineSizedFloat double cpy, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddCurveToPoint")
    public static native void addCurveToPoint(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double cp1x, @MachineSizedFloat double cp1y, @MachineSizedFloat double cp2x, @MachineSizedFloat double cp2y, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathCloseSubpath")
    public static native void closeSubpath(CGMutablePath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddRect")
    public static native void addRect(CGMutablePath path, CGAffineTransform m, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddRects")
    public static native void addRects(CGMutablePath path, CGAffineTransform m, CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddLines")
    public static native void addLines(CGMutablePath path, CGAffineTransform m, CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddEllipseInRect")
    public static native void addEllipseInRect(CGMutablePath path, CGAffineTransform m, CGRect rect);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathAddRelativeArc")
    public static native void addRelativeArc(CGMutablePath path, CGAffineTransform matrix, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double delta);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddArc")
    public static native void addArc(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, boolean clockwise);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddArcToPoint")
    public static native void addArcToPoint(CGMutablePath path, CGAffineTransform m, @MachineSizedFloat double x1, @MachineSizedFloat double y1, @MachineSizedFloat double x2, @MachineSizedFloat double y2, @MachineSizedFloat double radius);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathAddPath")
    public static native void addPath(CGMutablePath path1, CGAffineTransform m, CGPath path2);

}
