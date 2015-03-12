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
public class CGColor 
    extends CFType 
     {

    
    
    protected CGColor() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreate")
    protected static native CGColor create(CGColorSpace space, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorCreateWithPattern")
    protected static native CGColor createWithPattern(CGColorSpace space, CGPattern pattern, Todo components);
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
    public native boolean equalToColor(CGColor color2);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetNumberOfComponents")
    public native @MachineSizedUInt long getNumberOfComponents();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetComponents")
    protected static native Todo getComponents(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetAlpha")
    public native @MachineSizedFloat double getAlpha();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetColorSpace")
    public native CGColorSpace getColorSpace();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetPattern")
    public native CGPattern getPattern();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGColorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    
}
