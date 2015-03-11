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
public class CGPath 
    extends CFType 
     {

    
    
    protected CGPath() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathCreateCopy")
    public static native CGPath createCopy(CGPath path);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateCopyByTransformingPath")
    public static native CGPath createCopyByTransformingPath(CGPath path, CGAffineTransform transform);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGPathCreateWithRect")
    public static native CGPath createWithRect(CGRect rect, CGAffineTransform transform);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateWithEllipseInRect")
    public static native CGPath createWithEllipseInRect(CGRect rect, CGAffineTransform transform);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CGPathCreateWithRoundedRect")
    public static native CGPath createWithRoundedRect(CGRect rect, @MachineSizedFloat double cornerWidth, @MachineSizedFloat double cornerHeight, CGAffineTransform transform);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateCopyByDashingPath")
    protected static native CGPath createCopyByDashingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double phase, @Pointer long lengths, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateCopyByStrokingPath")
    public static native CGPath createCopyByStrokingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double lineWidth, CGLineCap lineCap, CGLineJoin lineJoin, @MachineSizedFloat double miterLimit);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathEqualToPath")
    public native boolean equalToPath(CGPath path2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathIsEmpty")
    public native boolean isEmpty();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathIsRect")
    public native boolean isRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathGetCurrentPoint")
    public native CGPoint getCurrentPoint();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathGetBoundingBox")
    public native CGRect getBoundingBox();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGPathGetPathBoundingBox")
    public native CGRect getPathBoundingBox();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathContainsPoint")
    public native boolean containsPoint(CGAffineTransform m, CGPoint point, boolean eoFill);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathApply")
    protected native void apply(@Pointer long info, @Pointer long function);
    
}
