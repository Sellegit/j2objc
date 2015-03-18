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
@Library("CoreGraphics/CoreGraphics.h")
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
    public static native CGPath createCopyByDashingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double phase, Todo lengths, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("CGPathCreateCopyByStrokingPath")
    public static native CGPath createCopyByStrokingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double lineWidth, CGLineCap lineCap, CGLineJoin lineJoin, @MachineSizedFloat double miterLimit);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathEqualToPath")
    public static native boolean equalToPath(CGPath path1, CGPath path2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathIsEmpty")
    public static native boolean isEmpty(CGPath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathIsRect")
    public static native boolean isRect(CGPath path, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathGetCurrentPoint")
    public static native CGPoint getCurrentPoint(CGPath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathGetBoundingBox")
    public static native CGRect getBoundingBox(CGPath path);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CGPathGetPathBoundingBox")
    public static native CGRect getPathBoundingBox(CGPath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathContainsPoint")
    public static native boolean containsPoint(CGPath path, CGAffineTransform m, CGPoint point, boolean eoFill);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPathApply")
    public static native void apply(CGPath path, Todo info, FunctionPtr function);
    
}
