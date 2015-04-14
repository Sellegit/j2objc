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

/*<javadoc>*/
/*</javadoc>*/
@Library("QuartzCore/QuartzCore.h")
public class CAGravity 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityCenter")
    public static native String CenterValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTop")
    public static native String TopValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottom")
    public static native String BottomValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityLeft")
    public static native String LeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityRight")
    public static native String RightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopLeft")
    public static native String TopLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityTopRight")
    public static native String TopRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomLeft")
    public static native String BottomLeftValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityBottomRight")
    public static native String BottomRightValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResize")
    public static native String ResizeValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspect")
    public static native String ResizeAspectValue();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCAGravityResizeAspectFill")
    public static native String ResizeAspectFillValue();

}
