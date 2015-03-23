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
@Mapping("CGColorRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGColor 
    extends CFType 
     {

    
    
    protected CGColor() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreate")
    public static native CGColor create(CGColorSpace space, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreateWithPattern")
    public static native CGColor createWithPattern(CGColorSpace space, CGPattern pattern, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreateCopy")
    public static native CGColor createCopy(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreateCopyWithAlpha")
    public static native CGColor createCopyWithAlpha(CGColor color, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorEqualToColor")
    public static native boolean equalToColor(CGColor color1, CGColor color2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetNumberOfComponents")
    public static native @MachineSizedUInt long getNumberOfComponents(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetComponents")
    public static native Todo getComponents(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetAlpha")
    public static native @MachineSizedFloat double getAlpha(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetColorSpace")
    public static native CGColorSpace getColorSpace(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetPattern")
    public static native CGPattern getPattern(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();

}
